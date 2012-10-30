/***************************************************************************
 *   Copyright (C) 2011-2012 by Fabrizio Montesi <famontesi@gmail.com>     *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU Library General Public License as       *
 *   published by the Free Software Foundation; either version 2 of the    *
 *   License, or (at your option) any later version.                       *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU Library General Public     *
 *   License along with this program; if not, write to the                 *
 *   Free Software Foundation, Inc.,                                       *
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.             *
 *                                                                         *
 *   For details about the authors of this software, see the AUTHORS file. *
 ***************************************************************************/


package org.chor.epp.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import jolie.lang.NativeType;
import jolie.lang.parse.ast.AssignStatement;
import jolie.lang.parse.ast.DeepCopyStatement;
import jolie.lang.parse.ast.DefinitionCallStatement;
import jolie.lang.parse.ast.IfStatement;
import jolie.lang.parse.ast.NotificationOperationStatement;
import jolie.lang.parse.ast.NullProcessStatement;
import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.OneWayOperationStatement;
import jolie.lang.parse.ast.RequestResponseOperationStatement;
import jolie.lang.parse.ast.SequenceStatement;
import jolie.lang.parse.ast.SolicitResponseOperationStatement;
import jolie.lang.parse.ast.TypeCastExpressionNode;
import jolie.lang.parse.ast.VariablePathNode;
import jolie.lang.parse.ast.expression.FreshValueExpressionNode;
import jolie.util.Pair;

import org.chor.chor.Call;
import org.chor.chor.Choreography;
import org.chor.chor.Delegation;
import org.chor.chor.IfThenElse;
import org.chor.chor.Interaction;
import org.chor.chor.LocalAskCommand;
import org.chor.chor.LocalAssignmentCommand;
import org.chor.chor.LocalShowCommand;
import org.chor.chor.Procedure;
import org.chor.chor.SessionProcedureParameter;
import org.chor.chor.Site;
import org.chor.chor.Start;
import org.chor.chor.ThreadWithRole;
import org.chor.chor.util.ChorSwitch;
import org.chor.epp.EndpointProjectionException;
import org.chor.epp.impl.merging.MergeUtils;
import org.chor.epp.impl.merging.MergingException;

public class ThreadProjector extends ChorSwitch< ThreadProjectionResult >
{
	private static class TypeEnvironment
	{
		// thread -> session -> role
		private final Map< String, Map< String, String > > theta = new HashMap< String, Map< String, String > >();
		
		// session -> threads (with role)
		private final Map< String, List< ThreadWithRole > > threadsInSession = new HashMap< String, List< ThreadWithRole > >();
		
		// session -> public channel
		private final Map< String, Site > sessionPublicChannels = new HashMap< String, Site >();
		
		// session -> start
		//private final Map< String, Start > sessionStarts = new HashMap< String, Start >();
		
		private TypeEnvironment() {}
		
		private TypeEnvironment( TypeEnvironment other )
		{
			for( Entry< String, Map< String, String > > entry : other.theta.entrySet() ) {
				Map< String, String > map = new HashMap< String, String >();
				map.putAll( entry.getValue() );
				theta.put( entry.getKey(), map );
			}
			
			for( Entry< String, List< ThreadWithRole > > entry : other.threadsInSession.entrySet() ) {
				List< ThreadWithRole > list = new ArrayList< ThreadWithRole >();
				list.addAll( entry.getValue() );
				threadsInSession.put( entry.getKey(), list );
			}
			
			sessionPublicChannels.putAll( other.sessionPublicChannels );
		}
		
		public void update( Start n )
		{
			for( ThreadWithRole twr : n.getActiveThreads() ) {
				updateTheta( twr.getThread(), n.getSession(), twr.getRole() );
			}
			for( ThreadWithRole twr : n.getServiceThreads() ) {
				updateTheta( twr.getThread(), n.getSession(), twr.getRole() );
			}
			List< ThreadWithRole > threads = new ArrayList< ThreadWithRole >( n.getActiveThreads().size() + n.getServiceThreads().size() );
			threads.addAll( n.getActiveThreads() );
			threads.addAll( n.getServiceThreads() );
			threadsInSession.put( n.getSession(), threads );
			
			sessionPublicChannels.put( n.getSession(), n.getPublicChannel() );
		}
		
