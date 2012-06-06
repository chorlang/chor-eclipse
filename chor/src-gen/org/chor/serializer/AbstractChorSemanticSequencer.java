package org.chor.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.chor.chor.BasicType;
import org.chor.chor.BranchGType;
import org.chor.chor.BranchingType;
import org.chor.chor.ChorPackage;
import org.chor.chor.CompareCondition;
import org.chor.chor.Condition;
import org.chor.chor.Constant;
import org.chor.chor.Expression;
import org.chor.chor.ExpressionBasicTerm;
import org.chor.chor.GlobalType;
import org.chor.chor.IfThenElse;
import org.chor.chor.InputType;
import org.chor.chor.Interaction;
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
			case ChorPackage.BRANCHING_TYPE:
				if(context == grammarAccess.getBranchTypeRule()) {
					sequence_BranchType(context, (BranchingType) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getLocalTypeRule()) {
					sequence_LocalType(context, (BranchingType) semanticObject); 
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
			case ChorPackage.CONSTANT:
				if(context == grammarAccess.getConstantRule()) {
					sequence_Constant(context, (Constant) semanticObject); 
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
			case ChorPackage.GLOBAL_TYPE:
				if(context == grammarAccess.getGlobalTypeRule()) {
					sequence_GlobalType(context, (GlobalType) semanticObject); 
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
			case ChorPackage.INPUT_TYPE:
				if(context == grammarAccess.getBranchTypeRule()) {
					sequence_BranchType(context, (InputType) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getLocalTypeRule()) {
					sequence_LocalType(context, (InputType) semanticObject); 
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
			case ChorPackage.OUTPUT_TYPE:
				if(context == grammarAccess.getBranchTypeRule()) {
					sequence_BranchType(context, (OutputType) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getLocalTypeRule()) {
					sequence_LocalType(context, (OutputType) semanticObject); 
					return; 
				}
				else break;
			case ChorPackage.PREAMBLE:
				if(context == grammarAccess.getPreambleRule()) {
					sequence_Preamble(context, (Preamble) semanticObject); 
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
			case ChorPackage.SELECTION_TYPE:
				if(context == grammarAccess.getBranchTypeRule()) {
					sequence_BranchType(context, (SelectionType) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getLocalTypeRule()) {
					sequence_LocalType(context, (SelectionType) semanticObject); 
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
	 *     (label=ID branches+=BranchType branches+=BranchType*)
	 */
	protected void sequence_BranchType(EObject context, BranchingType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=ID datatype=DataType continuation=LocalType)
	 */
	protected void sequence_BranchType(EObject context, InputType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.BRANCH_TYPE__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.BRANCH_TYPE__LABEL));
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.INPUT_TYPE__DATATYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.INPUT_TYPE__DATATYPE));
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.INPUT_TYPE__CONTINUATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.INPUT_TYPE__CONTINUATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBranchTypeAccess().getLabelIDTerminalRuleCall_0_0(), semanticObject.getLabel());
		feeder.accept(grammarAccess.getLocalTypeAccess().getDatatypeDataTypeParserRuleCall_1_3_0(), semanticObject.getDatatype());
		feeder.accept(grammarAccess.getLocalTypeAccess().getContinuationLocalTypeParserRuleCall_1_6_0(), semanticObject.getContinuation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (label=ID datatype=DataType continuation=LocalType)
	 */
	protected void sequence_BranchType(EObject context, OutputType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.BRANCH_TYPE__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.BRANCH_TYPE__LABEL));
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.OUTPUT_TYPE__DATATYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.OUTPUT_TYPE__DATATYPE));
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.OUTPUT_TYPE__CONTINUATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.OUTPUT_TYPE__CONTINUATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBranchTypeAccess().getLabelIDTerminalRuleCall_0_0(), semanticObject.getLabel());
		feeder.accept(grammarAccess.getLocalTypeAccess().getDatatypeDataTypeParserRuleCall_0_3_0(), semanticObject.getDatatype());
		feeder.accept(grammarAccess.getLocalTypeAccess().getContinuationLocalTypeParserRuleCall_0_6_0(), semanticObject.getContinuation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (label=ID branches+=BranchType branches+=BranchType*)
	 */
	protected void sequence_BranchType(EObject context, SelectionType semanticObject) {
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
	 *     (variable=ID | constant=Constant)
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
	 *     (sender=ID receiver=ID (branches+=BranchGType | (branches+=BranchGType branches+=BranchGType*)))
	 */
	protected void sequence_GlobalType(EObject context, GlobalType semanticObject) {
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
	 *         senderExpression=Expression? 
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
	 *     (branches+=BranchType branches+=BranchType*)
	 */
	protected void sequence_LocalType(EObject context, BranchingType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (datatype=DataType continuation=LocalType)
	 */
	protected void sequence_LocalType(EObject context, InputType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (datatype=DataType continuation=LocalType)
	 */
	protected void sequence_LocalType(EObject context, OutputType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (branches+=BranchType branches+=BranchType*)
	 */
	protected void sequence_LocalType(EObject context, SelectionType semanticObject) {
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
	 *     (name=ID preamble=Preamble choreography=Choreography)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.PROGRAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.PROGRAM__NAME));
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.PROGRAM__PREAMBLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.PROGRAM__PREAMBLE));
			if(transientValues.isValueTransient(semanticObject, ChorPackage.Literals.PROGRAM__CHOREOGRAPHY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChorPackage.Literals.PROGRAM__CHOREOGRAPHY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProgramAccess().getPreamblePreambleParserRuleCall_3_0(), semanticObject.getPreamble());
		feeder.accept(grammarAccess.getProgramAccess().getChoreographyChoreographyParserRuleCall_6_0(), semanticObject.getChoreography());
		feeder.finish();
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
	 *         serviceThreads+=ThreadWithRole 
	 *         serviceThreads+=ThreadWithRole* 
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
