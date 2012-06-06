/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.Expression#getSumExpression <em>Sum Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Sum Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sum Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sum Expression</em>' containment reference.
   * @see #setSumExpression(SumExpression)
   * @see org.chor.chor.ChorPackage#getExpression_SumExpression()
   * @model containment="true"
   * @generated
   */
  SumExpression getSumExpression();

  /**
   * Sets the value of the '{@link org.chor.chor.Expression#getSumExpression <em>Sum Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sum Expression</em>' containment reference.
   * @see #getSumExpression()
   * @generated
   */
  void setSumExpression(SumExpression value);

} // Expression