		public void update( Delegation n )
		{
			updateTheta( n.getReceiver(), n.getDelegatedSession(), getThreadRole( n.getSender(), n.getDelegatedSession() ) );
			removeFromTheta( n.getSender(), n.getDelegatedSession() );
		}
		
		private void removeFromTheta( String thread, String session )
		{
			Map< String, String > map = theta.get( thread );
			if ( map != null ) {
				map.remove( session );
			}
		}
		
		private void updateTheta( String thread, String session, String role )
		{
			Map< String, String > map = theta.get( thread );
			if ( map == null ) {
				map = new HashMap< String, String >();
				theta.put( thread, map );
			}
			map.put( session, role );
		}
		
		public boolean isThreadInSession( String thread, String session )
		{
			if ( theta.containsKey( thread ) ) {
				return theta.get( thread ).containsKey( session );
			}
			
			return false;
		}
		
		public List< String > getRolesForSession( String session )
		{
			List< ThreadWithRole > twrList = threadsInSession.get( session );
			List< String > ret = new ArrayList< String >( twrList.size() );
			for( ThreadWithRole twd : twrList ) {
				ret.add( twd.getRole() );
			}
			
			return ret;
		}
		
		public List< String > getThreadsForSession( String session )
		{
			List< ThreadWithRole > twrList = threadsInSession.get( session );
			List< String > ret = new ArrayList< String >( twrList.size() );
			for( ThreadWithRole twd : twrList ) {
				ret.add( twd.getThread() );
			}
			
			return ret;
		}

		public String getThreadRole( String thread, String session )
		{
			String role = null;
			Map< String, String > map = theta.get( thread );
			if ( map != null ) {
				role = map.get( session );
			}
			
			return role;
		}
		
		public Site getSessionPublicChannel( String session )
		{
			return sessionPublicChannels.get( session );
		}
	}
	
	private class CallTyping {
		private final Call call;
		private final Integer index;
		private final TypeEnvironment typeEnvironment;
		
		private CallTyping( Call call, Integer index, TypeEnvironment typeEnvironment )
		{
			this.call = call;
			this.index = index;
			this.typeEnvironment = typeEnvironment;
		}
	}
	
	private final String thread;
	private Exception errorException = null;
	private boolean alreadyStarted = false;
	private TypeEnvironment typeEnvironment = new TypeEnvironment();
	private final List< CallTyping > calls = new ArrayList< CallTyping >();
	
	private ThreadProjector( String thread )
	{
		this.thread = thread;
	}
	
	private void error( Exception e )
	{
		if ( errorException == null ) {
			errorException = e;
		}
	}
	
	public static ThreadProjectionResult projectActiveThread( String thread, Choreography choreography )
		throws EndpointProjectionException, MergingException
	{
		ThreadProjector projector = new ThreadProjector( thread );
		projector.alreadyStarted = true;
		ThreadProjectionResult ret = projector.doSwitch( choreography );
		projector.projectProcedures( ret );
		
		if ( projector.errorException != null ) {
			throw new EndpointProjectionException( projector.errorException );
		}
		return ret;
	}

	public static ThreadProjectionResult projectServiceThread( String thread, Choreography choreography )
		throws EndpointProjectionException, MergingException
	{
		ThreadProjector projector = new ThreadProjector( thread );
		projector.alreadyStarted = false;
		ThreadProjectionResult ret = projector.doSwitch( choreography );
		projector.projectProcedures( ret );

		if ( projector.errorException != null ) {
			throw new EndpointProjectionException( projector.errorException );
		}
		return ret;
	}
	
