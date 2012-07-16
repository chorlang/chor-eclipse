/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import org.chor.chor.ChorPackage;
import org.chor.chor.CompareCondition;
import org.chor.chor.ConditionOperator;
import org.chor.chor.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compare Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chor.chor.impl.CompareConditionImpl#getLeftExpression <em>Left Expression</em>}</li>
 *   <li>{@link org.chor.chor.impl.CompareConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.chor.chor.impl.CompareConditionImpl#getRightExpression <em>Right Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompareConditionImpl extends MinimalEObjectImpl.Container implements CompareCondition
{
  /**
   * The cached value of the '{@link #getLeftExpression() <em>Left Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftExpression()
   * @generated
   * @ordered
   */
  protected Expression leftExpression;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected ConditionOperator operator;

  /**
   * The cached value of the '{@link #getRightExpression() <em>Right Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightExpression()
   * @generated
   * @ordered
   */
  protected Expression rightExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompareConditionImpl()
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
    return ChorPackage.Literals.COMPARE_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLeftExpression()
  {
    return leftExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftExpression(Expression newLeftExpression, NotificationChain msgs)
  {
    Expression oldLeftExpression = leftExpression;
    leftExpression = newLeftExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.COMPARE_CONDITION__LEFT_EXPRESSION, oldLeftExpression, newLeftExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftExpression(Expression newLeftExpression)
  {
    if (newLeftExpression != leftExpression)
    {
      NotificationChain msgs = null;
      if (leftExpression != null)
        msgs = ((InternalEObject)leftExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.COMPARE_CONDITION__LEFT_EXPRESSION, null, msgs);
      if (newLeftExpression != null)
        msgs = ((InternalEObject)newLeftExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.COMPARE_CONDITION__LEFT_EXPRESSION, null, msgs);
      msgs = basicSetLeftExpression(newLeftExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.COMPARE_CONDITION__LEFT_EXPRESSION, newLeftExpression, newLeftExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionOperator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperator(ConditionOperator newOperator, NotificationChain msgs)
  {
    ConditionOperator oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.COMPARE_CONDITION__OPERATOR, oldOperator, newOperator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(ConditionOperator newOperator)
  {
    if (newOperator != operator)
    {
      NotificationChain msgs = null;
      if (operator != null)
        msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.COMPARE_CONDITION__OPERATOR, null, msgs);
      if (newOperator != null)
        msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.COMPARE_CONDITION__OPERATOR, null, msgs);
      msgs = basicSetOperator(newOperator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.COMPARE_CONDITION__OPERATOR, newOperator, newOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRightExpression()
  {
    return rightExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightExpression(Expression newRightExpression, NotificationChain msgs)
  {
    Expression oldRightExpression = rightExpression;
    rightExpression = newRightExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.COMPARE_CONDITION__RIGHT_EXPRESSION, oldRightExpression, newRightExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightExpression(Expression newRightExpression)
  {
    if (newRightExpression != rightExpression)
    {
      NotificationChain msgs = null;
      if (rightExpression != null)
        msgs = ((InternalEObject)rightExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.COMPARE_CONDITION__RIGHT_EXPRESSION, null, msgs);
      if (newRightExpression != null)
        msgs = ((InternalEObject)newRightExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.COMPARE_CONDITION__RIGHT_EXPRESSION, null, msgs);
      msgs = basicSetRightExpression(newRightExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.COMPARE_CONDITION__RIGHT_EXPRESSION, newRightExpression, newRightExpression));
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
      case ChorPackage.COMPARE_CONDITION__LEFT_EXPRESSION:
        return basicSetLeftExpression(null, msgs);
      case ChorPackage.COMPARE_CONDITION__OPERATOR:
        return basicSetOperator(null, msgs);
      case ChorPackage.COMPARE_CONDITION__RIGHT_EXPRESSION:
        return basicSetRightExpression(null, msgs);
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
      case ChorPackage.COMPARE_CONDITION__LEFT_EXPRESSION:
        return getLeftExpression();
      case ChorPackage.COMPARE_CONDITION__OPERATOR:
        return getOperator();
      case ChorPackage.COMPARE_CONDITION__RIGHT_EXPRESSION:
        return getRightExpression();
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
      case ChorPackage.COMPARE_CONDITION__LEFT_EXPRESSION:
        setLeftExpression((Expression)newValue);
        return;
      case ChorPackage.COMPARE_CONDITION__OPERATOR:
        setOperator((ConditionOperator)newValue);
        return;
      case ChorPackage.COMPARE_CONDITION__RIGHT_EXPRESSION:
        setRightExpression((Expression)newValue);
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
      case ChorPackage.COMPARE_CONDITION__LEFT_EXPRESSION:
        setLeftExpression((Expression)null);
        return;
      case ChorPackage.COMPARE_CONDITION__OPERATOR:
        setOperator((ConditionOperator)null);
        return;
      case ChorPackage.COMPARE_CONDITION__RIGHT_EXPRESSION:
        setRightExpression((Expression)null);
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
      case ChorPackage.COMPARE_CONDITION__LEFT_EXPRESSION:
        return leftExpression != null;
      case ChorPackage.COMPARE_CONDITION__OPERATOR:
        return operator != null;
      case ChorPackage.COMPARE_CONDITION__RIGHT_EXPRESSION:
        return rightExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //CompareConditionImpl
