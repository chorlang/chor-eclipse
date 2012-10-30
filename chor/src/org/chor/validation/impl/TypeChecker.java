/***************************************************************************
 *   Copyright (C) 2011-2012 by Fabrizio Montesi <famontesi@gmail.com>     *
 *   Copyright (C) 2011 by Marco Carbone <carbonem@itu.dk>                 *
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

package org.chor.validation.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.chor.chor.BranchGType;
import org.chor.chor.Call;
import org.chor.chor.Delegation;
import org.chor.chor.DelegationType;
import org.chor.chor.GlobalType;
import org.chor.chor.GlobalTypeInteraction;
import org.chor.chor.IfThenElse;
import org.chor.chor.Interaction;
import org.chor.chor.LocalCode;
import org.chor.chor.Procedure;
import org.chor.chor.Program;
import org.chor.chor.SessionProcedureParameter;
import org.chor.chor.Site;
import org.chor.chor.Start;
import org.chor.chor.ThreadWithRole;
import org.chor.chor.util.ChorSwitch;
import org.chor.epp.impl.NameCollector;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

/**
 * This class implements a type checking algorithm that
 * verifies whether, in a given {@link Program}, the choreography respects
 * the predeclared protocol definitions.
 * 
 * @author Fabrizio Montesi
 * @author Marco Carbone
 *
 */
public class TypeChecker extends ChorSwitch< Boolean >
{
	// theta: thread name -> session -> role
	// Theta keeps track of the role each thread plays in a session
	private Map< String, Map< String, String > > theta;
	
	// delta: session -> global type
	// Delta keeps track of the global type that a session should follow
	private Map< String, GlobalType > delta;
	
	// services: public channel -> { role | role is a service role in the public channel }
	private final Map< Site, Set< String > > services;
	
	// The validator we are going to use for displaying errors
	private final AbstractDeclarativeValidator validator;
	
	// The program to type check
	private final Program program;

	// Support class for keeping backups of typing environments
	private static class Backup {
		private final Map< String, Map< String, String > > theta;
		private final Map< String, GlobalType > delta;
		private Backup(
			Map< String, Map< String, String > > theta,
			Map< String, GlobalType > delta
		) {
			this.theta = theta;
			this.delta = delta;
		}
	}

	/**
	 * Constructor
	 * @param program the {@link Program} to type check
	 * @param validator the validator to use for showing messages
	 */
	public TypeChecker( Program program, AbstractDeclarativeValidator validator )
	{
		this.validator = validator;
		this.program = program;

		// Initialise maps to empty
		theta = new HashMap< String, Map< String, String > >();
		delta = new HashMap< String, GlobalType >();
		services = new HashMap< Site, Set< String > >();

		// and, finally, we initialize varTypes;
		// varTypes = new HashMap< String, HashMap< String, String >>();
	}
	
	private Backup backupAndReset()
	{
		Backup backup = new Backup( theta, delta );
		theta = new HashMap< String, Map< String, String > >();
		delta = new HashMap< String, GlobalType >();
		return backup;
	}
	
	private Backup backupAndCopy()
	{
		Backup backup = new Backup( theta, delta );
		theta = new HashMap< String, Map< String, String > >();
		for( Entry< String, Map< String, String > > e : backup.theta.entrySet() ) {
			theta.put( e.getKey(), new HashMap< String, String > ( e.getValue() ) );
		}
		delta = new HashMap< String, GlobalType >( delta );
		return backup;
	}
	
	private void restore( Backup backup )
	{
		theta = backup.theta;
		delta = backup.delta;
	}
	
	/**
	 * Run the type checking algorithm
	 */
	public void run()
	{
		// Check the procedures
		for( Procedure proc : program.getProcedures() ) {
			doSwitchIfNotNull( proc );
		}
		
		// Check the choreography
		doSwitchIfNotNull( program.getChoreography() );
	}
	
	public Boolean caseProcedure( Procedure proc )
	{
		Backup backup = backupAndReset();

		for( SessionProcedureParameter param : proc.getSessionParameters() ) {
			delta.put( param.getSession(), param.getType() );
			for( ThreadWithRole twr : param.getActiveThreads() ) {
				updateTheta( twr.getThread(), param.getSession(), twr.getRole() );
			}
		}
		
		doSwitchIfNotNull( proc.getChoreography() );
		
		NameCollector nameCollector = new NameCollector();
		nameCollector.collect( proc.getChoreography(), program );
		for( String thread : nameCollector.activeThreads() ) {
			if ( !proc.getThreadParameters().contains( thread ) ) {
				displayError( "Unknown thread: " + thread + " (maybe a forgotten procedure parameter or session start?)", proc );
			}
		}
		
		restore( backup );
		return true;
	}
	