	private void projectProcedures( ThreadProjectionResult result )
		throws MergingException
	{
		if ( calls.isEmpty() ) {
			return;
		}
		
		ThreadProjector projector;
		ThreadProjectionResult procResult;
		String threadName;
		
		CallTyping callTyping;
		for( int i = 0; i < calls.size(); i++ ) {
			callTyping = calls.get( i );
			threadName = callTyping.call.getProcedure().getThreadParameters().get( callTyping.index );
			projector = new ThreadProjector( threadName );
			projector.alreadyStarted = true;

			injectProcedureTyping( callTyping, projector.typeEnvironment, callTyping.call );

			procResult = projector.doSwitch( callTyping.call.getProcedure().getChoreography() );
			if ( projector.errorException != null ) {
				error( projector.errorException );
			}
			
			boolean found;
			for( CallTyping subCall : projector.calls ) {
				found = false;
				for( CallTyping myPair : calls ) {
					if ( myPair.call.getProcedure() == subCall.call.getProcedure()
						 && myPair.index == subCall.index ) {
						found = true;
					}
				}
				if ( !found ) {
					calls.add( subCall );
				}
			}
			
			result.mergeNamesOnly( procResult );
			
			if ( result.procedureProjections().containsKey( callTyping.call ) ) {
				result.procedureProjections().get( callTyping.call.getProcedure().getName() ).merge( procResult );
			} else {
				result.procedureProjections().put( callTyping.call.getProcedure().getName(), procResult );
			}
		}
	}
	
	private void injectProcedureTyping( CallTyping callTyping, TypeEnvironment procTyping, Call call )
	{
		Procedure proc = call.getProcedure();
		int sessionIndex = 0;
		for( SessionProcedureParameter param : proc.getSessionParameters() ) {
			procTyping.sessionPublicChannels.put(
				param.getSession(),
				callTyping.typeEnvironment.sessionPublicChannels.get( call.getSessions().get( sessionIndex ) )
			);
			procTyping.threadsInSession.put( param.getSession(), param.getActiveThreads() );
			
			for( ThreadWithRole twr : param.getActiveThreads() ) {
				procTyping.updateTheta( twr.getThread(), param.getSession(), twr.getRole() );
			}
			sessionIndex++;
		}
	}

	private void addOutputPortAssignmentsAfterStart( SequenceStatement seq, Start n )
	{
		List< ThreadWithRole > list = new ArrayList< ThreadWithRole >( n.getActiveThreads().size() + n.getServiceThreads().size() );
		list.addAll( n.getActiveThreads() );
		list.addAll( n.getServiceThreads() );
		for( ThreadWithRole t : list ) {
			if ( t.getThread().equals( thread ) == false ) {
				addOutputPortBindingAssignment( seq, n.getSession(), t.getRole() );
			}
		}
	}
	
	private void addOutputPortAssignmentsAfterDelegation( SequenceStatement seq, Delegation n )
	{
		for( String role : typeEnvironment.getRolesForSession( n.getDelegatedSession() ) ) {
			addOutputPortBindingAssignment( seq, n.getDelegatedSession(), role );
		}
	}
	
	private void addOutputPortBindingAssignment( SequenceStatement seq, String session, String role )
	{
		VariablePathNode sessionDescriptorForRole = JolieEppUtils.getSessionDescriptorPath( session );
		JolieEppUtils.appendSubNode( sessionDescriptorForRole, role );
		JolieEppUtils.appendSubNode( sessionDescriptorForRole, "binding" );
		seq.addChild( new DeepCopyStatement(
			JolieEppUtils.PARSING_CONTEXT,
			JolieEppUtils.variableNameToJolieVariablePath( getOutputPortNameForOutput( session, role ) ),
			sessionDescriptorForRole
		));
	}
	
	private String getCorrelationVariableName( String thread, String session )
	{
		return
			typeEnvironment.getSessionPublicChannel( session ).getProtocol().getName() + "_" +
			typeEnvironment.getThreadRole( thread, session );
	}
	
	private boolean tidInitialized = false;

