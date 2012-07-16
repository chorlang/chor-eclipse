/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import java.util.Collection;

import org.chor.chor.ChorPackage;
import org.chor.chor.Choreography;
import org.chor.chor.Procedure;
import org.chor.chor.SessionProcedureParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chor.chor.impl.ProcedureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.chor.chor.impl.ProcedureImpl#getThreadParameters <em>Thread Parameters</em>}</li>
 *   <li>{@link org.chor.chor.impl.ProcedureImpl#getSessionParameters <em>Session Parameters</em>}</li>
 *   <li>{@link org.chor.chor.impl.ProcedureImpl#getChoreography <em>Choreography</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureImpl extends MinimalEObjectImpl.Container implements Procedure
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getThreadParameters() <em>Thread Parameters</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreadParameters()
   * @generated
   * @ordered
   */
  protected EList<String> threadParameters;

  /**
   * The cached value of the '{@link #getSessionParameters() <em>Session Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSessionParameters()
   * @generated
   * @ordered
   */
  protected EList<SessionProcedureParameter> sessionParameters;

  /**
   * The cached value of the '{@link #getChoreography() <em>Choreography</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoreography()
   * @generated
   * @ordered
   */
  protected Choreography choreography;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcedureImpl()
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
    return ChorPackage.Literals.PROCEDURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.PROCEDURE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getThreadParameters()
  {
    if (threadParameters == null)
    {
      threadParameters = new EDataTypeEList<String>(String.class, this, ChorPackage.PROCEDURE__THREAD_PARAMETERS);
    }
    return threadParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SessionProcedureParameter> getSessionParameters()
  {
    if (sessionParameters == null)
    {
      sessionParameters = new EObjectContainmentEList<SessionProcedureParameter>(SessionProcedureParameter.class, this, ChorPackage.PROCEDURE__SESSION_PARAMETERS);
    }
    return sessionParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Choreography getChoreography()
  {
    return choreography;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChoreography(Choreography newChoreography, NotificationChain msgs)
  {
    Choreography oldChoreography = choreography;
    choreography = newChoreography;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.PROCEDURE__CHOREOGRAPHY, oldChoreography, newChoreography);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChoreography(Choreography newChoreography)
  {
    if (newChoreography != choreography)
    {
      NotificationChain msgs = null;
      if (choreography != null)
        msgs = ((InternalEObject)choreography).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.PROCEDURE__CHOREOGRAPHY, null, msgs);
      if (newChoreography != null)
        msgs = ((InternalEObject)newChoreography).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.PROCEDURE__CHOREOGRAPHY, null, msgs);
      msgs = basicSetChoreography(newChoreography, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.PROCEDURE__CHOREOGRAPHY, newChoreography, newChoreography));
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
      case ChorPackage.PROCEDURE__SESSION_PARAMETERS:
        return ((InternalEList<?>)getSessionParameters()).basicRemove(otherEnd, msgs);
      case ChorPackage.PROCEDURE__CHOREOGRAPHY:
        return basicSetChoreography(null, msgs);
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
      case ChorPackage.PROCEDURE__NAME:
        return getName();
      case ChorPackage.PROCEDURE__THREAD_PARAMETERS:
        return getThreadParameters();
      case ChorPackage.PROCEDURE__SESSION_PARAMETERS:
        return getSessionParameters();
      case ChorPackage.PROCEDURE__CHOREOGRAPHY:
        return getChoreography();
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
      case ChorPackage.PROCEDURE__NAME:
        setName((String)newValue);
        return;
      case ChorPackage.PROCEDURE__THREAD_PARAMETERS:
        getThreadParameters().clear();
        getThreadParameters().addAll((Collection<? extends String>)newValue);
        return;
      case ChorPackage.PROCEDURE__SESSION_PARAMETERS:
        getSessionParameters().clear();
        getSessionParameters().addAll((Collection<? extends SessionProcedureParameter>)newValue);
        return;
      case ChorPackage.PROCEDURE__CHOREOGRAPHY:
        setChoreography((Choreography)newValue);
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
      case ChorPackage.PROCEDURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ChorPackage.PROCEDURE__THREAD_PARAMETERS:
        getThreadParameters().clear();
        return;
      case ChorPackage.PROCEDURE__SESSION_PARAMETERS:
        getSessionParameters().clear();
        return;
      case ChorPackage.PROCEDURE__CHOREOGRAPHY:
        setChoreography((Choreography)null);
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
      case ChorPackage.PROCEDURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ChorPackage.PROCEDURE__THREAD_PARAMETERS:
        return threadParameters != null && !threadParameters.isEmpty();
      case ChorPackage.PROCEDURE__SESSION_PARAMETERS:
        return sessionParameters != null && !sessionParameters.isEmpty();
      case ChorPackage.PROCEDURE__CHOREOGRAPHY:
        return choreography != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", threadParameters: ");
    result.append(threadParameters);
    result.append(')');
    return result.toString();
  }

} //ProcedureImpl
