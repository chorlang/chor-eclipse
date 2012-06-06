package org.chor.epp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jolie.lang.Constants.ExecutionMode;
import jolie.lang.NativeType;
import jolie.lang.parse.ast.AssignStatement;
import jolie.lang.parse.ast.CorrelationSetInfo;
import jolie.lang.parse.ast.CorrelationSetInfo.CorrelationAliasInfo;
import jolie.lang.parse.ast.CorrelationSetInfo.CorrelationVariableInfo;
import jolie.lang.parse.ast.DeepCopyStatement;
import jolie.lang.parse.ast.DefinitionCallStatement;
import jolie.lang.parse.ast.DefinitionNode;
import jolie.lang.parse.ast.ExecutionInfo;
import jolie.lang.parse.ast.IfStatement;
import jolie.lang.parse.ast.InputPortInfo;
import jolie.lang.parse.ast.InterfaceDefinition;
import jolie.lang.parse.ast.NDChoiceStatement;
import jolie.lang.parse.ast.NotificationOperationStatement;
import jolie.lang.parse.ast.NullProcessStatement;
import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.OneWayOperationDeclaration;
import jolie.lang.parse.ast.OneWayOperationStatement;
import jolie.lang.parse.ast.OutputPortInfo;
import jolie.lang.parse.ast.RequestResponseOperationDeclaration;
import jolie.lang.parse.ast.RequestResponseOperationStatement;
import jolie.lang.parse.ast.SequenceStatement;
import jolie.lang.parse.ast.SolicitResponseOperationStatement;
import jolie.lang.parse.ast.SynchronizedStatement;
import jolie.lang.parse.ast.UndefStatement;
import jolie.lang.parse.ast.VariablePathNode;
import jolie.lang.parse.ast.expression.AndConditionNode;
import jolie.lang.parse.ast.expression.FreshValueExpressionNode;
import jolie.lang.parse.ast.expression.IsTypeExpressionNode;
import jolie.lang.parse.ast.expression.IsTypeExpressionNode.CheckType;
import jolie.lang.parse.ast.types.TypeDefinition;
import jolie.lang.parse.ast.types.TypeInlineDefinition;
import jolie.util.Pair;
import jolie.util.Range;

import org.chor.chor.Interaction;
import org.chor.chor.Program;
import org.chor.epp.impl.FileUtils;
import org.chor.epp.impl.JolieEppUtils;
import org.chor.epp.impl.JolieProcessPrettyPrinter;
import org.chor.epp.impl.NameCollector;
import org.chor.epp.impl.ServiceProjector;
import org.chor.epp.impl.ThreadProjectionResult;
import org.chor.epp.impl.ThreadProjector;

public class JolieEpp
{
	private final File srcGenDirectory;
	private File targetDirectory;
	private final NameCollector nameCollector = new NameCollector();
	private final Map< String, URI > publicChannelLocations = new HashMap< String, URI >();
	private final Map< String, Map< String, URI > > serviceThreadLocations = new HashMap< String, Map< String, URI > >();
	private int threadTcpPort = 9000;

	public JolieEpp( File srcGenDirectory )
	{
		if ( srcGenDirectory.exists() == false ) {
			srcGenDirectory.mkdirs();
		}
		this.srcGenDirectory = srcGenDirectory;
	}
	
	private URI getServiceThreadLocation( String publicChannel, String role )
	{
		Map< String, URI > map = serviceThreadLocations.get( publicChannel );
		if ( map == null ) {
			map = new HashMap< String, URI >();
			serviceThreadLocations.put( publicChannel, map );
		}
		URI location = map.get( role );
		if ( location == null ) {
			location = getFreshInputLocation();
			map.put( role, location );
		}
		return location;
	}
	
	/*private URI getThreadInputLocation( String thread )
	{
		URI location = threadLocations.get( thread );
		if ( location == null ) {
			location = URI.create( "socket://localhost:" + threadTcpPort++ + "/" );
			threadLocations.put( thread, location );
		}
		return location;
	}*/
	
	private URI getPublicChannelLocation( String publicChannel )
	{
		URI location = publicChannelLocations.get( publicChannel );
		if ( location == null ) {
			location = getFreshInputLocation();
			publicChannelLocations.put( publicChannel, location );
		}
		return location;
	}
	
