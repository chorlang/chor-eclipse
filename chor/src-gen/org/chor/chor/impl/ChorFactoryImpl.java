/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import org.chor.chor.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChorFactoryImpl extends EFactoryImpl implements ChorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ChorFactory init()
  {
    try
    {
      ChorFactory theChorFactory = (ChorFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.chor-lang.org/Chor"); 
      if (theChorFactory != null)
      {
        return theChorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ChorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChorFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ChorPackage.PROGRAM: return createProgram();
      case ChorPackage.PREAMBLE: return createPreamble();
      case ChorPackage.PROTOCOL: return createProtocol();
      case ChorPackage.SITE: return createSite();
      case ChorPackage.GLOBAL_TYPE: return createGlobalType();
      case ChorPackage.BRANCH_GTYPE: return createBranchGType();
      case ChorPackage.DATA_TYPE: return createDataType();
      case ChorPackage.BASIC_TYPE: return createBasicType();
      case ChorPackage.LOCAL_TYPE: return createLocalType();
      case ChorPackage.BRANCH_TYPE: return createBranchType();
      case ChorPackage.CHOREOGRAPHY: return createChoreography();
      case ChorPackage.START: return createStart();
      case ChorPackage.THREAD_WITH_ROLE: return createThreadWithRole();
      case ChorPackage.INTERACTION: return createInteraction();
      case ChorPackage.IF_THEN_ELSE: return createIfThenElse();
      case ChorPackage.EXPRESSION: return createExpression();
      case ChorPackage.SUM_EXPRESSION: return createSumExpression();
      case ChorPackage.SUM_EXPRESSION_TERM: return createSumExpressionTerm();
      case ChorPackage.EXPRESSION_BASIC_TERM: return createExpressionBasicTerm();
      case ChorPackage.CONSTANT: return createConstant();
      case ChorPackage.CONDITION: return createCondition();
      case ChorPackage.COMPARE_CONDITION: return createCompareCondition();
      case ChorPackage.OUTPUT_TYPE: return createOutputType();
      case ChorPackage.INPUT_TYPE: return createInputType();
      case ChorPackage.BRANCHING_TYPE: return createBranchingType();
      case ChorPackage.SELECTION_TYPE: return createSelectionType();
      case ChorPackage.SUM_EXPRESSION_ADD_TERM: return createSumExpressionAddTerm();
      case ChorPackage.SUM_EXPRESSION_SUBTRACT_TERM: return createSumExpressionSubtractTerm();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Preamble createPreamble()
  {
    PreambleImpl preamble = new PreambleImpl();
    return preamble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Protocol createProtocol()
  {
    ProtocolImpl protocol = new ProtocolImpl();
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Site createSite()
  {
    SiteImpl site = new SiteImpl();
    return site;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalType createGlobalType()
  {
    GlobalTypeImpl globalType = new GlobalTypeImpl();
    return globalType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BranchGType createBranchGType()
  {
    BranchGTypeImpl branchGType = new BranchGTypeImpl();
    return branchGType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicType createBasicType()
  {
    BasicTypeImpl basicType = new BasicTypeImpl();
    return basicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalType createLocalType()
  {
    LocalTypeImpl localType = new LocalTypeImpl();
    return localType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BranchType createBranchType()
  {
    BranchTypeImpl branchType = new BranchTypeImpl();
    return branchType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Choreography createChoreography()
  {
    ChoreographyImpl choreography = new ChoreographyImpl();
    return choreography;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Start createStart()
  {
    StartImpl start = new StartImpl();
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThreadWithRole createThreadWithRole()
  {
    ThreadWithRoleImpl threadWithRole = new ThreadWithRoleImpl();
    return threadWithRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interaction createInteraction()
  {
    InteractionImpl interaction = new InteractionImpl();
    return interaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfThenElse createIfThenElse()
  {
    IfThenElseImpl ifThenElse = new IfThenElseImpl();
    return ifThenElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SumExpression createSumExpression()
  {
    SumExpressionImpl sumExpression = new SumExpressionImpl();
    return sumExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SumExpressionTerm createSumExpressionTerm()
  {
    SumExpressionTermImpl sumExpressionTerm = new SumExpressionTermImpl();
    return sumExpressionTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionBasicTerm createExpressionBasicTerm()
  {
    ExpressionBasicTermImpl expressionBasicTerm = new ExpressionBasicTermImpl();
    return expressionBasicTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompareCondition createCompareCondition()
  {
    CompareConditionImpl compareCondition = new CompareConditionImpl();
    return compareCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputType createOutputType()
  {
    OutputTypeImpl outputType = new OutputTypeImpl();
    return outputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputType createInputType()
  {
    InputTypeImpl inputType = new InputTypeImpl();
    return inputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BranchingType createBranchingType()
  {
    BranchingTypeImpl branchingType = new BranchingTypeImpl();
    return branchingType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectionType createSelectionType()
  {
    SelectionTypeImpl selectionType = new SelectionTypeImpl();
    return selectionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SumExpressionAddTerm createSumExpressionAddTerm()
  {
    SumExpressionAddTermImpl sumExpressionAddTerm = new SumExpressionAddTermImpl();
    return sumExpressionAddTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SumExpressionSubtractTerm createSumExpressionSubtractTerm()
  {
    SumExpressionSubtractTermImpl sumExpressionSubtractTerm = new SumExpressionSubtractTermImpl();
    return sumExpressionSubtractTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChorPackage getChorPackage()
  {
    return (ChorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ChorPackage getPackage()
  {
    return ChorPackage.eINSTANCE;
  }

} //ChorFactoryImpl
