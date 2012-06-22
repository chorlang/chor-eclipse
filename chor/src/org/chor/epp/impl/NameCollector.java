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

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import jolie.lang.parse.ast.OneWayOperationDeclaration;
import jolie.lang.parse.ast.OperationDeclaration;

import org.chor.chor.Choreography;
import org.chor.chor.Delegation;
import org.chor.chor.IfThenElse;
import org.chor.chor.Interaction;
import org.chor.chor.LocalCode;
import org.chor.chor.Start;
import org.chor.chor.ThreadWithRole;
import org.chor.chor.util.ChorSwitch;
import org.eclipse.emf.ecore.EObject;

/**
 * Utility class for collecting some name sets and maps from programs.
 * 
 * @author Fabrizio Montesi
 *
 */
public class NameCollector extends ChorSwitch< Boolean >
{
	/*
	 * Collects the input operations used by each receiver thread.
	 */
	public static class ThreadOperations {
		
		// thread -> operation -> operation type
		private final Map< String, Map< String, OperationDeclaration > > operationMap =
			new HashMap< String, Map< String, OperationDeclaration > >();

		private void checkInteraction( Interaction n )
		{
			Map< String, OperationDeclaration > operations = operationMap.get( n.getReceiver() );
			if ( operations == null ) {
				operations = new HashMap< String, OperationDeclaration >();
				operationMap.put( n.getReceiver(), operations );
			}
			operations.put(
				n.getOperation(),
				new OneWayOperationDeclaration( JolieEppUtils.PARSING_CONTEXT, n.getOperation() )
			);
		}
		
		private void checkDelegation( Delegation n )
		{
			Map< String, OperationDeclaration > operations = operationMap.get( n.getReceiver() );
			if ( operations == null ) {
				operations = new HashMap< String, OperationDeclaration >();
				operationMap.put( n.getReceiver(), operations );
			}
			operations.put(
				n.getOperation(),
				new OneWayOperationDeclaration( JolieEppUtils.PARSING_CONTEXT, n.getOperation() )
			);
		}
	}
	
	private final Set< String > activeThreads = new HashSet< String >();
	private final ThreadOperations threadOperations = new ThreadOperations();
	// private final Map< String, Set< String> > targetThreads = new HashMap< String, Set< String > >();
	private final Map< String, Set< String > > publicChannelActiveRoles =
		new HashMap< String, Set< String > >();
	private final Map< String, Set< String > > publicChannelServiceRoles =
		new HashMap< String, Set< String > >();

	private void addPublicChannelActiveRole( String publicChannel, String role )
	{
		Set< String > roles = publicChannelActiveRoles.get( publicChannel );
		if ( roles == null ) {
			roles = new HashSet< String >();
			publicChannelActiveRoles.put( publicChannel, roles );
		}
		roles.add( role );
	}
	
	private void addPublicChannelServiceRole( String publicChannel, String role )
	{
		Set< String > roles = publicChannelServiceRoles.get( publicChannel );
		if ( roles == null ) {
			roles = new HashSet< String >();
			publicChannelServiceRoles.put( publicChannel, roles );
		}
		roles.add( role );
	}

	public ThreadOperations threadOperations()
	{
		return threadOperations;
	}

	public Set< String > activeThreads()
	{
		return activeThreads;
	}

	public Set< String > publicChannels()
	{
		Set< String > channels = new HashSet< String >();
		channels.addAll( publicChannelActiveRoles.keySet() );
		channels.addAll( publicChannelServiceRoles.keySet() );
		return channels;
	}
	
	public Set< String > getPublicChannelRoles( String publicChannel )
	{
		Set< String > channels = new HashSet< String >();
		channels.addAll( getPublicChannelActiveRoles( publicChannel ) );
		channels.addAll( getPublicChannelServiceRoles( publicChannel ) );
		return channels;
	}
	
	@SuppressWarnings("unchecked")
	public Set< String > getPublicChannelActiveRoles( String publicChannel )
	{
		Set< String > ret;
		ret = publicChannelActiveRoles.get( publicChannel );
		if ( ret == null ) {
			ret = (Set< String >)Collections.EMPTY_SET;
		}
		return ret;
	}
	
	@SuppressWarnings("unchecked")
	public Set< String > getPublicChannelServiceRoles( String publicChannel )
	{
		Set< String > ret;
		ret = publicChannelServiceRoles.get( publicChannel );
		if ( ret == null ) {
			ret = (Set< String >)Collections.EMPTY_SET;
		}
		return ret;
	}
	
	public boolean isActiveThread( String thread )
	{
		return activeThreads.contains( thread );
	}
	
	public void collect( Choreography choreography )
	{
		doSwitch( choreography );
	}
	
	public Boolean caseStart( Start n )
	{
		doSwitchIfNotNull( n.getContinuation() );
		for( ThreadWithRole t : n.getServiceThreads() ) {
			activeThreads.remove( t.getThread() );
			addPublicChannelServiceRole( n.getPublicChannel().getName(), t.getRole() );
		}
		for( ThreadWithRole t : n.getActiveThreads() ) {
			activeThreads.add( t.getThread() );
			addPublicChannelActiveRole( n.getPublicChannel().getName(), t.getRole() );
		}
		
		return true;
	}
	
	public Boolean caseLocalCode( LocalCode n )
	{
		doSwitchIfNotNull( n.getContinuation() );
		activeThreads.add( n.getThread() );
		return true;
	}
	
	public Boolean caseInteraction( Interaction n )
	{
		doSwitchIfNotNull( n.getContinuation() );
		threadOperations.checkInteraction( n );
		//addTargetThread( n );
		
		activeThreads.add( n.getSender() );
		activeThreads.add( n.getReceiver() );
		return true;
	}
	
	public Boolean caseDelegation( Delegation n )
	{
		doSwitchIfNotNull( n.getContinuation() );
		threadOperations.checkDelegation( n );
		//addTargetThread( n );
		
		activeThreads.add( n.getSender() );
		activeThreads.add( n.getReceiver() );
		return true;
	}
	
	public Boolean caseIfThenElse( IfThenElse n )
	{
		doSwitchIfNotNull( n.getThen() );
		doSwitchIfNotNull( n.getElse() );
		activeThreads.add( n.getThread() );
		return true;
	}
	
	private Boolean doSwitchIfNotNull( EObject e )
	{
		if ( e != null ) {
			return doSwitch( e );
		}
		return true;
	}
	
	/*private void addTargetThread( Interaction n )
	{
		Set< String > targets = targetThreads.get( n.getSender() );
		if ( targets == null ) {
			targets = new HashSet< String >();
		}
		targets.add( n.getReceiver() );
	}
	
	private void addTargetThread( Delegation n )
	{
		Set< String > targets = targetThreads.get( n.getSender() );
		if ( targets == null ) {
			targets = new HashSet< String >();
		}
		targets.add( n.getReceiver() );
	}*/
}