	private URI getFreshInputLocation()
	{
		return URI.create( "socket://localhost:" + threadTcpPort++ + "/" );
	}
	
	/*private URI getTargetThreadLocation( String thread )
	{
		if ( nameCollector.isActiveThread( thread ) ) {
			return getThreadInputLocation( thread );
		} else {
			//return getServiceThreadInputLocation( thread );
			//return URIthread;
		}
	}*/
	
	/*private URI getServiceThreadLocation( String thread )
	{
		
	}*/
	
	private Map< String, TypeDefinition > addTypes( jolie.lang.parse.ast.Program jolieProgram, ThreadProjectionResult result )
	{
		Map< String, TypeDefinition > types = new HashMap< String, TypeDefinition >();
		TypeInlineDefinition type;
		for( String compositeRole : result.compositeRoles() ) {
			type = new TypeInlineDefinition(
				JolieEppUtils.PARSING_CONTEXT,
				compositeRole,
				NativeType.ANY,
				new Range( 1, 1 )
			);
			type.putSubType( new TypeInlineDefinition(
				JolieEppUtils.PARSING_CONTEXT,
				JolieEppUtils.TID_VARNAME,
				NativeType.STRING,
				new Range( 1, 1 )
			));
			jolieProgram.addChild( type );
			types.put( compositeRole, type );
		}
		return types;
	}
	
	private void addCorrelationSets( jolie.lang.parse.ast.Program jolieProgram, ThreadProjectionResult result )
	{
		for( String compositeRole : result.compositeRoles() ) {
			List< CorrelationVariableInfo > csetVars = new ArrayList< CorrelationVariableInfo >();
			List< CorrelationAliasInfo > aliases = new ArrayList< CorrelationAliasInfo >();
			aliases.add( new CorrelationAliasInfo(
				JolieEppUtils.getMessageTypeName( compositeRole ),
				//JolieEppUtils.variableNameToJolieVariablePath( compositeRole ) )
				JolieEppUtils.variableNameToJolieVariablePath( JolieEppUtils.TID_VARNAME )
			));
			csetVars.add( new CorrelationVariableInfo(
				JolieEppUtils.variableNameToJolieVariablePath( JolieEppUtils.TID_VARNAME ),
				//JolieEppUtils.variableNameToJolieVariablePath( compositeRole ),
				aliases
			));
			CorrelationSetInfo csetInfo = new CorrelationSetInfo( JolieEppUtils.PARSING_CONTEXT, csetVars );
			jolieProgram.addChild( csetInfo );
		}
	}
	
	private void addInputInterfaceAndPort( jolie.lang.parse.ast.Program jolieProgram, ThreadProjectionResult result, Map< String, TypeDefinition > types, URI location )
	{
		InputPortInfo port = new InputPortInfo(
			JolieEppUtils.PARSING_CONTEXT,
			JolieEppUtils.SELF_INPUT_PORT_NAME,
			location,
			"sodep",
			null,
			null,
			null
		);
		
		InterfaceDefinition iface = new InterfaceDefinition( JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.SELF_INPUT_PORT_NAME + "Interface" );
		OneWayOperationDeclaration decl;
		for( String compositeRole : result.compositeRoles() ) {
			for( String operation : result.inputOperationsForCorrelationSet( compositeRole ) ) {
				decl = new OneWayOperationDeclaration( JolieEppUtils.PARSING_CONTEXT, operation );
				decl.setRequestType( types.get( compositeRole ) );
				iface.addOperation( decl );
			}
		}
		for( String operation : result.uncorrelatedInputOperations() ) {
			decl = new OneWayOperationDeclaration( JolieEppUtils.PARSING_CONTEXT, operation );
			iface.addOperation( decl );
		}
		
		port.addInterface( iface );

		if ( !iface.operationsMap().isEmpty() ) {
			jolieProgram.addChild( iface );
			jolieProgram.addChild( port );
		}
	}
	
	private void addOutputInterfacesAndPorts( jolie.lang.parse.ast.Program jolieProgram, ThreadProjectionResult result )
	{
		for( OutputPortInfo port : result.outputPorts().values() ) {
			if ( nameCollector.publicChannels().contains( port.id() ) ) {
				// It's a port towards a public channel
				port.setLocation( getPublicChannelLocation( port.id() ) );
			}
			jolieProgram.addChild( port );
		}
	}
	
