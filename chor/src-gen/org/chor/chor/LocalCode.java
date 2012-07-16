/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.LocalCode#getThread <em>Thread</em>}</li>
 *   <li>{@link org.chor.chor.LocalCode#getContinuation <em>Continuation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getLocalCode()
 * @model
 * @generated
 */
public interface LocalCode extends Choreography
{
  /**
   * Returns the value of the '<em><b>Thread</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thread</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thread</em>' attribute.
   * @see #setThread(String)
   * @see org.chor.chor.ChorPackage#getLocalCode_Thread()
   * @model
   * @generated
   */
  String getThread();

  /**
   * Sets the value of the '{@link org.chor.chor.LocalCode#getThread <em>Thread</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thread</em>' attribute.
   * @see #getThread()
   * @generated
   */
  void setThread(String value);

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
   * @see org.chor.chor.ChorPackage#getLocalCode_Continuation()
   * @model containment="true"
   * @generated
   */
  Choreography getContinuation();

  /**
   * Sets the value of the '{@link org.chor.chor.LocalCode#getContinuation <em>Continuation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Continuation</em>' containment reference.
   * @see #getContinuation()
   * @generated
   */
  void setContinuation(Choreography value);

} // LocalCode
