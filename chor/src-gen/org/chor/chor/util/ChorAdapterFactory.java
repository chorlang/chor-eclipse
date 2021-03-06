/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.util;

import org.chor.chor.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.chor.chor.ChorPackage
 * @generated
 */
public class ChorAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ChorPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChorAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ChorPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChorSwitch<Adapter> modelSwitch =
    new ChorSwitch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter casePreamble(Preamble object)
      {
        return createPreambleAdapter();
      }
      @Override
      public Adapter caseProcedure(Procedure object)
      {
        return createProcedureAdapter();
      }
      @Override
      public Adapter caseSessionProcedureParameter(SessionProcedureParameter object)
      {
        return createSessionProcedureParameterAdapter();
      }
      @Override
      public Adapter caseProtocol(Protocol object)
      {
        return createProtocolAdapter();
      }
      @Override
      public Adapter caseSite(Site object)
      {
        return createSiteAdapter();
      }
      @Override
      public Adapter caseGlobalType(GlobalType object)
      {
        return createGlobalTypeAdapter();
      }
      @Override
      public Adapter caseGlobalTypeInteraction(GlobalTypeInteraction object)
      {
        return createGlobalTypeInteractionAdapter();
      }
      @Override
      public Adapter caseGlobalTypeCall(GlobalTypeCall object)
      {
        return createGlobalTypeCallAdapter();
      }
      @Override
      public Adapter caseBranchGType(BranchGType object)
      {
        return createBranchGTypeAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseDelegationType(DelegationType object)
      {
        return createDelegationTypeAdapter();
      }
      @Override
      public Adapter caseBasicType(BasicType object)
      {
        return createBasicTypeAdapter();
      }
      @Override
      public Adapter caseChoreography(Choreography object)
      {
        return createChoreographyAdapter();
      }
      @Override
      public Adapter caseStart(Start object)
      {
        return createStartAdapter();
      }
      @Override
      public Adapter caseThreadWithRole(ThreadWithRole object)
      {
        return createThreadWithRoleAdapter();
      }
      @Override
      public Adapter caseInteraction(Interaction object)
      {
        return createInteractionAdapter();
      }
      @Override
      public Adapter caseDelegation(Delegation object)
      {
        return createDelegationAdapter();
      }
      @Override
      public Adapter caseCall(Call object)
      {
        return createCallAdapter();
      }
      @Override
      public Adapter caseIfThenElse(IfThenElse object)
      {
        return createIfThenElseAdapter();
      }
      @Override
      public Adapter caseLocalCode(LocalCode object)
      {
        return createLocalCodeAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseSumExpression(SumExpression object)
      {
        return createSumExpressionAdapter();
      }
      @Override
      public Adapter caseSumExpressionTerm(SumExpressionTerm object)
      {
        return createSumExpressionTermAdapter();
      }
      @Override
      public Adapter caseExpressionBasicTerm(ExpressionBasicTerm object)
      {
        return createExpressionBasicTermAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseCompareCondition(CompareCondition object)
      {
        return createCompareConditionAdapter();
      }
      @Override
      public Adapter caseConditionOperator(ConditionOperator object)
      {
        return createConditionOperatorAdapter();
      }
      @Override
      public Adapter caseLocalAskCommand(LocalAskCommand object)
      {
        return createLocalAskCommandAdapter();
      }
      @Override
      public Adapter caseLocalShowCommand(LocalShowCommand object)
      {
        return createLocalShowCommandAdapter();
      }
      @Override
      public Adapter caseLocalAssignmentCommand(LocalAssignmentCommand object)
      {
        return createLocalAssignmentCommandAdapter();
      }
      @Override
      public Adapter caseSumExpressionAddTerm(SumExpressionAddTerm object)
      {
        return createSumExpressionAddTermAdapter();
      }
      @Override
      public Adapter caseSumExpressionSubtractTerm(SumExpressionSubtractTerm object)
      {
        return createSumExpressionSubtractTermAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.Preamble <em>Preamble</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.Preamble
   * @generated
   */
  public Adapter createPreambleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.Procedure
   * @generated
   */
  public Adapter createProcedureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.SessionProcedureParameter <em>Session Procedure Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.SessionProcedureParameter
   * @generated
   */
  public Adapter createSessionProcedureParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.Protocol
   * @generated
   */
  public Adapter createProtocolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.Site <em>Site</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.Site
   * @generated
   */
  public Adapter createSiteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.GlobalType <em>Global Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.GlobalType
   * @generated
   */
  public Adapter createGlobalTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.GlobalTypeInteraction <em>Global Type Interaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.GlobalTypeInteraction
   * @generated
   */
  public Adapter createGlobalTypeInteractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.GlobalTypeCall <em>Global Type Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.GlobalTypeCall
   * @generated
   */
  public Adapter createGlobalTypeCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.BranchGType <em>Branch GType</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.BranchGType
   * @generated
   */
  public Adapter createBranchGTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.DelegationType <em>Delegation Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.DelegationType
   * @generated
   */
  public Adapter createDelegationTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.BasicType
   * @generated
   */
  public Adapter createBasicTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.Choreography <em>Choreography</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.Choreography
   * @generated
   */
  public Adapter createChoreographyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.Start <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.Start
   * @generated
   */
  public Adapter createStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.ThreadWithRole <em>Thread With Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.ThreadWithRole
   * @generated
   */
  public Adapter createThreadWithRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.Interaction <em>Interaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.Interaction
   * @generated
   */
  public Adapter createInteractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.Delegation <em>Delegation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.Delegation
   * @generated
   */
  public Adapter createDelegationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.Call
   * @generated
   */
  public Adapter createCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.IfThenElse <em>If Then Else</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.IfThenElse
   * @generated
   */
  public Adapter createIfThenElseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.LocalCode <em>Local Code</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.LocalCode
   * @generated
   */
  public Adapter createLocalCodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.SumExpression <em>Sum Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.SumExpression
   * @generated
   */
  public Adapter createSumExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.SumExpressionTerm <em>Sum Expression Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.SumExpressionTerm
   * @generated
   */
  public Adapter createSumExpressionTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.ExpressionBasicTerm <em>Expression Basic Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.ExpressionBasicTerm
   * @generated
   */
  public Adapter createExpressionBasicTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.CompareCondition <em>Compare Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.CompareCondition
   * @generated
   */
  public Adapter createCompareConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.ConditionOperator <em>Condition Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.ConditionOperator
   * @generated
   */
  public Adapter createConditionOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.LocalAskCommand <em>Local Ask Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.LocalAskCommand
   * @generated
   */
  public Adapter createLocalAskCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.LocalShowCommand <em>Local Show Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.LocalShowCommand
   * @generated
   */
  public Adapter createLocalShowCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.LocalAssignmentCommand <em>Local Assignment Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.LocalAssignmentCommand
   * @generated
   */
  public Adapter createLocalAssignmentCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.SumExpressionAddTerm <em>Sum Expression Add Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.SumExpressionAddTerm
   * @generated
   */
  public Adapter createSumExpressionAddTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.chor.chor.SumExpressionSubtractTerm <em>Sum Expression Subtract Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.chor.chor.SumExpressionSubtractTerm
   * @generated
   */
  public Adapter createSumExpressionSubtractTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ChorAdapterFactory
