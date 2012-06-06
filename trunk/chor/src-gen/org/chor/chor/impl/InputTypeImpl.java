/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import org.chor.chor.ChorPackage;
import org.chor.chor.DataType;
import org.chor.chor.InputType;
import org.chor.chor.LocalType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chor.chor.impl.InputTypeImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.chor.chor.impl.InputTypeImpl#getContinuation <em>Continuation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputTypeImpl extends LocalTypeImpl implements InputType
{
  /**
   * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatype()
   * @generated
   * @ordered
   */
  protected DataType datatype;

  /**
   * The cached value of the '{@link #getContinuation() <em>Continuation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContinuation()
   * @generated
   * @ordered
   */
  protected LocalType continuation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputTypeImpl()
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
    return ChorPackage.Literals.INPUT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getDatatype()
  {
    return datatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatatype(DataType newDatatype, NotificationChain msgs)
  {
    DataType oldDatatype = datatype;
    datatype = newDatatype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.INPUT_TYPE__DATATYPE, oldDatatype, newDatatype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatatype(DataType newDatatype)
  {
    if (newDatatype != datatype)
    {
      NotificationChain msgs = null;
      if (datatype != null)
        msgs = ((InternalEObject)datatype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.INPUT_TYPE__DATATYPE, null, msgs);
      if (newDatatype != null)
        msgs = ((InternalEObject)newDatatype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.INPUT_TYPE__DATATYPE, null, msgs);
      msgs = basicSetDatatype(newDatatype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.INPUT_TYPE__DATATYPE, newDatatype, newDatatype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalType getContinuation()
  {
    return continuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContinuation(LocalType newContinuation, NotificationChain msgs)
  {
    LocalType oldContinuation = continuation;
    continuation = newContinuation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.INPUT_TYPE__CONTINUATION, oldContinuation, newContinuation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContinuation(LocalType newContinuation)
  {
    if (newContinuation != continuation)
    {
      NotificationChain msgs = null;
      if (continuation != null)
        msgs = ((InternalEObject)continuation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.INPUT_TYPE__CONTINUATION, null, msgs);
      if (newContinuation != null)
        msgs = ((InternalEObject)newContinuation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.INPUT_TYPE__CONTINUATION, null, msgs);
      msgs = basicSetContinuation(newContinuation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.INPUT_TYPE__CONTINUATION, newContinuation, newContinuation));
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
      case ChorPackage.INPUT_TYPE__DATATYPE:
        return basicSetDatatype(null, msgs);
      case ChorPackage.INPUT_TYPE__CONTINUATION:
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
      case ChorPackage.INPUT_TYPE__DATATYPE:
        return getDatatype();
      case ChorPackage.INPUT_TYPE__CONTINUATION:
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
      case ChorPackage.INPUT_TYPE__DATATYPE:
        setDatatype((DataType)newValue);
        return;
      case ChorPackage.INPUT_TYPE__CONTINUATION:
        setContinuation((LocalType)newValue);
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
      case ChorPackage.INPUT_TYPE__DATATYPE:
        setDatatype((DataType)null);
        return;
      case ChorPackage.INPUT_TYPE__CONTINUATION:
        setContinuation((LocalType)null);
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
      case ChorPackage.INPUT_TYPE__DATATYPE:
        return datatype != null;
      case ChorPackage.INPUT_TYPE__CONTINUATION:
        return continuation != null;
    }
    return super.eIsSet(featureID);
  }

} //InputTypeImpl
