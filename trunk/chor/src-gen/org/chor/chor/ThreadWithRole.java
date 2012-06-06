/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread With Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.ThreadWithRole#getThread <em>Thread</em>}</li>
 *   <li>{@link org.chor.chor.ThreadWithRole#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getThreadWithRole()
 * @model
 * @generated
 */
public interface ThreadWithRole extends EObject
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
   * @see org.chor.chor.ChorPackage#getThreadWithRole_Thread()
   * @model
   * @generated
   */
  String getThread();

  /**
   * Sets the value of the '{@link org.chor.chor.ThreadWithRole#getThread <em>Thread</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thread</em>' attribute.
   * @see #getThread()
   * @generated
   */
  void setThread(String value);

  /**
   * Returns the value of the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' attribute.
   * @see #setRole(String)
   * @see org.chor.chor.ChorPackage#getThreadWithRole_Role()
   * @model
   * @generated
   */
  String getRole();

  /**
   * Sets the value of the '{@link org.chor.chor.ThreadWithRole#getRole <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' attribute.
   * @see #getRole()
   * @generated
   */
  void setRole(String value);

} // ThreadWithRole
