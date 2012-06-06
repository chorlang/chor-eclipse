package org.chor.epp.impl.merging;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import jolie.lang.parse.ast.OLSyntaxNode;

import org.chor.epp.impl.JolieEppUtils;

public class MergeUtils
{
	public static OLSyntaxNode merge( OLSyntaxNode left, OLSyntaxNode right )
		throws MergingException
	{
		try {
			Method m = MergeFunction.class.getMethod( "merge", left.getClass(), right.getClass() );
			return (OLSyntaxNode) m.invoke( null, left, right );
		} catch( NoSuchMethodException e ) {
			throw new MergingException( left, right );
		} catch( InvocationTargetException e ) {
			if ( e.getCause() instanceof MergingException ) {
				throw (MergingException) e.getCause();
			} else {
				throw new MergingException( left, right );
			}
		} catch( IllegalAccessException e ) {
			throw new MergingException( left, right );
		}
	}

	public static OLSyntaxNode optimizeAndMerge( OLSyntaxNode left, OLSyntaxNode right )
			throws MergingException
	{
		return merge( JolieEppUtils.optimizeProcess( left ), JolieEppUtils.optimizeProcess( right ) );
	}
}
