/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor.impl;

import org.chor.chor.BasicType;
import org.chor.chor.BranchGType;
import org.chor.chor.BranchType;
import org.chor.chor.BranchingType;
import org.chor.chor.ChorFactory;
import org.chor.chor.ChorPackage;
import org.chor.chor.Choreography;
import org.chor.chor.CompareCondition;
import org.chor.chor.Condition;
import org.chor.chor.Constant;
import org.chor.chor.DataType;
import org.chor.chor.Expression;
import org.chor.chor.ExpressionBasicTerm;
import org.chor.chor.GlobalType;
import org.chor.chor.IfThenElse;
import org.chor.chor.InputType;
import org.chor.chor.Interaction;
import org.chor.chor.LocalType;
import org.chor.chor.OutputType;
import org.chor.chor.Preamble;
import org.chor.chor.Program;
import org.chor.chor.Protocol;
import org.chor.chor.SelectionType;
import org.chor.chor.Site;
import org.chor.chor.Start;
import org.chor.chor.SumExpression;
import org.chor.chor.SumExpressionAddTerm;
import org.chor.chor.SumExpressionSubtractTerm;
import org.chor.chor.SumExpressionTerm;
import org.chor.chor.ThreadWithRole;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChorPackageImpl extends EPackageImpl implements ChorPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preambleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protocolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass siteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass globalTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass branchGTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass branchTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass choreographyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass startEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass threadWithRoleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifThenElseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumExpressionTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionBasicTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compareConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass branchingTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumExpressionAddTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumExpressionSubtractTermEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.chor.chor.ChorPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ChorPackageImpl()
  {
    super(eNS_URI, ChorFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ChorPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ChorPackage init()
  {
    if (isInited) return (ChorPackage)EPackage.Registry.INSTANCE.getEPackage(ChorPackage.eNS_URI);

    // Obtain or create and register package
    ChorPackageImpl theChorPackage = (ChorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ChorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ChorPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theChorPackage.createPackageContents();

    // Initialize created meta-data
    theChorPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theChorPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ChorPackage.eNS_URI, theChorPackage);
    return theChorPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProgram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProgram_Name()
  {
    return (EAttribute)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Preamble()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Choreography()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreamble()
  {
    return preambleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreamble_Protocols()
  {
    return (EReference)preambleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreamble_Site()
  {
    return (EReference)preambleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtocol()
  {
    return protocolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProtocol_Name()
  {
    return (EAttribute)protocolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProtocol_Type()
  {
    return (EReference)protocolEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSite()
  {
    return siteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSite_Name()
  {
    return (EAttribute)siteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSite_Protocol()
  {
    return (EReference)siteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlobalType()
  {
    return globalTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlobalType_Sender()
  {
    return (EAttribute)globalTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlobalType_Receiver()
  {
    return (EAttribute)globalTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobalType_Branches()
  {
    return (EReference)globalTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBranchGType()
  {
    return branchGTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBranchGType_Operation()
  {
    return (EAttribute)branchGTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBranchGType_DataType()
  {
    return (EReference)branchGTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBranchGType_Continuation()
  {
    return (EReference)branchGTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataType()
  {
    return dataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicType()
  {
    return basicTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBasicType_Name()
  {
    return (EAttribute)basicTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalType()
  {
    return localTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBranchType()
  {
    return branchTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBranchType_Label()
  {
    return (EAttribute)branchTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChoreography()
  {
    return choreographyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStart()
  {
    return startEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStart_ActiveThreads()
  {
    return (EReference)startEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStart_ServiceThreads()
  {
    return (EReference)startEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStart_PublicChannel()
  {
    return (EReference)startEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStart_Session()
  {
    return (EAttribute)startEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStart_Continuation()
  {
    return (EReference)startEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getThreadWithRole()
  {
    return threadWithRoleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getThreadWithRole_Thread()
  {
    return (EAttribute)threadWithRoleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getThreadWithRole_Role()
  {
    return (EAttribute)threadWithRoleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteraction()
  {
    return interactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteraction_Sender()
  {
    return (EAttribute)interactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteraction_SenderExpression()
  {
    return (EReference)interactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteraction_Receiver()
  {
    return (EAttribute)interactionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteraction_ReceiverVariable()
  {
    return (EAttribute)interactionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteraction_Operation()
  {
    return (EAttribute)interactionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteraction_Session()
  {
    return (EAttribute)interactionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteraction_Continuation()
  {
    return (EReference)interactionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfThenElse()
  {
    return ifThenElseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfThenElse_Condition()
  {
    return (EReference)ifThenElseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIfThenElse_Thread()
  {
    return (EAttribute)ifThenElseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfThenElse_Then()
  {
    return (EReference)ifThenElseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfThenElse_Else()
  {
    return (EReference)ifThenElseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_SumExpression()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSumExpression()
  {
    return sumExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSumExpression_Children()
  {
    return (EReference)sumExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSumExpressionTerm()
  {
    return sumExpressionTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSumExpressionTerm_Expression()
  {
    return (EReference)sumExpressionTermEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionBasicTerm()
  {
    return expressionBasicTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressionBasicTerm_Variable()
  {
    return (EAttribute)expressionBasicTermEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionBasicTerm_Constant()
  {
    return (EReference)expressionBasicTermEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_IntValue()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_StrValue()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_CompareCondition()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompareCondition()
  {
    return compareConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompareCondition_LeftExpression()
  {
    return (EReference)compareConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCompareCondition_Operator()
  {
    return (EAttribute)compareConditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompareCondition_RightExpression()
  {
    return (EReference)compareConditionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputType()
  {
    return outputTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputType_Datatype()
  {
    return (EReference)outputTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputType_Continuation()
  {
    return (EReference)outputTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputType()
  {
    return inputTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputType_Datatype()
  {
    return (EReference)inputTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputType_Continuation()
  {
    return (EReference)inputTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBranchingType()
  {
    return branchingTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBranchingType_Branches()
  {
    return (EReference)branchingTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectionType()
  {
    return selectionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionType_Branches()
  {
    return (EReference)selectionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSumExpressionAddTerm()
  {
    return sumExpressionAddTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSumExpressionSubtractTerm()
  {
    return sumExpressionSubtractTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChorFactory getChorFactory()
  {
    return (ChorFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    programEClass = createEClass(PROGRAM);
    createEAttribute(programEClass, PROGRAM__NAME);
    createEReference(programEClass, PROGRAM__PREAMBLE);
    createEReference(programEClass, PROGRAM__CHOREOGRAPHY);

    preambleEClass = createEClass(PREAMBLE);
    createEReference(preambleEClass, PREAMBLE__PROTOCOLS);
    createEReference(preambleEClass, PREAMBLE__SITE);

    protocolEClass = createEClass(PROTOCOL);
    createEAttribute(protocolEClass, PROTOCOL__NAME);
    createEReference(protocolEClass, PROTOCOL__TYPE);

    siteEClass = createEClass(SITE);
    createEAttribute(siteEClass, SITE__NAME);
    createEReference(siteEClass, SITE__PROTOCOL);

    globalTypeEClass = createEClass(GLOBAL_TYPE);
    createEAttribute(globalTypeEClass, GLOBAL_TYPE__SENDER);
    createEAttribute(globalTypeEClass, GLOBAL_TYPE__RECEIVER);
    createEReference(globalTypeEClass, GLOBAL_TYPE__BRANCHES);

    branchGTypeEClass = createEClass(BRANCH_GTYPE);
    createEAttribute(branchGTypeEClass, BRANCH_GTYPE__OPERATION);
    createEReference(branchGTypeEClass, BRANCH_GTYPE__DATA_TYPE);
    createEReference(branchGTypeEClass, BRANCH_GTYPE__CONTINUATION);

    dataTypeEClass = createEClass(DATA_TYPE);

    basicTypeEClass = createEClass(BASIC_TYPE);
    createEAttribute(basicTypeEClass, BASIC_TYPE__NAME);

    localTypeEClass = createEClass(LOCAL_TYPE);

    branchTypeEClass = createEClass(BRANCH_TYPE);
    createEAttribute(branchTypeEClass, BRANCH_TYPE__LABEL);

    choreographyEClass = createEClass(CHOREOGRAPHY);

    startEClass = createEClass(START);
    createEReference(startEClass, START__ACTIVE_THREADS);
    createEReference(startEClass, START__SERVICE_THREADS);
    createEReference(startEClass, START__PUBLIC_CHANNEL);
    createEAttribute(startEClass, START__SESSION);
    createEReference(startEClass, START__CONTINUATION);

    threadWithRoleEClass = createEClass(THREAD_WITH_ROLE);
    createEAttribute(threadWithRoleEClass, THREAD_WITH_ROLE__THREAD);
    createEAttribute(threadWithRoleEClass, THREAD_WITH_ROLE__ROLE);

    interactionEClass = createEClass(INTERACTION);
    createEAttribute(interactionEClass, INTERACTION__SENDER);
    createEReference(interactionEClass, INTERACTION__SENDER_EXPRESSION);
    createEAttribute(interactionEClass, INTERACTION__RECEIVER);
    createEAttribute(interactionEClass, INTERACTION__RECEIVER_VARIABLE);
    createEAttribute(interactionEClass, INTERACTION__OPERATION);
    createEAttribute(interactionEClass, INTERACTION__SESSION);
    createEReference(interactionEClass, INTERACTION__CONTINUATION);

    ifThenElseEClass = createEClass(IF_THEN_ELSE);
    createEReference(ifThenElseEClass, IF_THEN_ELSE__CONDITION);
    createEAttribute(ifThenElseEClass, IF_THEN_ELSE__THREAD);
    createEReference(ifThenElseEClass, IF_THEN_ELSE__THEN);
    createEReference(ifThenElseEClass, IF_THEN_ELSE__ELSE);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__SUM_EXPRESSION);

    sumExpressionEClass = createEClass(SUM_EXPRESSION);
    createEReference(sumExpressionEClass, SUM_EXPRESSION__CHILDREN);

    sumExpressionTermEClass = createEClass(SUM_EXPRESSION_TERM);
    createEReference(sumExpressionTermEClass, SUM_EXPRESSION_TERM__EXPRESSION);

    expressionBasicTermEClass = createEClass(EXPRESSION_BASIC_TERM);
    createEAttribute(expressionBasicTermEClass, EXPRESSION_BASIC_TERM__VARIABLE);
    createEReference(expressionBasicTermEClass, EXPRESSION_BASIC_TERM__CONSTANT);

    constantEClass = createEClass(CONSTANT);
    createEAttribute(constantEClass, CONSTANT__INT_VALUE);
    createEAttribute(constantEClass, CONSTANT__STR_VALUE);

    conditionEClass = createEClass(CONDITION);
    createEReference(conditionEClass, CONDITION__COMPARE_CONDITION);

    compareConditionEClass = createEClass(COMPARE_CONDITION);
    createEReference(compareConditionEClass, COMPARE_CONDITION__LEFT_EXPRESSION);
    createEAttribute(compareConditionEClass, COMPARE_CONDITION__OPERATOR);
    createEReference(compareConditionEClass, COMPARE_CONDITION__RIGHT_EXPRESSION);

    outputTypeEClass = createEClass(OUTPUT_TYPE);
    createEReference(outputTypeEClass, OUTPUT_TYPE__DATATYPE);
    createEReference(outputTypeEClass, OUTPUT_TYPE__CONTINUATION);

    inputTypeEClass = createEClass(INPUT_TYPE);
    createEReference(inputTypeEClass, INPUT_TYPE__DATATYPE);
    createEReference(inputTypeEClass, INPUT_TYPE__CONTINUATION);

    branchingTypeEClass = createEClass(BRANCHING_TYPE);
    createEReference(branchingTypeEClass, BRANCHING_TYPE__BRANCHES);

    selectionTypeEClass = createEClass(SELECTION_TYPE);
    createEReference(selectionTypeEClass, SELECTION_TYPE__BRANCHES);

    sumExpressionAddTermEClass = createEClass(SUM_EXPRESSION_ADD_TERM);

    sumExpressionSubtractTermEClass = createEClass(SUM_EXPRESSION_SUBTRACT_TERM);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    basicTypeEClass.getESuperTypes().add(this.getDataType());
    localTypeEClass.getESuperTypes().add(this.getDataType());
    localTypeEClass.getESuperTypes().add(this.getBranchType());
    startEClass.getESuperTypes().add(this.getChoreography());
    interactionEClass.getESuperTypes().add(this.getChoreography());
    ifThenElseEClass.getESuperTypes().add(this.getChoreography());
    outputTypeEClass.getESuperTypes().add(this.getLocalType());
    inputTypeEClass.getESuperTypes().add(this.getLocalType());
    branchingTypeEClass.getESuperTypes().add(this.getLocalType());
    selectionTypeEClass.getESuperTypes().add(this.getLocalType());
    sumExpressionAddTermEClass.getESuperTypes().add(this.getSumExpressionTerm());
    sumExpressionSubtractTermEClass.getESuperTypes().add(this.getSumExpressionTerm());

    // Initialize classes and features; add operations and parameters
    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Preamble(), this.getPreamble(), null, "preamble", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Choreography(), this.getChoreography(), null, "choreography", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preambleEClass, Preamble.class, "Preamble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPreamble_Protocols(), this.getProtocol(), null, "protocols", null, 0, -1, Preamble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPreamble_Site(), this.getSite(), null, "site", null, 0, -1, Preamble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(protocolEClass, Protocol.class, "Protocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProtocol_Name(), ecorePackage.getEString(), "name", null, 0, 1, Protocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProtocol_Type(), this.getGlobalType(), null, "type", null, 0, 1, Protocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(siteEClass, Site.class, "Site", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSite_Name(), ecorePackage.getEString(), "name", null, 0, 1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSite_Protocol(), this.getProtocol(), null, "protocol", null, 0, 1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(globalTypeEClass, GlobalType.class, "GlobalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGlobalType_Sender(), ecorePackage.getEString(), "sender", null, 0, 1, GlobalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlobalType_Receiver(), ecorePackage.getEString(), "receiver", null, 0, 1, GlobalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobalType_Branches(), this.getBranchGType(), null, "branches", null, 0, -1, GlobalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(branchGTypeEClass, BranchGType.class, "BranchGType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBranchGType_Operation(), ecorePackage.getEString(), "operation", null, 0, 1, BranchGType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBranchGType_DataType(), this.getDataType(), null, "dataType", null, 0, 1, BranchGType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBranchGType_Continuation(), this.getGlobalType(), null, "continuation", null, 0, 1, BranchGType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(basicTypeEClass, BasicType.class, "BasicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBasicType_Name(), ecorePackage.getEString(), "name", null, 0, 1, BasicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localTypeEClass, LocalType.class, "LocalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(branchTypeEClass, BranchType.class, "BranchType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBranchType_Label(), ecorePackage.getEString(), "label", null, 0, 1, BranchType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(choreographyEClass, Choreography.class, "Choreography", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStart_ActiveThreads(), this.getThreadWithRole(), null, "activeThreads", null, 0, -1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStart_ServiceThreads(), this.getThreadWithRole(), null, "serviceThreads", null, 0, -1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStart_PublicChannel(), this.getSite(), null, "publicChannel", null, 0, 1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStart_Session(), ecorePackage.getEString(), "session", null, 0, 1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStart_Continuation(), this.getChoreography(), null, "continuation", null, 0, 1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(threadWithRoleEClass, ThreadWithRole.class, "ThreadWithRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getThreadWithRole_Thread(), ecorePackage.getEString(), "thread", null, 0, 1, ThreadWithRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getThreadWithRole_Role(), ecorePackage.getEString(), "role", null, 0, 1, ThreadWithRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInteraction_Sender(), ecorePackage.getEString(), "sender", null, 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteraction_SenderExpression(), this.getExpression(), null, "senderExpression", null, 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInteraction_Receiver(), ecorePackage.getEString(), "receiver", null, 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInteraction_ReceiverVariable(), ecorePackage.getEString(), "receiverVariable", null, 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInteraction_Operation(), ecorePackage.getEString(), "operation", null, 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInteraction_Session(), ecorePackage.getEString(), "session", null, 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteraction_Continuation(), this.getChoreography(), null, "continuation", null, 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifThenElseEClass, IfThenElse.class, "IfThenElse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfThenElse_Condition(), this.getCondition(), null, "condition", null, 0, 1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIfThenElse_Thread(), ecorePackage.getEString(), "thread", null, 0, 1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfThenElse_Then(), this.getChoreography(), null, "then", null, 0, 1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfThenElse_Else(), this.getChoreography(), null, "else", null, 0, 1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_SumExpression(), this.getSumExpression(), null, "sumExpression", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sumExpressionEClass, SumExpression.class, "SumExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSumExpression_Children(), ecorePackage.getEObject(), null, "children", null, 0, -1, SumExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sumExpressionTermEClass, SumExpressionTerm.class, "SumExpressionTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSumExpressionTerm_Expression(), this.getExpressionBasicTerm(), null, "expression", null, 0, 1, SumExpressionTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionBasicTermEClass, ExpressionBasicTerm.class, "ExpressionBasicTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpressionBasicTerm_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, ExpressionBasicTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionBasicTerm_Constant(), this.getConstant(), null, "constant", null, 0, 1, ExpressionBasicTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstant_IntValue(), ecorePackage.getEInt(), "intValue", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstant_StrValue(), ecorePackage.getEString(), "strValue", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCondition_CompareCondition(), this.getCompareCondition(), null, "compareCondition", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compareConditionEClass, CompareCondition.class, "CompareCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompareCondition_LeftExpression(), this.getExpression(), null, "leftExpression", null, 0, 1, CompareCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCompareCondition_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, CompareCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompareCondition_RightExpression(), this.getExpression(), null, "rightExpression", null, 0, 1, CompareCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputTypeEClass, OutputType.class, "OutputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutputType_Datatype(), this.getDataType(), null, "datatype", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutputType_Continuation(), this.getLocalType(), null, "continuation", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputTypeEClass, InputType.class, "InputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInputType_Datatype(), this.getDataType(), null, "datatype", null, 0, 1, InputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputType_Continuation(), this.getLocalType(), null, "continuation", null, 0, 1, InputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(branchingTypeEClass, BranchingType.class, "BranchingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBranchingType_Branches(), this.getBranchType(), null, "branches", null, 0, -1, BranchingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectionTypeEClass, SelectionType.class, "SelectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectionType_Branches(), this.getBranchType(), null, "branches", null, 0, -1, SelectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sumExpressionAddTermEClass, SumExpressionAddTerm.class, "SumExpressionAddTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sumExpressionSubtractTermEClass, SumExpressionSubtractTerm.class, "SumExpressionSubtractTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //ChorPackageImpl