	private void projectActiveThread( String thread, Program program )
		throws EndpointProjectionException, IOException
	{
		jolie.lang.parse.ast.Program jolieProgram = new jolie.lang.parse.ast.Program( JolieEppUtils.PARSING_CONTEXT );
		jolieProgram.addChild( new ExecutionInfo( JolieEppUtils.PARSING_CONTEXT, ExecutionMode.SINGLE ) );
		
		ThreadProjectionResult result = ThreadProjector.projectActiveThread( thread, program.getChoreography() );
		Map< String, TypeDefinition > types = addTypes( jolieProgram, result );
		addOutputInterfacesAndPorts( jolieProgram, result );
		addInputInterfaceAndPort( jolieProgram, result, types, getFreshInputLocation() );
		addCorrelationSets( jolieProgram, result );
		
		OLSyntaxNode jolieMainNode = result.jolieNode();
		jolieMainNode = new DefinitionNode( JolieEppUtils.PARSING_CONTEXT, "main", jolieMainNode );
		jolieProgram.addChild( jolieMainNode );
		StringWriter w = new StringWriter();
		JolieProcessPrettyPrinter printer = new JolieProcessPrettyPrinter( w, jolieProgram );
		printer.run();
		OutputStream ostream = new FileOutputStream( targetDirectory.getAbsolutePath() + File.separator + thread + ".ol" );
		Writer fileWriter = new OutputStreamWriter( ostream );
		fileWriter.write( w.toString() );
		fileWriter.flush();
		ostream.close();
	}
	
	private void projectActiveThreads( Program program )
		throws EndpointProjectionException, IOException
	{
		for( String thread : nameCollector.activeThreads() ) {
			projectActiveThread( thread, program );
		}
	}
	
	private void writeJolieFile( String filename, jolie.lang.parse.ast.Program jolieProgram, String... preamble )
		throws IOException
	{
		StringWriter w = new StringWriter();
		JolieProcessPrettyPrinter printer = new JolieProcessPrettyPrinter( w, jolieProgram );
		printer.run();
		OutputStream ostream = new FileOutputStream( targetDirectory.getAbsolutePath() + File.separator + filename + ".ol" );
		Writer fileWriter = new OutputStreamWriter( ostream );
		for( String s : preamble ) {
			fileWriter.write( s );
		}
		fileWriter.write( w.toString() );
		fileWriter.flush();
		fileWriter.close();
		ostream.close();
	}
	
	private jolie.lang.parse.ast.Program buildJolieServiceProgram( String publicChannel, String role, Program program )
		throws EndpointProjectionException
	{
		ThreadProjectionResult result = ServiceProjector.projectService( publicChannel, role, program );
		
		jolie.lang.parse.ast.Program jolieProgram = new jolie.lang.parse.ast.Program( JolieEppUtils.PARSING_CONTEXT );
		jolieProgram.addChild( new ExecutionInfo( JolieEppUtils.PARSING_CONTEXT, ExecutionMode.CONCURRENT ) );
		Map< String, TypeDefinition > types = addTypes( jolieProgram, result );
		addOutputInterfacesAndPorts( jolieProgram, result );
		addInputInterfaceAndPort( jolieProgram, result, types, getServiceThreadLocation( publicChannel, role ) );
		addCorrelationSets( jolieProgram, result );

		OLSyntaxNode jolieMainNode = new DefinitionNode( JolieEppUtils.PARSING_CONTEXT, "main", result.jolieNode() );
		jolieProgram.addChild( jolieMainNode );
		return jolieProgram;
	}

	private void projectServiceThreads( Program program )
		throws EndpointProjectionException, IOException
	{
		for( String publicChannel : nameCollector.publicChannels() ) {
			for( String role : nameCollector.getPublicChannelServiceRoles( publicChannel ) ) {
				writeJolieFile(
					publicChannel + "_" + role,
					buildJolieServiceProgram( publicChannel, role, program )
				);
			}
		}
	}
	
