/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.DelegationType#getType <em>Type</em>}</li>
 *   <li>{@link org.chor.chor.DelegationType#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getDelegationType()
 * @model
 * @generated
 */
public interface DelegationType extends DataType
{
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
   * @see org.chor.chor.ChorPackage#getDelegationType_Type()
   * @model containment="true"
   * @generated
   */
  GlobalTypeCall getType();

  /**
   * Sets the value of the '{@link org.chor.chor.DelegationType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(GlobalTypeCall value);

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
   * @see org.chor.chor.ChorPackage#getDelegationType_Role()
   * @model
   * @generated
   */
  String getRole();

  /**
   * Sets the value of the '{@link org.chor.chor.DelegationType#getRole <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' attribute.
   * @see #getRole()
   * @generated
   */
  void setRole(String value);

} // DelegationType
