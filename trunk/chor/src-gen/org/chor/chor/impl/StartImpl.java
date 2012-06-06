/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import java.util.Collection;

import org.chor.chor.ChorPackage;
import org.chor.chor.Choreography;
import org.chor.chor.Site;
import org.chor.chor.Start;
import org.chor.chor.ThreadWithRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chor.chor.impl.StartImpl#getActiveThreads <em>Active Threads</em>}</li>
 *   <li>{@link org.chor.chor.impl.StartImpl#getServiceThreads <em>Service Threads</em>}</li>
 *   <li>{@link org.chor.chor.impl.StartImpl#getPublicChannel <em>Public Channel</em>}</li>
 *   <li>{@link org.chor.chor.impl.StartImpl#getSession <em>Session</em>}</li>
 *   <li>{@link org.chor.chor.impl.StartImpl#getContinuation <em>Continuation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartImpl extends ChoreographyImpl implements Start
{
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
   * The cached value of the '{@link #getServiceThreads() <em>Service Threads</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceThreads()
   * @generated
   * @ordered
   */
  protected EList<ThreadWithRole> serviceThreads;

  /**
   * The cached value of the '{@link #getPublicChannel() <em>Public Channel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPublicChannel()
   * @generated
   * @ordered
   */
  protected Site publicChannel;

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
  protected StartImpl()
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
    return ChorPackage.Literals.START;
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
      activeThreads = new EObjectContainmentEList<ThreadWithRole>(ThreadWithRole.class, this, ChorPackage.START__ACTIVE_THREADS);
    }
    return activeThreads;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ThreadWithRole> getServiceThreads()
  {
    if (serviceThreads == null)
    {
      serviceThreads = new EObjectContainmentEList<ThreadWithRole>(ThreadWithRole.class, this, ChorPackage.START__SERVICE_THREADS);
    }
    return serviceThreads;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Site getPublicChannel()
  {
    if (publicChannel != null && publicChannel.eIsProxy())
    {
      InternalEObject oldPublicChannel = (InternalEObject)publicChannel;
      publicChannel = (Site)eResolveProxy(oldPublicChannel);
      if (publicChannel != oldPublicChannel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChorPackage.START__PUBLIC_CHANNEL, oldPublicChannel, publicChannel));
      }
    }
    return publicChannel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Site basicGetPublicChannel()
  {
    return publicChannel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPublicChannel(Site newPublicChannel)
  {
    Site oldPublicChannel = publicChannel;
    publicChannel = newPublicChannel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.START__PUBLIC_CHANNEL, oldPublicChannel, publicChannel));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.START__SESSION, oldSession, session));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.START__CONTINUATION, oldContinuation, newContinuation);
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
        msgs = ((InternalEObject)continuation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.START__CONTINUATION, null, msgs);
      if (newContinuation != null)
        msgs = ((InternalEObject)newContinuation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.START__CONTINUATION, null, msgs);
      msgs = basicSetContinuation(newContinuation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.START__CONTINUATION, newContinuation, newContinuation));
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
      case ChorPackage.START__ACTIVE_THREADS:
        return ((InternalEList<?>)getActiveThreads()).basicRemove(otherEnd, msgs);
      case ChorPackage.START__SERVICE_THREADS:
        return ((InternalEList<?>)getServiceThreads()).basicRemove(otherEnd, msgs);
      case ChorPackage.START__CONTINUATION:
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
      case ChorPackage.START__ACTIVE_THREADS:
        return getActiveThreads();
      case ChorPackage.START__SERVICE_THREADS:
        return getServiceThreads();
      case ChorPackage.START__PUBLIC_CHANNEL:
        if (resolve) return getPublicChannel();
        return basicGetPublicChannel();
      case ChorPackage.START__SESSION:
        return getSession();
      case ChorPackage.START__CONTINUATION:
        return getContinuation();
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
      case ChorPackage.START__ACTIVE_THREADS:
        getActiveThreads().clear();
        getActiveThreads().addAll((Collection<? extends ThreadWithRole>)newValue);
        return;
      case ChorPackage.START__SERVICE_THREADS:
        getServiceThreads().clear();
        getServiceThreads().addAll((Collection<? extends ThreadWithRole>)newValue);
        return;
      case ChorPackage.START__PUBLIC_CHANNEL:
        setPublicChannel((Site)newValue);
        return;
      case ChorPackage.START__SESSION:
        setSession((String)newValue);
        return;
      case ChorPackage.START__CONTINUATION:
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
      case ChorPackage.START__ACTIVE_THREADS:
        getActiveThreads().clear();
        return;
      case ChorPackage.START__SERVICE_THREADS:
        getServiceThreads().clear();
        return;
      case ChorPackage.START__PUBLIC_CHANNEL:
        setPublicChannel((Site)null);
        return;
      case ChorPackage.START__SESSION:
        setSession(SESSION_EDEFAULT);
        return;
      case ChorPackage.START__CONTINUATION:
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
      case ChorPackage.START__ACTIVE_THREADS:
        return activeThreads != null && !activeThreads.isEmpty();
      case ChorPackage.START__SERVICE_THREADS:
        return serviceThreads != null && !serviceThreads.isEmpty();
      case ChorPackage.START__PUBLIC_CHANNEL:
        return publicChannel != null;
      case ChorPackage.START__SESSION:
        return SESSION_EDEFAULT == null ? session != null : !SESSION_EDEFAULT.equals(session);
      case ChorPackage.START__CONTINUATION:
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
    result.append(" (session: ");
    result.append(session);
    result.append(')');
    return result.toString();
  }

} //StartImpl