	private void projectStartServers( Program program )
		throws IOException
	{
		for( String publicChannel : nameCollector.publicChannels() ) {
			writeJolieFile(
				publicChannel,
				buildJolieStartServerProgram( publicChannel ),
				"include \"runtime.iol\"\n\n"
			);
		}
	}
	
	private void addStartServerPreamble( String publicChannel, jolie.lang.parse.ast.Program jolieProgram )
	{
		TypeInlineDefinition fireType = new TypeInlineDefinition( JolieEppUtils.PARSING_CONTEXT, "FireType", NativeType.VOID, new Range( 1, 1 ) );
		fireType.putSubType( new TypeInlineDefinition( JolieEppUtils.PARSING_CONTEXT, "sid", NativeType.STRING, new Range( 1, 1 ) ) );
		jolieProgram.addChild( fireType );
		
		InterfaceDefinition fireInterface = new InterfaceDefinition( JolieEppUtils.PARSING_CONTEXT, "FireInterface" );
		OneWayOperationDeclaration fireOp = new OneWayOperationDeclaration( JolieEppUtils.PARSING_CONTEXT, "fire" );
		fireOp.setRequestType( fireType );
		fireInterface.addOperation( fireOp );
		jolieProgram.addChild( fireInterface );
		
		InterfaceDefinition publicInterface = new InterfaceDefinition( JolieEppUtils.PARSING_CONTEXT, "PublicInterface" );
		for( String role : nameCollector.getPublicChannelRoles( publicChannel ) ) {
			publicInterface.addOperation( new RequestResponseOperationDeclaration(
				JolieEppUtils.PARSING_CONTEXT, "_start_" + role, null, null, null
			));
		}
		jolieProgram.addChild( publicInterface );
		
		OutputPortInfo selfOutputPort = new OutputPortInfo( JolieEppUtils.PARSING_CONTEXT, "Self" );
		selfOutputPort.addInterface( fireInterface );
		jolieProgram.addChild( selfOutputPort );
		
		OutputPortInfo serviceOutputPort;
		for( String role : nameCollector.getPublicChannelServiceRoles( publicChannel ) ) {
			serviceOutputPort = new OutputPortInfo( JolieEppUtils.PARSING_CONTEXT, role );
			serviceOutputPort.addOperation( new OneWayOperationDeclaration( JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.Operations.SERVICE_THREAD_START ) );
			serviceOutputPort.setProtocolId( "sodep" );
			serviceOutputPort.setLocation( getServiceThreadLocation( publicChannel, role ) );
			jolieProgram.addChild( serviceOutputPort );
		}
		
		InputPortInfo privateInputPort = new InputPortInfo(
			JolieEppUtils.PARSING_CONTEXT,
			"SelfInput", URI.create( "local" ), null, null, null, null
		);
		privateInputPort.addInterface( fireInterface );
		jolieProgram.addChild( privateInputPort );
		
		InputPortInfo publicInputPort = new InputPortInfo(
			JolieEppUtils.PARSING_CONTEXT,
			"PublicInput", getPublicChannelLocation( publicChannel ), "sodep", null, null, null
		);
		publicInputPort.addInterface( publicInterface );
		jolieProgram.addChild( publicInputPort );
		
		List< CorrelationVariableInfo > csetVars = new ArrayList< CorrelationVariableInfo >();
		List< CorrelationAliasInfo > aliases = new ArrayList< CorrelationAliasInfo >();
		aliases.add( new CorrelationAliasInfo(
			JolieEppUtils.getMessageTypeName( fireType.id() ),
			JolieEppUtils.variableNameToJolieVariablePath( "sid" )
		));
		csetVars.add( new CorrelationVariableInfo(
			JolieEppUtils.variableNameToJolieVariablePath( "sid" ),
			aliases
		));
		CorrelationSetInfo csetInfo = new CorrelationSetInfo( JolieEppUtils.PARSING_CONTEXT, csetVars );
		jolieProgram.addChild( csetInfo );
	}
	
