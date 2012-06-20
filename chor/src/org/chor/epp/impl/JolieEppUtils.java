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

import java.net.URI;

import jolie.lang.parse.OLParseTreeOptimizer;
import jolie.lang.parse.ast.DefinitionNode;
import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.VariablePathNode;
import jolie.lang.parse.ast.VariablePathNode.Type;
import jolie.lang.parse.ast.expression.ConstantIntegerExpression;
import jolie.lang.parse.ast.expression.ConstantStringExpression;
import jolie.lang.parse.context.ParsingContext;
import jolie.lang.parse.context.URIParsingContext;
import jolie.util.Pair;

import org.chor.chor.Expression;
import org.chor.chor.ExpressionBasicTerm;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public class JolieEppUtils
{
	public static final ParsingContext PARSING_CONTEXT = new URIParsingContext( URI.create( "chor" ), 0 );
	
	public static OLSyntaxNode optimizeProcess( OLSyntaxNode processNode )
	{
		jolie.lang.parse.ast.Program jolieProgram = new jolie.lang.parse.ast.Program( JolieEppUtils.PARSING_CONTEXT );
		jolieProgram.addChild( new DefinitionNode( JolieEppUtils.PARSING_CONTEXT, "main", processNode ) );
		jolieProgram = new OLParseTreeOptimizer( jolieProgram ).optimize();
		DefinitionNode main = (DefinitionNode) jolieProgram.children().get( 0 );
		return main.body();
	}
	
	public static VariablePathNode variableNameToJolieVariablePath( String variable )
	{
		if ( variable == null ) {
			return null;
		}
		VariablePathNode ret = new VariablePathNode( JolieEppUtils.PARSING_CONTEXT, VariablePathNode.Type.NORMAL );
		ret.append( new Pair< OLSyntaxNode, OLSyntaxNode >(
			new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, variable ),
			new ConstantIntegerExpression( JolieEppUtils.PARSING_CONTEXT, 0 )
		));
		return ret;
	}
	
	public static VariablePathNode variableNameToGlobalJolieVariablePath( String variable )
	{
		if ( variable == null ) {
			return null;
		}
		VariablePathNode ret = new VariablePathNode( JolieEppUtils.PARSING_CONTEXT, VariablePathNode.Type.GLOBAL );
		ret.append( new Pair< OLSyntaxNode, OLSyntaxNode >(
			new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, variable ),
			new ConstantIntegerExpression( JolieEppUtils.PARSING_CONTEXT, 0 )
		));
		return ret;
	}

	public static VariablePathNode getSessionDescriptorPath( String session )
	{
		VariablePathNode ret = new VariablePathNode( JolieEppUtils.PARSING_CONTEXT, Type.NORMAL );
		ret.append( new Pair< OLSyntaxNode, OLSyntaxNode >(
			new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, SESSION_DESCRIPTOR ),
			new ConstantIntegerExpression( JolieEppUtils.PARSING_CONTEXT, 0 )
		));
		ret.append( new Pair< OLSyntaxNode, OLSyntaxNode >(
			new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, session ),
			new ConstantIntegerExpression( JolieEppUtils.PARSING_CONTEXT, 0 )
		));
		return ret;
	}
	
	public static VariablePathNode getCorrelationVariablePath( String varName )
	{
		VariablePathNode ret = new VariablePathNode( JolieEppUtils.PARSING_CONTEXT, Type.CSET );
		ret.append( new Pair< OLSyntaxNode, OLSyntaxNode >(
			new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, "csets" ),
			new ConstantIntegerExpression( JolieEppUtils.PARSING_CONTEXT, 0 )
		));
		ret.append( new Pair< OLSyntaxNode, OLSyntaxNode >(
			new ConstantStringExpression( JolieEppUtils.PARSING_CONTEXT, varName ),
			new ConstantIntegerExpression( JolieEppUtils.PARSING_CONTEXT, 0 )
		));
		return ret;
	}

	public static String getSimpleChorVariable( EObject e )
	{
		if ( e != null ) {
			if ( e instanceof ExpressionBasicTerm ) {
				return ((ExpressionBasicTerm)e).getVariable();
			} else if ( e instanceof Expression ){
				EList< EObject > list = ((Expression)e).getSumExpression().getChildren();
				if ( list.size() == 1 ) {
					return ((ExpressionBasicTerm)list.get( 0 )).getVariable();
				}
			}
		}
		return null;
	}

	public static void appendSubNode( VariablePathNode path, String nodeName )
	{
		path.append( new Pair< OLSyntaxNode, OLSyntaxNode >(
			new ConstantStringExpression( PARSING_CONTEXT, nodeName ),
			new ConstantIntegerExpression( PARSING_CONTEXT, 0 )
		));
	}

	public final static String TID_VARNAME = "tid";
	public final static String TMP_VARNAME = "_tmp";
	public final static String DELEGATION_TMP_VARNAME = "_delegation_tmp";
	//public final static String DELEGATION_DESCRIPTOR_VARNAME = "delegatedSessionDescriptor";
	public final static String SELF_INPUT_PORT_NAME = "MyInputPort";
	public final static String DEFAULT_MESSAGE_TYPE = "ChorType";
	public final static String SESSION_DESCRIPTOR = "_sessionDescriptor";
	private final static String DELEGATION_SYNC_OPNAME = "__delegationSync";
	public final static VariablePathNode SELFREF_VARPATH = variableNameToJolieVariablePath( "_myRef" );
	public final static VariablePathNode SELFREF_TID_VARPATH = variableNameToJolieVariablePath( "_myRef" );
	public final static VariablePathNode SELFREF_BINDING_VARPATH = variableNameToJolieVariablePath( "_myRef" );
	public final static VariablePathNode SELF_INPUT_PORT = new VariablePathNode( PARSING_CONTEXT, VariablePathNode.Type.GLOBAL );
	public final static VariablePathNode EXPRESSION_VARPATH = variableNameToJolieVariablePath( TMP_VARNAME );
	public final static VariablePathNode EXPRESSION_TID_VARPATH = variableNameToJolieVariablePath( TMP_VARNAME );
	
	static {
		JolieEppUtils.appendSubNode( JolieEppUtils.SELFREF_TID_VARPATH, TID_VARNAME );
	
		JolieEppUtils.appendSubNode( JolieEppUtils.SELFREF_BINDING_VARPATH, "binding" );
	
		JolieEppUtils.appendSubNode( JolieEppUtils.SELF_INPUT_PORT, "inputPorts" );
		JolieEppUtils.appendSubNode( JolieEppUtils.SELF_INPUT_PORT, SELF_INPUT_PORT_NAME );
	
		JolieEppUtils.appendSubNode( JolieEppUtils.EXPRESSION_TID_VARPATH, TID_VARNAME );
	}
	
	public static class Operations {
		public final static String SERVICE_THREAD_START = "_start";
	}
	
	public static String getDelegationSyncOperation( String session )
	{
		return DELEGATION_SYNC_OPNAME + "_" + session;
	}
	
	public static class SessionStart {
		public final static VariablePathNode THREAD_REF_VARPATH = variableNameToJolieVariablePath( "threadRef" );
		public final static VariablePathNode SELF_LOCATION_VARPATH = variableNameToJolieVariablePath( "Self" );
		public final static VariablePathNode GLOBAL_SESSION_DESCRIPTOR_VARPATH = variableNameToGlobalJolieVariablePath( "sessionDescriptor" );
		public final static VariablePathNode GLOBAL_TMP_SESSION_DESCRIPTOR_VARPATH = variableNameToGlobalJolieVariablePath( "descTmp" );
		static {
			appendSubNode( SELF_LOCATION_VARPATH, "location" );
		}
	}

	public static String getMessageTypeName( String compositeRole )
	{
		return compositeRole;
	}
}
