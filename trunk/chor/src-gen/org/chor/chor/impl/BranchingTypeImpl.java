/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import java.util.Collection;

import org.chor.chor.BranchType;
import org.chor.chor.BranchingType;
import org.chor.chor.ChorPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branching Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chor.chor.impl.BranchingTypeImpl#getBranches <em>Branches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchingTypeImpl extends LocalTypeImpl implements BranchingType
{
  /**
   * The cached value of the '{@link #getBranches() <em>Branches</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBranches()
   * @generated
   * @ordered
   */
  protected EList<BranchType> branches;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BranchingTypeImpl()
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
    return ChorPackage.Literals.BRANCHING_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BranchType> getBranches()
  {
    if (branches == null)
    {
      branches = new EObjectContainmentEList<BranchType>(BranchType.class, this, ChorPackage.BRANCHING_TYPE__BRANCHES);
    }
    return branches;
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
      case ChorPackage.BRANCHING_TYPE__BRANCHES:
        return ((InternalEList<?>)getBranches()).basicRemove(otherEnd, msgs);
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
      case ChorPackage.BRANCHING_TYPE__BRANCHES:
        return getBranches();
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
      case ChorPackage.BRANCHING_TYPE__BRANCHES:
        getBranches().clear();
        getBranches().addAll((Collection<? extends BranchType>)newValue);
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
      case ChorPackage.BRANCHING_TYPE__BRANCHES:
        getBranches().clear();
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
      case ChorPackage.BRANCHING_TYPE__BRANCHES:
        return branches != null && !branches.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BranchingTypeImpl
