/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.Condition#getCompareCondition <em>Compare Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Compare Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compare Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compare Condition</em>' containment reference.
   * @see #setCompareCondition(CompareCondition)
   * @see org.chor.chor.ChorPackage#getCondition_CompareCondition()
   * @model containment="true"
   * @generated
   */
  CompareCondition getCompareCondition();

  /**
   * Sets the value of the '{@link org.chor.chor.Condition#getCompareCondition <em>Compare Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compare Condition</em>' containment reference.
   * @see #getCompareCondition()
   * @generated
   */
  void setCompareCondition(CompareCondition value);

} // Condition