	private jolie.lang.parse.ast.Program buildJolieStartServerProgram( String publicChannel )
	{
		jolie.lang.parse.ast.Program jolieProgram = new jolie.lang.parse.ast.Program( JolieEppUtils.PARSING_CONTEXT );
		jolieProgram.addChild( new ExecutionInfo( JolieEppUtils.PARSING_CONTEXT, ExecutionMode.CONCURRENT ) );
		/*Map< String, TypeDefinition > types = addTypes( jolieProgram, result );
		addOutputInterfacesAndPorts( jolieProgram, result );
		addInputInterfaceAndPort( jolieProgram, result, types );
		addCorrelationSets( jolieProgram, result );*/
		
		addStartServerPreamble( publicChannel, jolieProgram );

		jolieProgram.addChild( new DefinitionNode( JolieEppUtils.PARSING_CONTEXT, "init",
			new SolicitResponseOperationStatement( JolieEppUtils.PARSING_CONTEXT, "getLocalLocation", "Runtime", null, JolieEppUtils.SessionStart.SELF_LOCATION_VARPATH, null )
		) );
		jolieProgram.addChild( new DefinitionNode( JolieEppUtils.PARSING_CONTEXT, "activeThreadCheck", buildStartServerActiveThreadCheck( publicChannel ) ) );
		if ( nameCollector.getPublicChannelServiceRoles( publicChannel ).isEmpty() == false ) {
			jolieProgram.addChild( new DefinitionNode( JolieEppUtils.PARSING_CONTEXT, "serviceThreadCheck", buildStartServerServiceThreadCheck( publicChannel ) ) );
		}
		OLSyntaxNode jolieMainNode = new DefinitionNode( JolieEppUtils.PARSING_CONTEXT, "main", buildStartServerMainCode( publicChannel ) );
		jolieProgram.addChild( jolieMainNode );
		return jolieProgram;
	}
	
	private OLSyntaxNode buildStartServerActiveThreadCheck( String publicChannel )
	{
		IfStatement ifStm = new IfStatement( JolieEppUtils.PARSING_CONTEXT );
		AndConditionNode condition = new AndConditionNode( JolieEppUtils.PARSING_CONTEXT );
		VariablePathNode path;
		for( String role : nameCollector.getPublicChannelActiveRoles( publicChannel ) ) {
			path = JolieEppUtils.variableNameToGlobalJolieVariablePath( "descTmp" );
			JolieEppUtils.appendSubNode( path, role );
			condition.addChild(
				new IsTypeExpressionNode( JolieEppUtils.PARSING_CONTEXT, CheckType.DEFINED, path )
			);
		}
		SequenceStatement startSequence;
		if ( nameCollector.getPublicChannelServiceRoles( publicChannel ).isEmpty() ) {
			startSequence = buildFireSequence( publicChannel );
		} else {
			startSequence = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
			for ( String role : nameCollector.getPublicChannelServiceRoles( publicChannel ) ) {
				startSequence.addChild( new NotificationOperationStatement(
					JolieEppUtils.PARSING_CONTEXT, "_start", role, null
				));
			}
		}
		ifStm.addChild( new Pair< OLSyntaxNode, OLSyntaxNode >( condition, startSequence ) );
		return ifStm;
	}
	
	private SequenceStatement buildFireSequence( String publicChannel )
	{
		SequenceStatement seq = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		
		seq.addChild( new UndefStatement( JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.SessionStart.GLOBAL_SESSION_DESCRIPTOR_VARPATH ) );
		seq.addChild( new DeepCopyStatement( JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.SessionStart.GLOBAL_SESSION_DESCRIPTOR_VARPATH, JolieEppUtils.SessionStart.GLOBAL_TMP_SESSION_DESCRIPTOR_VARPATH ) );
		seq.addChild( new UndefStatement( JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.SessionStart.GLOBAL_TMP_SESSION_DESCRIPTOR_VARPATH ) );
		
		VariablePathNode f = JolieEppUtils.variableNameToJolieVariablePath( "f" );
		VariablePathNode sid = JolieEppUtils.variableNameToJolieVariablePath( "f" );
		JolieEppUtils.appendSubNode( sid, "sid" );
		VariablePathNode roleSid;
		for( String role : nameCollector.getPublicChannelRoles( publicChannel ) ) {
			roleSid = JolieEppUtils.variableNameToGlobalJolieVariablePath( role );
			JolieEppUtils.appendSubNode( roleSid, "sid" );
			seq.addChild( new AssignStatement( JolieEppUtils.PARSING_CONTEXT, sid, roleSid ) );
			seq.addChild( new UndefStatement( JolieEppUtils.PARSING_CONTEXT, roleSid ) );
			seq.addChild( new NotificationOperationStatement( JolieEppUtils.PARSING_CONTEXT, "fire", "Self", f ) );
		}
		return seq;
	}
	