	public ThreadProjectionResult caseStart( Start n )
	{
		ThreadProjectionResult result = new ThreadProjectionResult();
		boolean proceed = true;

		typeEnvironment.update( n );
		SequenceStatement seq = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		for( ThreadWithRole t : n.getActiveThreads() ) {
			if ( t.getThread().equals( thread ) ) {
				if ( tidInitialized == false ) {
					seq.addChild( new AssignStatement(
						JolieEppUtils.PARSING_CONTEXT,
						JolieEppUtils.getCorrelationVariablePath(
							JolieEppUtils.TID_VARNAME
							//getCorrelationVariableName( thread, n.getSession() )
						),
						new FreshValueExpressionNode( JolieEppUtils.PARSING_CONTEXT )
					));
					tidInitialized = true;
				}
				seq.addChild( new DeepCopyStatement(
					JolieEppUtils.PARSING_CONTEXT,
					JolieEppUtils.SELFREF_BINDING_VARPATH,
					JolieEppUtils.SELF_INPUT_PORT
				));
				seq.addChild( new AssignStatement(
					JolieEppUtils.PARSING_CONTEXT,
					JolieEppUtils.SELFREF_TID_VARPATH,
					JolieEppUtils.getCorrelationVariablePath(
						JolieEppUtils.TID_VARNAME
						//getCorrelationVariableName( thread, n.getSession() )
					)
					//new VariableExpressionNode( JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.getCorrelationVariablePath( n.getSession() ) )
				));
				seq.addChild( new SolicitResponseOperationStatement(
					JolieEppUtils.PARSING_CONTEXT,
					"_start_" + t.getRole(),
					n.getPublicChannel().getName(),
					JolieEppUtils.SELFREF_VARPATH,
					JolieEppUtils.getSessionDescriptorPath( n.getSession() ),
					null
				));
				addOutputPortAssignmentsAfterStart( seq, n );
				result.addRRToOutputPort( n.getPublicChannel().getName(), "_start_" + t.getRole() );
			}
		}
		
		for( ThreadWithRole t : n.getServiceThreads() ) {
			if ( t.getThread().equals( thread ) ) {
				if ( alreadyStarted ) {
					proceed = false; // Thread name has been overridden
				} else {
					alreadyStarted = true;
					result.uncorrelatedInputOperations().add( JolieEppUtils.Operations.SERVICE_THREAD_START );
					seq.addChild( new OneWayOperationStatement(
						JolieEppUtils.PARSING_CONTEXT,
						JolieEppUtils.Operations.SERVICE_THREAD_START,
						null
					));
					if ( tidInitialized == false ) {
						seq.addChild( new AssignStatement(
							JolieEppUtils.PARSING_CONTEXT,
							JolieEppUtils.getCorrelationVariablePath(
								JolieEppUtils.TID_VARNAME
								//getCorrelationVariableName( thread, n.getSession() )
							),
							new FreshValueExpressionNode( JolieEppUtils.PARSING_CONTEXT )
						));
						tidInitialized = true;
					}
					seq.addChild( new DeepCopyStatement(
						JolieEppUtils.PARSING_CONTEXT,
						JolieEppUtils.SELFREF_BINDING_VARPATH,
						JolieEppUtils.SELF_INPUT_PORT
					));
					seq.addChild( new AssignStatement(
						JolieEppUtils.PARSING_CONTEXT,
						JolieEppUtils.SELFREF_TID_VARPATH,
						JolieEppUtils.getCorrelationVariablePath(
							JolieEppUtils.TID_VARNAME
							//getCorrelationVariableName( thread, n.getSession() )
						)
						//new VariableExpressionNode( JolieEppUtils.PARSING_CONTEXT, JolieEppUtils.getCorrelationVariablePath( n.getSession() ) )
					));
					seq.addChild( new SolicitResponseOperationStatement(
						JolieEppUtils.PARSING_CONTEXT,
						"_start_" + t.getRole(),
						n.getPublicChannel().getName(),
						JolieEppUtils.SELFREF_VARPATH,
						JolieEppUtils.getSessionDescriptorPath( n.getSession() ),
						null
					));
					addOutputPortAssignmentsAfterStart( seq, n );
					result.addRRToOutputPort( n.getPublicChannel().getName(), "_start_" + t.getRole() );
				}
			}
		}

		if ( n.getContinuation() == null || proceed == false ) {
			if ( seq.children().isEmpty() ) {
				return result;
			}
		} else {
			ThreadProjectionResult res = doSwitch( n.getContinuation() );
			seq.addChild( res.jolieNode() );
			result.mergeNamesOnly( res );
		}
		result.setJolieNode( seq );
		return result;
	}
	
