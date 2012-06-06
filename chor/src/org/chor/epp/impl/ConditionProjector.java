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
