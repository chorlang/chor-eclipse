/***************************************************************************
 *   Copyright (C) 2012 by Fabrizio Montesi <famontesi@gmail.com>          *
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

package org.chor.validation.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.chor.chor.BranchGType;
import org.chor.chor.GlobalType;
import org.chor.chor.GlobalTypeCall;
import org.chor.chor.GlobalTypeInteraction;
import org.chor.chor.util.ChorSwitch;

/**
 * Utility class for some checks on global types.
 * @author Fabrizio Montesi
 *
 */
public class TypeUtils
{
	/**
	 * Check that the left and right global types express the same behaviour for a given role.
	 * 
	 * Formally, this is a type equivalence check on role projections.
	 */
	public static Boolean checkEqualForRole( GlobalType left, GlobalType right, String role )
	{
		return new TypeEqualChecker( role ).check( left, unfold( right ) );
	}
	
	/**
	 * Check if two global types are equivalent.
	 */
	public static Boolean checkEquivalent( GlobalType left, GlobalType right )
	{
		return new TypeEquivalenceChecker().check( left, right );
	}
	
	/**
	 * Compile a global type to a regular expression
	 */
	/*public static String compileToRegExp( GlobalType t )
	{
		return new TypeRegExpCompiler().compile( t );
	}*/
	
	/**
	 * Calculate the set of roles involved in a global type.
	 * 
	 * This implements the roles(G) function in the theoretical model.
	 */
	public static Set< String > calculateRoles( GlobalType t )
	{
		return new TypeRolesChecker().doSwitchIfNotNull( t );
	}
	
	/**
	 * Calculates the set of input operation names used by a given role in a protocol type.
	 * @param t the protocol type
	 * @param role the role
	 * @return the set of input operations used by role in t
	 */
	public static Set< String > calculateInputOperations( GlobalType t, String role )
	{
		return new TypeInputOperationsCalculator( role ).doSwitchIfNotNull( t );
	}
	
	/**
	 * Unfolds a global type until an interaction is met.
	 * @param t the global type to unfold
	 * @return the unfolded global type
	 * 
	 * @throws IllegalArgumentException if the global type is ill-formed
	 */
	public static GlobalTypeInteraction unfold( GlobalType t )
	{
		if ( t instanceof GlobalTypeInteraction ) {
			return (GlobalTypeInteraction) t;
		} else if ( t instanceof GlobalTypeCall ) {
			return unfold( ((GlobalTypeCall) t).getProtocol().getType() );
		}
		
		throw new IllegalArgumentException( "Could not unfold global type " + t );
	}
	
	private static class TypeInputOperationsCalculator extends ChorSwitch< Set< String > >
	{
		private final String role;
		
		// { g | g is a visited global type }
		private final Set< GlobalType > visitedTypes = new HashSet< GlobalType >();
		
		public TypeInputOperationsCalculator( String role )
		{
			this.role = role;
		}
		
		public Set< String > caseGlobalTypeInteraction( GlobalTypeInteraction t )
		{
			visitedTypes.add( t );
			
			Set< String > set = new HashSet< String >();
			for( BranchGType branch : t.getBranches() ) {
				if ( t.getReceiver().equals( role ) ) {
					set.add( branch.getOperation() );
				}
				set.addAll( doSwitchIfNotNull( branch.getContinuation() ) );
			}
			return set;
		}
		
		public Set< String > caseGlobalTypeCall( GlobalTypeCall t )
		{
			visitedTypes.add( t );

			Set< String > set = new HashSet< String >();
			if ( !visitedTypes.contains( t.getProtocol().getType() ) ) {
				set.addAll( doSwitchIfNotNull( t.getProtocol().getType() ) );
			}
			
			return set;
		}
		
		public Set< String > doSwitchIfNotNull( GlobalType t )
		{
			if ( t == null ) {
				return new HashSet< String >();
			}
			
			return doSwitch( t );
		}
	}
	
