/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.SelectionType#getBranches <em>Branches</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getSelectionType()
 * @model
 * @generated
 */
public interface SelectionType extends LocalType
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
   * @see org.chor.chor.ChorPackage#getSelectionType_Branches()
   * @model containment="true"
   * @generated
   */
  EList<BranchType> getBranches();

} // SelectionType
