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
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Class;
import org.omg.sysml.metamodel.Classifier;
import org.omg.sysml.metamodel.ConcernUsage;
import org.omg.sysml.metamodel.ConnectorAsUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Differencing;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EnumerationUsage;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureChaining;
import org.omg.sysml.metamodel.FeatureDirectionKind;
import org.omg.sysml.metamodel.FeatureInverting;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.FlowUsage;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.Intersecting;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.MetadataUsage;
import org.omg.sysml.metamodel.OccurrenceUsage;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.PortionKind;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.TypeFeaturing;
import org.omg.sysml.metamodel.Unioning;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.UseCaseUsage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ActionUsageImpl.class)
public abstract class ActionUsageImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile ListAttribute<ActionUsageImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile ListAttribute<ActionUsageImpl, Usage> usage;
	public static volatile CollectionAttribute<ActionUsageImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<ActionUsageImpl, Type> type;
	public static volatile ListAttribute<ActionUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile ListAttribute<ActionUsageImpl, Feature> output;
	public static volatile ListAttribute<ActionUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<ActionUsageImpl, TransitionUsage> nestedTransition;
	public static volatile ListAttribute<ActionUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isSufficient;
	public static volatile ListAttribute<ActionUsageImpl, Differencing> ownedDifferencing;
	public static volatile CollectionAttribute<ActionUsageImpl, Redefinition> ownedRedefinition;
	public static volatile ListAttribute<ActionUsageImpl, TextualRepresentation> textualRepresentation;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isLibraryElement;
	public static volatile ListAttribute<ActionUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile ListAttribute<ActionUsageImpl, EnumerationUsage> nestedEnumeration;
	public static volatile ListAttribute<ActionUsageImpl, Feature> ownedFeature;
	public static volatile ListAttribute<ActionUsageImpl, Documentation> documentation;
	public static volatile ListAttribute<ActionUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile ListAttribute<ActionUsageImpl, Behavior> actionDefinition;
	public static volatile ListAttribute<ActionUsageImpl, Feature> directedFeature;
	public static volatile ListAttribute<ActionUsageImpl, Feature> input;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isConstant;
	public static volatile ListAttribute<ActionUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile ListAttribute<ActionUsageImpl, ViewUsage> nestedView;
	public static volatile SingularAttribute<ActionUsageImpl, String> shortName;
	public static volatile ListAttribute<ActionUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<ActionUsageImpl, OccurrenceUsage> nestedOccurrence;
	public static volatile ListAttribute<ActionUsageImpl, AllocationUsage> nestedAllocation;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isPortion;
	public static volatile ListAttribute<ActionUsageImpl, ReferenceUsage> nestedReference;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isVariation;
	public static volatile ListAttribute<ActionUsageImpl, Feature> feature;
	public static volatile ListAttribute<ActionUsageImpl, Element> member;
	public static volatile SingularAttribute<ActionUsageImpl, String> declaredName;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isReference;
	public static volatile ListAttribute<ActionUsageImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<ActionUsageImpl, Behavior> behavior;
	public static volatile ListAttribute<ActionUsageImpl, Membership> importedMembership;
	public static volatile ListAttribute<ActionUsageImpl, Element> ownedElement;
	public static volatile ListAttribute<ActionUsageImpl, String> aliasIds;
	public static volatile ListAttribute<ActionUsageImpl, FeatureMembership> featureMembership;
	public static volatile SingularAttribute<ActionUsageImpl, PortionKind> portionKind;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isAbstract;
	public static volatile ListAttribute<ActionUsageImpl, MetadataUsage> nestedMetadata;
	public static volatile ListAttribute<ActionUsageImpl, RenderingUsage> nestedRendering;
	public static volatile ListAttribute<ActionUsageImpl, ConnectorAsUsage> nestedConnection;
	public static volatile ListAttribute<ActionUsageImpl, Type> unioningType;
	public static volatile ListAttribute<ActionUsageImpl, InterfaceUsage> nestedInterface;
	public static volatile ListAttribute<ActionUsageImpl, Specialization> ownedSpecialization;
	public static volatile ListAttribute<ActionUsageImpl, ViewpointUsage> nestedViewpoint;
	public static volatile CollectionAttribute<ActionUsageImpl, FeatureInverting> ownedFeatureInverting;
	public static volatile ListAttribute<ActionUsageImpl, Usage> directedUsage;
	public static volatile SingularAttribute<ActionUsageImpl, String> declaredShortName;
	public static volatile ListAttribute<ActionUsageImpl, PartUsage> nestedPart;
	public static volatile ListAttribute<ActionUsageImpl, Feature> chainingFeature;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isUnique;
	public static volatile ListAttribute<ActionUsageImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<ActionUsageImpl, Usage> variant;
	public static volatile ListAttribute<ActionUsageImpl, StateUsage> nestedState;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isOrdered;
	public static volatile SingularAttribute<ActionUsageImpl, UUID> elementId;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isDerived;
	public static volatile ListAttribute<ActionUsageImpl, Annotation> ownedAnnotation;
	public static volatile SingularAttribute<ActionUsageImpl, String> qualifiedName;
	public static volatile ListAttribute<ActionUsageImpl, Type> intersectingType;
	public static volatile ListAttribute<ActionUsageImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile ListAttribute<ActionUsageImpl, Feature> endFeature;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isEnd;
	public static volatile ListAttribute<ActionUsageImpl, ItemUsage> nestedItem;
	public static volatile ListAttribute<ActionUsageImpl, Type> featuringType;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> mayTimeVary;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isComposite;
	public static volatile SingularAttribute<ActionUsageImpl, String> name;
	public static volatile ListAttribute<ActionUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<ActionUsageImpl, FlowUsage> nestedFlow;
	public static volatile ListAttribute<ActionUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<ActionUsageImpl, Disjoining> ownedDisjoining;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isIndividual;
	public static volatile ListAttribute<ActionUsageImpl, Membership> membership;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isImpliedIncluded;
	public static volatile ListAttribute<ActionUsageImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile ListAttribute<ActionUsageImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<ActionUsageImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<ActionUsageImpl, Feature> parameter;
	public static volatile ListAttribute<ActionUsageImpl, Class> occurrenceDefinition;
	public static volatile ListAttribute<ActionUsageImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<ActionUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<ActionUsageImpl, Classifier> definition;
	public static volatile ListAttribute<ActionUsageImpl, UseCaseUsage> nestedUseCase;
	public static volatile SingularAttribute<ActionUsageImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<ActionUsageImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<ActionUsageImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<ActionUsageImpl, ConcernUsage> nestedConcern;
	public static volatile ListAttribute<ActionUsageImpl, Import> ownedImport;
	public static volatile ListAttribute<ActionUsageImpl, Type> differencingType;
	public static volatile CollectionAttribute<ActionUsageImpl, VariantMembership> variantMembership;
	public static volatile ListAttribute<ActionUsageImpl, Unioning> ownedUnioning;
	public static volatile SingularAttribute<ActionUsageImpl, Boolean> isVariable;
	public static volatile ListAttribute<ActionUsageImpl, Intersecting> ownedIntersecting;

	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String USAGE = "usage";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String NESTED_REQUIREMENT = "nestedRequirement";
	public static final String OUTPUT = "output";
	public static final String NESTED_PORT = "nestedPort";
	public static final String NESTED_TRANSITION = "nestedTransition";
	public static final String NESTED_CONSTRAINT = "nestedConstraint";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String OWNED_DIFFERENCING = "ownedDifferencing";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String TEXTUAL_REPRESENTATION = "textualRepresentation";
	public static final String IS_LIBRARY_ELEMENT = "isLibraryElement";
	public static final String NESTED_ATTRIBUTE = "nestedAttribute";
	public static final String NESTED_ENUMERATION = "nestedEnumeration";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String DOCUMENTATION = "documentation";
	public static final String NESTED_ANALYSIS_CASE = "nestedAnalysisCase";
	public static final String ACTION_DEFINITION = "actionDefinition";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String INPUT = "input";
	public static final String IS_CONSTANT = "isConstant";
	public static final String NESTED_CALCULATION = "nestedCalculation";
	public static final String NESTED_VIEW = "nestedView";
	public static final String SHORT_NAME = "shortName";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String NESTED_OCCURRENCE = "nestedOccurrence";
	public static final String NESTED_ALLOCATION = "nestedAllocation";
	public static final String IS_PORTION = "isPortion";
	public static final String NESTED_REFERENCE = "nestedReference";
	public static final String IS_VARIATION = "isVariation";
	public static final String FEATURE = "feature";
	public static final String MEMBER = "member";
	public static final String DECLARED_NAME = "declaredName";
	public static final String IS_REFERENCE = "isReference";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String BEHAVIOR = "behavior";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String ALIAS_IDS = "aliasIds";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String PORTION_KIND = "portionKind";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String NESTED_METADATA = "nestedMetadata";
	public static final String NESTED_RENDERING = "nestedRendering";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String UNIONING_TYPE = "unioningType";
	public static final String NESTED_INTERFACE = "nestedInterface";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String NESTED_VIEWPOINT = "nestedViewpoint";
	public static final String OWNED_FEATURE_INVERTING = "ownedFeatureInverting";
	public static final String DIRECTED_USAGE = "directedUsage";
	public static final String DECLARED_SHORT_NAME = "declaredShortName";
	public static final String NESTED_PART = "nestedPart";
	public static final String CHAINING_FEATURE = "chainingFeature";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String IS_UNIQUE = "isUnique";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String VARIANT = "variant";
	public static final String NESTED_STATE = "nestedState";
	public static final String IS_ORDERED = "isOrdered";
	public static final String ELEMENT_ID = "elementId";
	public static final String IS_DERIVED = "isDerived";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String INTERSECTING_TYPE = "intersectingType";
	public static final String NESTED_VERIFICATION_CASE = "nestedVerificationCase";
	public static final String END_FEATURE = "endFeature";
	public static final String IS_END = "isEnd";
	public static final String NESTED_ITEM = "nestedItem";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String MAY_TIME_VARY = "mayTimeVary";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String NAME = "name";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String NESTED_FLOW = "nestedFlow";
	public static final String NESTED_CASE = "nestedCase";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String IS_INDIVIDUAL = "isIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_IMPLIED_INCLUDED = "isImpliedIncluded";
	public static final String OWNED_FEATURE_CHAINING = "ownedFeatureChaining";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String OCCURRENCE_DEFINITION = "occurrenceDefinition";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String DEFINITION = "definition";
	public static final String NESTED_USE_CASE = "nestedUseCase";
	public static final String DIRECTION = "direction";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String NESTED_CONCERN = "nestedConcern";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String DIFFERENCING_TYPE = "differencingType";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String OWNED_UNIONING = "ownedUnioning";
	public static final String IS_VARIABLE = "isVariable";
	public static final String OWNED_INTERSECTING = "ownedIntersecting";

}

