/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.Delegation#getSender <em>Sender</em>}</li>
 *   <li>{@link org.chor.chor.Delegation#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.chor.chor.Delegation#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.chor.chor.Delegation#getSession <em>Session</em>}</li>
 *   <li>{@link org.chor.chor.Delegation#getDelegatedSession <em>Delegated Session</em>}</li>
 *   <li>{@link org.chor.chor.Delegation#getContinuation <em>Continuation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getDelegation()
 * @model
 * @generated
 */
public interface Delegation extends Choreography
{
  /**
   * Returns the value of the '<em><b>Sender</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sender</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sender</em>' attribute.
   * @see #setSender(String)
   * @see org.chor.chor.ChorPackage#getDelegation_Sender()
   * @model
   * @generated
   */
  String getSender();

  /**
   * Sets the value of the '{@link org.chor.chor.Delegation#getSender <em>Sender</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sender</em>' attribute.
   * @see #getSender()
   * @generated
   */
  void setSender(String value);

  /**
   * Returns the value of the '<em><b>Receiver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Receiver</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receiver</em>' attribute.
   * @see #setReceiver(String)
   * @see org.chor.chor.ChorPackage#getDelegation_Receiver()
   * @model
   * @generated
   */
  String getReceiver();

  /**
   * Sets the value of the '{@link org.chor.chor.Delegation#getReceiver <em>Receiver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receiver</em>' attribute.
   * @see #getReceiver()
   * @generated
   */
  void setReceiver(String value);

  /**
   * Returns the value of the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' attribute.
   * @see #setOperation(String)
   * @see org.chor.chor.ChorPackage#getDelegation_Operation()
   * @model
   * @generated
   */
  String getOperation();

  /**
   * Sets the value of the '{@link org.chor.chor.Delegation#getOperation <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' attribute.
   * @see #getOperation()
   * @generated
   */
  void setOperation(String value);

  /**
   * Returns the value of the '<em><b>Session</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Session</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Session</em>' attribute.
   * @see #setSession(String)
   * @see org.chor.chor.ChorPackage#getDelegation_Session()
   * @model
   * @generated
   */
  String getSession();

  /**
   * Sets the value of the '{@link org.chor.chor.Delegation#getSession <em>Session</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Session</em>' attribute.
   * @see #getSession()
   * @generated
   */
  void setSession(String value);

  /**
   * Returns the value of the '<em><b>Delegated Session</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delegated Session</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delegated Session</em>' attribute.
   * @see #setDelegatedSession(String)
   * @see org.chor.chor.ChorPackage#getDelegation_DelegatedSession()
   * @model
   * @generated
   */
  String getDelegatedSession();

  /**
   * Sets the value of the '{@link org.chor.chor.Delegation#getDelegatedSession <em>Delegated Session</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delegated Session</em>' attribute.
   * @see #getDelegatedSession()
   * @generated
   */
  void setDelegatedSession(String value);

  /**
   * Returns the value of the '<em><b>Continuation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Continuation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Continuation</em>' containment reference.
   * @see #setContinuation(Choreography)
   * @see org.chor.chor.ChorPackage#getDelegation_Continuation()
   * @model containment="true"
   * @generated
   */
  Choreography getContinuation();

  /**
   * Sets the value of the '{@link org.chor.chor.Delegation#getContinuation <em>Continuation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Continuation</em>' containment reference.
   * @see #getContinuation()
   * @generated
   */
  void setContinuation(Choreography value);

} // Delegation
