/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Ask Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.LocalAskCommand#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.chor.chor.LocalAskCommand#getResultVariable <em>Result Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getLocalAskCommand()
 * @model
 * @generated
 */
public interface LocalAskCommand extends LocalCode
{
  /**
   * Returns the value of the '<em><b>Question</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Question</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Question</em>' containment reference.
   * @see #setQuestion(Expression)
   * @see org.chor.chor.ChorPackage#getLocalAskCommand_Question()
   * @model containment="true"
   * @generated
   */
  Expression getQuestion();

  /**
   * Sets the value of the '{@link org.chor.chor.LocalAskCommand#getQuestion <em>Question</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' containment reference.
   * @see #getQuestion()
   * @generated
   */
  void setQuestion(Expression value);

  /**
   * Returns the value of the '<em><b>Result Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result Variable</em>' attribute.
   * @see #setResultVariable(String)
   * @see org.chor.chor.ChorPackage#getLocalAskCommand_ResultVariable()
   * @model
   * @generated
   */
  String getResultVariable();

  /**
   * Sets the value of the '{@link org.chor.chor.LocalAskCommand#getResultVariable <em>Result Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result Variable</em>' attribute.
   * @see #getResultVariable()
   * @generated
   */
  void setResultVariable(String value);

} // LocalAskCommand
