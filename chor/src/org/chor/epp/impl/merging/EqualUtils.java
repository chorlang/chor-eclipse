package org.chor.epp.impl.merging;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import jolie.lang.Constants.OperandType;
import jolie.lang.parse.ast.AssignStatement;
import jolie.lang.parse.ast.NotificationOperationStatement;
import jolie.lang.parse.ast.NullProcessStatement;
import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.OneWayOperationStatement;
import jolie.lang.parse.ast.VariablePathNode;
import jolie.lang.parse.ast.expression.ConstantIntegerExpression;
import jolie.lang.parse.ast.expression.ConstantStringExpression;
import jolie.lang.parse.ast.expression.SumExpressionNode;
import jolie.util.Pair;

public class EqualUtils
{
	public static Boolean checkEqual( OLSyntaxNode left, OLSyntaxNode right )
	{
		try {
			if ( left == null || right == null ) {
				return left == right;
			}
			Method m = EqualUtils.class.getMethod( "checkEqual", left.getClass(), right.getClass() );
			return (Boolean) m.invoke( null, left, right );
		} catch( NoSuchMethodException e ) {
			return false;
		} catch( InvocationTargetException e ) {
			return false;
		} catch( IllegalAccessException e ) {
			return false;
		}
	}
	
	public static Boolean checkEqual( OneWayOperationStatement left, OneWayOperationStatement right )
	{
		if ( !left.id().equals( right.id() ) ) {
			return false;
		}
		
		return checkEqual( left.inputVarPath(), right.inputVarPath() );
	}
	
	public static Boolean checkEqual( NullProcessStatement left, NullProcessStatement right )
	{
		return true;
	}
	
	public static Boolean checkEqual( AssignStatement left, AssignStatement right )
	{
		return checkEqual( left.variablePath(), right.variablePath() ) && checkEqual( left.expression(), right.expression() );
	}
	
	public static Boolean checkEqual( NotificationOperationStatement left, NotificationOperationStatement right )
	{
		if ( !left.id().equals( right.id() ) ) {
			return false;
		}

		if ( !left.outputPortId().equals( right.outputPortId() ) ) {
			return false;
		}

		return checkEqual( left.outputExpression(), right.outputExpression() );
	}
	
	public static Boolean checkEqual( SumExpressionNode left, SumExpressionNode right )
	{
		if ( left.operands().size() != right.operands().size() ) {
			return null;
		}
		
		Pair< OperandType, OLSyntaxNode > leftPair, rightPair;
		for( int i = 0; i < left.operands().size(); i++ ) {
			leftPair = left.operands().get( i );
			rightPair = right.operands().get( i );
			if (
				leftPair.key() != rightPair.key()
				|| checkEqual( leftPair.value(), rightPair.value() ) == false
			) {
				return false;
			}
		}
		return true;
	}

	public static Boolean checkEqual( VariablePathNode left, VariablePathNode right )
	{
		if ( left == null || right == null ) {
			return left == right;
		}
		
		if ( left.path().size() != right.path().size() ) {
			return false;
		}

		ConstantStringExpression leftName, rightName;
		ConstantIntegerExpression leftIndex, rightIndex;
		Pair< OLSyntaxNode, OLSyntaxNode > leftPair, rightPair;
		for( int i = 0; i < left.path().size(); i++ ) {
			leftPair = left.path().get( i );
			rightPair = right.path().get( i );
			leftName = (ConstantStringExpression)leftPair.key();
			rightName = (ConstantStringExpression)rightPair.key();
			if ( !leftName.value().equals( rightName.value() ) ) {
				return false;
			}
			leftIndex = (ConstantIntegerExpression)leftPair.value();
			rightIndex = (ConstantIntegerExpression)rightPair.value();
			if ( leftIndex.value() != rightIndex.value() ) {
				return false;
			}
		}
		return true;
	}
}
