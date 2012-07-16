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
 * A representation of the model object '<em><b>Session Procedure Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.SessionProcedureParameter#getSession <em>Session</em>}</li>
 *   <li>{@link org.chor.chor.SessionProcedureParameter#getType <em>Type</em>}</li>
 *   <li>{@link org.chor.chor.SessionProcedureParameter#getActiveThreads <em>Active Threads</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getSessionProcedureParameter()
 * @model
 * @generated
 */
public interface SessionProcedureParameter extends EObject
{
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
   * @see org.chor.chor.ChorPackage#getSessionProcedureParameter_Session()
   * @model
   * @generated
   */
  String getSession();

  /**
   * Sets the value of the '{@link org.chor.chor.SessionProcedureParameter#getSession <em>Session</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Session</em>' attribute.
   * @see #getSession()
   * @generated
   */
  void setSession(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(GlobalTypeCall)
   * @see org.chor.chor.ChorPackage#getSessionProcedureParameter_Type()
   * @model containment="true"
   * @generated
   */
  GlobalTypeCall getType();

  /**
   * Sets the value of the '{@link org.chor.chor.SessionProcedureParameter#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(GlobalTypeCall value);

  /**
   * Returns the value of the '<em><b>Active Threads</b></em>' containment reference list.
   * The list contents are of type {@link org.chor.chor.ThreadWithRole}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Active Threads</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Active Threads</em>' containment reference list.
   * @see org.chor.chor.ChorPackage#getSessionProcedureParameter_ActiveThreads()
   * @model containment="true"
   * @generated
   */
  EList<ThreadWithRole> getActiveThreads();

} // SessionProcedureParameter
