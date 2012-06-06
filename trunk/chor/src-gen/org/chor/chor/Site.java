/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.Site#getName <em>Name</em>}</li>
 *   <li>{@link org.chor.chor.Site#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getSite()
 * @model
 * @generated
 */
public interface Site extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.chor.chor.ChorPackage#getSite_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.chor.chor.Site#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Protocol</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protocol</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocol</em>' reference.
   * @see #setProtocol(Protocol)
   * @see org.chor.chor.ChorPackage#getSite_Protocol()
   * @model
   * @generated
   */
  Protocol getProtocol();

  /**
   * Sets the value of the '{@link org.chor.chor.Site#getProtocol <em>Protocol</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protocol</em>' reference.
   * @see #getProtocol()
   * @generated
   */
  void setProtocol(Protocol value);

} // Site
