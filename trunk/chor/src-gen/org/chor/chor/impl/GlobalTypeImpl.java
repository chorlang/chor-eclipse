/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import java.util.Collection;

import org.chor.chor.BranchGType;
import org.chor.chor.ChorPackage;
import org.chor.chor.GlobalType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chor.chor.impl.GlobalTypeImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.chor.chor.impl.GlobalTypeImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.chor.chor.impl.GlobalTypeImpl#getBranches <em>Branches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalTypeImpl extends MinimalEObjectImpl.Container implements GlobalType
{
  /**
   * The default value of the '{@link #getSender() <em>Sender</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSender()
   * @generated
   * @ordered
   */
  protected static final String SENDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSender() <em>Sender</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSender()
   * @generated
   * @ordered
   */
  protected String sender = SENDER_EDEFAULT;

  /**
   * The default value of the '{@link #getReceiver() <em>Receiver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiver()
   * @generated
   * @ordered
   */
  protected static final String RECEIVER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiver()
   * @generated
   * @ordered
   */
  protected String receiver = RECEIVER_EDEFAULT;

  /**
   * The cached value of the '{@link #getBranches() <em>Branches</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBranches()
   * @generated
   * @ordered
   */
  protected EList<BranchGType> branches;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GlobalTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ChorPackage.Literals.GLOBAL_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSender()
  {
    return sender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSender(String newSender)
  {
    String oldSender = sender;
    sender = newSender;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.GLOBAL_TYPE__SENDER, oldSender, sender));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReceiver()
  {
    return receiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReceiver(String newReceiver)
  {
    String oldReceiver = receiver;
    receiver = newReceiver;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.GLOBAL_TYPE__RECEIVER, oldReceiver, receiver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BranchGType> getBranches()
  {
    if (branches == null)
    {
      branches = new EObjectContainmentEList<BranchGType>(BranchGType.class, this, ChorPackage.GLOBAL_TYPE__BRANCHES);
    }
    return branches;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ChorPackage.GLOBAL_TYPE__BRANCHES:
        return ((InternalEList<?>)getBranches()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ChorPackage.GLOBAL_TYPE__SENDER:
        return getSender();
      case ChorPackage.GLOBAL_TYPE__RECEIVER:
        return getReceiver();
      case ChorPackage.GLOBAL_TYPE__BRANCHES:
        return getBranches();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ChorPackage.GLOBAL_TYPE__SENDER:
        setSender((String)newValue);
        return;
      case ChorPackage.GLOBAL_TYPE__RECEIVER:
        setReceiver((String)newValue);
        return;
      case ChorPackage.GLOBAL_TYPE__BRANCHES:
        getBranches().clear();
        getBranches().addAll((Collection<? extends BranchGType>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ChorPackage.GLOBAL_TYPE__SENDER:
        setSender(SENDER_EDEFAULT);
        return;
      case ChorPackage.GLOBAL_TYPE__RECEIVER:
        setReceiver(RECEIVER_EDEFAULT);
        return;
      case ChorPackage.GLOBAL_TYPE__BRANCHES:
        getBranches().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ChorPackage.GLOBAL_TYPE__SENDER:
        return SENDER_EDEFAULT == null ? sender != null : !SENDER_EDEFAULT.equals(sender);
      case ChorPackage.GLOBAL_TYPE__RECEIVER:
        return RECEIVER_EDEFAULT == null ? receiver != null : !RECEIVER_EDEFAULT.equals(receiver);
      case ChorPackage.GLOBAL_TYPE__BRANCHES:
        return branches != null && !branches.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (sender: ");
    result.append(sender);
    result.append(", receiver: ");
    result.append(receiver);
    result.append(')');
    return result.toString();
  }

} //GlobalTypeImpl
