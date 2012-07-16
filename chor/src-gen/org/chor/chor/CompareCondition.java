/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.CompareCondition#getLeftExpression <em>Left Expression</em>}</li>
 *   <li>{@link org.chor.chor.CompareCondition#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.chor.chor.CompareCondition#getRightExpression <em>Right Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getCompareCondition()
 * @model
 * @generated
 */
public interface CompareCondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Left Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Expression</em>' containment reference.
   * @see #setLeftExpression(Expression)
   * @see org.chor.chor.ChorPackage#getCompareCondition_LeftExpression()
   * @model containment="true"
   * @generated
   */
  Expression getLeftExpression();

  /**
   * Sets the value of the '{@link org.chor.chor.CompareCondition#getLeftExpression <em>Left Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Expression</em>' containment reference.
   * @see #getLeftExpression()
   * @generated
   */
  void setLeftExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' containment reference.
   * @see #setOperator(ConditionOperator)
   * @see org.chor.chor.ChorPackage#getCompareCondition_Operator()
   * @model containment="true"
   * @generated
   */
  ConditionOperator getOperator();

  /**
   * Sets the value of the '{@link org.chor.chor.CompareCondition#getOperator <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' containment reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(ConditionOperator value);

  /**
   * Returns the value of the '<em><b>Right Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Expression</em>' containment reference.
   * @see #setRightExpression(Expression)
   * @see org.chor.chor.ChorPackage#getCompareCondition_RightExpression()
   * @model containment="true"
   * @generated
   */
  Expression getRightExpression();

  /**
   * Sets the value of the '{@link org.chor.chor.CompareCondition#getRightExpression <em>Right Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Expression</em>' containment reference.
   * @see #getRightExpression()
   * @generated
   */
  void setRightExpression(Expression value);

} // CompareCondition
