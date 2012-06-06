/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.SumExpression#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getSumExpression()
 * @model
 * @generated
 */
public interface SumExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.chor.chor.ChorPackage#getSumExpression_Children()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getChildren();

} // SumExpression
