/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import java.util.Collection;

import org.chor.chor.Call;
import org.chor.chor.ChorPackage;
import org.chor.chor.Procedure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chor.chor.impl.CallImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.chor.chor.impl.CallImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.chor.chor.impl.CallImpl#getSessions <em>Sessions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallImpl extends ChoreographyImpl implements Call
{
  /**
   * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedure()
   * @generated
   * @ordered
   */
  protected Procedure procedure;

  /**
   * The cached value of the '{@link #getThreads() <em>Threads</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreads()
   * @generated
   * @ordered
   */
  protected EList<String> threads;

  /**
   * The cached value of the '{@link #getSessions() <em>Sessions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSessions()
   * @generated
   * @ordered
   */
  protected EList<String> sessions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CallImpl()
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
    return ChorPackage.Literals.CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure getProcedure()
  {
    if (procedure != null && procedure.eIsProxy())
    {
      InternalEObject oldProcedure = (InternalEObject)procedure;
      procedure = (Procedure)eResolveProxy(oldProcedure);
      if (procedure != oldProcedure)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChorPackage.CALL__PROCEDURE, oldProcedure, procedure));
      }
    }
    return procedure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure basicGetProcedure()
  {
    return procedure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcedure(Procedure newProcedure)
  {
    Procedure oldProcedure = procedure;
    procedure = newProcedure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CALL__PROCEDURE, oldProcedure, procedure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getThreads()
  {
    if (threads == null)
    {
      threads = new EDataTypeEList<String>(String.class, this, ChorPackage.CALL__THREADS);
    }
    return threads;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSessions()
  {
    if (sessions == null)
    {
      sessions = new EDataTypeEList<String>(String.class, this, ChorPackage.CALL__SESSIONS);
    }
    return sessions;
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
      case ChorPackage.CALL__PROCEDURE:
        if (resolve) return getProcedure();
        return basicGetProcedure();
      case ChorPackage.CALL__THREADS:
        return getThreads();
      case ChorPackage.CALL__SESSIONS:
        return getSessions();
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
      case ChorPackage.CALL__PROCEDURE:
        setProcedure((Procedure)newValue);
        return;
      case ChorPackage.CALL__THREADS:
        getThreads().clear();
        getThreads().addAll((Collection<? extends String>)newValue);
        return;
      case ChorPackage.CALL__SESSIONS:
        getSessions().clear();
        getSessions().addAll((Collection<? extends String>)newValue);
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
      case ChorPackage.CALL__PROCEDURE:
        setProcedure((Procedure)null);
        return;
      case ChorPackage.CALL__THREADS:
        getThreads().clear();
        return;
      case ChorPackage.CALL__SESSIONS:
        getSessions().clear();
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
      case ChorPackage.CALL__PROCEDURE:
        return procedure != null;
      case ChorPackage.CALL__THREADS:
        return threads != null && !threads.isEmpty();
      case ChorPackage.CALL__SESSIONS:
        return sessions != null && !sessions.isEmpty();
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
    result.append(" (threads: ");
    result.append(threads);
    result.append(", sessions: ");
    result.append(sessions);
    result.append(')');
    return result.toString();
  }

} //CallImpl
