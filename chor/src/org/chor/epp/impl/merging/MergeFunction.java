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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jolie.lang.parse.ast.NDChoiceStatement;
import jolie.lang.parse.ast.NotificationOperationStatement;
import jolie.lang.parse.ast.NullProcessStatement;
import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.OneWayOperationStatement;
import jolie.lang.parse.ast.RequestResponseOperationStatement;
import jolie.lang.parse.ast.SequenceStatement;
import jolie.lang.parse.ast.SolicitResponseOperationStatement;
import jolie.util.Pair;

import org.chor.epp.impl.JolieEppUtils;

public class MergeFunction
{
	private static NDChoiceStatement oneWayToInputChoice( OneWayOperationStatement stm )
	{
		NDChoiceStatement ndChoice = new NDChoiceStatement( JolieEppUtils.PARSING_CONTEXT );
		ndChoice.addChild( new Pair< OLSyntaxNode, OLSyntaxNode >(
			stm, new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT )
		));
		return ndChoice;
	}
	
	private static NDChoiceStatement requestResponseToInputChoice( RequestResponseOperationStatement stm )
	{
		NDChoiceStatement ndChoice = new NDChoiceStatement( JolieEppUtils.PARSING_CONTEXT );
		ndChoice.addChild( new Pair< OLSyntaxNode, OLSyntaxNode >(
			stm, new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT )
		));
		return ndChoice;
	}
	
	private static NDChoiceStatement sequenceToInputChoice( SequenceStatement sequence )
		throws MergingException
	{
		OLSyntaxNode head = sequence.children().get( 0 );
		if ( head instanceof OneWayOperationStatement ) {
			sequence.children().remove( 0 );
			NDChoiceStatement ndChoice = new NDChoiceStatement( JolieEppUtils.PARSING_CONTEXT );
			ndChoice.addChild( new Pair< OLSyntaxNode, OLSyntaxNode >(
				head,
				JolieEppUtils.optimizeProcess( sequence )
			));
			return ndChoice;
		} else if ( head instanceof RequestResponseOperationStatement ) {
			sequence.children().remove( 0 );
			NDChoiceStatement ndChoice = new NDChoiceStatement( JolieEppUtils.PARSING_CONTEXT );
			ndChoice.addChild( new Pair< OLSyntaxNode, OLSyntaxNode >(
				head,
				JolieEppUtils.optimizeProcess( sequence )
			));
			return ndChoice;
		} else if ( head instanceof NDChoiceStatement ) {
			sequence.children().remove( 0 );
			NDChoiceStatement headChoice = (NDChoiceStatement) head;
			Pair< OLSyntaxNode, OLSyntaxNode > pair;
			SequenceStatement newPairBody;
			for( int i = 0; i < headChoice.children().size(); i++ ) {
				pair = headChoice.children().get( i );
				newPairBody = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
				newPairBody.addChild( pair.value() );
				newPairBody.addChild( sequence );
				pair = new Pair< OLSyntaxNode, OLSyntaxNode >(
					pair.key(),
					newPairBody
				);
				headChoice.children().set( i, pair );
			}
			return headChoice;
		}
		
		throw new MergingException( "Could not transform sequence to input choice" );
	}
	
	public static OLSyntaxNode merge( NotificationOperationStatement left, NotificationOperationStatement right )
		throws MergingException
	{
		if ( EqualUtils.checkEqual( left, right ) ) {
			return left;
		}
		throw new MergingException( left, right );
	}
	
	public static OLSyntaxNode merge( SolicitResponseOperationStatement left, SolicitResponseOperationStatement right )
			throws MergingException
	{
		if ( EqualUtils.checkEqual( left, right ) ) {
			return left;
		}
		throw new MergingException( left, right );
	}

	public static OLSyntaxNode merge( SequenceStatement left, SequenceStatement right )
		throws MergingException
	{
		SequenceStatement seq = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		boolean keepRun = true;
		OLSyntaxNode leftChild, rightChild;
		for( int i = 0; i < left.children().size() && keepRun; i++ ) {
			if ( i >= right.children().size() ) {
				throw new MergingException( left.children().get( i ), new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT ) );
			}
			leftChild = left.children().get( i );
			rightChild = right.children().get( i );
			if ( EqualUtils.checkEqual( leftChild, rightChild ) ) {
				seq.addChild( left.children().get( i ) );
			} else {
				keepRun = false;
				// If they're not equal, let's try if we can make an input choice branching.
				SequenceStatement subSequenceLeft = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
				SequenceStatement subSequenceRight = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
				for( int k = i; k < left.children().size(); k++ ) {
					subSequenceLeft.addChild( left.children().get( k ) );
				}
				for( int k = i; k < right.children().size(); k++ ) {
					subSequenceRight.addChild( right.children().get( k ) );
				}
				NDChoiceStatement choice = sequenceToInputChoice( subSequenceLeft );
				return merge( choice, subSequenceRight );
			}
		}

		if ( seq.children().size() == 1 ) {
			return seq.children().get( 0 );
		}
		return seq;
	}

	public static OLSyntaxNode merge( NDChoiceStatement left, NDChoiceStatement right )
		throws MergingException
	{
		Map< String, Pair< OLSyntaxNode, OLSyntaxNode > > choiceMap = new HashMap< String, Pair< OLSyntaxNode, OLSyntaxNode > >();
		OneWayOperationStatement owStatement;
		RequestResponseOperationStatement rrStatement;
		Pair< OLSyntaxNode, OLSyntaxNode > otherPair;
		List< Pair< OLSyntaxNode, OLSyntaxNode > > choiceList =
			new ArrayList< Pair< OLSyntaxNode, OLSyntaxNode > >( left.children().size() + right.children().size() );
		choiceList.addAll( left.children() );
		choiceList.addAll( right.children() );
		for( Pair< OLSyntaxNode, OLSyntaxNode > pair : choiceList ) {
			if ( pair.key() instanceof OneWayOperationStatement ) {
				owStatement = (OneWayOperationStatement) pair.key();
				if ( choiceMap.containsKey( owStatement.id() ) ) {
					otherPair = choiceMap.get( owStatement.id() );
					if ( !(otherPair.key() instanceof OneWayOperationStatement) ) {
						throw new MergingException( owStatement, otherPair.key() );
					}
					if ( EqualUtils.checkEqual( owStatement, (OneWayOperationStatement) otherPair.key() ) ) {
						choiceMap.put(
							owStatement.id(),
							new Pair< OLSyntaxNode, OLSyntaxNode >(
								owStatement,
								MergeUtils.merge( pair.value(), otherPair.value() )
							)
						);
					} else {
						throw new MergingException( owStatement, otherPair.key() );
					}
				} else {
					choiceMap.put( owStatement.id(), pair );
				}
			} else if ( pair.key() instanceof RequestResponseOperationStatement ){
				rrStatement = (RequestResponseOperationStatement) pair.key();
				if ( choiceMap.containsKey( rrStatement.id() ) ) {
					otherPair = choiceMap.get( rrStatement.id() );
					if ( !(otherPair.key() instanceof RequestResponseOperationStatement) ) {
						throw new MergingException( rrStatement, otherPair.key() );
					}
					choiceMap.put(
						rrStatement.id(),
						new Pair< OLSyntaxNode, OLSyntaxNode >(
							MergeUtils.merge( pair.key(), (RequestResponseOperationStatement) otherPair.key() ),
							MergeUtils.merge( pair.value(), otherPair.value() )
						)
					);
				} else {
					choiceMap.put( rrStatement.id(), pair );
				}
			}
		}
		NDChoiceStatement ndChoice = new NDChoiceStatement( JolieEppUtils.PARSING_CONTEXT );
		ndChoice.children().addAll( choiceMap.values() );
		return ndChoice;
	}

	public static OLSyntaxNode merge( OneWayOperationStatement left, OneWayOperationStatement right )
		throws MergingException
	{
		OLSyntaxNode ret = null;
		if ( EqualUtils.checkEqual( left, right ) ) {
			ret = left;
		} else if ( !left.id().equals( right.id() ) ) { // The operation name is different
			NDChoiceStatement ndChoice = new NDChoiceStatement( JolieEppUtils.PARSING_CONTEXT );
			ndChoice.addChild( new Pair< OLSyntaxNode, OLSyntaxNode >(
				left, new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT )
			));
			ndChoice.addChild( new Pair< OLSyntaxNode, OLSyntaxNode >(
				right, new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT )
			));
			ret = ndChoice;
		}
		if ( ret == null ) {
			throw new MergingException( left, right );
		}
		return ret;
	}
	
	public static OLSyntaxNode merge( RequestResponseOperationStatement left, RequestResponseOperationStatement right )
		throws MergingException
	{
		OLSyntaxNode ret = null;
		if ( left.id().equals( right.id() ) ) {
			if ( !EqualUtils.checkEqual( left.inputVarPath(), right.inputVarPath() )
				|| !EqualUtils.checkEqual( left.outputExpression(), right.outputExpression() )
			) {
				throw new MergingException( left, right );
			}
			
			ret = new RequestResponseOperationStatement(
				left.context(), left.id(),
				left.inputVarPath(), left.outputExpression(),
				MergeUtils.merge( left.process(), right.process() )
			);
		} else {
			NDChoiceStatement ndChoice = new NDChoiceStatement( JolieEppUtils.PARSING_CONTEXT );
			ndChoice.addChild( new Pair< OLSyntaxNode, OLSyntaxNode >(
				left, new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT )
			));
			ndChoice.addChild( new Pair< OLSyntaxNode, OLSyntaxNode >(
				right, new NullProcessStatement( JolieEppUtils.PARSING_CONTEXT )
			));
			ret = ndChoice;
		}
		return ret;
	}
	
	public static OLSyntaxNode merge( NDChoiceStatement left, OneWayOperationStatement right )
		throws MergingException
	{
		return merge( left, oneWayToInputChoice( right ) );
	}
	
	public static OLSyntaxNode merge( OneWayOperationStatement left, NDChoiceStatement right )
		throws MergingException
	{
		return merge( oneWayToInputChoice( left ), right );
	}
	
	public static OLSyntaxNode merge( NDChoiceStatement left, RequestResponseOperationStatement right )
		throws MergingException
	{
		return merge( left, requestResponseToInputChoice( right ) );
	}
	
	public static OLSyntaxNode merge( RequestResponseOperationStatement left, NDChoiceStatement right )
		throws MergingException
	{
		return merge( requestResponseToInputChoice( left ), right );
	}
	
	public static OLSyntaxNode merge( NDChoiceStatement left, SequenceStatement right )
		throws MergingException
	{
		return merge( left, sequenceToInputChoice( right ) );
	}
	
	public static OLSyntaxNode merge( SequenceStatement left, NDChoiceStatement right )
		throws MergingException
	{
		return merge( sequenceToInputChoice( left ), right );
	}
	
	public static OLSyntaxNode merge( OneWayOperationStatement left, SequenceStatement right )
		throws MergingException
	{
		SequenceStatement leftSequence = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		leftSequence.addChild( left );
		return merge( leftSequence, right );
	}
	
	public static OLSyntaxNode merge( SequenceStatement left, OneWayOperationStatement right )
		throws MergingException
	{
		SequenceStatement rightSequence = new SequenceStatement( JolieEppUtils.PARSING_CONTEXT );
		rightSequence.addChild( right );
		return merge( left, rightSequence );
	}
	
	public static OLSyntaxNode merge( NullProcessStatement left, NullProcessStatement right )
	{
		return left;
	}
}