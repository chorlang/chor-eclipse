package org.chor.epp.impl;

import org.chor.chor.IfThenElse;
import org.chor.chor.Interaction;
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
	
	@SuppressWarnings("unchecked")
	public static ThreadProjectionResult projectService( String publicChannel, String role, Program program )
		throws EndpointProjectionException
	{
		ServiceProjector projector = new ServiceProjector( publicChannel, role );
		projector.doSwitch( program.getChoreography() );
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
}
