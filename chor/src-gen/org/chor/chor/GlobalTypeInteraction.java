/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Type Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.GlobalTypeInteraction#getSender <em>Sender</em>}</li>
 *   <li>{@link org.chor.chor.GlobalTypeInteraction#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.chor.chor.GlobalTypeInteraction#getBranches <em>Branches</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getGlobalTypeInteraction()
 * @model
 * @generated
 */
public interface GlobalTypeInteraction extends GlobalType
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
   * @see org.chor.chor.ChorPackage#getGlobalTypeInteraction_Sender()
   * @model
   * @generated
   */
  String getSender();

  /**
   * Sets the value of the '{@link org.chor.chor.GlobalTypeInteraction#getSender <em>Sender</em>}' attribute.
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
   * @see org.chor.chor.ChorPackage#getGlobalTypeInteraction_Receiver()
   * @model
   * @generated
   */
  String getReceiver();

  /**
   * Sets the value of the '{@link org.chor.chor.GlobalTypeInteraction#getReceiver <em>Receiver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receiver</em>' attribute.
   * @see #getReceiver()
   * @generated
   */
  void setReceiver(String value);

  /**
   * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
   * The list contents are of type {@link org.chor.chor.BranchGType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Branches</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Branches</em>' containment reference list.
   * @see org.chor.chor.ChorPackage#getGlobalTypeInteraction_Branches()
   * @model containment="true"
   * @generated
   */
  EList<BranchGType> getBranches();

} // GlobalTypeInteraction
