/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch GType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.chor.chor.BranchGType#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.chor.chor.BranchGType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.chor.chor.BranchGType#getContinuation <em>Continuation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.chor.chor.ChorPackage#getBranchGType()
 * @model
 * @generated
 */
public interface BranchGType extends EObject
{
  /**
   * Returns the value of the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' attribute.
   * @see #setOperation(String)
   * @see org.chor.chor.ChorPackage#getBranchGType_Operation()
   * @model
   * @generated
   */
  String getOperation();

  /**
   * Sets the value of the '{@link org.chor.chor.BranchGType#getOperation <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' attribute.
   * @see #getOperation()
   * @generated
   */
  void setOperation(String value);

  /**
   * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Type</em>' containment reference.
   * @see #setDataType(DataType)
   * @see org.chor.chor.ChorPackage#getBranchGType_DataType()
   * @model containment="true"
   * @generated
   */
  DataType getDataType();

  /**
   * Sets the value of the '{@link org.chor.chor.BranchGType#getDataType <em>Data Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' containment reference.
   * @see #getDataType()
   * @generated
   */
  void setDataType(DataType value);

  /**
   * Returns the value of the '<em><b>Continuation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Continuation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Continuation</em>' containment reference.
   * @see #setContinuation(GlobalType)
   * @see org.chor.chor.ChorPackage#getBranchGType_Continuation()
   * @model containment="true"
   * @generated
   */
  GlobalType getContinuation();

  /**
   * Sets the value of the '{@link org.chor.chor.BranchGType#getContinuation <em>Continuation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Continuation</em>' containment reference.
   * @see #getContinuation()
   * @generated
   */
  void setContinuation(GlobalType value);

} // BranchGType