	private static class TypeRolesChecker extends ChorSwitch< Set< String > >
	{
		// { g | g is a visited global type }
		private final Set< GlobalType > visitedTypes = new HashSet< GlobalType >();
		
		public Set< String > caseGlobalTypeInteraction( GlobalTypeInteraction t )
		{
			visitedTypes.add( t );
			
			Set< String > set = new HashSet< String >();
			for( BranchGType branch : t.getBranches() ) {
				set.addAll( doSwitchIfNotNull( branch.getContinuation() ) );
			}
			set.add( t.getSender() );
			set.add( t.getReceiver() );
			return set;
		}
		
		public Set< String > caseGlobalTypeCall( GlobalTypeCall t )
		{
			visitedTypes.add( t );

			Set< String > set = new HashSet< String >();
			if ( !visitedTypes.contains( t.getProtocol().getType() ) ) {
				set.addAll( doSwitchIfNotNull( t.getProtocol().getType() ) );
			}
			
			return set;
		}
		
		public Set< String > doSwitchIfNotNull( GlobalType t )
		{
			if ( t == null ) {
				return new HashSet< String >();
			}
			
			return doSwitch( t );
		}
	}
	
	/* private static class TypeRegExpCompiler extends ChorSwitch< Boolean >
	{
		private final StringBuilder regexpBuilder = new StringBuilder();
		
		public String compile( GlobalType t )
		{
			doSwitchIfNotNull( t );
			return regexpBuilder.toString();
		}
		
		public Boolean caseDelegationType( DelegationType t )
		{
			regexpBuilder
				.append( "<" )
				.append( t.getProtocol().getName() )
				.append( ">" );
			
			return true;
		}
		
		public Boolean caseBasicType( BasicType t )
		{
			regexpBuilder.append( t.getName() );
			return true;
		}
		
		public Boolean caseGlobalTypeCall( GlobalTypeCall t )
		{
			regexpBuilder
				.append( "<" )
				.append( t.getProtocol().getName() )
				.append( ">" );

			return true;
		}

		public Boolean caseGlobalTypeInteraction( GlobalTypeInteraction t )
		{
			regexpBuilder
				.append( t.getSender() )
				.append( " -> " )
				.append( t.getReceiver() )
				.append( ":" );
			
			// Collect the branches
			List< String > branchNames = new ArrayList< String >( t.getBranches().size() );
			Map< String, BranchGType > branches = new HashMap< String, BranchGType >();
			for( BranchGType branch : t.getBranches() ) {
				branchNames.add( branch.getOperation() );
				branches.put( branch.getOperation(), branch );
			}
			
			// Order the branches by lexicographic order on their operations
			Collections.sort( branchNames );
			
			BranchGType branch;
			for( String operation : branchNames ) {
				branch = branches.get( operation );
				regexpBuilder
					.append( "{" )
					.append( operation )
					.append( "[" );
				doSwitchIfNotNull( branch.getDataType() );
				regexpBuilder
					.append( "]" );
				regexpBuilder.append( ";" );
				doSwitchIfNotNull( branch.getContinuation() );
				regexpBuilder.append( "}" );
			}
			
			return true;
		}
		
		public Boolean doSwitchIfNotNull( EObject t )
		{
			if ( t != null ) {
				return doSwitch( t );
			}
			
			return true;
		}
	}*/
	
	private static class TypeEqualChecker extends ChorSwitch< Boolean >
	{
		private GlobalType left;
		private final String role;
		
		public TypeEqualChecker( String role )
		{
			this.role = role;
		}
		
		public Boolean caseGlobalTypeCall( GlobalTypeCall right )
		{
			if ( !(left instanceof GlobalTypeCall) ) {
				return false;
			}
			
			return ((GlobalTypeCall)left).getProtocol() == right.getProtocol();
		}
		
