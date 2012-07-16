/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import org.chor.chor.ChorPackage;
import org.chor.chor.Choreography;
import org.chor.chor.Delegation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chor.chor.impl.DelegationImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.chor.chor.impl.DelegationImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.chor.chor.impl.DelegationImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.chor.chor.impl.DelegationImpl#getSession <em>Session</em>}</li>
 *   <li>{@link org.chor.chor.impl.DelegationImpl#getDelegatedSession <em>Delegated Session</em>}</li>
 *   <li>{@link org.chor.chor.impl.DelegationImpl#getContinuation <em>Continuation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelegationImpl extends ChoreographyImpl implements Delegation
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
   * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected static final String OPERATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected String operation = OPERATION_EDEFAULT;

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
   * The default value of the '{@link #getDelegatedSession() <em>Delegated Session</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelegatedSession()
   * @generated
   * @ordered
   */
  protected static final String DELEGATED_SESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDelegatedSession() <em>Delegated Session</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelegatedSession()
   * @generated
   * @ordered
   */
  protected String delegatedSession = DELEGATED_SESSION_EDEFAULT;

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
  protected DelegationImpl()
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
    return ChorPackage.Literals.DELEGATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.DELEGATION__SENDER, oldSender, sender));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.DELEGATION__RECEIVER, oldReceiver, receiver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(String newOperation)
  {
    String oldOperation = operation;
    operation = newOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.DELEGATION__OPERATION, oldOperation, operation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.DELEGATION__SESSION, oldSession, session));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDelegatedSession()
  {
    return delegatedSession;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelegatedSession(String newDelegatedSession)
  {
    String oldDelegatedSession = delegatedSession;
    delegatedSession = newDelegatedSession;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.DELEGATION__DELEGATED_SESSION, oldDelegatedSession, delegatedSession));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.DELEGATION__CONTINUATION, oldContinuation, newContinuation);
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
        msgs = ((InternalEObject)continuation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.DELEGATION__CONTINUATION, null, msgs);
      if (newContinuation != null)
        msgs = ((InternalEObject)newContinuation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.DELEGATION__CONTINUATION, null, msgs);
      msgs = basicSetContinuation(newContinuation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.DELEGATION__CONTINUATION, newContinuation, newContinuation));
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
      case ChorPackage.DELEGATION__CONTINUATION:
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
      case ChorPackage.DELEGATION__SENDER:
        return getSender();
      case ChorPackage.DELEGATION__RECEIVER:
        return getReceiver();
      case ChorPackage.DELEGATION__OPERATION:
        return getOperation();
      case ChorPackage.DELEGATION__SESSION:
        return getSession();
      case ChorPackage.DELEGATION__DELEGATED_SESSION:
        return getDelegatedSession();
      case ChorPackage.DELEGATION__CONTINUATION:
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
      case ChorPackage.DELEGATION__SENDER:
        setSender((String)newValue);
        return;
      case ChorPackage.DELEGATION__RECEIVER:
        setReceiver((String)newValue);
        return;
      case ChorPackage.DELEGATION__OPERATION:
        setOperation((String)newValue);
        return;
      case ChorPackage.DELEGATION__SESSION:
        setSession((String)newValue);
        return;
      case ChorPackage.DELEGATION__DELEGATED_SESSION:
        setDelegatedSession((String)newValue);
        return;
      case ChorPackage.DELEGATION__CONTINUATION:
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
      case ChorPackage.DELEGATION__SENDER:
        setSender(SENDER_EDEFAULT);
        return;
      case ChorPackage.DELEGATION__RECEIVER:
        setReceiver(RECEIVER_EDEFAULT);
        return;
      case ChorPackage.DELEGATION__OPERATION:
        setOperation(OPERATION_EDEFAULT);
        return;
      case ChorPackage.DELEGATION__SESSION:
        setSession(SESSION_EDEFAULT);
        return;
      case ChorPackage.DELEGATION__DELEGATED_SESSION:
        setDelegatedSession(DELEGATED_SESSION_EDEFAULT);
        return;
      case ChorPackage.DELEGATION__CONTINUATION:
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
      case ChorPackage.DELEGATION__SENDER:
        return SENDER_EDEFAULT == null ? sender != null : !SENDER_EDEFAULT.equals(sender);
      case ChorPackage.DELEGATION__RECEIVER:
        return RECEIVER_EDEFAULT == null ? receiver != null : !RECEIVER_EDEFAULT.equals(receiver);
      case ChorPackage.DELEGATION__OPERATION:
        return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
      case ChorPackage.DELEGATION__SESSION:
        return SESSION_EDEFAULT == null ? session != null : !SESSION_EDEFAULT.equals(session);
      case ChorPackage.DELEGATION__DELEGATED_SESSION:
        return DELEGATED_SESSION_EDEFAULT == null ? delegatedSession != null : !DELEGATED_SESSION_EDEFAULT.equals(delegatedSession);
      case ChorPackage.DELEGATION__CONTINUATION:
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
    result.append(" (sender: ");
    result.append(sender);
    result.append(", receiver: ");
    result.append(receiver);
    result.append(", operation: ");
    result.append(operation);
    result.append(", session: ");
    result.append(session);
    result.append(", delegatedSession: ");
    result.append(delegatedSession);
    result.append(')');
    return result.toString();
  }

} //DelegationImpl
