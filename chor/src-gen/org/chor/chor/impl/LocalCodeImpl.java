/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import org.chor.chor.ChorPackage;
import org.chor.chor.Choreography;
import org.chor.chor.LocalCode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chor.chor.impl.LocalCodeImpl#getThread <em>Thread</em>}</li>
 *   <li>{@link org.chor.chor.impl.LocalCodeImpl#getContinuation <em>Continuation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalCodeImpl extends ChoreographyImpl implements LocalCode
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
   * The cached value of the '{@link #getContinuation() <em>Continuation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContinuation()
   * @generated
   * @ordered
   */
  protected Choreography continuation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalCodeImpl()
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
    return ChorPackage.Literals.LOCAL_CODE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.LOCAL_CODE__THREAD, oldThread, thread));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Choreography getContinuation()
  {
    return continuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContinuation(Choreography newContinuation, NotificationChain msgs)
  {
    Choreography oldContinuation = continuation;
    continuation = newContinuation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.LOCAL_CODE__CONTINUATION, oldContinuation, newContinuation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContinuation(Choreography newContinuation)
  {
    if (newContinuation != continuation)
    {
      NotificationChain msgs = null;
      if (continuation != null)
        msgs = ((InternalEObject)continuation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.LOCAL_CODE__CONTINUATION, null, msgs);
      if (newContinuation != null)
        msgs = ((InternalEObject)newContinuation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.LOCAL_CODE__CONTINUATION, null, msgs);
      msgs = basicSetContinuation(newContinuation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.LOCAL_CODE__CONTINUATION, newContinuation, newContinuation));
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
      case ChorPackage.LOCAL_CODE__CONTINUATION:
        return basicSetContinuation(null, msgs);
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
      case ChorPackage.LOCAL_CODE__THREAD:
        return getThread();
      case ChorPackage.LOCAL_CODE__CONTINUATION:
        return getContinuation();
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
      case ChorPackage.LOCAL_CODE__THREAD:
        setThread((String)newValue);
        return;
      case ChorPackage.LOCAL_CODE__CONTINUATION:
        setContinuation((Choreography)newValue);
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
      case ChorPackage.LOCAL_CODE__THREAD:
        setThread(THREAD_EDEFAULT);
        return;
      case ChorPackage.LOCAL_CODE__CONTINUATION:
        setContinuation((Choreography)null);
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
      case ChorPackage.LOCAL_CODE__THREAD:
        return THREAD_EDEFAULT == null ? thread != null : !THREAD_EDEFAULT.equals(thread);
      case ChorPackage.LOCAL_CODE__CONTINUATION:
        return continuation != null;
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
    result.append(')');
    return result.toString();
  }

} //LocalCodeImpl
