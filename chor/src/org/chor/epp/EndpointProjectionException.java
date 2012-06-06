package org.chor.epp;

public class EndpointProjectionException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public EndpointProjectionException( Throwable t )
	{
		super( t );
	}

	public EndpointProjectionException( String message )
	{
		super( message );
	}
}
