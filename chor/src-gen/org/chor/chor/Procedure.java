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
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.Procedure#getName <em>Name</em>}</li>
 *   <li>{@link org.chor.chor.Procedure#getThreadParameters <em>Thread Parameters</em>}</li>
 *   <li>{@link org.chor.chor.Procedure#getSessionParameters <em>Session Parameters</em>}</li>
 *   <li>{@link org.chor.chor.Procedure#getChoreography <em>Choreography</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getProcedure()
 * @model
 * @generated
 */
public interface Procedure extends EObject
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
   * @see org.chor.chor.ChorPackage#getProcedure_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.chor.chor.Procedure#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Thread Parameters</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thread Parameters</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thread Parameters</em>' attribute list.
   * @see org.chor.chor.ChorPackage#getProcedure_ThreadParameters()
   * @model unique="false"
   * @generated
   */
  EList<String> getThreadParameters();

  /**
   * Returns the value of the '<em><b>Session Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.chor.chor.SessionProcedureParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Session Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Session Parameters</em>' containment reference list.
   * @see org.chor.chor.ChorPackage#getProcedure_SessionParameters()
   * @model containment="true"
   * @generated
   */
  EList<SessionProcedureParameter> getSessionParameters();

  /**
   * Returns the value of the '<em><b>Choreography</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choreography</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choreography</em>' containment reference.
   * @see #setChoreography(Choreography)
   * @see org.chor.chor.ChorPackage#getProcedure_Choreography()
   * @model containment="true"
   * @generated
   */
  Choreography getChoreography();

  /**
   * Sets the value of the '{@link org.chor.chor.Procedure#getChoreography <em>Choreography</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Choreography</em>' containment reference.
   * @see #getChoreography()
   * @generated
   */
  void setChoreography(Choreography value);

} // Procedure
