/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum Expression Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.SumExpressionTerm#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getSumExpressionTerm()
 * @model
 * @generated
 */
public interface SumExpressionTerm extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(ExpressionBasicTerm)
   * @see org.chor.chor.ChorPackage#getSumExpressionTerm_Expression()
   * @model containment="true"
   * @generated
   */
  ExpressionBasicTerm getExpression();

  /**
   * Sets the value of the '{@link org.chor.chor.SumExpressionTerm#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(ExpressionBasicTerm value);

} // SumExpressionTerm