	public ThreadProjectionResult caseIfThenElse( IfThenElse n )
	{
		ThreadProjectionResult result = new ThreadProjectionResult();
		ThreadProjectionResult resThen = null, resElse = null;
		TypeEnvironment typeEnvironmentBackup = new TypeEnvironment( typeEnvironment );
		resThen = doSwitch( n.getThen() );
		result.mergeNamesOnly( resThen );
		if ( n.getElse() != null ) {
			typeEnvironment = typeEnvironmentBackup;
			resElse = doSwitch( n.getElse() );
			result.mergeNamesOnly( resElse );
		}

		if ( n.getThread().equals( thread ) ) {
			IfStatement jolieStatement = new IfStatement( JolieEppUtils.PARSING_CONTEXT );
			jolieStatement.addChild( new Pair< OLSyntaxNode, OLSyntaxNode > (
				ConditionProjector.project( n.getCondition() ), resThen.jolieNode()
			));
			if ( resElse != null ) {
				jolieStatement.setElseProcess( resElse.jolieNode() );
			}
			result.setJolieNode( jolieStatement );
		} else {
			OLSyntaxNode jolieNode = null;
			try {
				jolieNode = MergeUtils.optimizeAndMerge( resElse.jolieNode(), resThen.jolieNode() );
			} catch( MergingException e ) {
				error( new MergingException( thread, e ) );
			}
			result.setJolieNode( jolieNode );
		}
		
		return result;
	}
	
	private String getOutputPortNameForOutput( String session, String role )
	{
		return session + "_" + role;
	}
	
	public ThreadProjectionResult caseLocalAskCommand( LocalAskCommand n )
	{
		ThreadProjectionResult result = new ThreadProjectionResult();
		SequenceStatement seq = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		if ( n.getThread().equals( thread ) ) {
			seq.addChild( new SolicitResponseOperationStatement(
				JolieEppUtils.PARSING_CONTEXT,
				"showInputDialog", "SwingUI",
				ExpressionProjector.project( n.getQuestion() ),
				JolieEppUtils.variableNameToJolieVariablePath( n.getResultVariable() ),
				null )
			);
			result.addInclude( "ui/swing_ui" );
		}
		
		if ( n.getContinuation() == null ) {
			if ( seq.children().isEmpty() ) {
				return result;
			}
		} else {
			ThreadProjectionResult res = doSwitch( n.getContinuation() );
			result.mergeNamesOnly( res );
			seq.addChild( res.jolieNode() );
		}
		
		result.setJolieNode( seq );
		return result;
	}
	
	public ThreadProjectionResult caseLocalAssignmentCommand( LocalAssignmentCommand n )
	{
		ThreadProjectionResult result = new ThreadProjectionResult();
		SequenceStatement seq = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		if ( n.getThread().equals( thread ) ) {
			seq.addChild( new AssignStatement(
				JolieEppUtils.PARSING_CONTEXT,
				JolieEppUtils.variableNameToJolieVariablePath( n.getVariable() ),
				ExpressionProjector.project( n.getExpression() )
			));
		}
		
		if ( n.getContinuation() == null ) {
			if ( seq.children().isEmpty() ) {
				return result;
			}
		} else {
			ThreadProjectionResult res = doSwitch( n.getContinuation() );
			result.mergeNamesOnly( res );
			seq.addChild( res.jolieNode() );
		}
		
		result.setJolieNode( seq );
		return result;
	}
	
	public ThreadProjectionResult caseLocalShowCommand( LocalShowCommand n )
	{
		ThreadProjectionResult result = new ThreadProjectionResult();
		SequenceStatement seq = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		if ( n.getThread().equals( thread ) ) {
			seq.addChild( new SolicitResponseOperationStatement(
				JolieEppUtils.PARSING_CONTEXT,
				"showMessageDialog", "SwingUI",
				new TypeCastExpressionNode(
					JolieEppUtils.PARSING_CONTEXT, NativeType.STRING, ExpressionProjector.project( n.getExpression() )
				), null, null
			) );
			result.addInclude( "ui/swing_ui" );
		}
		
		if ( n.getContinuation() == null ) {
			if ( seq.children().isEmpty() ) {
				return result;
			}
		} else {
			ThreadProjectionResult res = doSwitch( n.getContinuation() );
			result.mergeNamesOnly( res );
			seq.addChild( res.jolieNode() );
		}
		
		result.setJolieNode( seq );
		return result;
	}

