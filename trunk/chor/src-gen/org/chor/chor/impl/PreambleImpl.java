/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import java.util.Collection;

import org.chor.chor.ChorPackage;
import org.chor.chor.Preamble;
import org.chor.chor.Protocol;
import org.chor.chor.Site;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preamble</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chor.chor.impl.PreambleImpl#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link org.chor.chor.impl.PreambleImpl#getSite <em>Site</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreambleImpl extends MinimalEObjectImpl.Container implements Preamble
{
  /**
   * The cached value of the '{@link #getProtocols() <em>Protocols</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocols()
   * @generated
   * @ordered
   */
  protected EList<Protocol> protocols;

  /**
   * The cached value of the '{@link #getSite() <em>Site</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSite()
   * @generated
   * @ordered
   */
  protected EList<Site> site;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreambleImpl()
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
    return ChorPackage.Literals.PREAMBLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Protocol> getProtocols()
  {
    if (protocols == null)
    {
      protocols = new EObjectContainmentEList<Protocol>(Protocol.class, this, ChorPackage.PREAMBLE__PROTOCOLS);
    }
    return protocols;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Site> getSite()
  {
    if (site == null)
    {
      site = new EObjectContainmentEList<Site>(Site.class, this, ChorPackage.PREAMBLE__SITE);
    }
    return site;
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
      case ChorPackage.PREAMBLE__PROTOCOLS:
        return ((InternalEList<?>)getProtocols()).basicRemove(otherEnd, msgs);
      case ChorPackage.PREAMBLE__SITE:
        return ((InternalEList<?>)getSite()).basicRemove(otherEnd, msgs);
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
      case ChorPackage.PREAMBLE__PROTOCOLS:
        return getProtocols();
      case ChorPackage.PREAMBLE__SITE:
        return getSite();
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
      case ChorPackage.PREAMBLE__PROTOCOLS:
        getProtocols().clear();
        getProtocols().addAll((Collection<? extends Protocol>)newValue);
        return;
      case ChorPackage.PREAMBLE__SITE:
        getSite().clear();
        getSite().addAll((Collection<? extends Site>)newValue);
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
      case ChorPackage.PREAMBLE__PROTOCOLS:
        getProtocols().clear();
        return;
      case ChorPackage.PREAMBLE__SITE:
        getSite().clear();
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
      case ChorPackage.PREAMBLE__PROTOCOLS:
        return protocols != null && !protocols.isEmpty();
      case ChorPackage.PREAMBLE__SITE:
        return site != null && !site.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PreambleImpl
