/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branching Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.BranchingType#getBranches <em>Branches</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getBranchingType()
 * @model
 * @generated
 */
public interface BranchingType extends LocalType
{
  /**
   * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
   * The list contents are of type {@link org.chor.chor.BranchType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Branches</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Branches</em>' containment reference list.
   * @see org.chor.chor.ChorPackage#getBranchingType_Branches()
   * @model containment="true"
   * @generated
   */
  EList<BranchType> getBranches();

} // BranchingType