	public ThreadProjectionResult caseInteraction( Interaction n )
	{
		ThreadProjectionResult result = new ThreadProjectionResult();
		SequenceStatement seq = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		if ( n.getSender().equals( thread ) ) {
			VariablePathNode outVarPath, tidVarPath;
			String varName = JolieEppUtils.getSimpleChorVariable( n.getSenderExpression() );
			if ( varName != null ) {
				// It's a simple variable
				outVarPath = JolieEppUtils.variableNameToJolieVariablePath( varName );
				tidVarPath = JolieEppUtils.variableNameToJolieVariablePath( varName );
				JolieEppUtils.appendSubNode( tidVarPath, "tid" );
			} else {
				// It's an expression
				outVarPath = JolieEppUtils.EXPRESSION_VARPATH;
				tidVarPath = JolieEppUtils.EXPRESSION_TID_VARPATH;
				if ( n.getSenderExpression() != null ) {
					seq.addChild( new AssignStatement(
						JolieEppUtils.PARSING_CONTEXT,
						outVarPath,
						ExpressionProjector.project( n.getSenderExpression() )
					));
				}
			}
			
			VariablePathNode receiverTidPath = JolieEppUtils.getSessionDescriptorPath( n.getSession() );
			JolieEppUtils.appendSubNode( receiverTidPath, typeEnvironment.getThreadRole( n.getReceiver(), n.getSession() ) );
			JolieEppUtils.appendSubNode( receiverTidPath, "tid" );
			seq.addChild( new AssignStatement(
				JolieEppUtils.PARSING_CONTEXT,
				tidVarPath,
				receiverTidPath
			));
			seq.addChild( new NotificationOperationStatement(
				JolieEppUtils.PARSING_CONTEXT,
				n.getOperation(),
				getOutputPortNameForOutput( n.getSession(), typeEnvironment.getThreadRole( n.getReceiver(), n.getSession() ) ),
				outVarPath
			));
			result.addOWToOutputPort( getOutputPortNameForOutput( n.getSession(), typeEnvironment.getThreadRole( n.getReceiver(), n.getSession() ) ), n.getOperation() );
		} else if ( n.getReceiver().equals( thread ) ) {
			result.inputOperationsForCorrelationSet(
				getCorrelationVariableName( n.getSender(), n.getSession() )
			).add( n.getOperation() );
			seq.addChild( new OneWayOperationStatement(
				JolieEppUtils.PARSING_CONTEXT,
				n.getOperation(),
				JolieEppUtils.variableNameToJolieVariablePath( n.getReceiverVariable() )
			));
		}

		if ( n.getContinuation() == null ) {
			if ( seq.children().isEmpty() ) {
				return result;
			}
		} else {
			ThreadProjectionResult res = doSwitch( n.getContinuation() );
			result.mergeNamesOnly( res );
			seq.addChild( res.jolieNode() );
		}

		result.setJolieNode( seq );
		return result;
	}
	
	public ThreadProjectionResult caseCall( Call n )
	{
		ThreadProjectionResult result = new ThreadProjectionResult();
		SequenceStatement seq = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		result.setJolieNode( seq );
		
		int i = 0;
		for( ; i < n.getThreads().size(); i++ ) {
			if ( n.getThreads().get( i ).equals( thread ) ) {
				break;
			}
		}
		
		if ( i < n.getThreads().size() ) { // We found our thread in the call parameters
			addAssignmentsBeforeCall( seq, n );
			seq.addChild( new DefinitionCallStatement(
				JolieEppUtils.PARSING_CONTEXT,
				n.getProcedure().getName()
			));
			
			addCall( n, i );
		} else {
			result.setJolieNode( new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT ) );
		}
		
