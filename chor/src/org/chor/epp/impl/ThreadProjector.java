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
import java.util.Stack;

import jolie.lang.NativeType;
import jolie.lang.parse.ast.AssignStatement;
import jolie.lang.parse.ast.DeepCopyStatement;
import jolie.lang.parse.ast.IfStatement;
import jolie.lang.parse.ast.NotificationOperationStatement;
import jolie.lang.parse.ast.NullProcessStatement;
import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.OneWayOperationStatement;
import jolie.lang.parse.ast.SequenceStatement;
import jolie.lang.parse.ast.SolicitResponseOperationStatement;
import jolie.lang.parse.ast.TypeCastExpressionNode;
import jolie.lang.parse.ast.VariablePathNode;
import jolie.lang.parse.ast.expression.FreshValueExpressionNode;
import jolie.util.Pair;

import org.chor.chor.Choreography;
import org.chor.chor.IfThenElse;
import org.chor.chor.Interaction;
import org.chor.chor.LocalAskCommand;
import org.chor.chor.LocalShowCommand;
import org.chor.chor.Site;
import org.chor.chor.Start;
import org.chor.chor.ThreadWithRole;
import org.chor.chor.util.ChorSwitch;
import org.chor.epp.EndpointProjectionException;
import org.chor.epp.impl.merging.MergeUtils;
import org.chor.epp.impl.merging.MergingException;

public class ThreadProjector extends ChorSwitch< ThreadProjectionResult >
{
	private static class ThreadDescriptor {
		private final String name;
		private final String role;
		private final Site publicChannel;
		
		public ThreadDescriptor( String name, String role, Site publicChannel )
		{
			this.name = name;
			this.role = role;
			this.publicChannel = publicChannel;
		}
		
		/*public String getOutputPortName()
		{
			return publicChannel + "_" + role;
		}*/
	}
	
	private static class StartScope
	{
		private final Map< String, ThreadDescriptor > threadDescriptors = new HashMap< String, ThreadDescriptor >();
		private final Map< String, ThreadDescriptor > serviceThreadDescriptors = new HashMap< String, ThreadDescriptor >();
		private final Start start;
		
		public StartScope( Start n )
		{
			ThreadDescriptor td;
			for( ThreadWithRole t : n.getServiceThreads() ) {
				td = new ThreadDescriptor( t.getThread(), t.getRole(), n.getPublicChannel() );
				serviceThreadDescriptors.put( t.getThread(), td );
				threadDescriptors.put( t.getThread(), td );
			}
			for( ThreadWithRole t : n.getActiveThreads() ) {
				td = new ThreadDescriptor( t.getThread(), t.getRole(), n.getPublicChannel() );
				threadDescriptors.put( t.getThread(), td );
			}
			this.start = n;
		}
		
		/*public ThreadDescriptor getServiceThreadDescriptor( String thread )
		{
			return serviceThreadDescriptors.get( thread );
		}*/
		
		public String getThreadRole( String thread, String sessionName )
		{
			if ( sessionName.equals( start.getSession() ) == false ) {
				return null;
			}
			ThreadDescriptor td = threadDescriptors.get( thread );
			if ( td == null ) {
				return null;
			}
			return td.role;
		}
		
		public Site getSessionPublicChannel( String sessionName )
		{
			if ( sessionName.equals( start.getSession() ) == false ) {
				return null;
			}
			
			return start.getPublicChannel();
		}
	}
	
	private static class StartScopeStack
	{
		private final Stack< StartScope > stack = new Stack< StartScope >();
		
		public void push( Start n )
		{
			stack.push( new StartScope( n ) );
		}
		
		public StartScope pop()
		{
			return stack.pop();
		}

		public String getThreadRole( String thread, String session )
		{
			String role = null;
			for( StartScope scope : stack ) {
				role = scope.getThreadRole( thread, session );
				if ( role != null ) {
					return role;
				}
			}
			return role;
		}
		
		public Site getSessionPublicChannel( String session )
		{
			Site publicChannel = null;
			for( StartScope scope : stack ) {
				publicChannel = scope.getSessionPublicChannel( session );
				if ( publicChannel != null ) {
					return publicChannel;
				}
			}
			return publicChannel;
		}
	}
	
