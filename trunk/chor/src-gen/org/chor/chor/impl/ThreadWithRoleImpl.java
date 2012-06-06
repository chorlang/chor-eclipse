/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import org.chor.chor.ChorPackage;
import org.chor.chor.ThreadWithRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thread With Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chor.chor.impl.ThreadWithRoleImpl#getThread <em>Thread</em>}</li>
 *   <li>{@link org.chor.chor.impl.ThreadWithRoleImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThreadWithRoleImpl extends MinimalEObjectImpl.Container implements ThreadWithRole
{
  /**
   * The default value of the '{@link #getThread() <em>Thread</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThread()
   * @generated
   * @ordered
   */
  protected static final String THREAD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getThread() <em>Thread</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThread()
   * @generated
   * @ordered
   */
  protected String thread = THREAD_EDEFAULT;

  /**
   * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected static final String ROLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected String role = ROLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ThreadWithRoleImpl()
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
    return ChorPackage.Literals.THREAD_WITH_ROLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getThread()
  {
    return thread;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThread(String newThread)
  {
    String oldThread = thread;
    thread = newThread;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.THREAD_WITH_ROLE__THREAD, oldThread, thread));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRole()
  {
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRole(String newRole)
  {
    String oldRole = role;
    role = newRole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.THREAD_WITH_ROLE__ROLE, oldRole, role));
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
      case ChorPackage.THREAD_WITH_ROLE__THREAD:
        return getThread();
      case ChorPackage.THREAD_WITH_ROLE__ROLE:
        return getRole();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ChorPackage.THREAD_WITH_ROLE__THREAD:
        setThread((String)newValue);
        return;
      case ChorPackage.THREAD_WITH_ROLE__ROLE:
        setRole((String)newValue);
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
      case ChorPackage.THREAD_WITH_ROLE__THREAD:
        setThread(THREAD_EDEFAULT);
        return;
      case ChorPackage.THREAD_WITH_ROLE__ROLE:
        setRole(ROLE_EDEFAULT);
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
      case ChorPackage.THREAD_WITH_ROLE__THREAD:
        return THREAD_EDEFAULT == null ? thread != null : !THREAD_EDEFAULT.equals(thread);
      case ChorPackage.THREAD_WITH_ROLE__ROLE:
        return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
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
    result.append(" (thread: ");
    result.append(thread);
    result.append(", role: ");
    result.append(role);
    result.append(')');
    return result.toString();
  }

} //ThreadWithRoleImpl