		return result;
	}
	
	private void addAssignmentsBeforeCall( SequenceStatement seq, Call n )
	{
		/*
		 * For each passed session in which this thread is in, we need to
		 * copy the session descriptor to the procedure parameter name and
		 * update the output port references.
		 */
		int i = 0;
		SessionProcedureParameter param;
		for( String session : n.getSessions() ) {
			if ( typeEnvironment.isThreadInSession( thread, session ) ) {
				param = n.getProcedure().getSessionParameters().get( i );
				
				seq.addChild( new DeepCopyStatement(
					JolieEppUtils.PARSING_CONTEXT,
					JolieEppUtils.getSessionDescriptorPath( param.getSession() ),
					JolieEppUtils.getSessionDescriptorPath( session )
				));
				for( ThreadWithRole twr : param.getActiveThreads() ) {
					addOutputPortBindingAssignment( seq, param.getSession(), twr.getRole() );
				}
			}
			i++;
		}
	}
	
	private void addCall( Call call, int threadParamIndex )
	{
		calls.add( new CallTyping( call, threadParamIndex, new TypeEnvironment( typeEnvironment ) ) );
	}
	
	public ThreadProjectionResult caseDelegation( Delegation n )
	{
		ThreadProjectionResult result = new ThreadProjectionResult();
		SequenceStatement seq = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		if ( n.getSender().equals( thread ) ) {
			// Update the binding in the session descriptor to the delegated thread
			VariablePathNode delegatedDescriptor = JolieEppUtils.getSessionDescriptorPath( n.getDelegatedSession() );;
			JolieEppUtils.appendSubNode( delegatedDescriptor, typeEnvironment.getThreadRole( n.getSender(), n.getDelegatedSession() ) );
			VariablePathNode receiverDescriptorPath = JolieEppUtils.getSessionDescriptorPath( n.getSession() );
			JolieEppUtils.appendSubNode( receiverDescriptorPath, typeEnvironment.getThreadRole( n.getReceiver(), n.getSession() ) );
			seq.addChild( new DeepCopyStatement( JolieEppUtils.PARSING_CONTEXT,
				delegatedDescriptor, receiverDescriptorPath
			));
			
			VariablePathNode outVarPath = JolieEppUtils.variableNameToJolieVariablePath( JolieEppUtils.DELEGATION_TMP_VARNAME );
			VariablePathNode tidVarPath = JolieEppUtils.variableNameToJolieVariablePath( JolieEppUtils.DELEGATION_TMP_VARNAME );
			JolieEppUtils.appendSubNode( tidVarPath, "tid" );

			// Add the binding information for the delegated session
			VariablePathNode delegatedDescriptorPath = JolieEppUtils.variableNameToJolieVariablePath( JolieEppUtils.DELEGATION_TMP_VARNAME );
			JolieEppUtils.appendSubNode( delegatedDescriptorPath, JolieEppUtils.SESSION_DESCRIPTOR );
			seq.addChild( new DeepCopyStatement(
				JolieEppUtils.PARSING_CONTEXT,
				delegatedDescriptorPath,
				JolieEppUtils.getSessionDescriptorPath( n.getDelegatedSession() )
			));

			// Add the session correlation information for reaching the receiver
			VariablePathNode receiverTidPath = JolieEppUtils.getSessionDescriptorPath( n.getSession() );
			JolieEppUtils.appendSubNode( receiverTidPath, typeEnvironment.getThreadRole( n.getReceiver(), n.getSession() ) );
			JolieEppUtils.appendSubNode( receiverTidPath, "tid" );
			seq.addChild( new AssignStatement(
				JolieEppUtils.PARSING_CONTEXT,
				tidVarPath,
				receiverTidPath
			));
			seq.addChild( new SolicitResponseOperationStatement(
				JolieEppUtils.PARSING_CONTEXT,
				n.getOperation(),
				getOutputPortNameForOutput( n.getSession(), typeEnvironment.getThreadRole( n.getReceiver(), n.getSession() ) ),
				outVarPath, null, null
			));
			result.addRRToOutputPort( getOutputPortNameForOutput( n.getSession(), typeEnvironment.getThreadRole( n.getReceiver(), n.getSession() ) ), n.getOperation() );

			// Send the synchronisations to other threads involved in the session
			for( String thread : typeEnvironment.getThreadsForSession( n.getDelegatedSession() ) ) {
				if ( thread.equals( n.getSender() ) == false ) {
					receiverTidPath = JolieEppUtils.getSessionDescriptorPath( n.getDelegatedSession() );
					JolieEppUtils.appendSubNode( receiverTidPath, typeEnvironment.getThreadRole( thread, n.getDelegatedSession() ) );
					JolieEppUtils.appendSubNode( receiverTidPath, "tid" );
					seq.addChild( new AssignStatement(
						JolieEppUtils.PARSING_CONTEXT,
						tidVarPath,
						receiverTidPath
					));
					seq.addChild( new NotificationOperationStatement(
						JolieEppUtils.PARSING_CONTEXT,
						JolieEppUtils.getDelegationSyncOperation( n.getDelegatedSession() ),
						getOutputPortNameForOutput( n.getDelegatedSession(), typeEnvironment.getThreadRole( thread, n.getDelegatedSession() ) ),
						outVarPath
					));
					result.addOWToOutputPort(
						getOutputPortNameForOutput( n.getDelegatedSession(), typeEnvironment.getThreadRole( thread, n.getDelegatedSession() ) ),
						JolieEppUtils.getDelegationSyncOperation( n.getDelegatedSession() )
					);
				}
			}
		} else if ( n.getReceiver().equals( thread ) ) {
			result.inputOperationsForCorrelationSet(
				getCorrelationVariableName( n.getSender(), n.getSession() )
			).add( n.getOperation() );
			result.setUsedForDelegation( n.getOperation() );
			
			SequenceStatement rrSeq = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
			// Assign the output port bindings
			VariablePathNode sessionDescriptor = JolieEppUtils.variableNameToJolieVariablePath( JolieEppUtils.DELEGATION_TMP_VARNAME );
			JolieEppUtils.appendSubNode( sessionDescriptor, JolieEppUtils.SESSION_DESCRIPTOR );
			rrSeq.addChild(
				new DeepCopyStatement( JolieEppUtils.PARSING_CONTEXT,
					JolieEppUtils.getSessionDescriptorPath( n.getDelegatedSession() ),
					sessionDescriptor
			));
			addOutputPortAssignmentsAfterDelegation( rrSeq, n );
			
			seq.addChild( new RequestResponseOperationStatement(
				JolieEppUtils.PARSING_CONTEXT,
				n.getOperation(),
				JolieEppUtils.variableNameToJolieVariablePath( JolieEppUtils.DELEGATION_TMP_VARNAME ),
				null, rrSeq
			));
		} else if ( typeEnvironment.isThreadInSession( thread, n.getDelegatedSession() ) ) {
			// Receive the delegation synchronisation if in the delegated session
			result.inputOperationsForCorrelationSet(
				getCorrelationVariableName( n.getSender(), n.getDelegatedSession() )
			).add( JolieEppUtils.getDelegationSyncOperation( n.getDelegatedSession() ) );

			VariablePathNode recvVarPath = JolieEppUtils.variableNameToJolieVariablePath( JolieEppUtils.DELEGATION_TMP_VARNAME );
			seq.addChild( new OneWayOperationStatement(
				JolieEppUtils.PARSING_CONTEXT,
				JolieEppUtils.getDelegationSyncOperation( n.getDelegatedSession() ),
				recvVarPath
			));
			VariablePathNode sessionDescriptor = JolieEppUtils.variableNameToJolieVariablePath( JolieEppUtils.DELEGATION_TMP_VARNAME );
			JolieEppUtils.appendSubNode( sessionDescriptor, JolieEppUtils.SESSION_DESCRIPTOR );
			seq.addChild(
				new DeepCopyStatement( JolieEppUtils.PARSING_CONTEXT,
					JolieEppUtils.getSessionDescriptorPath( n.getDelegatedSession() ),
					sessionDescriptor
			));
			addOutputPortBindingAssignment( seq, n.getDelegatedSession(), typeEnvironment.getThreadRole( n.getSender(), n.getDelegatedSession() ) );
		}

		typeEnvironment.update( n );

		if ( n.getContinuation() == null ) {
			if ( seq.children().isEmpty() ) {
				return result;
			}
		} else {
			ThreadProjectionResult res = doSwitch( n.getContinuation() );
			result.mergeNamesOnly( res );
			seq.addChild( res.jolieNode() );
		}

		result.setJolieNode( seq );
		return result;
	}
}
