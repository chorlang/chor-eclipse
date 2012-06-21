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


package org.chor.validation;

import java.util.HashSet;
import java.util.Set;

import org.chor.chor.BranchGType;
import org.chor.chor.Call;
import org.chor.chor.ChorPackage;
import org.chor.chor.GlobalTypeCall;
import org.chor.chor.GlobalTypeInteraction;
import org.chor.chor.Procedure;
import org.chor.chor.Program;
import org.chor.chor.Protocol;
import org.chor.chor.SessionProcedureParameter;
import org.chor.validation.impl.TypeChecker;
import org.eclipse.xtext.validation.Check;

/**
 * Performs some basic well-formedness checks and calls the type checker
 * for verifying that the protocols are correctly used inside the main choreography.
 * 
 * @author Fabrizio Montesi
 *
 */
public class ChorJavaValidator extends AbstractChorJavaValidator
{
	@Check
	public void checkProgram( Program program )
	{
		// Check that the choreography respects the predefined protocols
		TypeChecker t = new TypeChecker( program, this );
		t.run();
	}
	
	@Check
	public void checkProtocol( Protocol p )
	{
		if ( p.getType() instanceof GlobalTypeCall ) {
			error( "A protocol cannot start with a protocol call", ChorPackage.Literals.PROTOCOL__TYPE );
		}
	}
	
	@Check
	public void checkProcedure( Procedure proc )
	{
		Set< String > s = new HashSet< String >();
		for( SessionProcedureParameter param : proc.getSessionParameters() ) {
			if ( s.contains( param.getSession() ) ) {
				error( "Duplicate session name in procedure parameters: " + param.getSession(),
						ChorPackage.Literals.PROCEDURE__SESSION_PARAMETERS );
			}
		}
		
		s = new HashSet< String >();
		for( String thread : proc.getThreadParameters() ) {
			if ( s.contains( thread ) ) {
				error( "Duplicate thread name in procedure parameters: " + thread,
						ChorPackage.Literals.PROCEDURE__THREAD_PARAMETERS );
			}
		}
	}
	
	@Check
	public void checkCall( Call call )
	{
		Set< String > s = new HashSet< String >();
		for( String session : call.getSessions() ) {
			if ( s.contains( session ) ) {
				error( "Duplicate session name in procedure call parameters: " + session,
						ChorPackage.Literals.CALL__SESSIONS );
			}
		}
		
		s = new HashSet< String >();
		for( String thread : call.getThreads() ) {
			if ( s.contains( thread ) ) {
				error( "Duplicate thread name in procedure call parameters: " + thread,
						ChorPackage.Literals.CALL__THREADS );
			}
		}
	}
	
	@Check
	public void checkGlobalTypeInteraction( GlobalTypeInteraction t )
	{
		// Check that sender and receiver are different
		if ( t.getSender().equals( t.getReceiver() ) ) {
			error( "A role cannot send a message to itself", ChorPackage.Literals.GLOBAL_TYPE_INTERACTION__SENDER );
		}
		
		// Check disjointness of operation names in choices
		Set< String > ops = new HashSet< String >();
		for( BranchGType branch : t.getBranches() ) {
			if ( ops.contains( branch.getOperation() ) ) {
				error( "All operations in the same choice must have distinct names (operation name: " + branch.getOperation() + ")",
						ChorPackage.Literals.GLOBAL_TYPE_INTERACTION__BRANCHES );
			}
			ops.add( branch.getOperation() );
		}
	}
}
