/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.ConditionOperator#isLess <em>Less</em>}</li>
 *   <li>{@link org.chor.chor.ConditionOperator#isEqual <em>Equal</em>}</li>
 *   <li>{@link org.chor.chor.ConditionOperator#isGreater <em>Greater</em>}</li>
 *   <li>{@link org.chor.chor.ConditionOperator#isNot_equal <em>Not equal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getConditionOperator()
 * @model
 * @generated
 */
public interface ConditionOperator extends EObject
{
  /**
   * Returns the value of the '<em><b>Less</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Less</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Less</em>' attribute.
   * @see #setLess(boolean)
   * @see org.chor.chor.ChorPackage#getConditionOperator_Less()
   * @model
   * @generated
   */
  boolean isLess();

  /**
   * Sets the value of the '{@link org.chor.chor.ConditionOperator#isLess <em>Less</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Less</em>' attribute.
   * @see #isLess()
   * @generated
   */
  void setLess(boolean value);

  /**
   * Returns the value of the '<em><b>Equal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equal</em>' attribute.
   * @see #setEqual(boolean)
   * @see org.chor.chor.ChorPackage#getConditionOperator_Equal()
   * @model
   * @generated
   */
  boolean isEqual();

  /**
   * Sets the value of the '{@link org.chor.chor.ConditionOperator#isEqual <em>Equal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Equal</em>' attribute.
   * @see #isEqual()
   * @generated
   */
  void setEqual(boolean value);

  /**
   * Returns the value of the '<em><b>Greater</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Greater</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Greater</em>' attribute.
   * @see #setGreater(boolean)
   * @see org.chor.chor.ChorPackage#getConditionOperator_Greater()
   * @model
   * @generated
   */
  boolean isGreater();

  /**
   * Sets the value of the '{@link org.chor.chor.ConditionOperator#isGreater <em>Greater</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Greater</em>' attribute.
   * @see #isGreater()
   * @generated
   */
  void setGreater(boolean value);

  /**
   * Returns the value of the '<em><b>Not equal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not equal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not equal</em>' attribute.
   * @see #setNot_equal(boolean)
   * @see org.chor.chor.ChorPackage#getConditionOperator_Not_equal()
   * @model
   * @generated
   */
  boolean isNot_equal();

  /**
   * Sets the value of the '{@link org.chor.chor.ConditionOperator#isNot_equal <em>Not equal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not equal</em>' attribute.
   * @see #isNot_equal()
   * @generated
   */
  void setNot_equal(boolean value);

} // ConditionOperator
