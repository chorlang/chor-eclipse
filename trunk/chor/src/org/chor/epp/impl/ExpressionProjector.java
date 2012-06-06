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
