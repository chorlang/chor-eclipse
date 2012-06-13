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

import jolie.lang.parse.Scanner;
import jolie.lang.parse.ast.CompareConditionNode;
import jolie.lang.parse.ast.OLSyntaxNode;

import org.chor.chor.CompareCondition;
import org.chor.chor.Condition;
import org.chor.chor.ConditionOperator;
import org.chor.chor.util.ChorSwitch;
import org.eclipse.emf.ecore.EObject;

public class ConditionProjector extends ChorSwitch< OLSyntaxNode >
{
	private ConditionProjector() {}

	public static OLSyntaxNode project( Condition condition )
	{
		return new ConditionProjector().doSwitchIfNotNull( condition );
	}

	public OLSyntaxNode caseCondition( Condition n )
	{
		return doSwitchIfNotNull( n.getCompareCondition() );
	}

	private static Scanner.TokenType projectCompareOperator( ConditionOperator operator )
	{
		if ( operator.isEqual() ) {
			return Scanner.TokenType.EQUAL;
		} else if ( operator.isLess() ) {
			return Scanner.TokenType.LANGLE;
		} else if ( operator.isGreater() ) {
			return Scanner.TokenType.RANGLE;
		} else if ( operator.isNot_equal() ) {
			return Scanner.TokenType.NOT_EQUAL;
		}
	
		return null;
	}

	public OLSyntaxNode caseCompareCondition( CompareCondition n )
	{
		return new CompareConditionNode(
			JolieEppUtils.PARSING_CONTEXT,
			ExpressionProjector.project( n.getLeftExpression() ),
			ExpressionProjector.project( n.getRightExpression() ),
			projectCompareOperator( n.getOperator() )
		);
	}

	private OLSyntaxNode doSwitchIfNotNull( EObject e )
	{
		if ( e != null ) {
			return doSwitch( e );
		}
		return null;
	}
}
