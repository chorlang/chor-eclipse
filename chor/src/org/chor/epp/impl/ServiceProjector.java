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

import org.chor.chor.Call;
import org.chor.chor.Delegation;
import org.chor.chor.IfThenElse;
import org.chor.chor.Interaction;
import org.chor.chor.LocalCode;
import org.chor.chor.Procedure;
import org.chor.chor.Program;
import org.chor.chor.Start;
import org.chor.chor.ThreadWithRole;
import org.chor.chor.util.ChorSwitch;
import org.chor.epp.EndpointProjectionException;
import org.chor.epp.impl.merging.MergingException;
import org.eclipse.emf.ecore.EObject;

public class ServiceProjector extends ChorSwitch< Boolean >
{
	private final String role;
	private final String publicChannel;
	private Exception errorException = null;
	private ThreadProjectionResult currentResult = null;
	
	private ServiceProjector( String publicChannel, String role )
	{
		this.publicChannel = publicChannel;
		this.role = role;
	}
	
	private void error( Exception e )
	{
		if ( errorException == null ) {
			errorException = e;
		}
	}
	
	public static ThreadProjectionResult projectService( String publicChannel, String role, Program program )
		throws EndpointProjectionException
	{
		ServiceProjector projector = new ServiceProjector( publicChannel, role );
		projector.doSwitch( program.getChoreography() );
		for( Procedure procedure : program.getProcedures() ) {
			projector.doSwitch( procedure.getChoreography() );
		}
		if ( projector.errorException != null ) {
			throw new EndpointProjectionException( projector.errorException );
		}
		if ( projector.currentResult == null ) {
			return new ThreadProjectionResult();
		}
		return projector.currentResult;
	}
	
	private void merge( ThreadProjectionResult result )
		throws MergingException
	{
		if ( currentResult == null ) {
			currentResult = result;
		} else {
			currentResult.merge( result );
		}
	}
	
	public Boolean caseStart( Start n )
	{
		try {
			if ( n.getPublicChannel().getName().equals( publicChannel ) ) {
				for( ThreadWithRole t : n.getServiceThreads() ) {
					if ( t.getRole().equals( role ) ) {
						merge( ThreadProjector.projectServiceThread( t.getThread(), n ) );
					}
				}
			}
		} catch( MergingException e ) {
			error( e );
		} catch( EndpointProjectionException e ) {
			error( e );
		}
		
		doSwitchIfNotNull( n.getContinuation() );
		
		return true;
	}
	
	public Boolean caseIfThenElse( IfThenElse n )
	{
		doSwitchIfNotNull( n.getThen() );
		doSwitchIfNotNull( n.getElse() );
		return true;
	}
	
	public Boolean caseDelegation( Delegation n )
	{
		return doSwitchIfNotNull( n.getContinuation() );
	}
	
	public Boolean caseLocalCode( LocalCode n )
	{
		return doSwitchIfNotNull( n.getContinuation() );
	}
	
	public Boolean caseInteraction( Interaction n )
	{
		doSwitchIfNotNull( n.getContinuation() );
		return true;
	}
	
	private Boolean doSwitchIfNotNull( EObject e )
	{
		if ( e != null ) {
			return doSwitch( e );
		}
		return null;
	}
	
	public Boolean caseCall( Call n )
	{
		return true;
	}
}
