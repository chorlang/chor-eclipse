/**
 * <copyright>
 * </copyright>
 *
 */
package org.chor.chor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.chor.chor.ChorFactory
 * @model kind="package"
 * @generated
 */
public interface ChorPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "chor";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.chor-lang.org/Chor";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "chor";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ChorPackage eINSTANCE = org.chor.chor.impl.ChorPackageImpl.init();

  /**
   * The meta object id for the '{@link org.chor.chor.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.ProgramImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Preamble</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PREAMBLE = 1;

  /**
   * The feature id for the '<em><b>Choreography</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__CHOREOGRAPHY = 2;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.PreambleImpl <em>Preamble</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.PreambleImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getPreamble()
   * @generated
   */
  int PREAMBLE = 1;

  /**
   * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREAMBLE__PROTOCOLS = 0;

  /**
   * The feature id for the '<em><b>Site</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREAMBLE__SITE = 1;

  /**
   * The number of structural features of the '<em>Preamble</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREAMBLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.ProtocolImpl <em>Protocol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.ProtocolImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getProtocol()
   * @generated
   */
  int PROTOCOL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__TYPE = 1;

  /**
   * The number of structural features of the '<em>Protocol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.SiteImpl <em>Site</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.SiteImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getSite()
   * @generated
   */
  int SITE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE__NAME = 0;

  /**
   * The feature id for the '<em><b>Protocol</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE__PROTOCOL = 1;

  /**
   * The number of structural features of the '<em>Site</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.GlobalTypeImpl <em>Global Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.GlobalTypeImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getGlobalType()
   * @generated
   */
  int GLOBAL_TYPE = 4;

  /**
   * The feature id for the '<em><b>Sender</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_TYPE__SENDER = 0;

  /**
   * The feature id for the '<em><b>Receiver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_TYPE__RECEIVER = 1;

  /**
   * The feature id for the '<em><b>Branches</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_TYPE__BRANCHES = 2;

  /**
   * The number of structural features of the '<em>Global Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.BranchGTypeImpl <em>Branch GType</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.BranchGTypeImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getBranchGType()
   * @generated
   */
  int BRANCH_GTYPE = 5;

  /**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_GTYPE__OPERATION = 0;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_GTYPE__DATA_TYPE = 1;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_GTYPE__CONTINUATION = 2;

  /**
   * The number of structural features of the '<em>Branch GType</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_GTYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.DataTypeImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 6;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.BasicTypeImpl <em>Basic Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.BasicTypeImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getBasicType()
   * @generated
   */
  int BASIC_TYPE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__NAME = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Basic Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.LocalTypeImpl <em>Local Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.LocalTypeImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getLocalType()
   * @generated
   */
  int LOCAL_TYPE = 8;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_TYPE__LABEL = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.BranchTypeImpl <em>Branch Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.BranchTypeImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getBranchType()
   * @generated
   */
  int BRANCH_TYPE = 9;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_TYPE__LABEL = 0;

  /**
   * The number of structural features of the '<em>Branch Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.ChoreographyImpl <em>Choreography</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.ChoreographyImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getChoreography()
   * @generated
   */
  int CHOREOGRAPHY = 10;

  /**
   * The number of structural features of the '<em>Choreography</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOREOGRAPHY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.StartImpl <em>Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.StartImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getStart()
   * @generated
   */
  int START = 11;

  /**
   * The feature id for the '<em><b>Active Threads</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START__ACTIVE_THREADS = CHOREOGRAPHY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Service Threads</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START__SERVICE_THREADS = CHOREOGRAPHY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Public Channel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START__PUBLIC_CHANNEL = CHOREOGRAPHY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Session</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START__SESSION = CHOREOGRAPHY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START__CONTINUATION = CHOREOGRAPHY_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_FEATURE_COUNT = CHOREOGRAPHY_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.ThreadWithRoleImpl <em>Thread With Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.ThreadWithRoleImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getThreadWithRole()
   * @generated
   */
  int THREAD_WITH_ROLE = 12;

  /**
   * The feature id for the '<em><b>Thread</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THREAD_WITH_ROLE__THREAD = 0;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THREAD_WITH_ROLE__ROLE = 1;

  /**
   * The number of structural features of the '<em>Thread With Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THREAD_WITH_ROLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.InteractionImpl <em>Interaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.InteractionImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getInteraction()
   * @generated
   */
  int INTERACTION = 13;

  /**
   * The feature id for the '<em><b>Sender</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__SENDER = CHOREOGRAPHY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sender Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__SENDER_EXPRESSION = CHOREOGRAPHY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Receiver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__RECEIVER = CHOREOGRAPHY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Receiver Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__RECEIVER_VARIABLE = CHOREOGRAPHY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__OPERATION = CHOREOGRAPHY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Session</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__SESSION = CHOREOGRAPHY_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__CONTINUATION = CHOREOGRAPHY_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Interaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FEATURE_COUNT = CHOREOGRAPHY_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.IfThenElseImpl <em>If Then Else</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.IfThenElseImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getIfThenElse()
   * @generated
   */
  int IF_THEN_ELSE = 14;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__CONDITION = CHOREOGRAPHY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Thread</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__THREAD = CHOREOGRAPHY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__THEN = CHOREOGRAPHY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__ELSE = CHOREOGRAPHY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>If Then Else</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_FEATURE_COUNT = CHOREOGRAPHY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.ExpressionImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 15;

  /**
   * The feature id for the '<em><b>Sum Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__SUM_EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.SumExpressionImpl <em>Sum Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.SumExpressionImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getSumExpression()
   * @generated
   */
  int SUM_EXPRESSION = 16;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION__CHILDREN = 0;

  /**
   * The number of structural features of the '<em>Sum Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.SumExpressionTermImpl <em>Sum Expression Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.SumExpressionTermImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getSumExpressionTerm()
   * @generated
   */
  int SUM_EXPRESSION_TERM = 17;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION_TERM__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Sum Expression Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION_TERM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.ExpressionBasicTermImpl <em>Expression Basic Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.ExpressionBasicTermImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getExpressionBasicTerm()
   * @generated
   */
  int EXPRESSION_BASIC_TERM = 18;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BASIC_TERM__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BASIC_TERM__CONSTANT = 1;

  /**
   * The number of structural features of the '<em>Expression Basic Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BASIC_TERM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.ConstantImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 19;

  /**
   * The feature id for the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__INT_VALUE = 0;

  /**
   * The feature id for the '<em><b>Str Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__STR_VALUE = 1;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.ConditionImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 20;

  /**
   * The feature id for the '<em><b>Compare Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__COMPARE_CONDITION = 0;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.CompareConditionImpl <em>Compare Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.CompareConditionImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getCompareCondition()
   * @generated
   */
  int COMPARE_CONDITION = 21;

  /**
   * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_CONDITION__LEFT_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_CONDITION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_CONDITION__RIGHT_EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Compare Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_CONDITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.OutputTypeImpl <em>Output Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.OutputTypeImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getOutputType()
   * @generated
   */
  int OUTPUT_TYPE = 22;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TYPE__LABEL = LOCAL_TYPE__LABEL;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TYPE__DATATYPE = LOCAL_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TYPE__CONTINUATION = LOCAL_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Output Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TYPE_FEATURE_COUNT = LOCAL_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.InputTypeImpl <em>Input Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.InputTypeImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getInputType()
   * @generated
   */
  int INPUT_TYPE = 23;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TYPE__LABEL = LOCAL_TYPE__LABEL;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TYPE__DATATYPE = LOCAL_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TYPE__CONTINUATION = LOCAL_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Input Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TYPE_FEATURE_COUNT = LOCAL_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.BranchingTypeImpl <em>Branching Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.BranchingTypeImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getBranchingType()
   * @generated
   */
  int BRANCHING_TYPE = 24;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCHING_TYPE__LABEL = LOCAL_TYPE__LABEL;

  /**
   * The feature id for the '<em><b>Branches</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCHING_TYPE__BRANCHES = LOCAL_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Branching Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCHING_TYPE_FEATURE_COUNT = LOCAL_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.SelectionTypeImpl <em>Selection Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.SelectionTypeImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getSelectionType()
   * @generated
   */
  int SELECTION_TYPE = 25;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_TYPE__LABEL = LOCAL_TYPE__LABEL;

  /**
   * The feature id for the '<em><b>Branches</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_TYPE__BRANCHES = LOCAL_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Selection Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_TYPE_FEATURE_COUNT = LOCAL_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.SumExpressionAddTermImpl <em>Sum Expression Add Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.SumExpressionAddTermImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getSumExpressionAddTerm()
   * @generated
   */
  int SUM_EXPRESSION_ADD_TERM = 26;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION_ADD_TERM__EXPRESSION = SUM_EXPRESSION_TERM__EXPRESSION;

  /**
   * The number of structural features of the '<em>Sum Expression Add Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION_ADD_TERM_FEATURE_COUNT = SUM_EXPRESSION_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.chor.chor.impl.SumExpressionSubtractTermImpl <em>Sum Expression Subtract Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.chor.chor.impl.SumExpressionSubtractTermImpl
   * @see org.chor.chor.impl.ChorPackageImpl#getSumExpressionSubtractTerm()
   * @generated
   */
  int SUM_EXPRESSION_SUBTRACT_TERM = 27;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION_SUBTRACT_TERM__EXPRESSION = SUM_EXPRESSION_TERM__EXPRESSION;

  /**
   * The number of structural features of the '<em>Sum Expression Subtract Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION_SUBTRACT_TERM_FEATURE_COUNT = SUM_EXPRESSION_TERM_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.chor.chor.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see org.chor.chor.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.Program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.chor.chor.Program#getName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.Program#getPreamble <em>Preamble</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Preamble</em>'.
   * @see org.chor.chor.Program#getPreamble()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Preamble();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.Program#getChoreography <em>Choreography</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Choreography</em>'.
   * @see org.chor.chor.Program#getChoreography()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Choreography();

  /**
   * Returns the meta object for class '{@link org.chor.chor.Preamble <em>Preamble</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Preamble</em>'.
   * @see org.chor.chor.Preamble
   * @generated
   */
  EClass getPreamble();

  /**
   * Returns the meta object for the containment reference list '{@link org.chor.chor.Preamble#getProtocols <em>Protocols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Protocols</em>'.
   * @see org.chor.chor.Preamble#getProtocols()
   * @see #getPreamble()
   * @generated
   */
  EReference getPreamble_Protocols();

  /**
   * Returns the meta object for the containment reference list '{@link org.chor.chor.Preamble#getSite <em>Site</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Site</em>'.
   * @see org.chor.chor.Preamble#getSite()
   * @see #getPreamble()
   * @generated
   */
  EReference getPreamble_Site();

  /**
   * Returns the meta object for class '{@link org.chor.chor.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protocol</em>'.
   * @see org.chor.chor.Protocol
   * @generated
   */
  EClass getProtocol();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.Protocol#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.chor.chor.Protocol#getName()
   * @see #getProtocol()
   * @generated
   */
  EAttribute getProtocol_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.Protocol#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.chor.chor.Protocol#getType()
   * @see #getProtocol()
   * @generated
   */
  EReference getProtocol_Type();

  /**
   * Returns the meta object for class '{@link org.chor.chor.Site <em>Site</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Site</em>'.
   * @see org.chor.chor.Site
   * @generated
   */
  EClass getSite();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.Site#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.chor.chor.Site#getName()
   * @see #getSite()
   * @generated
   */
  EAttribute getSite_Name();

  /**
   * Returns the meta object for the reference '{@link org.chor.chor.Site#getProtocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Protocol</em>'.
   * @see org.chor.chor.Site#getProtocol()
   * @see #getSite()
   * @generated
   */
  EReference getSite_Protocol();

  /**
   * Returns the meta object for class '{@link org.chor.chor.GlobalType <em>Global Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Type</em>'.
   * @see org.chor.chor.GlobalType
   * @generated
   */
  EClass getGlobalType();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.GlobalType#getSender <em>Sender</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sender</em>'.
   * @see org.chor.chor.GlobalType#getSender()
   * @see #getGlobalType()
   * @generated
   */
  EAttribute getGlobalType_Sender();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.GlobalType#getReceiver <em>Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Receiver</em>'.
   * @see org.chor.chor.GlobalType#getReceiver()
   * @see #getGlobalType()
   * @generated
   */
  EAttribute getGlobalType_Receiver();

  /**
   * Returns the meta object for the containment reference list '{@link org.chor.chor.GlobalType#getBranches <em>Branches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Branches</em>'.
   * @see org.chor.chor.GlobalType#getBranches()
   * @see #getGlobalType()
   * @generated
   */
  EReference getGlobalType_Branches();

  /**
   * Returns the meta object for class '{@link org.chor.chor.BranchGType <em>Branch GType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Branch GType</em>'.
   * @see org.chor.chor.BranchGType
   * @generated
   */
  EClass getBranchGType();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.BranchGType#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see org.chor.chor.BranchGType#getOperation()
   * @see #getBranchGType()
   * @generated
   */
  EAttribute getBranchGType_Operation();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.BranchGType#getDataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Type</em>'.
   * @see org.chor.chor.BranchGType#getDataType()
   * @see #getBranchGType()
   * @generated
   */
  EReference getBranchGType_DataType();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.BranchGType#getContinuation <em>Continuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Continuation</em>'.
   * @see org.chor.chor.BranchGType#getContinuation()
   * @see #getBranchGType()
   * @generated
   */
  EReference getBranchGType_Continuation();

  /**
   * Returns the meta object for class '{@link org.chor.chor.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see org.chor.chor.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for class '{@link org.chor.chor.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Type</em>'.
   * @see org.chor.chor.BasicType
   * @generated
   */
  EClass getBasicType();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.BasicType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.chor.chor.BasicType#getName()
   * @see #getBasicType()
   * @generated
   */
  EAttribute getBasicType_Name();

  /**
   * Returns the meta object for class '{@link org.chor.chor.LocalType <em>Local Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Type</em>'.
   * @see org.chor.chor.LocalType
   * @generated
   */
  EClass getLocalType();

  /**
   * Returns the meta object for class '{@link org.chor.chor.BranchType <em>Branch Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Branch Type</em>'.
   * @see org.chor.chor.BranchType
   * @generated
   */
  EClass getBranchType();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.BranchType#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.chor.chor.BranchType#getLabel()
   * @see #getBranchType()
   * @generated
   */
  EAttribute getBranchType_Label();

  /**
   * Returns the meta object for class '{@link org.chor.chor.Choreography <em>Choreography</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choreography</em>'.
   * @see org.chor.chor.Choreography
   * @generated
   */
  EClass getChoreography();

  /**
   * Returns the meta object for class '{@link org.chor.chor.Start <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start</em>'.
   * @see org.chor.chor.Start
   * @generated
   */
  EClass getStart();

  /**
   * Returns the meta object for the containment reference list '{@link org.chor.chor.Start#getActiveThreads <em>Active Threads</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Active Threads</em>'.
   * @see org.chor.chor.Start#getActiveThreads()
   * @see #getStart()
   * @generated
   */
  EReference getStart_ActiveThreads();

  /**
   * Returns the meta object for the containment reference list '{@link org.chor.chor.Start#getServiceThreads <em>Service Threads</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service Threads</em>'.
   * @see org.chor.chor.Start#getServiceThreads()
   * @see #getStart()
   * @generated
   */
  EReference getStart_ServiceThreads();

  /**
   * Returns the meta object for the reference '{@link org.chor.chor.Start#getPublicChannel <em>Public Channel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Public Channel</em>'.
   * @see org.chor.chor.Start#getPublicChannel()
   * @see #getStart()
   * @generated
   */
  EReference getStart_PublicChannel();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.Start#getSession <em>Session</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Session</em>'.
   * @see org.chor.chor.Start#getSession()
   * @see #getStart()
   * @generated
   */
  EAttribute getStart_Session();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.Start#getContinuation <em>Continuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Continuation</em>'.
   * @see org.chor.chor.Start#getContinuation()
   * @see #getStart()
   * @generated
   */
  EReference getStart_Continuation();

  /**
   * Returns the meta object for class '{@link org.chor.chor.ThreadWithRole <em>Thread With Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Thread With Role</em>'.
   * @see org.chor.chor.ThreadWithRole
   * @generated
   */
  EClass getThreadWithRole();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.ThreadWithRole#getThread <em>Thread</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Thread</em>'.
   * @see org.chor.chor.ThreadWithRole#getThread()
   * @see #getThreadWithRole()
   * @generated
   */
  EAttribute getThreadWithRole_Thread();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.ThreadWithRole#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Role</em>'.
   * @see org.chor.chor.ThreadWithRole#getRole()
   * @see #getThreadWithRole()
   * @generated
   */
  EAttribute getThreadWithRole_Role();

  /**
   * Returns the meta object for class '{@link org.chor.chor.Interaction <em>Interaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction</em>'.
   * @see org.chor.chor.Interaction
   * @generated
   */
  EClass getInteraction();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.Interaction#getSender <em>Sender</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sender</em>'.
   * @see org.chor.chor.Interaction#getSender()
   * @see #getInteraction()
   * @generated
   */
  EAttribute getInteraction_Sender();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.Interaction#getSenderExpression <em>Sender Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sender Expression</em>'.
   * @see org.chor.chor.Interaction#getSenderExpression()
   * @see #getInteraction()
   * @generated
   */
  EReference getInteraction_SenderExpression();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.Interaction#getReceiver <em>Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Receiver</em>'.
   * @see org.chor.chor.Interaction#getReceiver()
   * @see #getInteraction()
   * @generated
   */
  EAttribute getInteraction_Receiver();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.Interaction#getReceiverVariable <em>Receiver Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Receiver Variable</em>'.
   * @see org.chor.chor.Interaction#getReceiverVariable()
   * @see #getInteraction()
   * @generated
   */
  EAttribute getInteraction_ReceiverVariable();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.Interaction#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see org.chor.chor.Interaction#getOperation()
   * @see #getInteraction()
   * @generated
   */
  EAttribute getInteraction_Operation();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.Interaction#getSession <em>Session</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Session</em>'.
   * @see org.chor.chor.Interaction#getSession()
   * @see #getInteraction()
   * @generated
   */
  EAttribute getInteraction_Session();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.Interaction#getContinuation <em>Continuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Continuation</em>'.
   * @see org.chor.chor.Interaction#getContinuation()
   * @see #getInteraction()
   * @generated
   */
  EReference getInteraction_Continuation();

  /**
   * Returns the meta object for class '{@link org.chor.chor.IfThenElse <em>If Then Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Then Else</em>'.
   * @see org.chor.chor.IfThenElse
   * @generated
   */
  EClass getIfThenElse();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.IfThenElse#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.chor.chor.IfThenElse#getCondition()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Condition();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.IfThenElse#getThread <em>Thread</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Thread</em>'.
   * @see org.chor.chor.IfThenElse#getThread()
   * @see #getIfThenElse()
   * @generated
   */
  EAttribute getIfThenElse_Thread();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.IfThenElse#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see org.chor.chor.IfThenElse#getThen()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Then();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.IfThenElse#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see org.chor.chor.IfThenElse#getElse()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Else();

  /**
   * Returns the meta object for class '{@link org.chor.chor.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.chor.chor.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.Expression#getSumExpression <em>Sum Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sum Expression</em>'.
   * @see org.chor.chor.Expression#getSumExpression()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_SumExpression();

  /**
   * Returns the meta object for class '{@link org.chor.chor.SumExpression <em>Sum Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sum Expression</em>'.
   * @see org.chor.chor.SumExpression
   * @generated
   */
  EClass getSumExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.chor.chor.SumExpression#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.chor.chor.SumExpression#getChildren()
   * @see #getSumExpression()
   * @generated
   */
  EReference getSumExpression_Children();

  /**
   * Returns the meta object for class '{@link org.chor.chor.SumExpressionTerm <em>Sum Expression Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sum Expression Term</em>'.
   * @see org.chor.chor.SumExpressionTerm
   * @generated
   */
  EClass getSumExpressionTerm();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.SumExpressionTerm#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.chor.chor.SumExpressionTerm#getExpression()
   * @see #getSumExpressionTerm()
   * @generated
   */
  EReference getSumExpressionTerm_Expression();

  /**
   * Returns the meta object for class '{@link org.chor.chor.ExpressionBasicTerm <em>Expression Basic Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Basic Term</em>'.
   * @see org.chor.chor.ExpressionBasicTerm
   * @generated
   */
  EClass getExpressionBasicTerm();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.ExpressionBasicTerm#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.chor.chor.ExpressionBasicTerm#getVariable()
   * @see #getExpressionBasicTerm()
   * @generated
   */
  EAttribute getExpressionBasicTerm_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.ExpressionBasicTerm#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant</em>'.
   * @see org.chor.chor.ExpressionBasicTerm#getConstant()
   * @see #getExpressionBasicTerm()
   * @generated
   */
  EReference getExpressionBasicTerm_Constant();

  /**
   * Returns the meta object for class '{@link org.chor.chor.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see org.chor.chor.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.Constant#getIntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Value</em>'.
   * @see org.chor.chor.Constant#getIntValue()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_IntValue();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.Constant#getStrValue <em>Str Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Str Value</em>'.
   * @see org.chor.chor.Constant#getStrValue()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_StrValue();

  /**
   * Returns the meta object for class '{@link org.chor.chor.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.chor.chor.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.Condition#getCompareCondition <em>Compare Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Compare Condition</em>'.
   * @see org.chor.chor.Condition#getCompareCondition()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_CompareCondition();

  /**
   * Returns the meta object for class '{@link org.chor.chor.CompareCondition <em>Compare Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compare Condition</em>'.
   * @see org.chor.chor.CompareCondition
   * @generated
   */
  EClass getCompareCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.CompareCondition#getLeftExpression <em>Left Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Expression</em>'.
   * @see org.chor.chor.CompareCondition#getLeftExpression()
   * @see #getCompareCondition()
   * @generated
   */
  EReference getCompareCondition_LeftExpression();

  /**
   * Returns the meta object for the attribute '{@link org.chor.chor.CompareCondition#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.chor.chor.CompareCondition#getOperator()
   * @see #getCompareCondition()
   * @generated
   */
  EAttribute getCompareCondition_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.CompareCondition#getRightExpression <em>Right Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Expression</em>'.
   * @see org.chor.chor.CompareCondition#getRightExpression()
   * @see #getCompareCondition()
   * @generated
   */
  EReference getCompareCondition_RightExpression();

  /**
   * Returns the meta object for class '{@link org.chor.chor.OutputType <em>Output Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Type</em>'.
   * @see org.chor.chor.OutputType
   * @generated
   */
  EClass getOutputType();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.OutputType#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype</em>'.
   * @see org.chor.chor.OutputType#getDatatype()
   * @see #getOutputType()
   * @generated
   */
  EReference getOutputType_Datatype();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.OutputType#getContinuation <em>Continuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Continuation</em>'.
   * @see org.chor.chor.OutputType#getContinuation()
   * @see #getOutputType()
   * @generated
   */
  EReference getOutputType_Continuation();

  /**
   * Returns the meta object for class '{@link org.chor.chor.InputType <em>Input Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Type</em>'.
   * @see org.chor.chor.InputType
   * @generated
   */
  EClass getInputType();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.InputType#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype</em>'.
   * @see org.chor.chor.InputType#getDatatype()
   * @see #getInputType()
   * @generated
   */
  EReference getInputType_Datatype();

  /**
   * Returns the meta object for the containment reference '{@link org.chor.chor.InputType#getContinuation <em>Continuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Continuation</em>'.
   * @see org.chor.chor.InputType#getContinuation()
   * @see #getInputType()
   * @generated
   */
  EReference getInputType_Continuation();

  /**
   * Returns the meta object for class '{@link org.chor.chor.BranchingType <em>Branching Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Branching Type</em>'.
   * @see org.chor.chor.BranchingType
   * @generated
   */
  EClass getBranchingType();

  /**
   * Returns the meta object for the containment reference list '{@link org.chor.chor.BranchingType#getBranches <em>Branches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Branches</em>'.
   * @see org.chor.chor.BranchingType#getBranches()
   * @see #getBranchingType()
   * @generated
   */
  EReference getBranchingType_Branches();

  /**
   * Returns the meta object for class '{@link org.chor.chor.SelectionType <em>Selection Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection Type</em>'.
   * @see org.chor.chor.SelectionType
   * @generated
   */
  EClass getSelectionType();

  /**
   * Returns the meta object for the containment reference list '{@link org.chor.chor.SelectionType#getBranches <em>Branches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Branches</em>'.
   * @see org.chor.chor.SelectionType#getBranches()
   * @see #getSelectionType()
   * @generated
   */
  EReference getSelectionType_Branches();

  /**
   * Returns the meta object for class '{@link org.chor.chor.SumExpressionAddTerm <em>Sum Expression Add Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sum Expression Add Term</em>'.
   * @see org.chor.chor.SumExpressionAddTerm
   * @generated
   */
  EClass getSumExpressionAddTerm();

  /**
   * Returns the meta object for class '{@link org.chor.chor.SumExpressionSubtractTerm <em>Sum Expression Subtract Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sum Expression Subtract Term</em>'.
   * @see org.chor.chor.SumExpressionSubtractTerm
   * @generated
   */
  EClass getSumExpressionSubtractTerm();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ChorFactory getChorFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.chor.chor.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.ProgramImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

    /**
     * The meta object literal for the '<em><b>Preamble</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PREAMBLE = eINSTANCE.getProgram_Preamble();

    /**
     * The meta object literal for the '<em><b>Choreography</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__CHOREOGRAPHY = eINSTANCE.getProgram_Choreography();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.PreambleImpl <em>Preamble</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.PreambleImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getPreamble()
     * @generated
     */
    EClass PREAMBLE = eINSTANCE.getPreamble();

    /**
     * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREAMBLE__PROTOCOLS = eINSTANCE.getPreamble_Protocols();

    /**
     * The meta object literal for the '<em><b>Site</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREAMBLE__SITE = eINSTANCE.getPreamble_Site();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.ProtocolImpl <em>Protocol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.ProtocolImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getProtocol()
     * @generated
     */
    EClass PROTOCOL = eINSTANCE.getProtocol();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROTOCOL__NAME = eINSTANCE.getProtocol_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL__TYPE = eINSTANCE.getProtocol_Type();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.SiteImpl <em>Site</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.SiteImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getSite()
     * @generated
     */
    EClass SITE = eINSTANCE.getSite();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SITE__NAME = eINSTANCE.getSite_Name();

    /**
     * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SITE__PROTOCOL = eINSTANCE.getSite_Protocol();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.GlobalTypeImpl <em>Global Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.GlobalTypeImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getGlobalType()
     * @generated
     */
    EClass GLOBAL_TYPE = eINSTANCE.getGlobalType();

    /**
     * The meta object literal for the '<em><b>Sender</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_TYPE__SENDER = eINSTANCE.getGlobalType_Sender();

    /**
     * The meta object literal for the '<em><b>Receiver</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_TYPE__RECEIVER = eINSTANCE.getGlobalType_Receiver();

    /**
     * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_TYPE__BRANCHES = eINSTANCE.getGlobalType_Branches();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.BranchGTypeImpl <em>Branch GType</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.BranchGTypeImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getBranchGType()
     * @generated
     */
    EClass BRANCH_GTYPE = eINSTANCE.getBranchGType();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRANCH_GTYPE__OPERATION = eINSTANCE.getBranchGType_Operation();

    /**
     * The meta object literal for the '<em><b>Data Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRANCH_GTYPE__DATA_TYPE = eINSTANCE.getBranchGType_DataType();

    /**
     * The meta object literal for the '<em><b>Continuation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRANCH_GTYPE__CONTINUATION = eINSTANCE.getBranchGType_Continuation();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.DataTypeImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.BasicTypeImpl <em>Basic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.BasicTypeImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getBasicType()
     * @generated
     */
    EClass BASIC_TYPE = eINSTANCE.getBasicType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_TYPE__NAME = eINSTANCE.getBasicType_Name();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.LocalTypeImpl <em>Local Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.LocalTypeImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getLocalType()
     * @generated
     */
    EClass LOCAL_TYPE = eINSTANCE.getLocalType();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.BranchTypeImpl <em>Branch Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.BranchTypeImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getBranchType()
     * @generated
     */
    EClass BRANCH_TYPE = eINSTANCE.getBranchType();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRANCH_TYPE__LABEL = eINSTANCE.getBranchType_Label();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.ChoreographyImpl <em>Choreography</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.ChoreographyImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getChoreography()
     * @generated
     */
    EClass CHOREOGRAPHY = eINSTANCE.getChoreography();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.StartImpl <em>Start</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.StartImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getStart()
     * @generated
     */
    EClass START = eINSTANCE.getStart();

    /**
     * The meta object literal for the '<em><b>Active Threads</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START__ACTIVE_THREADS = eINSTANCE.getStart_ActiveThreads();

    /**
     * The meta object literal for the '<em><b>Service Threads</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START__SERVICE_THREADS = eINSTANCE.getStart_ServiceThreads();

    /**
     * The meta object literal for the '<em><b>Public Channel</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START__PUBLIC_CHANNEL = eINSTANCE.getStart_PublicChannel();

    /**
     * The meta object literal for the '<em><b>Session</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute START__SESSION = eINSTANCE.getStart_Session();

    /**
     * The meta object literal for the '<em><b>Continuation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START__CONTINUATION = eINSTANCE.getStart_Continuation();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.ThreadWithRoleImpl <em>Thread With Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.ThreadWithRoleImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getThreadWithRole()
     * @generated
     */
    EClass THREAD_WITH_ROLE = eINSTANCE.getThreadWithRole();

    /**
     * The meta object literal for the '<em><b>Thread</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THREAD_WITH_ROLE__THREAD = eINSTANCE.getThreadWithRole_Thread();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THREAD_WITH_ROLE__ROLE = eINSTANCE.getThreadWithRole_Role();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.InteractionImpl <em>Interaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.InteractionImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getInteraction()
     * @generated
     */
    EClass INTERACTION = eINSTANCE.getInteraction();

    /**
     * The meta object literal for the '<em><b>Sender</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION__SENDER = eINSTANCE.getInteraction_Sender();

    /**
     * The meta object literal for the '<em><b>Sender Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION__SENDER_EXPRESSION = eINSTANCE.getInteraction_SenderExpression();

    /**
     * The meta object literal for the '<em><b>Receiver</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION__RECEIVER = eINSTANCE.getInteraction_Receiver();

    /**
     * The meta object literal for the '<em><b>Receiver Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION__RECEIVER_VARIABLE = eINSTANCE.getInteraction_ReceiverVariable();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION__OPERATION = eINSTANCE.getInteraction_Operation();

    /**
     * The meta object literal for the '<em><b>Session</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION__SESSION = eINSTANCE.getInteraction_Session();

    /**
     * The meta object literal for the '<em><b>Continuation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION__CONTINUATION = eINSTANCE.getInteraction_Continuation();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.IfThenElseImpl <em>If Then Else</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.IfThenElseImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getIfThenElse()
     * @generated
     */
    EClass IF_THEN_ELSE = eINSTANCE.getIfThenElse();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__CONDITION = eINSTANCE.getIfThenElse_Condition();

    /**
     * The meta object literal for the '<em><b>Thread</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_THEN_ELSE__THREAD = eINSTANCE.getIfThenElse_Thread();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__THEN = eINSTANCE.getIfThenElse_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__ELSE = eINSTANCE.getIfThenElse_Else();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.ExpressionImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Sum Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__SUM_EXPRESSION = eINSTANCE.getExpression_SumExpression();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.SumExpressionImpl <em>Sum Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.SumExpressionImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getSumExpression()
     * @generated
     */
    EClass SUM_EXPRESSION = eINSTANCE.getSumExpression();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUM_EXPRESSION__CHILDREN = eINSTANCE.getSumExpression_Children();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.SumExpressionTermImpl <em>Sum Expression Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.SumExpressionTermImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getSumExpressionTerm()
     * @generated
     */
    EClass SUM_EXPRESSION_TERM = eINSTANCE.getSumExpressionTerm();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUM_EXPRESSION_TERM__EXPRESSION = eINSTANCE.getSumExpressionTerm_Expression();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.ExpressionBasicTermImpl <em>Expression Basic Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.ExpressionBasicTermImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getExpressionBasicTerm()
     * @generated
     */
    EClass EXPRESSION_BASIC_TERM = eINSTANCE.getExpressionBasicTerm();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_BASIC_TERM__VARIABLE = eINSTANCE.getExpressionBasicTerm_Variable();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_BASIC_TERM__CONSTANT = eINSTANCE.getExpressionBasicTerm_Constant();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.ConstantImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__INT_VALUE = eINSTANCE.getConstant_IntValue();

    /**
     * The meta object literal for the '<em><b>Str Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__STR_VALUE = eINSTANCE.getConstant_StrValue();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.ConditionImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Compare Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__COMPARE_CONDITION = eINSTANCE.getCondition_CompareCondition();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.CompareConditionImpl <em>Compare Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.CompareConditionImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getCompareCondition()
     * @generated
     */
    EClass COMPARE_CONDITION = eINSTANCE.getCompareCondition();

    /**
     * The meta object literal for the '<em><b>Left Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARE_CONDITION__LEFT_EXPRESSION = eINSTANCE.getCompareCondition_LeftExpression();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARE_CONDITION__OPERATOR = eINSTANCE.getCompareCondition_Operator();

    /**
     * The meta object literal for the '<em><b>Right Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARE_CONDITION__RIGHT_EXPRESSION = eINSTANCE.getCompareCondition_RightExpression();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.OutputTypeImpl <em>Output Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.OutputTypeImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getOutputType()
     * @generated
     */
    EClass OUTPUT_TYPE = eINSTANCE.getOutputType();

    /**
     * The meta object literal for the '<em><b>Datatype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_TYPE__DATATYPE = eINSTANCE.getOutputType_Datatype();

    /**
     * The meta object literal for the '<em><b>Continuation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_TYPE__CONTINUATION = eINSTANCE.getOutputType_Continuation();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.InputTypeImpl <em>Input Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.InputTypeImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getInputType()
     * @generated
     */
    EClass INPUT_TYPE = eINSTANCE.getInputType();

    /**
     * The meta object literal for the '<em><b>Datatype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_TYPE__DATATYPE = eINSTANCE.getInputType_Datatype();

    /**
     * The meta object literal for the '<em><b>Continuation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_TYPE__CONTINUATION = eINSTANCE.getInputType_Continuation();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.BranchingTypeImpl <em>Branching Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.BranchingTypeImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getBranchingType()
     * @generated
     */
    EClass BRANCHING_TYPE = eINSTANCE.getBranchingType();

    /**
     * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRANCHING_TYPE__BRANCHES = eINSTANCE.getBranchingType_Branches();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.SelectionTypeImpl <em>Selection Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.SelectionTypeImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getSelectionType()
     * @generated
     */
    EClass SELECTION_TYPE = eINSTANCE.getSelectionType();

    /**
     * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_TYPE__BRANCHES = eINSTANCE.getSelectionType_Branches();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.SumExpressionAddTermImpl <em>Sum Expression Add Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.SumExpressionAddTermImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getSumExpressionAddTerm()
     * @generated
     */
    EClass SUM_EXPRESSION_ADD_TERM = eINSTANCE.getSumExpressionAddTerm();

    /**
     * The meta object literal for the '{@link org.chor.chor.impl.SumExpressionSubtractTermImpl <em>Sum Expression Subtract Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.chor.chor.impl.SumExpressionSubtractTermImpl
     * @see org.chor.chor.impl.ChorPackageImpl#getSumExpressionSubtractTerm()
     * @generated
     */
    EClass SUM_EXPRESSION_SUBTRACT_TERM = eINSTANCE.getSumExpressionSubtractTerm();

  }

} //ChorPackage
