package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.AllocationUsage;
import org.omg.sysml.metamodel.AnalysisCaseUsage;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.ConcernUsage;
import org.omg.sysml.metamodel.ConnectorAsUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EnumerationUsage;
import org.omg.sysml.metamodel.Expression;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FlowConnectionUsage;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.OccurrenceUsage;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Step;
import org.omg.sysml.metamodel.Subclassification;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.UseCaseUsage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ViewpointDefinitionImpl.class)
public abstract class ViewpointDefinitionImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<ViewpointDefinitionImpl, Usage> directedUsage;
	public static volatile ListAttribute<ViewpointDefinitionImpl, PortUsage> ownedPort;
	public static volatile SingularAttribute<ViewpointDefinitionImpl, Boolean> isConjugated;
	public static volatile ListAttribute<ViewpointDefinitionImpl, EnumerationUsage> ownedEnumeration;
	public static volatile ListAttribute<ViewpointDefinitionImpl, VerificationCaseUsage> ownedVerificationCase;
	public static volatile ListAttribute<ViewpointDefinitionImpl, ConstraintUsage> requiredConstraint;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Usage> usage;
	public static volatile ListAttribute<ViewpointDefinitionImpl, ViewpointUsage> ownedViewpoint;
	public static volatile ListAttribute<ViewpointDefinitionImpl, AnalysisCaseUsage> ownedAnalysisCase;
	public static volatile ListAttribute<ViewpointDefinitionImpl, RenderingUsage> ownedRendering;
	public static volatile ListAttribute<ViewpointDefinitionImpl, ConstraintUsage> ownedConstraint;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Feature> output;
	public static volatile ListAttribute<ViewpointDefinitionImpl, ConcernUsage> framedConcern;
	public static volatile CollectionAttribute<ViewpointDefinitionImpl, Disjoining> disjoiningTypeDisjoining;
	public static volatile CollectionAttribute<ViewpointDefinitionImpl, Usage> variant;
	public static volatile ListAttribute<ViewpointDefinitionImpl, ItemUsage> ownedItem;
	public static volatile CollectionAttribute<ViewpointDefinitionImpl, String> text;
	public static volatile SingularAttribute<ViewpointDefinitionImpl, Boolean> isSufficient;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Comment> documentationComment;
	public static volatile SingularAttribute<ViewpointDefinitionImpl, UUID> identifier;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<ViewpointDefinitionImpl, ViewUsage> ownedView;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<ViewpointDefinitionImpl, String> qualifiedName;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Documentation> documentation;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Feature> endFeature;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Feature> directedFeature;
	public static volatile ListAttribute<ViewpointDefinitionImpl, AllocationUsage> ownedAllocation;
	public static volatile ListAttribute<ViewpointDefinitionImpl, InterfaceUsage> ownedInterface;
	public static volatile SingularAttribute<ViewpointDefinitionImpl, String> reqId;
	public static volatile ListAttribute<ViewpointDefinitionImpl, PartUsage> stakeholderParameter;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Feature> input;
	public static volatile CollectionAttribute<ViewpointDefinitionImpl, FlowConnectionUsage> ownedFlow;
	public static volatile ListAttribute<ViewpointDefinitionImpl, ActionUsage> ownedAction;
	public static volatile ListAttribute<ViewpointDefinitionImpl, ConstraintUsage> assumedConstraint;
	public static volatile ListAttribute<ViewpointDefinitionImpl, CaseUsage> ownedCase;
	public static volatile ListAttribute<ViewpointDefinitionImpl, PartUsage> actorParameter;
	public static volatile ListAttribute<ViewpointDefinitionImpl, CalculationUsage> ownedCalculation;
	public static volatile ListAttribute<ViewpointDefinitionImpl, OccurrenceUsage> ownedOccurrence;
	public static volatile SingularAttribute<ViewpointDefinitionImpl, String> name;
	public static volatile ListAttribute<ViewpointDefinitionImpl, ReferenceUsage> ownedReference;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Usage> ownedUsage;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Element> ownedMember;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<ViewpointDefinitionImpl, Type> disjointType;
	public static volatile ListAttribute<ViewpointDefinitionImpl, UseCaseUsage> ownedUseCase;
	public static volatile ListAttribute<ViewpointDefinitionImpl, StateUsage> ownedState;
	public static volatile SingularAttribute<ViewpointDefinitionImpl, Boolean> isIndividual;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Membership> membership;
	public static volatile SingularAttribute<ViewpointDefinitionImpl, Boolean> isVariation;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Feature> feature;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Feature> parameter;
	public static volatile ListAttribute<ViewpointDefinitionImpl, PartUsage> viewpointStakeholder;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Element> member;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<ViewpointDefinitionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<ViewpointDefinitionImpl, Subclassification> ownedSubclassification;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<ViewpointDefinitionImpl, TransitionUsage> ownedTransition;
	public static volatile SingularAttribute<ViewpointDefinitionImpl, String> effectiveName;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Membership> importedMembership;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Element> ownedElement;
	public static volatile CollectionAttribute<ViewpointDefinitionImpl, Expression> expression;
	public static volatile SingularAttribute<ViewpointDefinitionImpl, Boolean> isModelLevelEvaluable;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<ViewpointDefinitionImpl, ConnectorAsUsage> ownedConnection;
	public static volatile ListAttribute<ViewpointDefinitionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Import> ownedImport;
	public static volatile ListAttribute<ViewpointDefinitionImpl, RequirementUsage> ownedRequirement;
	public static volatile SingularAttribute<ViewpointDefinitionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<ViewpointDefinitionImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<ViewpointDefinitionImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<ViewpointDefinitionImpl, String> humanId;
	public static volatile ListAttribute<ViewpointDefinitionImpl, String> aliasId;
	public static volatile ListAttribute<ViewpointDefinitionImpl, Specialization> ownedSpecialization;
	public static volatile CollectionAttribute<ViewpointDefinitionImpl, ConcernUsage> ownedConcern;
	public static volatile CollectionAttribute<ViewpointDefinitionImpl, Step> step;
	public static volatile ListAttribute<ViewpointDefinitionImpl, AttributeUsage> ownedAttribute;
	public static volatile ListAttribute<ViewpointDefinitionImpl, PartUsage> ownedPart;

	public static final String DIRECTED_USAGE = "directedUsage";
	public static final String OWNED_PORT = "ownedPort";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String OWNED_ENUMERATION = "ownedEnumeration";
	public static final String OWNED_VERIFICATION_CASE = "ownedVerificationCase";
	public static final String REQUIRED_CONSTRAINT = "requiredConstraint";
	public static final String USAGE = "usage";
	public static final String OWNED_VIEWPOINT = "ownedViewpoint";
	public static final String OWNED_ANALYSIS_CASE = "ownedAnalysisCase";
	public static final String OWNED_RENDERING = "ownedRendering";
	public static final String OWNED_CONSTRAINT = "ownedConstraint";
	public static final String OUTPUT = "output";
	public static final String FRAMED_CONCERN = "framedConcern";
	public static final String DISJOINING_TYPE_DISJOINING = "disjoiningTypeDisjoining";
	public static final String VARIANT = "variant";
	public static final String OWNED_ITEM = "ownedItem";
	public static final String TEXT = "text";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_VIEW = "ownedView";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String END_FEATURE = "endFeature";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String OWNED_ALLOCATION = "ownedAllocation";
	public static final String OWNED_INTERFACE = "ownedInterface";
	public static final String REQ_ID = "reqId";
	public static final String STAKEHOLDER_PARAMETER = "stakeholderParameter";
	public static final String INPUT = "input";
	public static final String OWNED_FLOW = "ownedFlow";
	public static final String OWNED_ACTION = "ownedAction";
	public static final String ASSUMED_CONSTRAINT = "assumedConstraint";
	public static final String OWNED_CASE = "ownedCase";
	public static final String ACTOR_PARAMETER = "actorParameter";
	public static final String OWNED_CALCULATION = "ownedCalculation";
	public static final String OWNED_OCCURRENCE = "ownedOccurrence";
	public static final String NAME = "name";
	public static final String OWNED_REFERENCE = "ownedReference";
	public static final String OWNED_USAGE = "ownedUsage";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String DISJOINT_TYPE = "disjointType";
	public static final String OWNED_USE_CASE = "ownedUseCase";
	public static final String OWNED_STATE = "ownedState";
	public static final String IS_INDIVIDUAL = "isIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_VARIATION = "isVariation";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String VIEWPOINT_STAKEHOLDER = "viewpointStakeholder";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String OWNED_SUBCLASSIFICATION = "ownedSubclassification";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String OWNED_TRANSITION = "ownedTransition";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String EXPRESSION = "expression";
	public static final String IS_MODEL_LEVEL_EVALUABLE = "isModelLevelEvaluable";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String OWNED_CONNECTION = "ownedConnection";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String OWNED_REQUIREMENT = "ownedRequirement";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String HUMAN_ID = "humanId";
	public static final String ALIAS_ID = "aliasId";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String OWNED_CONCERN = "ownedConcern";
	public static final String STEP = "step";
	public static final String OWNED_ATTRIBUTE = "ownedAttribute";
	public static final String OWNED_PART = "ownedPart";

}

