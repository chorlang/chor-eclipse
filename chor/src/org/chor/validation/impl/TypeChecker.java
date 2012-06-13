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
		/*
		 * If we are starting a session with a name that was used before,
		 * we need to ensure that the previous session with the same name
		 * has been correctly terminated.
		 * If so, we can safely remove it from delta and theta.
		 */
		if ( delta.remove( start.getSession() ) != null ) { // This also cleans delta if necessary
			displayError( "Session " + start.getSession() + " must be completed correctly following its protocol, before its name" +
					"can be reused for starting a new session", start );
		} else {
			/*
			 * Clean theta of all threads involved in the start.
			 * We do not bother removing the mappings for service threads,
			 * since they will be removed altogether afterwards by
			 * the service thread name freshness check.
			 */
			for( ThreadWithRole twr : start.getActiveThreads() ) {
				if ( theta.containsKey( twr.getThread() ) ) {
					theta.remove( twr.getThread() ).get( start.getSession() );
				}
			}
			/* for( ThreadWithRole twr : start.getServiceThreads() ) {
				if ( theta.containsKey( twr.getThread() ) ) {
					theta.remove( twr.getThread() ).get( start.getSession() );
				}
			} */
		}
		
		// Update theta with the active threads
		for( ThreadWithRole twr : start.getActiveThreads() ) {
			Map< String, String > threadRoles = theta.get( twr.getThread() );
			if ( threadRoles == null ) { // Create a fresh map for the thread if not in theta already
				threadRoles = new HashMap< String, String >();
				theta.put( twr.getThread(), threadRoles );
			}
			threadRoles.put( start.getSession(), twr.getRole() );
		}
		
		// Clean up theta from all service threads, for ensuring thread name freshness (binding)
		for( ThreadWithRole twr : start.getServiceThreads() ) {
			theta.remove( twr.getThread() );
		}
		
		// Update theta with the service threads
		for( ThreadWithRole twr : start.getServiceThreads() ) {
			Map< String, String > threadRoles = new HashMap< String, String >();
			threadRoles.put( start.getSession(), twr.getRole() );
			theta.put( twr.getThread(), threadRoles );
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

		return doSwitchIfNotNull( start.getContinuation() );
	}
	
	private void displayMainError( String error )
	{
		INode node = NodeModelUtils.findActualNodeFor( program );
		validator.acceptError( error, program, node.getOffset(), "program".length(), null );
	}
	
	private void displayError( String error, Program program )
	{
		validator.acceptError( error, program, program.eContainmentFeature(), 0, "" );
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

		// TODO: check expression types
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
					displayMainError( "Session " + session + " ends before completing its type" );
				}
			}
			return true;
		} else {
			return doSwitch( obj );
		}
	}
}