	private void updateTheta( String thread, String session, String role )
	{
		Map< String, String > threadRoles = theta.get( thread );
		if ( threadRoles == null ) { // Create a fresh map for the thread if not in theta already
			threadRoles = new HashMap< String, String >();
			theta.put( thread, threadRoles );
		}
		threadRoles.put( session, role );
	}

	public Boolean caseStart( Start start )
	{
		/*
		 * If we are starting a session with a name that was used before,
		 * we need to ensure that the previous session with the same name
		 * has been correctly terminated.
		 * If so, we can safely remove it from delta and theta.
		 */
		if ( delta.remove( start.getSession() ) != null ) { // This also cleans delta if necessary
			displayError( "Session " + start.getSession() + " must be completed correctly following its protocol, before its name " +
					"can be reused for starting a new session", start );
			return false;
		} else {
			/*
			 * Clean theta of all mappings towards the same session name for 
			 * all active threads, to ensure session name freshness (binding).
			 * 
			 * We do not bother removing the mappings for service threads,
			 * since they will be removed altogether afterwards by
			 * the service thread name freshness check.
			 */
			for( ThreadWithRole twr : start.getActiveThreads() ) {
				if ( theta.containsKey( twr.getThread() ) ) {
					theta.get( twr.getThread() ).remove( start.getSession() );
				}
			}
		}
		
		// Update theta with the active threads
		for( ThreadWithRole twr : start.getActiveThreads() ) {
			updateTheta( twr.getThread(), start.getSession(), twr.getRole() );
		}
		
		// Clean up theta from all service threads, for ensuring thread name freshness (binding)
		// Also, update theta with the new service thread information
		for( ThreadWithRole twr : start.getServiceThreads() ) {
			Map< String, String > threadRoles = new HashMap< String, String >();
			threadRoles.put( start.getSession(), twr.getRole() );
			theta.put( twr.getThread(), threadRoles ); // This cleans up and updates theta in a single shot
		}

		// Update delta with the type of the started session
		delta.put( start.getSession(), start.getPublicChannel().getProtocol().getType() );

		/* Check if the service roles are the same
		 * for every start on the same public channel.
		 * If it is the first time we do such a start, we just put
		 * the service roles in services.
		 */
		Set< String > serviceRoles = new HashSet< String >();
		for( ThreadWithRole twr : start.getServiceThreads() ) {
			serviceRoles.add( twr.getRole() );
		}
		if ( !services.containsKey( start.getPublicChannel() ) ) { // First time
			services.put( start.getPublicChannel(), serviceRoles );
		} else { // Not first time: run the check
			if ( !services.get( start.getPublicChannel() ).equals( serviceRoles ) ) {
				displayError( "Every start on the same public channel must have the same set of roles on the service (right-hand) side", start );
			}
		}
		
		/*
		 * We verify that each active thread is not entering
		 * in a session (the one we are starting) that uses any operation name
		 * that is already in use in another session that the thread is already
		 * participating in.
		 * 
		 * This is a restriction from the Jolie language, which imposes
		 * the usage of different operations for distinguishing inputs from different parties.
		 */
		for( ThreadWithRole twr : start.getActiveThreads() ) {
			if ( !checkOperationsConsistency( twr.getThread() ) ) {
				displayError( "Thread " + twr.getThread()
						+ " is starting a session that shares an operation name with another running session for the same thread", start
				);
				return false;
			}
		}

		return doSwitchIfNotNull( start.getContinuation() );
	}
	
	private boolean checkOperationsConsistency( String thread )
	{
		Map< String, String > roles = theta.get( thread );
		if ( roles == null ) { // Safety check. Should never be null though, since we got called in this method.
			return true;
		}
				
		// For each (session |-> role) mapping...
		Set< String > ops = new HashSet< String >();
		Set< String > curr;
		for( Map.Entry< String, String > entry : roles.entrySet() ) {
			curr = TypeUtils.calculateInputOperations( delta.get( entry.getKey() ), entry.getValue() );
			if ( Collections.disjoint( ops, curr ) ) {
				ops.addAll( curr );
			} else {
				return false;
			}
		}
		
		return true;
	}
	
	private void displayMainError( String error )
	{
		INode node = NodeModelUtils.findActualNodeFor( program );
		validator.acceptError( error, program, node.getOffset(), "program".length(), null );
	}

