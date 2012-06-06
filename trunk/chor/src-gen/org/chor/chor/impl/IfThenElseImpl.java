/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import org.chor.chor.ChorPackage;
import org.chor.chor.Choreography;
import org.chor.chor.Condition;
import org.chor.chor.IfThenElse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chor.chor.impl.IfThenElseImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.chor.chor.impl.IfThenElseImpl#getThread <em>Thread</em>}</li>
 *   <li>{@link org.chor.chor.impl.IfThenElseImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.chor.chor.impl.IfThenElseImpl#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfThenElseImpl extends ChoreographyImpl implements IfThenElse
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Condition condition;

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
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected Choreography then;

  /**
   * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse()
   * @generated
   * @ordered
   */
  protected Choreography else_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfThenElseImpl()
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
    return ChorPackage.Literals.IF_THEN_ELSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs)
  {
    Condition oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.IF_THEN_ELSE__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Condition newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.IF_THEN_ELSE__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.IF_THEN_ELSE__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.IF_THEN_ELSE__CONDITION, newCondition, newCondition));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.IF_THEN_ELSE__THREAD, oldThread, thread));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Choreography getThen()
  {
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen(Choreography newThen, NotificationChain msgs)
  {
    Choreography oldThen = then;
    then = newThen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.IF_THEN_ELSE__THEN, oldThen, newThen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThen(Choreography newThen)
  {
    if (newThen != then)
    {
      NotificationChain msgs = null;
      if (then != null)
        msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.IF_THEN_ELSE__THEN, null, msgs);
      if (newThen != null)
        msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.IF_THEN_ELSE__THEN, null, msgs);
      msgs = basicSetThen(newThen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.IF_THEN_ELSE__THEN, newThen, newThen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Choreography getElse()
  {
    return else_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElse(Choreography newElse, NotificationChain msgs)
  {
    Choreography oldElse = else_;
    else_ = newElse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.IF_THEN_ELSE__ELSE, oldElse, newElse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElse(Choreography newElse)
  {
    if (newElse != else_)
    {
      NotificationChain msgs = null;
      if (else_ != null)
        msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.IF_THEN_ELSE__ELSE, null, msgs);
      if (newElse != null)
        msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.IF_THEN_ELSE__ELSE, null, msgs);
      msgs = basicSetElse(newElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.IF_THEN_ELSE__ELSE, newElse, newElse));
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
      case ChorPackage.IF_THEN_ELSE__CONDITION:
        return basicSetCondition(null, msgs);
      case ChorPackage.IF_THEN_ELSE__THEN:
        return basicSetThen(null, msgs);
      case ChorPackage.IF_THEN_ELSE__ELSE:
        return basicSetElse(null, msgs);
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
      case ChorPackage.IF_THEN_ELSE__CONDITION:
        return getCondition();
      case ChorPackage.IF_THEN_ELSE__THREAD:
        return getThread();
      case ChorPackage.IF_THEN_ELSE__THEN:
        return getThen();
      case ChorPackage.IF_THEN_ELSE__ELSE:
        return getElse();
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
      case ChorPackage.IF_THEN_ELSE__CONDITION:
        setCondition((Condition)newValue);
        return;
      case ChorPackage.IF_THEN_ELSE__THREAD:
        setThread((String)newValue);
        return;
      case ChorPackage.IF_THEN_ELSE__THEN:
        setThen((Choreography)newValue);
        return;
      case ChorPackage.IF_THEN_ELSE__ELSE:
        setElse((Choreography)newValue);
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
      case ChorPackage.IF_THEN_ELSE__CONDITION:
        setCondition((Condition)null);
        return;
      case ChorPackage.IF_THEN_ELSE__THREAD:
        setThread(THREAD_EDEFAULT);
        return;
      case ChorPackage.IF_THEN_ELSE__THEN:
        setThen((Choreography)null);
        return;
      case ChorPackage.IF_THEN_ELSE__ELSE:
        setElse((Choreography)null);
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
      case ChorPackage.IF_THEN_ELSE__CONDITION:
        return condition != null;
      case ChorPackage.IF_THEN_ELSE__THREAD:
        return THREAD_EDEFAULT == null ? thread != null : !THREAD_EDEFAULT.equals(thread);
      case ChorPackage.IF_THEN_ELSE__THEN:
        return then != null;
      case ChorPackage.IF_THEN_ELSE__ELSE:
        return else_ != null;
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

} //IfThenElseImpl
