/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import org.chor.chor.ChorPackage;
import org.chor.chor.Choreography;
import org.chor.chor.Preamble;
import org.chor.chor.Program;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chor.chor.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.chor.chor.impl.ProgramImpl#getPreamble <em>Preamble</em>}</li>
 *   <li>{@link org.chor.chor.impl.ProgramImpl#getChoreography <em>Choreography</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
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
   * The cached value of the '{@link #getPreamble() <em>Preamble</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreamble()
   * @generated
   * @ordered
   */
  protected Preamble preamble;

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
  protected ProgramImpl()
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
    return ChorPackage.Literals.PROGRAM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.PROGRAM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Preamble getPreamble()
  {
    return preamble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreamble(Preamble newPreamble, NotificationChain msgs)
  {
    Preamble oldPreamble = preamble;
    preamble = newPreamble;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.PROGRAM__PREAMBLE, oldPreamble, newPreamble);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreamble(Preamble newPreamble)
  {
    if (newPreamble != preamble)
    {
      NotificationChain msgs = null;
      if (preamble != null)
        msgs = ((InternalEObject)preamble).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.PROGRAM__PREAMBLE, null, msgs);
      if (newPreamble != null)
        msgs = ((InternalEObject)newPreamble).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.PROGRAM__PREAMBLE, null, msgs);
      msgs = basicSetPreamble(newPreamble, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.PROGRAM__PREAMBLE, newPreamble, newPreamble));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.PROGRAM__CHOREOGRAPHY, oldChoreography, newChoreography);
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
        msgs = ((InternalEObject)choreography).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.PROGRAM__CHOREOGRAPHY, null, msgs);
      if (newChoreography != null)
        msgs = ((InternalEObject)newChoreography).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.PROGRAM__CHOREOGRAPHY, null, msgs);
      msgs = basicSetChoreography(newChoreography, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.PROGRAM__CHOREOGRAPHY, newChoreography, newChoreography));
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
      case ChorPackage.PROGRAM__PREAMBLE:
        return basicSetPreamble(null, msgs);
      case ChorPackage.PROGRAM__CHOREOGRAPHY:
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
      case ChorPackage.PROGRAM__NAME:
        return getName();
      case ChorPackage.PROGRAM__PREAMBLE:
        return getPreamble();
      case ChorPackage.PROGRAM__CHOREOGRAPHY:
        return getChoreography();
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
      case ChorPackage.PROGRAM__NAME:
        setName((String)newValue);
        return;
      case ChorPackage.PROGRAM__PREAMBLE:
        setPreamble((Preamble)newValue);
        return;
      case ChorPackage.PROGRAM__CHOREOGRAPHY:
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
      case ChorPackage.PROGRAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ChorPackage.PROGRAM__PREAMBLE:
        setPreamble((Preamble)null);
        return;
      case ChorPackage.PROGRAM__CHOREOGRAPHY:
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
      case ChorPackage.PROGRAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ChorPackage.PROGRAM__PREAMBLE:
        return preamble != null;
      case ChorPackage.PROGRAM__CHOREOGRAPHY:
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
    result.append(')');
    return result.toString();
  }

} //ProgramImpl