	private void displayError( String error, Interaction interaction )
	{
		int offset;
		int len;
		INode node = NodeModelUtils.findActualNodeFor( interaction );
		offset = node.getOffset();
		len = node.getLength();
		if ( interaction.getContinuation() != null ) {
			INode contNode = NodeModelUtils.findActualNodeFor( interaction.getContinuation() );
			len = len - contNode.getLength();
		}
		validator.acceptError( error, interaction, offset, len, null );
	}

	private void displayError( String error, Delegation delegation )
	{
		int offset;
		int len;
		INode node = NodeModelUtils.findActualNodeFor( delegation );
		offset = node.getOffset();
		len = node.getLength();
		if ( delegation.getContinuation() != null ) {
			INode contNode = NodeModelUtils.findActualNodeFor( delegation.getContinuation() );
			len = len - contNode.getLength();
		}
		validator.acceptError( error, delegation, offset, len, null );
	}
	
	private void displayError( String error, Start start )
	{
		int offset;
		int len;
		INode node = NodeModelUtils.findActualNodeFor( start );
		offset = node.getOffset();
		len = node.getLength();
		if ( start.getContinuation() != null ) {
			INode contNode = NodeModelUtils.findActualNodeFor( start.getContinuation() );
			len = len - contNode.getLength();
		}
		validator.acceptError( error, start, offset, len, null );
	}
	
	private void displayError( String error, Call call )
	{
		int offset;
		int len;
		INode node = NodeModelUtils.findActualNodeFor( call );
		offset = node.getOffset();
		len = node.getLength();
		validator.acceptError( error, call, offset, len, null );
	}
	
	private void displayError( String error, Procedure proc )
	{
		int offset;
		int len;
		INode node = NodeModelUtils.findActualNodeFor( proc );
		offset = node.getOffset();
		len = node.getLength();
		validator.acceptError( error, proc, offset, len, null );
	}
	
	public Boolean caseLocalCode( LocalCode localCode )
	{
		return doSwitchIfNotNull( localCode.getContinuation() );
	}
	
