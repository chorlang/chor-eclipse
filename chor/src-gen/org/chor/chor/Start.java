/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.Start#getActiveThreads <em>Active Threads</em>}</li>
 *   <li>{@link org.chor.chor.Start#getServiceThreads <em>Service Threads</em>}</li>
 *   <li>{@link org.chor.chor.Start#getPublicChannel <em>Public Channel</em>}</li>
 *   <li>{@link org.chor.chor.Start#getSession <em>Session</em>}</li>
 *   <li>{@link org.chor.chor.Start#getContinuation <em>Continuation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getStart()
 * @model
 * @generated
 */
public interface Start extends Choreography
{
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
   * @see org.chor.chor.ChorPackage#getStart_ActiveThreads()
   * @model containment="true"
   * @generated
   */
  EList<ThreadWithRole> getActiveThreads();

  /**
   * Returns the value of the '<em><b>Service Threads</b></em>' containment reference list.
   * The list contents are of type {@link org.chor.chor.ThreadWithRole}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Threads</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Threads</em>' containment reference list.
   * @see org.chor.chor.ChorPackage#getStart_ServiceThreads()
   * @model containment="true"
   * @generated
   */
  EList<ThreadWithRole> getServiceThreads();

  /**
   * Returns the value of the '<em><b>Public Channel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Public Channel</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Public Channel</em>' reference.
   * @see #setPublicChannel(Site)
   * @see org.chor.chor.ChorPackage#getStart_PublicChannel()
   * @model
   * @generated
   */
  Site getPublicChannel();

  /**
   * Sets the value of the '{@link org.chor.chor.Start#getPublicChannel <em>Public Channel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Public Channel</em>' reference.
   * @see #getPublicChannel()
   * @generated
   */
  void setPublicChannel(Site value);

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
   * @see org.chor.chor.ChorPackage#getStart_Session()
   * @model
   * @generated
   */
  String getSession();

  /**
   * Sets the value of the '{@link org.chor.chor.Start#getSession <em>Session</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Session</em>' attribute.
   * @see #getSession()
   * @generated
   */
  void setSession(String value);

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
   * @see org.chor.chor.ChorPackage#getStart_Continuation()
   * @model containment="true"
   * @generated
   */
  Choreography getContinuation();

  /**
   * Sets the value of the '{@link org.chor.chor.Start#getContinuation <em>Continuation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Continuation</em>' containment reference.
   * @see #getContinuation()
   * @generated
   */
  void setContinuation(Choreography value);

} // Start
