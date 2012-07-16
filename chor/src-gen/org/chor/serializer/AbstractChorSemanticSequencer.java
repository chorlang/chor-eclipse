package org.chor.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.chor.chor.BasicType;
import org.chor.chor.BranchGType;
import org.chor.chor.Call;
import org.chor.chor.ChorPackage;
import org.chor.chor.CompareCondition;
import org.chor.chor.Condition;
import org.chor.chor.ConditionOperator;
import org.chor.chor.Constant;
import org.chor.chor.Delegation;
import org.chor.chor.DelegationType;
import org.chor.chor.Expression;
import org.chor.chor.ExpressionBasicTerm;
import org.chor.chor.GlobalTypeCall;
import org.chor.chor.GlobalTypeInteraction;
import org.chor.chor.IfThenElse;
import org.chor.chor.Interaction;
import org.chor.chor.LocalAskCommand;
import org.chor.chor.LocalAssignmentCommand;
import org.chor.chor.LocalShowCommand;
import org.chor.chor.Preamble;
import org.chor.chor.Procedure;
import org.chor.chor.Program;
import org.chor.chor.Protocol;
import org.chor.chor.SessionProcedureParameter;
import org.chor.chor.Site;
import org.chor.chor.Start;
import org.chor.chor.SumExpression;
import org.chor.chor.SumExpressionAddTerm;
import org.chor.chor.SumExpressionSubtractTerm;
import org.chor.chor.ThreadWithRole;
import org.chor.services.ChorGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractChorSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected ChorGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ChorPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ChorPackage.BASIC_TYPE:
				if(context == grammarAccess.getBasicTypeRule() ||
				   context == grammarAccess.getDataTypeRule()) {
					sequence_BasicType(context, (BasicType) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.BRANCH_GTYPE:
				if(context == grammarAccess.getBranchGTypeRule()) {
					sequence_BranchGType(context, (BranchGType) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.CALL:
				if(context == grammarAccess.getCallRule() ||
				   context == grammarAccess.getChoreographyRule()) {
					sequence_Call(context, (Call) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.COMPARE_CONDITION:
				if(context == grammarAccess.getCompareConditionRule()) {
					sequence_CompareCondition(context, (CompareCondition) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.CONDITION:
				if(context == grammarAccess.getConditionRule()) {
					sequence_Condition(context, (Condition) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.CONDITION_OPERATOR:
				if(context == grammarAccess.getConditionOperatorRule()) {
					sequence_ConditionOperator(context, (ConditionOperator) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.CONSTANT:
				if(context == grammarAccess.getConstantRule()) {
					sequence_Constant(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.DELEGATION:
				if(context == grammarAccess.getChoreographyRule() ||
				   context == grammarAccess.getDelegationRule()) {
					sequence_Delegation(context, (Delegation) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.DELEGATION_TYPE:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getDelegationTypeRule()) {
					sequence_DelegationType(context, (DelegationType) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.EXPRESSION:
				if(context == grammarAccess.getExpressionRule()) {
					sequence_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.EXPRESSION_BASIC_TERM:
				if(context == grammarAccess.getExpressionBasicTermRule()) {
					sequence_ExpressionBasicTerm(context, (ExpressionBasicTerm) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.GLOBAL_TYPE_CALL:
				if(context == grammarAccess.getGlobalTypeRule() ||
				   context == grammarAccess.getGlobalTypeCallRule()) {
					sequence_GlobalTypeCall(context, (GlobalTypeCall) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.GLOBAL_TYPE_INTERACTION:
				if(context == grammarAccess.getGlobalTypeRule() ||
				   context == grammarAccess.getGlobalTypeInteractionRule()) {
					sequence_GlobalTypeInteraction(context, (GlobalTypeInteraction) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.IF_THEN_ELSE:
				if(context == grammarAccess.getChoreographyRule() ||
				   context == grammarAccess.getIfThenElseRule()) {
					sequence_IfThenElse(context, (IfThenElse) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.INTERACTION:
				if(context == grammarAccess.getChoreographyRule() ||
				   context == grammarAccess.getInteractionRule()) {
					sequence_Interaction(context, (Interaction) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.LOCAL_ASK_COMMAND:
				if(context == grammarAccess.getChoreographyRule() ||
				   context == grammarAccess.getLocalCodeRule()) {
					sequence_LocalCode(context, (LocalAskCommand) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.LOCAL_ASSIGNMENT_COMMAND:
				if(context == grammarAccess.getChoreographyRule() ||
				   context == grammarAccess.getLocalCodeRule()) {
					sequence_LocalCode(context, (LocalAssignmentCommand) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.LOCAL_SHOW_COMMAND:
				if(context == grammarAccess.getChoreographyRule() ||
				   context == grammarAccess.getLocalCodeRule()) {
					sequence_LocalCode(context, (LocalShowCommand) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.PREAMBLE:
				if(context == grammarAccess.getPreambleRule()) {
					sequence_Preamble(context, (Preamble) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.PROCEDURE:
				if(context == grammarAccess.getProcedureRule()) {
					sequence_Procedure(context, (Procedure) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.PROTOCOL:
				if(context == grammarAccess.getProtocolRule()) {
					sequence_Protocol(context, (Protocol) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.SESSION_PROCEDURE_PARAMETER:
				if(context == grammarAccess.getSessionProcedureParameterRule()) {
					sequence_SessionProcedureParameter(context, (SessionProcedureParameter) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.SITE:
				if(context == grammarAccess.getSiteRule()) {
					sequence_Site(context, (Site) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.START:
				if(context == grammarAccess.getChoreographyRule() ||
				   context == grammarAccess.getStartRule()) {
					sequence_Start(context, (Start) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.SUM_EXPRESSION:
				if(context == grammarAccess.getSumExpressionRule()) {
					sequence_SumExpression(context, (SumExpression) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.SUM_EXPRESSION_ADD_TERM:
				if(context == grammarAccess.getSumExpressionTermRule()) {
					sequence_SumExpressionTerm(context, (SumExpressionAddTerm) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.SUM_EXPRESSION_SUBTRACT_TERM:
				if(context == grammarAccess.getSumExpressionTermRule()) {
					sequence_SumExpressionTerm(context, (SumExpressionSubtractTerm) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.THREAD_WITH_ROLE:
				if(context == grammarAccess.getThreadWithRoleRule()) {
					sequence_ThreadWithRole(context, (ThreadWithRole) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name='int'
	 */
	protected void sequence_BasicType(EObject context, BasicType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.BASIC_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.BASIC_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBasicTypeAccess().getNameIntKeyword_0_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operation=ID dataType=DataType continuation=GlobalType?)
	 */
	protected void sequence_BranchGType(EObject context, BranchGType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (procedure=[Procedure|ID] threads+=ID threads+=ID* (sessions+=ID sessions+=ID*)?)
	 */
	protected void sequence_Call(EObject context, Call semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftExpression=Expression operator=ConditionOperator rightExpression=Expression)
	 */
	protected void sequence_CompareCondition(EObject context, CompareCondition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.COMPARE_CONDITION__LEFT_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.COMPARE_CONDITION__LEFT_EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.COMPARE_CONDITION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.COMPARE_CONDITION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.COMPARE_CONDITION__RIGHT_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.COMPARE_CONDITION__RIGHT_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompareConditionAccess().getLeftExpressionExpressionParserRuleCall_0_0(), semanticObject.getLeftExpression());
		feeder.accept(grammarAccess.getCompareConditionAccess().getOperatorConditionOperatorParserRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getCompareConditionAccess().getRightExpressionExpressionParserRuleCall_2_0(), semanticObject.getRightExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (less?=LESS | equal?=EQUAL | greater?=GREATER | not_equal?=NOT_EQUAL)
	 */
	protected void sequence_ConditionOperator(EObject context, ConditionOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     compareCondition=CompareCondition
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.CONDITION__COMPARE_CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.CONDITION__COMPARE_CONDITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionAccess().getCompareConditionCompareConditionParserRuleCall_0(), semanticObject.getCompareCondition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (intValue=INT | strValue=STRING)
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=GlobalTypeCall role=ID)
	 */
	protected void sequence_DelegationType(EObject context, DelegationType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.DELEGATION_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.DELEGATION_TYPE__TYPE));
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.DELEGATION_TYPE__ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.DELEGATION_TYPE__ROLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDelegationTypeAccess().getTypeGlobalTypeCallParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getDelegationTypeAccess().getRoleIDTerminalRuleCall_2_0(), semanticObject.getRole());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         sender=ID 
	 *         receiver=ID 
	 *         operation=ID 
	 *         session=ID 
	 *         delegatedSession=ID 
	 *         continuation=Choreography?
	 *     )
	 */
	protected void sequence_Delegation(EObject context, Delegation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=ID | constant=Constant | expression=Expression)
	 */
	protected void sequence_ExpressionBasicTerm(EObject context, ExpressionBasicTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     sumExpression=SumExpression
	 */
	protected void sequence_Expression(EObject context, Expression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.EXPRESSION__SUM_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.EXPRESSION__SUM_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getSumExpressionSumExpressionParserRuleCall_0(), semanticObject.getSumExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     protocol=[Protocol|ID]
	 */
	protected void sequence_GlobalTypeCall(EObject context, GlobalTypeCall semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.GLOBAL_TYPE_CALL__PROTOCOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.GLOBAL_TYPE_CALL__PROTOCOL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGlobalTypeCallAccess().getProtocolProtocolIDTerminalRuleCall_0_1(), semanticObject.getProtocol());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (sender=ID receiver=ID (branches+=BranchGType | (branches+=BranchGType branches+=BranchGType*)))
	 */
	protected void sequence_GlobalTypeInteraction(EObject context, GlobalTypeInteraction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Condition thread=ID then=Choreography else=Choreography?)
	 */
	protected void sequence_IfThenElse(EObject context, IfThenElse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         sender=ID 
	 *         senderExpression=ExpressionBasicTerm? 
	 *         receiver=ID 
	 *         receiverVariable=ID? 
	 *         operation=ID 
	 *         session=ID 
	 *         continuation=Choreography?
	 *     )
	 */
	protected void sequence_Interaction(EObject context, Interaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (thread=ID question=Expression resultVariable=ID continuation=Choreography?)
	 */
	protected void sequence_LocalCode(EObject context, LocalAskCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (thread=ID variable=ID expression=Expression continuation=Choreography?)
	 */
	protected void sequence_LocalCode(EObject context, LocalAssignmentCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (thread=ID expression=Expression continuation=Choreography?)
	 */
	protected void sequence_LocalCode(EObject context, LocalShowCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((protocols+=Protocol | site+=Site)*)
	 */
	protected void sequence_Preamble(EObject context, Preamble semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         threadParameters+=ID 
	 *         threadParameters+=ID* 
	 *         (sessionParameters+=SessionProcedureParameter sessionParameters+=SessionProcedureParameter*)? 
	 *         choreography=Choreography
	 *     )
	 */
	protected void sequence_Procedure(EObject context, Procedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID preamble=Preamble procedures+=Procedure* choreography=Choreography)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=GlobalType)
	 */
	protected void sequence_Protocol(EObject context, Protocol semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.PROTOCOL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.PROTOCOL__NAME));
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.PROTOCOL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.PROTOCOL__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProtocolAccess().getTypeGlobalTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (session=ID type=GlobalTypeCall activeThreads+=ThreadWithRole activeThreads+=ThreadWithRole*)
	 */
	protected void sequence_SessionProcedureParameter(EObject context, SessionProcedureParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID protocol=[Protocol|ID])
	 */
	protected void sequence_Site(EObject context, Site semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.SITE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.SITE__NAME));
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.SITE__PROTOCOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.SITE__PROTOCOL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSiteAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSiteAccess().getProtocolProtocolIDTerminalRuleCall_3_0_1(), semanticObject.getProtocol());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         activeThreads+=ThreadWithRole 
	 *         activeThreads+=ThreadWithRole* 
	 *         (serviceThreads+=ThreadWithRole serviceThreads+=ThreadWithRole*)? 
	 *         publicChannel=[Site|ID] 
	 *         session=ID 
	 *         continuation=Choreography?
	 *     )
	 */
	protected void sequence_Start(EObject context, Start semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=ExpressionBasicTerm
	 */
	protected void sequence_SumExpressionTerm(EObject context, SumExpressionAddTerm semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.SUM_EXPRESSION_TERM__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.SUM_EXPRESSION_TERM__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSumExpressionTermAccess().getExpressionExpressionBasicTermParserRuleCall_0_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=ExpressionBasicTerm
	 */
	protected void sequence_SumExpressionTerm(EObject context, SumExpressionSubtractTerm semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.SUM_EXPRESSION_TERM__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.SUM_EXPRESSION_TERM__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSumExpressionTermAccess().getExpressionExpressionBasicTermParserRuleCall_1_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (children+=ExpressionBasicTerm children+=SumExpressionTerm*)
	 */
	protected void sequence_SumExpression(EObject context, SumExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (thread=ID role=ID)
	 */
	protected void sequence_ThreadWithRole(EObject context, ThreadWithRole semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.THREAD_WITH_ROLE__THREAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.THREAD_WITH_ROLE__THREAD));
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.THREAD_WITH_ROLE__ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.THREAD_WITH_ROLE__ROLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getThreadWithRoleAccess().getThreadIDTerminalRuleCall_0_0(), semanticObject.getThread());
		feeder.accept(grammarAccess.getThreadWithRoleAccess().getRoleIDTerminalRuleCall_2_0(), semanticObject.getRole());
		feeder.finish();
	}
}
