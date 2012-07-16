/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import org.chor.chor.ChorPackage;
import org.chor.chor.ConditionOperator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chor.chor.impl.ConditionOperatorImpl#isLess <em>Less</em>}</li>
 *   <li>{@link org.chor.chor.impl.ConditionOperatorImpl#isEqual <em>Equal</em>}</li>
 *   <li>{@link org.chor.chor.impl.ConditionOperatorImpl#isGreater <em>Greater</em>}</li>
 *   <li>{@link org.chor.chor.impl.ConditionOperatorImpl#isNot_equal <em>Not equal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionOperatorImpl extends MinimalEObjectImpl.Container implements ConditionOperator
{
  /**
   * The default value of the '{@link #isLess() <em>Less</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLess()
   * @generated
   * @ordered
   */
  protected static final boolean LESS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLess() <em>Less</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLess()
   * @generated
   * @ordered
   */
  protected boolean less = LESS_EDEFAULT;

  /**
   * The default value of the '{@link #isEqual() <em>Equal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEqual()
   * @generated
   * @ordered
   */
  protected static final boolean EQUAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEqual() <em>Equal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEqual()
   * @generated
   * @ordered
   */
  protected boolean equal = EQUAL_EDEFAULT;

  /**
   * The default value of the '{@link #isGreater() <em>Greater</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGreater()
   * @generated
   * @ordered
   */
  protected static final boolean GREATER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGreater() <em>Greater</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGreater()
   * @generated
   * @ordered
   */
  protected boolean greater = GREATER_EDEFAULT;

  /**
   * The default value of the '{@link #isNot_equal() <em>Not equal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot_equal()
   * @generated
   * @ordered
   */
  protected static final boolean NOT_EQUAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNot_equal() <em>Not equal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot_equal()
   * @generated
   * @ordered
   */
  protected boolean not_equal = NOT_EQUAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionOperatorImpl()
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
    return ChorPackage.Literals.CONDITION_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLess()
  {
    return less;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLess(boolean newLess)
  {
    boolean oldLess = less;
    less = newLess;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CONDITION_OPERATOR__LESS, oldLess, less));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEqual()
  {
    return equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEqual(boolean newEqual)
  {
    boolean oldEqual = equal;
    equal = newEqual;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CONDITION_OPERATOR__EQUAL, oldEqual, equal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGreater()
  {
    return greater;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGreater(boolean newGreater)
  {
    boolean oldGreater = greater;
    greater = newGreater;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CONDITION_OPERATOR__GREATER, oldGreater, greater));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNot_equal()
  {
    return not_equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNot_equal(boolean newNot_equal)
  {
    boolean oldNot_equal = not_equal;
    not_equal = newNot_equal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CONDITION_OPERATOR__NOT_EQUAL, oldNot_equal, not_equal));
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
      case ChorPackage.CONDITION_OPERATOR__LESS:
        return isLess();
      case ChorPackage.CONDITION_OPERATOR__EQUAL:
        return isEqual();
      case ChorPackage.CONDITION_OPERATOR__GREATER:
        return isGreater();
      case ChorPackage.CONDITION_OPERATOR__NOT_EQUAL:
        return isNot_equal();
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
      case ChorPackage.CONDITION_OPERATOR__LESS:
        setLess((Boolean)newValue);
        return;
      case ChorPackage.CONDITION_OPERATOR__EQUAL:
        setEqual((Boolean)newValue);
        return;
      case ChorPackage.CONDITION_OPERATOR__GREATER:
        setGreater((Boolean)newValue);
        return;
      case ChorPackage.CONDITION_OPERATOR__NOT_EQUAL:
        setNot_equal((Boolean)newValue);
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
      case ChorPackage.CONDITION_OPERATOR__LESS:
        setLess(LESS_EDEFAULT);
        return;
      case ChorPackage.CONDITION_OPERATOR__EQUAL:
        setEqual(EQUAL_EDEFAULT);
        return;
      case ChorPackage.CONDITION_OPERATOR__GREATER:
        setGreater(GREATER_EDEFAULT);
        return;
      case ChorPackage.CONDITION_OPERATOR__NOT_EQUAL:
        setNot_equal(NOT_EQUAL_EDEFAULT);
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
      case ChorPackage.CONDITION_OPERATOR__LESS:
        return less != LESS_EDEFAULT;
      case ChorPackage.CONDITION_OPERATOR__EQUAL:
        return equal != EQUAL_EDEFAULT;
      case ChorPackage.CONDITION_OPERATOR__GREATER:
        return greater != GREATER_EDEFAULT;
      case ChorPackage.CONDITION_OPERATOR__NOT_EQUAL:
        return not_equal != NOT_EQUAL_EDEFAULT;
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
    result.append(" (less: ");
    result.append(less);
    result.append(", equal: ");
    result.append(equal);
    result.append(", greater: ");
    result.append(greater);
    result.append(", not_equal: ");
    result.append(not_equal);
    result.append(')');
    return result.toString();
  }

} //ConditionOperatorImpl
