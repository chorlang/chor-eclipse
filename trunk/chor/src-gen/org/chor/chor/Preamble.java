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
 * A representation of the model object '<em><b>Preamble</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.Preamble#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link org.chor.chor.Preamble#getSite <em>Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getPreamble()
 * @model
 * @generated
 */
public interface Preamble extends EObject
{
  /**
   * Returns the value of the '<em><b>Protocols</b></em>' containment reference list.
   * The list contents are of type {@link org.chor.chor.Protocol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protocols</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocols</em>' containment reference list.
   * @see org.chor.chor.ChorPackage#getPreamble_Protocols()
   * @model containment="true"
   * @generated
   */
  EList<Protocol> getProtocols();

  /**
   * Returns the value of the '<em><b>Site</b></em>' containment reference list.
   * The list contents are of type {@link org.chor.chor.Site}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Site</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Site</em>' containment reference list.
   * @see org.chor.chor.ChorPackage#getPreamble_Site()
   * @model containment="true"
   * @generated
   */
  EList<Site> getSite();

} // Preamble
