package org.chor.epp.impl.merging;

import jolie.lang.parse.ast.OLSyntaxNode;

public class MergingException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public MergingException( String string )
	{
		super( string );
	}
	
	public MergingException( OLSyntaxNode left, OLSyntaxNode right )
	{
		this( "Could not merge " + left.getClass().getSimpleName() + " with " + right.getClass().getSimpleName() );
	}
	
	public MergingException( String originatingThread, MergingException e )
	{
		this( "Thread " + originatingThread + ": " + e.getMessage() );
	}
}
