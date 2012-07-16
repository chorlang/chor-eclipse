/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import java.util.Collection;

import org.chor.chor.ChorPackage;
import org.chor.chor.GlobalTypeCall;
import org.chor.chor.SessionProcedureParameter;
import org.chor.chor.ThreadWithRole;

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
 * An implementation of the model object '<em><b>Session Procedure Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chor.chor.impl.SessionProcedureParameterImpl#getSession <em>Session</em>}</li>
 *   <li>{@link org.chor.chor.impl.SessionProcedureParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.chor.chor.impl.SessionProcedureParameterImpl#getActiveThreads <em>Active Threads</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SessionProcedureParameterImpl extends MinimalEObjectImpl.Container implements SessionProcedureParameter
{
  /**
   * The default value of the '{@link #getSession() <em>Session</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSession()
   * @generated
   * @ordered
   */
  protected static final String SESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSession() <em>Session</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSession()
   * @generated
   * @ordered
   */
  protected String session = SESSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected GlobalTypeCall type;

  /**
   * The cached value of the '{@link #getActiveThreads() <em>Active Threads</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActiveThreads()
   * @generated
   * @ordered
   */
  protected EList<ThreadWithRole> activeThreads;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SessionProcedureParameterImpl()
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
    return ChorPackage.Literals.SESSION_PROCEDURE_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSession()
  {
    return session;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSession(String newSession)
  {
    String oldSession = session;
    session = newSession;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.SESSION_PROCEDURE_PARAMETER__SESSION, oldSession, session));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalTypeCall getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(GlobalTypeCall newType, NotificationChain msgs)
  {
    GlobalTypeCall oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.SESSION_PROCEDURE_PARAMETER__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(GlobalTypeCall newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.SESSION_PROCEDURE_PARAMETER__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.SESSION_PROCEDURE_PARAMETER__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.SESSION_PROCEDURE_PARAMETER__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ThreadWithRole> getActiveThreads()
  {
    if (activeThreads == null)
    {
      activeThreads = new EObjectContainmentEList<ThreadWithRole>(ThreadWithRole.class, this, ChorPackage.SESSION_PROCEDURE_PARAMETER__ACTIVE_THREADS);
    }
    return activeThreads;
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
      case ChorPackage.SESSION_PROCEDURE_PARAMETER__TYPE:
        return basicSetType(null, msgs);
      case ChorPackage.SESSION_PROCEDURE_PARAMETER__ACTIVE_THREADS:
        return ((InternalEList<?>)getActiveThreads()).basicRemove(otherEnd, msgs);
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
      case ChorPackage.SESSION_PROCEDURE_PARAMETER__SESSION:
        return getSession();
      case ChorPackage.SESSION_PROCEDURE_PARAMETER__TYPE:
        return getType();
      case ChorPackage.SESSION_PROCEDURE_PARAMETER__ACTIVE_THREADS:
        return getActiveThreads();
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
      case ChorPackage.SESSION_PROCEDURE_PARAMETER__SESSION:
        setSession((String)newValue);
        return;
      case ChorPackage.SESSION_PROCEDURE_PARAMETER__TYPE:
        setType((GlobalTypeCall)newValue);
        return;
      case ChorPackage.SESSION_PROCEDURE_PARAMETER__ACTIVE_THREADS:
        getActiveThreads().clear();
        getActiveThreads().addAll((Collection<? extends ThreadWithRole>)newValue);
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
      case ChorPackage.SESSION_PROCEDURE_PARAMETER__SESSION:
        setSession(SESSION_EDEFAULT);
        return;
      case ChorPackage.SESSION_PROCEDURE_PARAMETER__TYPE:
        setType((GlobalTypeCall)null);
        return;
      case ChorPackage.SESSION_PROCEDURE_PARAMETER__ACTIVE_THREADS:
        getActiveThreads().clear();
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
      case ChorPackage.SESSION_PROCEDURE_PARAMETER__SESSION:
        return SESSION_EDEFAULT == null ? session != null : !SESSION_EDEFAULT.equals(session);
      case ChorPackage.SESSION_PROCEDURE_PARAMETER__TYPE:
        return type != null;
      case ChorPackage.SESSION_PROCEDURE_PARAMETER__ACTIVE_THREADS:
        return activeThreads != null && !activeThreads.isEmpty();
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
    result.append(" (session: ");
    result.append(session);
    result.append(')');
    return result.toString();
  }

} //SessionProcedureParameterImpl