	public Boolean caseDelegation( Delegation delegation )
	{
		// Make sure that the session channel is in delta
		if ( !delta.containsKey( delegation.getSession() ) ) {
			displayError( "Session " + delegation.getSession() + " has not been started before", delegation );
			return false;
		}

		GlobalTypeInteraction g = TypeUtils.unfold( delta.get( delegation.getSession() ) );
		if ( g == null ) {
			displayError( "The type for session " + delegation.getSession() +
					" is finished, but the session is still performing communications",
					delegation );
			return false;
		}

		// Check that the sender thread exists
		if ( !theta.containsKey( delegation.getSender() ) ) {
			displayError( "Thread " + delegation.getSender()
					+ " is not in session " + delegation.getSession(), delegation );
			return false;
		}

		// Check that the sender thread is actually in this session
		if ( !theta.get( delegation.getSender() ).containsKey( delegation.getSession() ) ) {
			displayError( "Thread " + delegation.getSender()
					+ " is not in session " + delegation.getSession(), delegation );
			return false;
		}

		// Check that the sender thread is the one supposed to send according to the session type
		String senderRole = theta.get( delegation.getSender() ).get( delegation.getSession() );
		if ( !senderRole.equals( g.getSender() ) ) {
			displayError( "Protocol for session " + delegation.getSession() + " expects an output from role " + g.getSender() +
					", while thread " + delegation.getSender() + " has role " + senderRole, delegation );
		}

		// Check that the receiver thread exists
		if ( !theta.containsKey( delegation.getReceiver() ) ) {
			displayError( "Thread " + delegation.getReceiver()
					+ " is not in session " + delegation.getSession(), delegation );
			return false;
		}
		
		// Check that the receiver thread is actually in this session
		if ( !theta.get( delegation.getReceiver() ).containsKey( delegation.getSession() ) ) {
			displayError( "Thread " + delegation.getReceiver()
					+ " is not in session " + delegation.getSession(), delegation );
			return false;
		}

		// Check that the receiver thread is the one supposed to receive according to the session type
		String recvRole = theta.get( delegation.getReceiver() ).get( delegation.getSession() );
		if ( !recvRole.equals( g.getReceiver() ) ) {
			displayError( "Protocol for session " + delegation.getSession() + " expects an input from role " + g.getReceiver() +
					", while thread " + delegation.getReceiver() + " has role " + recvRole, delegation );
		}

		// Check the operation name wrt the session type
		BranchGType branch = null;
		for( BranchGType br : g.getBranches() ) {
			if ( br.getOperation().equals( delegation.getOperation() ) ) {
				branch = br;
				break;
			}
		}

		if ( branch == null ) {
			displayError( "Operation " + delegation.getOperation() + " is not expected by the type for session "
					+ delegation.getSession(), delegation );
			return false;
		}
		
		if ( !(branch.getDataType() instanceof DelegationType) ) {
			displayError( "Type for operation " + delegation.getOperation() + " in session "
					+ delegation.getSession() + " does not expect a session delegation at this point of execution", delegation );
			return false;
		}

		DelegationType delegationType = (DelegationType)branch.getDataType();
		String senderRoleInDelegatedSession = theta.get( delegation.getSender() ).remove( delegation.getDelegatedSession() );

		// Check that the sender thread is actually in the delegated session
		if ( senderRoleInDelegatedSession == null ) {
			displayError( "Thread " + delegation.getSender() + " is delegating session "
					+ delegation.getDelegatedSession() + " but it is not in its participants", delegation );
			return false;
		}
		// Check that the sender thread is delegating a role that it owns
		else if ( !delegationType.getRole().equals( senderRoleInDelegatedSession ) ) {
			displayError( "Thread " + delegation.getSender() + " is delegating role " + delegationType.getRole()
					+ " for session "
					+ delegation.getDelegatedSession() + " but it owns role " + senderRoleInDelegatedSession + " instead", delegation );
			return false;
		}
		// Check that the receiving thread is not already in the delegated session
		else if ( theta.get( delegation.getReceiver() ).containsKey( delegation.getDelegatedSession() ) ) {
			displayError( "Thread " + delegation.getReceiver() + " is already in session " + delegation.getDelegatedSession()
					+ " with role "
					+ theta.get( delegation.getReceiver() ).get( delegation.getDelegatedSession() ), delegation );
			return false;
		}

		// Update theta for the delegation
		theta.get( delegation.getSender() ).remove( delegation.getDelegatedSession() );
		theta.get( delegation.getReceiver() ).put( delegation.getDelegatedSession(), senderRoleInDelegatedSession );
		
		/*
		 *  Check that the delegation carried type specifies the same protocol
		 *  that is going to be implemented for the delegated session.
		 */
		if ( !TypeUtils.checkEqualForRole(
				delta.get( delegation.getDelegatedSession() ),
				delegationType.getType(),
				senderRoleInDelegatedSession )
		) {
			displayError( "The delegated carried protocol declared in the communication for session " + delegation.getSession()
					+ " is different than the protocol behaviour remaining for session "
					+ delegation.getDelegatedSession()
					+ " and role " + senderRoleInDelegatedSession, delegation );
			return false;
		}
		
		// Update the session type in delta
		delta.put( delegation.getSession(), branch.getContinuation() );
		return doSwitchIfNotNull( delegation.getContinuation() );
	}
	
	public Boolean caseCall( Call call )
	{
		Procedure proc = call.getProcedure();
		if ( call.getThreads().size() != proc.getThreadParameters().size() ) {
			displayError( "Wrong number of thread parameters for calling procedure " + proc.getName(), call );
		} else if ( call.getSessions().size() != proc.getSessionParameters().size() ) {
			displayError( "Wrong number of session parameters for calling procedure " + proc.getName(), call );
		}
		
		List< SessionProcedureParameter > procParams = call.getProcedure().getSessionParameters();
		int i = 0;
		SessionProcedureParameter procSessionParam;
		for( String session : call.getSessions() ) { // For each session passed in the call
			procSessionParam = procParams.get( i++ ); // Get the corresponding session parameter in the called procedure

			// Check that the remaining global type for the passed session will be implemented in the procedure
			if ( !TypeUtils.checkEquivalent( delta.get( session ), procSessionParam.getType() ) ) {
				displayError( "The remaining protocol for session " + session + " is not implemented by procedure " + call.getProcedure().getName(), call );
			}

			// Check that each thread in the session procedure parameter has the required role
			String passedThread;
			for( ThreadWithRole twr : procSessionParam.getActiveThreads() ) {
				// Find the thread name in the procedure thread parameters
				passedThread = findAssociatedThreadInCall( twr.getThread(), call, proc );
				if ( passedThread == null ) {
					displayError( "Internal type checking error", call );
				}
				
				if ( !theta.containsKey( passedThread ) || !theta.get( passedThread ).containsKey( session ) ) {
					displayError( "Thread " + passedThread + " is not in session " + session, call );
				} else if ( !theta.get( passedThread ).get( session ).equals( twr.getRole() ) ) {
					displayError( "Thread " + passedThread + " does not have role "
							+ twr.getRole() + " in session " + session, call );
				}
			}
		}
		
		return true;
	}
	
