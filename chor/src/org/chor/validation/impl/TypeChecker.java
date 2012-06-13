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

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jolie.util.Pair;

import org.chor.chor.BranchGType;
import org.chor.chor.Choreography;
import org.chor.chor.ExpressionBasicTerm;
import org.chor.chor.GlobalType;
import org.chor.chor.IfThenElse;
import org.chor.chor.Interaction;
import org.chor.chor.Program;
import org.chor.chor.Site;
import org.chor.chor.Start;
import org.chor.chor.ThreadWithRole;
import org.chor.chor.util.ChorSwitch;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
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
	private final Map< String, Map< String, String >> theta;
	
	// delta: session -> global type
	// Delta keeps track of the global type that a session should follow
	private Map< String, GlobalType > delta;
	
	// services: public channel -> { role | role is a service role in the public channel }
	private final Map< Site, Set< String >> services;
	
	// The validator we are going to use for displaying errors
	private final AbstractDeclarativeValidator validator;
	
	// The program to type check
	private final Program program;

	// Deprecated. To be removed.
	public List< Pair< String, EStructuralFeature >> errors = new LinkedList< Pair< String, EStructuralFeature >>();
	// private HashMap< String, HashMap< String, String >> varTypes;

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
		theta = new HashMap< String, Map< String, String >>();
		delta = new HashMap< String, GlobalType >();
		services = new HashMap< Site, Set< String >>();

		// and, finally, we initialize varTypes;
		// varTypes = new HashMap< String, HashMap< String, String >>();
	}
	
	/**
	 * Run the type checking algorithm
	 */
	public void run()
	{
		doSwitchIfNotNull( program.getChoreography() );
	}

	public Boolean caseStart( Start start )
	{
		// First, we check that if we are using a used binder, then the old
		// session is complete
		if ( delta.containsKey( start.getSession() ) && delta.get( start.getSession() ) != null )
			errors.add( new Pair< String, EStructuralFeature >( "Channel " + start.getSession()
					+ " is not correctly used", start.eContainingFeature() ) );
		// if the old session is complete, we need to flush delta and theta from
		// such a binder
		else if ( delta.containsKey( start.getSession() ) ) {
			delta.remove( start.getSession() );
			for( String s : theta.keySet() ) {
				if ( (theta.get( s )).containsKey( start.getSession() ) )
					(theta.get( s )).remove( start.getSession() );
			}
		}

		// We update the theta environment with active threads
		for( ThreadWithRole twr : start.getActiveThreads() ) {
			// if theta contains a thread, then we update its function
			if ( theta.containsKey( twr.getThread() ) ) {
				(theta.get( twr.getThread() )).put( start.getSession(), twr.getRole() );
			}
			// otherwise we just create a HashMap for this new thread
			else {
				HashMap< String, String > temp = new HashMap< String, String >();
				temp.put( start.getSession(), twr.getRole() );
				theta.put( twr.getThread(), temp );
			}
		}

		// ...and service threads
		// first we remove any service thread name already used from theta
		// (binding)
		for( ThreadWithRole twr : start.getServiceThreads() ) {
			if ( theta.containsKey( twr.getThread() ) )
				theta.remove( twr.getThread() );
		}
		// then we do the expected update
		for( ThreadWithRole twr : start.getServiceThreads() ) {
			HashMap< String, String > temp = new HashMap< String, String >();
			temp.put( start.getSession(), twr.getRole() );
			theta.put( twr.getThread(), temp );
		}

		// Then, we update the delta environment
		delta.put( start.getSession(), start.getPublicChannel().getProtocol().getType() );

		// We need to check that the service roles are so also in other starts.
		// First we check if the public channel entry is empty (first
		// occurrence)
		// If so we add a new entry to services
		HashSet< String > tempSet = new HashSet< String >();
		if ( services.get( start.getPublicChannel() ) == null ) {
			for( ThreadWithRole twr : start.getServiceThreads() ) {
				tempSet.add( twr.getRole() );
			}
			services.put( start.getPublicChannel(), tempSet );
		}
		// Otherwise we run a check
		else {
			// It consists of checking that the set of service roles is what we
			// get from services
			for( ThreadWithRole twr : start.getServiceThreads() )
				tempSet.add( twr.getRole() );
			if ( !services.get( start.getPublicChannel() ).equals( tempSet ) ) {
				errors.add( new Pair< String, EStructuralFeature >( "Some roles in "
						+ start.getPublicChannel().getName()
						+ " are used as servers and as active roles in other instances.", start.eContainingFeature() ) );
			}
		}

		return doSwitchIfNotNull( start.getContinuation() );
	}
	
	private void displayError( String error, Choreography choreography )
	{
		int offset;
		List< INode > iNodes = NodeModelUtils.findNodesForFeature( choreography, choreography.eContainmentFeature() );
		if ( !iNodes.isEmpty() ) {
			offset = iNodes.get( 0 ).getOffset();
			validator.acceptError( error, choreography, offset, 4, null );
		} else {
			displayError( error, program );
		}
	}
	
	private void displayError( String error, Program program )
	{
		validator.acceptError( error, program, program.eContainmentFeature(), 0, "" );
	}

	private void displayError( String error, Interaction interaction )
	{
		int offset;
		int contOffset;
		List< INode > iNodes = NodeModelUtils.findNodesForFeature( interaction, interaction.eContainmentFeature() );
		if ( !iNodes.isEmpty() ) {
			offset = iNodes.get( 0 ).getOffset();
			contOffset = offset + iNodes.get( 0 ).getLength();
			if ( interaction.getContinuation() != null ) {
				List< INode > cNodes = NodeModelUtils.findNodesForFeature( interaction.getContinuation(), interaction
						.getContinuation().eContainingFeature() );
				if ( !cNodes.isEmpty() )
					contOffset = cNodes.get( 0 ).getOffset();
			}
			validator.acceptError( error, interaction, offset, contOffset - offset, null );
		} else {
			displayError( error, program );
		}
	}

	public Boolean caseInteraction( Interaction interaction )
	{
		// Make sure that the session channel is in delta
		if ( !delta.containsKey( interaction.getSession() ) ) {
			displayError( "Session " + interaction.getSession() + " has not been started before", interaction );
			return false;
		}

		GlobalType g = delta.get( interaction.getSession() );
		if ( g == null ) {
			displayError( "The type for session " + interaction.getSession() +
					" is finished, but the session is still performing communications",
					interaction );
			return false;
		}

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
		
		// Check that the sender thread is the one supposed to send according to the session type
		String recvRole = theta.get( interaction.getReceiver() ).get( interaction.getSession() );
		if ( !recvRole.equals( g.getReceiver() ) ) {
			displayError( "Protocol for session " + interaction.getSession() + " expects an input from role " + g.getReceiver() +
					", while thread " + interaction.getReceiver() + " has role " + recvRole, interaction );
		}

		// Check the operation name wrt the session type
		GlobalType contType = null;
		boolean found = false;
		for( BranchGType br : g.getBranches() ) {
			if ( br.getOperation().equals( interaction.getOperation() ) ) {
				contType = br.getContinuation();
				found = true;
				break;
			}
		}
		
		if ( !found ) {
			displayError( "Operation " + interaction.getOperation() + " is not expected by the type for session "
					+ interaction.getSession(), interaction );
			return false;
		}
		
		// Update the session type in delta
		delta.put( interaction.getSession(), contType );
		return doSwitchIfNotNull( interaction.getContinuation() );

		// We need to check that the type of the message matches the type of the
		// receiving variable
		// for that we call a specialised method
		/*
		 * String tempType; if (varTypes.get(interaction.getReceiver())==null)
		 * tempType = null; else tempType =
		 * (varTypes.get(interaction.getReceiver
		 * ())).get(interaction.getReceiverVariable()); String inferredType =
		 * null;//infer(interaction.getSenderExpression()); if (tempType==null)
		 * { HashMap<String,String> local = new HashMap<String,String>();
		 * local.put(interaction.getReceiverVariable(), inferredType);
		 * varTypes.put(interaction.getReceiver(), local); } else if
		 * (tempType!=inferredType) { errors.add(new
		 * Pair<String,EStructuralFeature>("The type of the variable " +
		 * interaction.getSenderExpression() +
		 * " does not match the type of the communicated message",
		 * interaction.eContainmentFeature())); }
		 */
		// we now change delta and then check the continuation
		// delta.remove( interaction.getSession() );
	}

	private String infer( ExpressionBasicTerm exp )
	{
		// System.out.println(exp.getClass().toString());

		return "";
	}

	public Boolean caseIfThenElse( IfThenElse cond )
	{
		Map< String, GlobalType > deltaBackup = new HashMap< String, GlobalType >( delta );
		if ( doSwitchIfNotNull( cond.getThen() ) == false ) { return false; }
		delta = deltaBackup;
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
					displayError( "Session " + session + " ends before completing its type", program.getChoreography() );
				}
			}
			return true;
		} else {
			return doSwitch( obj );
		}
	}

}