	private final String thread;
	private Exception errorException = null;
	private boolean alreadyStarted = false;
	private final StartScopeStack startScopeStack = new StartScopeStack();
	
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
		throws EndpointProjectionException
	{
		ThreadProjector projector = new ThreadProjector( thread );
		projector.alreadyStarted = true;
		ThreadProjectionResult ret = projector.doSwitch( choreography );
		if ( projector.errorException != null ) {
			throw new EndpointProjectionException( projector.errorException );
		}
		return ret;
	}
	
	public static ThreadProjectionResult projectServiceThread( String thread, Choreography choreography )
		throws EndpointProjectionException
	{
		ThreadProjector projector = new ThreadProjector( thread );
		projector.alreadyStarted = false;
		ThreadProjectionResult ret = projector.doSwitch( choreography );
		if ( projector.errorException != null ) {
			throw new EndpointProjectionException( projector.errorException );
		}
		return ret;
	}

	private void addOutputPortAssignmentsAfterStart( SequenceStatement seq, Start n )
	{
		VariablePathNode sessionDescriptorForRole;
		List< ThreadWithRole > list = new ArrayList< ThreadWithRole >( n.getActiveThreads().size() + n.getServiceThreads().size() );
		list.addAll( n.getActiveThreads() );
		list.addAll( n.getServiceThreads() );
		for( ThreadWithRole t : list ) {
			if ( t.getThread().equals( thread ) == false ) {
				sessionDescriptorForRole = JolieEppUtils.getSessionDescriptorPath( n.getSession() );
				JolieEppUtils.appendSubNode( sessionDescriptorForRole, t.getRole() );
				JolieEppUtils.appendSubNode( sessionDescriptorForRole, "binding" );
				seq.addChild( new DeepCopyStatement(
					JolieEppUtils.PARSING_CONTEXT,
					JolieEppUtils.variableNameToJolieVariablePath( getOutputPortNameForOutput( n.getSession(), t.getRole() ) ),
					sessionDescriptorForRole
				));
			}
		}
	}
	
	private String getCorrelationVariableName( String thread, String session )
	{
		return
			startScopeStack.getSessionPublicChannel( session ).getProtocol().getName() + "_" +
			startScopeStack.getThreadRole( thread, session );
	}
	
	private boolean tidInitialized = false;

	public ThreadProjectionResult caseStart( Start n )
	{
		ThreadProjectionResult result = new ThreadProjectionResult();
		boolean proceed = true;

		startScopeStack.push( n );
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
				result.addRequestResponseOperation( n.getPublicChannel().getName(), "_start_" + t.getRole() );
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
					result.addRequestResponseOperation( n.getPublicChannel().getName(), "_start_" + t.getRole() );
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
		startScopeStack.pop();
		result.setJolieNode( seq );
		return result;
	}
	
	public ThreadProjectionResult caseIfThenElse( IfThenElse n )
	{
		ThreadProjectionResult result = new ThreadProjectionResult();
		ThreadProjectionResult resThen = null, resElse = null;
		resThen = doSwitch( n.getThen() );
		result.mergeNamesOnly( resThen );
		if ( n.getElse() != null ) {
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
			JolieEppUtils.appendSubNode( receiverTidPath, startScopeStack.getThreadRole( n.getReceiver(), n.getSession() ) );
			JolieEppUtils.appendSubNode( receiverTidPath, "tid" );
			seq.addChild( new AssignStatement(
				JolieEppUtils.PARSING_CONTEXT,
				tidVarPath,
				receiverTidPath
			));
			seq.addChild( new NotificationOperationStatement(
				JolieEppUtils.PARSING_CONTEXT,
				n.getOperation(),
				getOutputPortNameForOutput( n.getSession(), startScopeStack.getThreadRole( n.getReceiver(), n.getSession() ) ),
				outVarPath
			));
			result.addOneWayOperation( getOutputPortNameForOutput( n.getSession(), startScopeStack.getThreadRole( n.getReceiver(), n.getSession() ) ), n.getOperation() );
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
}
