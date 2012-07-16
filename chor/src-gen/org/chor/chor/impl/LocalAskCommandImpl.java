/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import org.chor.chor.ChorPackage;
import org.chor.chor.Expression;
import org.chor.chor.LocalAskCommand;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Ask Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.chor.chor.impl.LocalAskCommandImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.chor.chor.impl.LocalAskCommandImpl#getResultVariable <em>Result Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalAskCommandImpl extends LocalCodeImpl implements LocalAskCommand
{
  /**
   * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestion()
   * @generated
   * @ordered
   */
  protected Expression question;

  /**
   * The default value of the '{@link #getResultVariable() <em>Result Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultVariable()
   * @generated
   * @ordered
   */
  protected static final String RESULT_VARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResultVariable() <em>Result Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultVariable()
   * @generated
   * @ordered
   */
  protected String resultVariable = RESULT_VARIABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalAskCommandImpl()
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
    return ChorPackage.Literals.LOCAL_ASK_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getQuestion()
  {
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuestion(Expression newQuestion, NotificationChain msgs)
  {
    Expression oldQuestion = question;
    question = newQuestion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.LOCAL_ASK_COMMAND__QUESTION, oldQuestion, newQuestion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuestion(Expression newQuestion)
  {
    if (newQuestion != question)
    {
      NotificationChain msgs = null;
      if (question != null)
        msgs = ((InternalEObject)question).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.LOCAL_ASK_COMMAND__QUESTION, null, msgs);
      if (newQuestion != null)
        msgs = ((InternalEObject)newQuestion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.LOCAL_ASK_COMMAND__QUESTION, null, msgs);
      msgs = basicSetQuestion(newQuestion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.LOCAL_ASK_COMMAND__QUESTION, newQuestion, newQuestion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResultVariable()
  {
    return resultVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResultVariable(String newResultVariable)
  {
    String oldResultVariable = resultVariable;
    resultVariable = newResultVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.LOCAL_ASK_COMMAND__RESULT_VARIABLE, oldResultVariable, resultVariable));
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
      case ChorPackage.LOCAL_ASK_COMMAND__QUESTION:
        return basicSetQuestion(null, msgs);
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
      case ChorPackage.LOCAL_ASK_COMMAND__QUESTION:
        return getQuestion();
      case ChorPackage.LOCAL_ASK_COMMAND__RESULT_VARIABLE:
        return getResultVariable();
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
      case ChorPackage.LOCAL_ASK_COMMAND__QUESTION:
        setQuestion((Expression)newValue);
        return;
      case ChorPackage.LOCAL_ASK_COMMAND__RESULT_VARIABLE:
        setResultVariable((String)newValue);
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
      case ChorPackage.LOCAL_ASK_COMMAND__QUESTION:
        setQuestion((Expression)null);
        return;
      case ChorPackage.LOCAL_ASK_COMMAND__RESULT_VARIABLE:
        setResultVariable(RESULT_VARIABLE_EDEFAULT);
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
      case ChorPackage.LOCAL_ASK_COMMAND__QUESTION:
        return question != null;
      case ChorPackage.LOCAL_ASK_COMMAND__RESULT_VARIABLE:
        return RESULT_VARIABLE_EDEFAULT == null ? resultVariable != null : !RESULT_VARIABLE_EDEFAULT.equals(resultVariable);
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
    result.append(" (resultVariable: ");
    result.append(resultVariable);
    result.append(')');
    return result.toString();
  }

} //LocalAskCommandImpl
