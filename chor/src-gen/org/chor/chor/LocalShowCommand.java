/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Show Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.LocalShowCommand#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getLocalShowCommand()
 * @model
 * @generated
 */
public interface LocalShowCommand extends LocalCode
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
   * @see #setExpression(Expression)
   * @see org.chor.chor.ChorPackage#getLocalShowCommand_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.chor.chor.LocalShowCommand#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // LocalShowCommand
