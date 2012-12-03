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

/**
 * Result of a thread endpoint projection.
 * 
 * This class offers methods for merging thread projections, and accessing
 * information such as the used input operations and their correlation sets.
 * 
 * @author Fabrizio Montesi
 *
 */
public class ThreadProjectionResult
{
	// The projected Jolie abstract syntax node
	private OLSyntaxNode jolieNode;
	
	// Procedure projections: procedure name -> projection
	private Map< String, ThreadProjectionResult > procedureProjections = new HashMap< String, ThreadProjectionResult >();
	
	// cset -> input operations
	private final Map< String, Set< String > > inputOperationMap;
	
	// { op | op is an operation used for receiving a delegation }
	private final Set< String > delegationOps = new HashSet< String >();
	
	// { op | op is an operation without correlation set }
	private final Set< String > uncorrelatedInputOperations;
	
	// output port name -> output port
	private final Map< String, OutputPortInfo > outputPorts;
	
	// { s | s is a filename to be included at the beginning of the Jolie program }
	private final Set< String > includes;
	
	/**
	 * Constructor.
	 */
	public ThreadProjectionResult()
	{
		this.jolieNode = new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT );
		this.inputOperationMap = new HashMap< String, Set< String > >();
		this.uncorrelatedInputOperations = new HashSet< String >();
		this.outputPorts = new HashMap< String, OutputPortInfo >();
		this.includes = new HashSet< String >();
	}
	
	public boolean isUsedForDelegation( String operation )
	{
		return delegationOps.contains( operation );
	}
	
	public void setUsedForDelegation( String operation )
	{
		delegationOps.add( operation );
	}

	public void addInclude( String include )
	{
		includes.add( include );
	}

	public Set< String > includes()
	{
		return includes;
	}
	
	public OLSyntaxNode jolieNode()
	{
		return jolieNode;
	}
	
	public Map< String, ThreadProjectionResult > procedureProjections()
	{
		return procedureProjections;
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

	public void addOWToOutputPort( String outputPortName, String operationName )
	{
		getOutputPort( outputPortName ).addOperation( new OneWayOperationDeclaration( JolieEppUtils.PARSING_CONTEXT, operationName ) );
	}
	
	public void addRRToOutputPort( String outputPortName, String operationName )
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
		jolieNode = MergeUtils.optimizeAndMerge( jolieNode, other.jolieNode ).jolieNode();
	}
	
	public void mergeNamesOnly( ThreadProjectionResult other )
	{
		for( String cset : other.inputOperationMap.keySet() ) {
			inputOperationsForCorrelationSet( cset ).addAll( other.inputOperationsForCorrelationSet( cset ) );
		}
		delegationOps.addAll( other.delegationOps );
		uncorrelatedInputOperations.addAll( other.uncorrelatedInputOperations );

		for( Map.Entry< String, OutputPortInfo > entry : other.outputPorts.entrySet() ) {
			for( OperationDeclaration opDecl : entry.getValue().operations() ) {
				if ( opDecl instanceof OneWayOperationDeclaration ) {
					addOWToOutputPort( entry.getKey(), opDecl.id() );
				} else {
					addRRToOutputPort( entry.getKey(), opDecl.id() );
				}
			}
		}
		
		includes.addAll( other.includes );
	}
}