	private OLSyntaxNode buildStartServerServiceThreadCheck( String publicChannel )
	{
		IfStatement ifStm = new IfStatement( JolieEppUtils.PARSING_CONTEXT );
		AndConditionNode condition = new AndConditionNode( JolieEppUtils.PARSING_CONTEXT );
		VariablePathNode path;
		for( String role : nameCollector.getPublicChannelRoles( publicChannel ) ) {
			path = JolieEppUtils.variableNameToGlobalJolieVariablePath( "descTmp" );
			JolieEppUtils.appendSubNode( path, role );
			condition.addChild(
				new IsTypeExpressionNode( JolieEppUtils.PARSING_CONTEXT, CheckType.DEFINED, path )
			);
		}
		ifStm.addChild( new Pair< OLSyntaxNode, OLSyntaxNode >( condition, buildFireSequence( publicChannel ) ) );
		return ifStm;
	}

	private OLSyntaxNode buildStartServerMainCode( String publicChannel )
	{
		NDChoiceStatement choice = new NDChoiceStatement( JolieEppUtils.PARSING_CONTEXT );
		SequenceStatement seq, syncSeq;
		VariablePathNode path;
		String definitionName;
		for( String role : nameCollector.getPublicChannelRoles( publicChannel ) ) {
			seq = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
			seq.addChild( new AssignStatement(
				JolieEppUtils.PARSING_CONTEXT,
				JolieEppUtils.getCorrelationVariablePath( "sid" ),
				new FreshValueExpressionNode( JolieEppUtils.PARSING_CONTEXT )
			));
			path = JolieEppUtils.variableNameToGlobalJolieVariablePath( role );
			JolieEppUtils.appendSubNode( path, "sid" );
			seq.addChild( new AssignStatement(
				JolieEppUtils.PARSING_CONTEXT,
				path,
				JolieEppUtils.getCorrelationVariablePath( "sid" )
			));
			syncSeq = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
			seq.addChild( new SynchronizedStatement( JolieEppUtils.PARSING_CONTEXT, "SessionStart", syncSeq ) );
			path = JolieEppUtils.variableNameToGlobalJolieVariablePath( "descTmp" );
			JolieEppUtils.appendSubNode( path, role );
			syncSeq.addChild( new DeepCopyStatement(
				JolieEppUtils.PARSING_CONTEXT,
				path,
				JolieEppUtils.SessionStart.THREAD_REF_VARPATH
			));
			if ( nameCollector.getPublicChannelActiveRoles( publicChannel ).contains( role ) ) {
				definitionName = "activeThreadCheck";
			} else {
				definitionName = "serviceThreadCheck";
			}
			syncSeq.addChild( new DefinitionCallStatement( JolieEppUtils.PARSING_CONTEXT, definitionName ) );
			seq.addChild( new OneWayOperationStatement( JolieEppUtils.PARSING_CONTEXT, "fire", null ) );
			
			choice.addChild( new Pair< OLSyntaxNode, OLSyntaxNode >(
				new RequestResponseOperationStatement(
					JolieEppUtils.PARSING_CONTEXT,
					"_start_" + role,
					JolieEppUtils.SessionStart.THREAD_REF_VARPATH,
					JolieEppUtils.SessionStart.GLOBAL_SESSION_DESCRIPTOR_VARPATH,
					seq
				),
				new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT )
			));
		}
		return choice;
	}

	public void epp( Program program )
		throws EndpointProjectionException, IOException
	{
		targetDirectory = new File( srcGenDirectory.getAbsolutePath() + File.separator + "epp" );
		FileUtils.deleteDirectory( targetDirectory );
		targetDirectory.mkdir();

		nameCollector.collect( program.getChoreography() );
		projectActiveThreads( program );
		projectServiceThreads( program );
		projectStartServers( program );
	}
	
	public Boolean caseInteraction( Interaction n )
	{
		return true;
	}
}
