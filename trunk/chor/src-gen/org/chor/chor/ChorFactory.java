/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.chor.chor.ChorPackage
 * @generated
 */
public interface ChorFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ChorFactory eINSTANCE = org.chor.chor.impl.ChorFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>Preamble</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Preamble</em>'.
   * @generated
   */
  Preamble createPreamble();

  /**
   * Returns a new object of class '<em>Protocol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protocol</em>'.
   * @generated
   */
  Protocol createProtocol();

  /**
   * Returns a new object of class '<em>Site</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Site</em>'.
   * @generated
   */
  Site createSite();

  /**
   * Returns a new object of class '<em>Global Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Type</em>'.
   * @generated
   */
  GlobalType createGlobalType();

  /**
   * Returns a new object of class '<em>Branch GType</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Branch GType</em>'.
   * @generated
   */
  BranchGType createBranchGType();

  /**
   * Returns a new object of class '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type</em>'.
   * @generated
   */
  DataType createDataType();

  /**
   * Returns a new object of class '<em>Basic Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Type</em>'.
   * @generated
   */
  BasicType createBasicType();

  /**
   * Returns a new object of class '<em>Local Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Type</em>'.
   * @generated
   */
  LocalType createLocalType();

  /**
   * Returns a new object of class '<em>Branch Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Branch Type</em>'.
   * @generated
   */
  BranchType createBranchType();

  /**
   * Returns a new object of class '<em>Choreography</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Choreography</em>'.
   * @generated
   */
  Choreography createChoreography();

  /**
   * Returns a new object of class '<em>Start</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start</em>'.
   * @generated
   */
  Start createStart();

  /**
   * Returns a new object of class '<em>Thread With Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Thread With Role</em>'.
   * @generated
   */
  ThreadWithRole createThreadWithRole();

  /**
   * Returns a new object of class '<em>Interaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interaction</em>'.
   * @generated
   */
  Interaction createInteraction();

  /**
   * Returns a new object of class '<em>If Then Else</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Then Else</em>'.
   * @generated
   */
  IfThenElse createIfThenElse();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Sum Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum Expression</em>'.
   * @generated
   */
  SumExpression createSumExpression();

  /**
   * Returns a new object of class '<em>Sum Expression Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum Expression Term</em>'.
   * @generated
   */
  SumExpressionTerm createSumExpressionTerm();

  /**
   * Returns a new object of class '<em>Expression Basic Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Basic Term</em>'.
   * @generated
   */
  ExpressionBasicTerm createExpressionBasicTerm();

  /**
   * Returns a new object of class '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant</em>'.
   * @generated
   */
  Constant createConstant();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Compare Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compare Condition</em>'.
   * @generated
   */
  CompareCondition createCompareCondition();

  /**
   * Returns a new object of class '<em>Output Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Type</em>'.
   * @generated
   */
  OutputType createOutputType();

  /**
   * Returns a new object of class '<em>Input Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Type</em>'.
   * @generated
   */
  InputType createInputType();

  /**
   * Returns a new object of class '<em>Branching Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Branching Type</em>'.
   * @generated
   */
  BranchingType createBranchingType();

  /**
   * Returns a new object of class '<em>Selection Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selection Type</em>'.
   * @generated
   */
  SelectionType createSelectionType();

  /**
   * Returns a new object of class '<em>Sum Expression Add Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum Expression Add Term</em>'.
   * @generated
   */
  SumExpressionAddTerm createSumExpressionAddTerm();

  /**
   * Returns a new object of class '<em>Sum Expression Subtract Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum Expression Subtract Term</em>'.
   * @generated
   */
  SumExpressionSubtractTerm createSumExpressionSubtractTerm();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ChorPackage getChorPackage();

} //ChorFactory
