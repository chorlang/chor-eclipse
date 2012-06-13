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