	private String findAssociatedThreadInCall( String threadNameInProcedure, Call call, Procedure proc )
	{
		int k = 0;

		// Find the thread name in the procedure thread parameters
		for( String threadParam : proc.getThreadParameters() ) {
			if ( threadParam.equals( threadNameInProcedure ) ) {
				break;
			}
			k++;
		}

		if ( k >= call.getThreads().size() ) {
			return null;
		}
		
		return call.getThreads().get( k );
	}
	
	/*private SessionProcedureParameter getParameterForSession( String session, Procedure proc )
	{
		for( SessionProcedureParameter param : proc.getSessionParameters() ) {
			if ( param.getSession().equals( session ) ) {
				return param.getType();
			}
		}
		
		return null;
	}*/

	public Boolean caseInteraction( Interaction interaction )
	{
		// Make sure that the session channel is in delta
		if ( !delta.containsKey( interaction.getSession() ) ) {
			displayError( "Session " + interaction.getSession() + " has not been started before", interaction );
			return false;
		}

		GlobalType globalType = delta.get( interaction.getSession() );
		if ( globalType == null ) {
			displayError( "The type for session " + interaction.getSession() +
					" is finished, but the session is still performing communications",
					interaction );
			return false;
		}
		
		GlobalTypeInteraction g = TypeUtils.unfold( globalType );

		// Check that the sender thread exists
		if ( !theta.containsKey( interaction.getSender() ) ) {
			displayError( "Thread " + interaction.getSender()
					+ " is not in session " + interaction.getSession(), interaction );
			return false;
		}
		
		// Check that the sender thread is actually in this session
		if ( !theta.get( interaction.getSender() ).containsKey( interaction.getSession() ) ) {
			displayError( "Thread " + interaction.getSender()
					+ " is not in session " + interaction.getSession(), interaction );
			return false;
		}

		// Check that the sender thread is the one supposed to send according to the session type
		String senderRole = theta.get( interaction.getSender() ).get( interaction.getSession() );
		if ( !senderRole.equals( g.getSender() ) ) {
			displayError( "Protocol for session " + interaction.getSession() + " expects an output from role " + g.getSender() +
					", while thread " + interaction.getSender() + " has role " + senderRole, interaction );
		}

		// Check that the receiver thread exists
		if ( !theta.containsKey( interaction.getReceiver() ) ) {
			displayError( "Thread " + interaction.getReceiver()
					+ " is not in session " + interaction.getSession(), interaction );
			return false;
		}
		
		// Check that the receiver thread is actually in this session
		if ( !theta.get( interaction.getReceiver() ).containsKey( interaction.getSession() ) ) {
			displayError( "Thread " + interaction.getReceiver()
					+ " is not in session " + interaction.getSession(), interaction );
			return false;
		}
		
		// Check that the receiver thread is the one supposed to receive according to the session type
		String recvRole = theta.get( interaction.getReceiver() ).get( interaction.getSession() );
		if ( !recvRole.equals( g.getReceiver() ) ) {
			displayError( "Protocol for session " + interaction.getSession() + " expects an input from role " + g.getReceiver() +
					", while thread " + interaction.getReceiver() + " has role " + recvRole, interaction );
		}

		// Check the operation name wrt the session type
		BranchGType branch = null;
		for( BranchGType br : g.getBranches() ) {
			if ( br.getOperation().equals( interaction.getOperation() ) ) {
				branch = br;
				break;
			}
		}

		if ( branch == null ) {
			displayError( "Operation " + interaction.getOperation() + " is not expected by the type for session "
					+ interaction.getSession(), interaction );
			return false;
		}
		
		// Update the session type in delta
		delta.put( interaction.getSession(), branch.getContinuation() );
		return doSwitchIfNotNull( interaction.getContinuation() );
	}

	public Boolean caseIfThenElse( IfThenElse cond )
	{
		Backup backup = backupAndCopy();
		if ( doSwitchIfNotNull( cond.getThen() ) == false ) { return false; }
		restore( backup );
		if ( doSwitchIfNotNull( cond.getElse() ) == false ) { return false; }
		return true;
	}

	public Boolean doSwitchIfNotNull( EObject obj )
	{
		if ( obj == null ) {
			// For every session...
			for( String session : delta.keySet() ) {
				// ...check that its respective type is finished too.
				if ( delta.get( session ) != null ) {
					displayMainError( "Session " + session + " ends before completing its type" );
				}
			}
			return true;
		} else {
			return doSwitch( obj );
		}
	}
}
