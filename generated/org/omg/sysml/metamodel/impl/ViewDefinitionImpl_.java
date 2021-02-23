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
import org.omg.sysml.metamodel.ConnectionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EnumerationUsage;
import org.omg.sysml.metamodel.Expression;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.IndividualUsage;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Superclassing;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ViewDefinitionImpl.class)
public abstract class ViewDefinitionImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile CollectionAttribute<ViewDefinitionImpl, PortUsage> ownedPort;
	public static volatile ListAttribute<ViewDefinitionImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<ViewDefinitionImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<ViewDefinitionImpl, EnumerationUsage> ownedEnumeration;
	public static volatile CollectionAttribute<ViewDefinitionImpl, VerificationCaseUsage> ownedVerificationCase;
	public static volatile CollectionAttribute<ViewDefinitionImpl, Usage> usage;
	public static volatile CollectionAttribute<ViewDefinitionImpl, ViewpointUsage> ownedViewpoint;
	public static volatile CollectionAttribute<ViewDefinitionImpl, AnalysisCaseUsage> ownedAnalysisCase;
	public static volatile CollectionAttribute<ViewDefinitionImpl, RenderingUsage> ownedRendering;
	public static volatile CollectionAttribute<ViewDefinitionImpl, ConstraintUsage> ownedConstraint;
	public static volatile CollectionAttribute<ViewDefinitionImpl, Feature> output;
	public static volatile CollectionAttribute<ViewDefinitionImpl, ViewUsage> view;
	public static volatile CollectionAttribute<ViewDefinitionImpl, Usage> variant;
	public static volatile CollectionAttribute<ViewDefinitionImpl, IndividualUsage> ownedIndividual;
	public static volatile CollectionAttribute<ViewDefinitionImpl, ItemUsage> ownedItem;
	public static volatile SingularAttribute<ViewDefinitionImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<ViewDefinitionImpl, Comment> documentationComment;
	public static volatile SingularAttribute<ViewDefinitionImpl, UUID> identifier;
	public static volatile CollectionAttribute<ViewDefinitionImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<ViewDefinitionImpl, ViewUsage> ownedView;
	public static volatile CollectionAttribute<ViewDefinitionImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<ViewDefinitionImpl, Usage> flowFeature;
	public static volatile SingularAttribute<ViewDefinitionImpl, String> qualifiedName;
	public static volatile CollectionAttribute<ViewDefinitionImpl, Documentation> documentation;
	public static volatile CollectionAttribute<ViewDefinitionImpl, Feature> endFeature;
	public static volatile CollectionAttribute<ViewDefinitionImpl, AllocationUsage> ownedAllocation;
	public static volatile CollectionAttribute<ViewDefinitionImpl, InterfaceUsage> ownedInterface;
	public static volatile CollectionAttribute<ViewDefinitionImpl, Feature> input;
	public static volatile CollectionAttribute<ViewDefinitionImpl, ActionUsage> ownedAction;
	public static volatile CollectionAttribute<ViewDefinitionImpl, CaseUsage> ownedCase;
	public static volatile CollectionAttribute<ViewDefinitionImpl, CalculationUsage> ownedCalculation;
	public static volatile SingularAttribute<ViewDefinitionImpl, String> name;
	public static volatile CollectionAttribute<ViewDefinitionImpl, ReferenceUsage> ownedReference;
	public static volatile CollectionAttribute<ViewDefinitionImpl, Usage> ownedUsage;
	public static volatile ListAttribute<ViewDefinitionImpl, Element> ownedMember;
	public static volatile ListAttribute<ViewDefinitionImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<ViewDefinitionImpl, StateUsage> ownedState;
	public static volatile ListAttribute<ViewDefinitionImpl, Membership> membership;
	public static volatile CollectionAttribute<ViewDefinitionImpl, Superclassing> ownedSuperclassing;
	public static volatile CollectionAttribute<ViewDefinitionImpl, Expression> viewCondition;
	public static volatile CollectionAttribute<ViewDefinitionImpl, ViewpointUsage> satisfiedViewpoint;
	public static volatile SingularAttribute<ViewDefinitionImpl, Boolean> isVariation;
	public static volatile CollectionAttribute<ViewDefinitionImpl, Feature> feature;
	public static volatile ListAttribute<ViewDefinitionImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<ViewDefinitionImpl, Element> member;
	public static volatile CollectionAttribute<ViewDefinitionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<ViewDefinitionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<ViewDefinitionImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<ViewDefinitionImpl, TransitionUsage> ownedTransition;
	public static volatile ListAttribute<ViewDefinitionImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<ViewDefinitionImpl, Element> ownedElement;
	public static volatile ListAttribute<ViewDefinitionImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<ViewDefinitionImpl, ConnectionUsage> ownedConnection;
	public static volatile ListAttribute<ViewDefinitionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<ViewDefinitionImpl, Import> ownedImport;
	public static volatile CollectionAttribute<ViewDefinitionImpl, RequirementUsage> ownedRequirement;
	public static volatile SingularAttribute<ViewDefinitionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<ViewDefinitionImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<ViewDefinitionImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<ViewDefinitionImpl, String> humanId;
	public static volatile CollectionAttribute<ViewDefinitionImpl, String> aliasId;
	public static volatile CollectionAttribute<ViewDefinitionImpl, AttributeUsage> ownedAttribute;
	public static volatile CollectionAttribute<ViewDefinitionImpl, PartUsage> ownedPart;

	public static final String OWNED_PORT = "ownedPort";
	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String OWNED_ENUMERATION = "ownedEnumeration";
	public static final String OWNED_VERIFICATION_CASE = "ownedVerificationCase";
	public static final String USAGE = "usage";
	public static final String OWNED_VIEWPOINT = "ownedViewpoint";
	public static final String OWNED_ANALYSIS_CASE = "ownedAnalysisCase";
	public static final String OWNED_RENDERING = "ownedRendering";
	public static final String OWNED_CONSTRAINT = "ownedConstraint";
	public static final String OUTPUT = "output";
	public static final String VIEW = "view";
	public static final String VARIANT = "variant";
	public static final String OWNED_INDIVIDUAL = "ownedIndividual";
	public static final String OWNED_ITEM = "ownedItem";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_VIEW = "ownedView";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String FLOW_FEATURE = "flowFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String END_FEATURE = "endFeature";
	public static final String OWNED_ALLOCATION = "ownedAllocation";
	public static final String OWNED_INTERFACE = "ownedInterface";
	public static final String INPUT = "input";
	public static final String OWNED_ACTION = "ownedAction";
	public static final String OWNED_CASE = "ownedCase";
	public static final String OWNED_CALCULATION = "ownedCalculation";
	public static final String NAME = "name";
	public static final String OWNED_REFERENCE = "ownedReference";
	public static final String OWNED_USAGE = "ownedUsage";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String OWNED_STATE = "ownedState";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_SUPERCLASSING = "ownedSuperclassing";
	public static final String VIEW_CONDITION = "viewCondition";
	public static final String SATISFIED_VIEWPOINT = "satisfiedViewpoint";
	public static final String IS_VARIATION = "isVariation";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String OWNED_TRANSITION = "ownedTransition";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
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
	public static final String OWNED_ATTRIBUTE = "ownedAttribute";
	public static final String OWNED_PART = "ownedPart";

}

