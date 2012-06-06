/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import org.chor.chor.ChorPackage;
import org.chor.chor.Choreography;
import org.chor.chor.Expression;
import org.chor.chor.Interaction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chor.chor.impl.InteractionImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.chor.chor.impl.InteractionImpl#getSenderExpression <em>Sender Expression</em>}</li>
 *   <li>{@link org.chor.chor.impl.InteractionImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.chor.chor.impl.InteractionImpl#getReceiverVariable <em>Receiver Variable</em>}</li>
 *   <li>{@link org.chor.chor.impl.InteractionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.chor.chor.impl.InteractionImpl#getSession <em>Session</em>}</li>
 *   <li>{@link org.chor.chor.impl.InteractionImpl#getContinuation <em>Continuation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionImpl extends ChoreographyImpl implements Interaction
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
   * The cached value of the '{@link #getSenderExpression() <em>Sender Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSenderExpression()
   * @generated
   * @ordered
   */
  protected Expression senderExpression;

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
   * The default value of the '{@link #getReceiverVariable() <em>Receiver Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiverVariable()
   * @generated
   * @ordered
   */
  protected static final String RECEIVER_VARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReceiverVariable() <em>Receiver Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiverVariable()
   * @generated
   * @ordered
   */
  protected String receiverVariable = RECEIVER_VARIABLE_EDEFAULT;

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
  protected InteractionImpl()
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
    return ChorPackage.Literals.INTERACTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.INTERACTION__SENDER, oldSender, sender));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSenderExpression()
  {
    return senderExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSenderExpression(Expression newSenderExpression, NotificationChain msgs)
  {
    Expression oldSenderExpression = senderExpression;
    senderExpression = newSenderExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.INTERACTION__SENDER_EXPRESSION, oldSenderExpression, newSenderExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSenderExpression(Expression newSenderExpression)
  {
    if (newSenderExpression != senderExpression)
    {
      NotificationChain msgs = null;
      if (senderExpression != null)
        msgs = ((InternalEObject)senderExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.INTERACTION__SENDER_EXPRESSION, null, msgs);
      if (newSenderExpression != null)
        msgs = ((InternalEObject)newSenderExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.INTERACTION__SENDER_EXPRESSION, null, msgs);
      msgs = basicSetSenderExpression(newSenderExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.INTERACTION__SENDER_EXPRESSION, newSenderExpression, newSenderExpression));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.INTERACTION__RECEIVER, oldReceiver, receiver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReceiverVariable()
  {
    return receiverVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReceiverVariable(String newReceiverVariable)
  {
    String oldReceiverVariable = receiverVariable;
    receiverVariable = newReceiverVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.INTERACTION__RECEIVER_VARIABLE, oldReceiverVariable, receiverVariable));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.INTERACTION__OPERATION, oldOperation, operation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.INTERACTION__SESSION, oldSession, session));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.INTERACTION__CONTINUATION, oldContinuation, newContinuation);
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
        msgs = ((InternalEObject)continuation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.INTERACTION__CONTINUATION, null, msgs);
      if (newContinuation != null)
        msgs = ((InternalEObject)newContinuation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.INTERACTION__CONTINUATION, null, msgs);
      msgs = basicSetContinuation(newContinuation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.INTERACTION__CONTINUATION, newContinuation, newContinuation));
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
      case ChorPackage.INTERACTION__SENDER_EXPRESSION:
        return basicSetSenderExpression(null, msgs);
      case ChorPackage.INTERACTION__CONTINUATION:
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
      case ChorPackage.INTERACTION__SENDER:
        return getSender();
      case ChorPackage.INTERACTION__SENDER_EXPRESSION:
        return getSenderExpression();
      case ChorPackage.INTERACTION__RECEIVER:
        return getReceiver();
      case ChorPackage.INTERACTION__RECEIVER_VARIABLE:
        return getReceiverVariable();
      case ChorPackage.INTERACTION__OPERATION:
        return getOperation();
      case ChorPackage.INTERACTION__SESSION:
        return getSession();
      case ChorPackage.INTERACTION__CONTINUATION:
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
      case ChorPackage.INTERACTION__SENDER:
        setSender((String)newValue);
        return;
      case ChorPackage.INTERACTION__SENDER_EXPRESSION:
        setSenderExpression((Expression)newValue);
        return;
      case ChorPackage.INTERACTION__RECEIVER:
        setReceiver((String)newValue);
        return;
      case ChorPackage.INTERACTION__RECEIVER_VARIABLE:
        setReceiverVariable((String)newValue);
        return;
      case ChorPackage.INTERACTION__OPERATION:
        setOperation((String)newValue);
        return;
      case ChorPackage.INTERACTION__SESSION:
        setSession((String)newValue);
        return;
      case ChorPackage.INTERACTION__CONTINUATION:
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
      case ChorPackage.INTERACTION__SENDER:
        setSender(SENDER_EDEFAULT);
        return;
      case ChorPackage.INTERACTION__SENDER_EXPRESSION:
        setSenderExpression((Expression)null);
        return;
      case ChorPackage.INTERACTION__RECEIVER:
        setReceiver(RECEIVER_EDEFAULT);
        return;
      case ChorPackage.INTERACTION__RECEIVER_VARIABLE:
        setReceiverVariable(RECEIVER_VARIABLE_EDEFAULT);
        return;
      case ChorPackage.INTERACTION__OPERATION:
        setOperation(OPERATION_EDEFAULT);
        return;
      case ChorPackage.INTERACTION__SESSION:
        setSession(SESSION_EDEFAULT);
        return;
      case ChorPackage.INTERACTION__CONTINUATION:
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
      case ChorPackage.INTERACTION__SENDER:
        return SENDER_EDEFAULT == null ? sender != null : !SENDER_EDEFAULT.equals(sender);
      case ChorPackage.INTERACTION__SENDER_EXPRESSION:
        return senderExpression != null;
      case ChorPackage.INTERACTION__RECEIVER:
        return RECEIVER_EDEFAULT == null ? receiver != null : !RECEIVER_EDEFAULT.equals(receiver);
      case ChorPackage.INTERACTION__RECEIVER_VARIABLE:
        return RECEIVER_VARIABLE_EDEFAULT == null ? receiverVariable != null : !RECEIVER_VARIABLE_EDEFAULT.equals(receiverVariable);
      case ChorPackage.INTERACTION__OPERATION:
        return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
      case ChorPackage.INTERACTION__SESSION:
        return SESSION_EDEFAULT == null ? session != null : !SESSION_EDEFAULT.equals(session);
      case ChorPackage.INTERACTION__CONTINUATION:
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
    result.append(", receiverVariable: ");
    result.append(receiverVariable);
    result.append(", operation: ");
    result.append(operation);
    result.append(", session: ");
    result.append(session);
    result.append(')');
    return result.toString();
  }

} //InteractionImpl
