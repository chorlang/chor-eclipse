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

import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.expression.ConstantIntegerExpression;
import jolie.lang.parse.ast.expression.ConstantStringExpression;
import jolie.lang.parse.ast.expression.SumExpressionNode;

import org.chor.chor.Constant;
import org.chor.chor.Expression;
import org.chor.chor.ExpressionBasicTerm;
import org.chor.chor.SumExpression;
import org.chor.chor.SumExpressionAddTerm;
import org.chor.chor.SumExpressionTerm;
import org.chor.chor.util.ChorSwitch;
import org.eclipse.emf.ecore.EObject;

public class ExpressionProjector extends ChorSwitch< OLSyntaxNode >
{
	private ExpressionProjector() {}
	
	public static OLSyntaxNode project( EObject expression )
	{
		return new ExpressionProjector().doSwitchIfNotNull( expression );
	}
	
	public OLSyntaxNode caseExpression( Expression n )
	{
		return doSwitchIfNotNull( n.getSumExpression() );
	}
	
	public OLSyntaxNode caseSumExpression( SumExpression n )
	{
		SumExpressionNode jolieSumExpression = new SumExpressionNode( JolieEppUtils.PARSING_CONTEXT );
		OLSyntaxNode jolieTerm;
		for( EObject term : n.getChildren() ) {
			jolieTerm = doSwitch( term );
			if ( term instanceof SumExpressionAddTerm || term instanceof ExpressionBasicTerm ) {
				jolieSumExpression.add( jolieTerm );
			} else {
				jolieSumExpression.subtract( jolieTerm );
			}
		}
		return jolieSumExpression;
	}
	
	public OLSyntaxNode caseSumExpressionTerm( SumExpressionTerm n )
	{
		return doSwitch( n.getExpression() );
	}

	public OLSyntaxNode caseExpressionBasicTerm( ExpressionBasicTerm n )
	{
		if ( n.getVariable() != null ) {
			return JolieEppUtils.variableNameToJolieVariablePath( n.getVariable() );
		} else if ( n.getConstant() != null ) {
			return doSwitch( n.getConstant() );
		} else if ( n.getExpression() != null ) {
			return doSwitch( n.getExpression() );
		}

		return null;
	}
	
	public OLSyntaxNode caseConstant( Constant n )
	{
		if ( n.getStrValue() != null ) {
			return new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, n.getStrValue() );
		} else {
			return new ConstantIntegerExpression( JolieEppUtils.PARSING_CONTEXT, n.getIntValue() );
		}
	}
	
	private OLSyntaxNode doSwitchIfNotNull( EObject e )
	{
		if ( e != null ) {
			return doSwitch( e );
		}
		return null;
	}
}
