/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.Call#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.chor.chor.Call#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.chor.chor.Call#getSessions <em>Sessions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Choreography
{
  /**
   * Returns the value of the '<em><b>Procedure</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedure</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedure</em>' reference.
   * @see #setProcedure(Procedure)
   * @see org.chor.chor.ChorPackage#getCall_Procedure()
   * @model
   * @generated
   */
  Procedure getProcedure();

  /**
   * Sets the value of the '{@link org.chor.chor.Call#getProcedure <em>Procedure</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Procedure</em>' reference.
   * @see #getProcedure()
   * @generated
   */
  void setProcedure(Procedure value);

  /**
   * Returns the value of the '<em><b>Threads</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Threads</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Threads</em>' attribute list.
   * @see org.chor.chor.ChorPackage#getCall_Threads()
   * @model unique="false"
   * @generated
   */
  EList<String> getThreads();

  /**
   * Returns the value of the '<em><b>Sessions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sessions</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sessions</em>' attribute list.
   * @see org.chor.chor.ChorPackage#getCall_Sessions()
   * @model unique="false"
   * @generated
   */
  EList<String> getSessions();

} // Call