		public Boolean caseGlobalTypeInteraction( GlobalTypeInteraction right )
		{
			GlobalTypeInteraction l = unfold( left );
			
			// Check the sender
			if ( l.getSender().equals( role ) || right.getSender().equals( role ) ) {
				if ( !l.getSender().equals( right.getSender() ) ) {
					return false;
				}
			}
			// Check the receiver
			else if ( l.getReceiver().equals( role ) || right.getReceiver().equals( role ) ) {
				if ( !l.getReceiver().equals( right.getReceiver() ) ) {
					return false;
				}
			}
			
			/*
			 *  Check that the number of branches is the same
			 *  
			 *  TODO:
			 *  this condition could be relaxed by taking some subtyping into account. 
			 */
			if ( l.getBranches().size() != right.getBranches().size() ) {
				return false;
			}
			
			// Map all branches in the right global type by operation name, for later usage
			Map< String, GlobalType > rightBranchesMap = new HashMap< String, GlobalType >();
			for( BranchGType b : right.getBranches() ) {
				rightBranchesMap.put( b.getOperation(), b.getContinuation() );
			}
			
			// Compare the continuations for each pair of branches (paired by operation name equality)
			GlobalType rightBranchContinuation;
			for( BranchGType leftBranch : l.getBranches() ) {
				rightBranchContinuation = rightBranchesMap.get( leftBranch.getOperation() );
				if ( !check( leftBranch.getContinuation(), rightBranchContinuation ) ) {
					return false;
				}
			}
			
			return true;
		}
				
		public Boolean check( GlobalType left, GlobalType right )
		{			
			if ( left == null ) {
				return TypeUtils.calculateRoles( right ).contains( role ) == false;
			}
			
			if ( right == null ) {
				return TypeUtils.calculateRoles( left ).contains( role ) == false;
			}

			this.left = left;

			return doSwitch( right );
		}
	}
	
	private static class TypeEquivalenceChecker extends ChorSwitch< Boolean >
	{
		private GlobalType left;
		
		public Boolean caseGlobalTypeCall( GlobalTypeCall right )
		{
			if ( !(left instanceof GlobalTypeCall) ) {
				return false;
			}
			
			GlobalTypeCall l = (GlobalTypeCall)left;
			
			return l.getProtocol() != right.getProtocol();
		}
		
		public Boolean caseGlobalTypeInteraction( GlobalTypeInteraction right )
		{
			if ( !(left instanceof GlobalTypeInteraction) ) {
				return false;
			}
			
			GlobalTypeInteraction l = (GlobalTypeInteraction)left;
			
			// Check the sender
			if ( !l.getSender().equals( right.getSender() ) ) {
				return false;
			}
			// Check the receiver
			else if ( !l.getReceiver().equals( right.getReceiver() ) ) {
				return false;
			}
			
			/*
			 *  Check that the number of branches is the same
			 *  
			 *  TODO:
			 *  this condition could be relaxed by taking some subtyping into account. 
			 */
			if ( l.getBranches().size() != right.getBranches().size() ) {
				return false;
			}
			
			// Map all branches in the right global type by operation name, for later usage
			Map< String, GlobalType > rightBranchesMap = new HashMap< String, GlobalType >();
			for( BranchGType b : right.getBranches() ) {
				rightBranchesMap.put( b.getOperation(), b.getContinuation() );
			}
			
			// Compare the continuations for each pair of branches (paired by operation name equality)
			GlobalType rightBranchContinuation;
			for( BranchGType leftBranch : l.getBranches() ) {
				rightBranchContinuation = rightBranchesMap.get( leftBranch.getOperation() );
				if ( !check( leftBranch.getContinuation(), rightBranchContinuation ) ) {
					return false;
				}
			}
			
			return true;
		}
				
		public Boolean check( GlobalType left, GlobalType right )
		{
			// If one is null, both must be null
			if ( left == null || right == null ) {
				return left == right;
			}

			this.left = left;

			return doSwitch( right );
		}
	}
}
