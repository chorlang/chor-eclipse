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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import jolie.lang.parse.ast.NullProcessStatement;
import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.OneWayOperationDeclaration;
import jolie.lang.parse.ast.OperationDeclaration;
import jolie.lang.parse.ast.OutputPortInfo;
import jolie.lang.parse.ast.RequestResponseOperationDeclaration;

import org.chor.epp.impl.merging.MergeUtils;
import org.chor.epp.impl.merging.MergingException;

public class ThreadProjectionResult
{
	private OLSyntaxNode jolieNode;
	private final Map< String, Set< String > > inputOperationMap;
	private final Set< String > uncorrelatedInputOperations;
	private final Map< String, OutputPortInfo > outputPorts;
	
	public ThreadProjectionResult()
	{
		this.jolieNode = new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT );
		this.inputOperationMap = new HashMap< String, Set< String > >();
		this.uncorrelatedInputOperations = new HashSet< String >();
		this.outputPorts = new HashMap< String, OutputPortInfo >();
	}
	
	public OLSyntaxNode jolieNode()
	{
		return jolieNode;
	}
	
	public void setJolieNode( OLSyntaxNode jolieNode )
	{
		this.jolieNode = jolieNode;
	}
	
	public Set< String > compositeRoles()
	{
		return inputOperationMap.keySet();
	}
	
	public Set< String > inputOperationsForCorrelationSet( String cset )
	{
		Set< String > inputOperations = inputOperationMap.get( cset );
		if ( inputOperations == null ) {
			inputOperations = new HashSet< String >();
			inputOperationMap.put( cset, inputOperations );
		}
		
		return inputOperations;
	}
	
	public Set< String > uncorrelatedInputOperations()
	{
		return uncorrelatedInputOperations;
	}
	
	public Map< String, OutputPortInfo > outputPorts()
	{
		return outputPorts;
	}
	
	public void addOneWayOperation( String outputPortName, String operationName )
	{
		getOutputPort( outputPortName ).addOperation( new OneWayOperationDeclaration( JolieEppUtils.PARSING_CONTEXT, operationName ) );
	}
	
	public void addRequestResponseOperation( String outputPortName, String operationName )
	{
		getOutputPort( outputPortName ).addOperation( new RequestResponseOperationDeclaration( JolieEppUtils.PARSING_CONTEXT, operationName, null, null, null ) );
	}
	
	private OutputPortInfo getOutputPort( String outputPortName )
	{
		OutputPortInfo port = outputPorts.get( outputPortName );
		if ( port == null ) {
			port = new OutputPortInfo( JolieEppUtils.PARSING_CONTEXT, outputPortName );
			port.setProtocolId( "sodep" );
			outputPorts.put( outputPortName, port );
		}
		return port;
	}

	public void merge( ThreadProjectionResult other )
		throws MergingException
	{
		mergeNamesOnly( other );
		jolieNode = MergeUtils.optimizeAndMerge( jolieNode, other.jolieNode );
	}
	
	public void mergeNamesOnly( ThreadProjectionResult other )
	{
		for( String cset : other.inputOperationMap.keySet() ) {
			inputOperationsForCorrelationSet( cset ).addAll( other.inputOperationsForCorrelationSet( cset ) );
		}
		uncorrelatedInputOperations.addAll( other.uncorrelatedInputOperations );

		for( Map.Entry< String, OutputPortInfo > entry : other.outputPorts.entrySet() ) {
			for( OperationDeclaration opDecl : entry.getValue().operations() ) {
				if ( opDecl instanceof OneWayOperationDeclaration ) {
					addOneWayOperation( entry.getKey(), opDecl.id() );
				} else {
					addRequestResponseOperation( entry.getKey(), opDecl.id() );
				}
			}
		}
	}
}
