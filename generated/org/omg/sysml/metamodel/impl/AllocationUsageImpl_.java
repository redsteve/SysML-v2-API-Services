package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.AllocationDefinition;
import org.omg.sysml.metamodel.AllocationUsage;
import org.omg.sysml.metamodel.AnalysisCaseUsage;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Association;
import org.omg.sysml.metamodel.AssociationStructure;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.ConnectionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EnumerationUsage;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.IndividualUsage;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.PartDefinition;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Structure;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.TypeFeaturing;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AllocationUsageImpl.class)
public abstract class AllocationUsageImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<AllocationUsageImpl, Generalization> ownedGeneralization;
	public static volatile CollectionAttribute<AllocationUsageImpl, PartUsage> nestedPart;
	public static volatile CollectionAttribute<AllocationUsageImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<AllocationUsageImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<AllocationUsageImpl, AllocationDefinition> allocationDefinition;
	public static volatile CollectionAttribute<AllocationUsageImpl, Usage> usage;
	public static volatile SingularAttribute<AllocationUsageImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<AllocationUsageImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<AllocationUsageImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<AllocationUsageImpl, Element> source;
	public static volatile CollectionAttribute<AllocationUsageImpl, Type> type;
	public static volatile CollectionAttribute<AllocationUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile CollectionAttribute<AllocationUsageImpl, Feature> output;
	public static volatile CollectionAttribute<AllocationUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<AllocationUsageImpl, TransitionUsage> nestedTransition;
	public static volatile CollectionAttribute<AllocationUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile CollectionAttribute<AllocationUsageImpl, Usage> variant;
	public static volatile SingularAttribute<AllocationUsageImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<AllocationUsageImpl, StateUsage> nestedState;
	public static volatile CollectionAttribute<AllocationUsageImpl, Comment> documentationComment;
	public static volatile SingularAttribute<AllocationUsageImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<AllocationUsageImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<AllocationUsageImpl, UUID> identifier;
	public static volatile CollectionAttribute<AllocationUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile CollectionAttribute<AllocationUsageImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<AllocationUsageImpl, EnumerationUsage> nestedEnumeration;
	public static volatile CollectionAttribute<AllocationUsageImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<AllocationUsageImpl, Usage> flowFeature;
	public static volatile SingularAttribute<AllocationUsageImpl, String> qualifiedName;
	public static volatile CollectionAttribute<AllocationUsageImpl, Documentation> documentation;
	public static volatile CollectionAttribute<AllocationUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile CollectionAttribute<AllocationUsageImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile CollectionAttribute<AllocationUsageImpl, Feature> endFeature;
	public static volatile SingularAttribute<AllocationUsageImpl, Boolean> isEnd;
	public static volatile CollectionAttribute<AllocationUsageImpl, ItemUsage> nestedItem;
	public static volatile CollectionAttribute<AllocationUsageImpl, Type> featuringType;
	public static volatile CollectionAttribute<AllocationUsageImpl, Feature> input;
	public static volatile CollectionAttribute<AllocationUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile SingularAttribute<AllocationUsageImpl, Boolean> isComposite;
	public static volatile ListAttribute<AllocationUsageImpl, Element> relatedElement;
	public static volatile CollectionAttribute<AllocationUsageImpl, ViewUsage> nestedView;
	public static volatile SingularAttribute<AllocationUsageImpl, String> name;
	public static volatile CollectionAttribute<AllocationUsageImpl, Feature> connectorEnd;
	public static volatile CollectionAttribute<AllocationUsageImpl, AssociationStructure> connectionDefinition;
	public static volatile ListAttribute<AllocationUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<AllocationUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<AllocationUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<AllocationUsageImpl, AllocationUsage> nestedAllocation;
	public static volatile CollectionAttribute<AllocationUsageImpl, Association> association;
	public static volatile CollectionAttribute<AllocationUsageImpl, IndividualUsage> nestedIndividual;
	public static volatile ListAttribute<AllocationUsageImpl, Membership> membership;
	public static volatile ListAttribute<AllocationUsageImpl, Element> ownedRelatedElement;
	public static volatile SingularAttribute<AllocationUsageImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<AllocationUsageImpl, ReferenceUsage> nestedReference;
	public static volatile CollectionAttribute<AllocationUsageImpl, Feature> targetFeature;
	public static volatile SingularAttribute<AllocationUsageImpl, Boolean> isVariation;
	public static volatile CollectionAttribute<AllocationUsageImpl, FeatureTyping> ownedTyping;
	public static volatile CollectionAttribute<AllocationUsageImpl, Feature> feature;
	public static volatile ListAttribute<AllocationUsageImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<AllocationUsageImpl, Element> member;
	public static volatile CollectionAttribute<AllocationUsageImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<AllocationUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<AllocationUsageImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<AllocationUsageImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<AllocationUsageImpl, Element> ownedElement;
	public static volatile CollectionAttribute<AllocationUsageImpl, PartDefinition> partDefinition;
	public static volatile CollectionAttribute<AllocationUsageImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<AllocationUsageImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<AllocationUsageImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<AllocationUsageImpl, Import> ownedImport;
	public static volatile SingularAttribute<AllocationUsageImpl, Boolean> isAbstract;
	public static volatile ListAttribute<AllocationUsageImpl, Feature> relatedFeature;
	public static volatile CollectionAttribute<AllocationUsageImpl, Structure> itemDefinition;
	public static volatile ListAttribute<AllocationUsageImpl, Element> target;
	public static volatile CollectionAttribute<AllocationUsageImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<AllocationUsageImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<AllocationUsageImpl, Boolean> isDirected;
	public static volatile CollectionAttribute<AllocationUsageImpl, RenderingUsage> nestedRendering;
	public static volatile SingularAttribute<AllocationUsageImpl, String> humanId;
	public static volatile CollectionAttribute<AllocationUsageImpl, ConnectionUsage> nestedConnection;
	public static volatile CollectionAttribute<AllocationUsageImpl, String> aliasId;
	public static volatile CollectionAttribute<AllocationUsageImpl, InterfaceUsage> nestedInterface;
	public static volatile CollectionAttribute<AllocationUsageImpl, ViewpointUsage> nestedViewpoint;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String NESTED_PART = "nestedPart";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String ALLOCATION_DEFINITION = "allocationDefinition";
	public static final String USAGE = "usage";
	public static final String IS_UNIQUE = "isUnique";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String SOURCE = "source";
	public static final String TYPE = "type";
	public static final String NESTED_REQUIREMENT = "nestedRequirement";
	public static final String OUTPUT = "output";
	public static final String NESTED_PORT = "nestedPort";
	public static final String NESTED_TRANSITION = "nestedTransition";
	public static final String NESTED_CONSTRAINT = "nestedConstraint";
	public static final String VARIANT = "variant";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String NESTED_STATE = "nestedState";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IDENTIFIER = "identifier";
	public static final String NESTED_ATTRIBUTE = "nestedAttribute";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String NESTED_ENUMERATION = "nestedEnumeration";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String FLOW_FEATURE = "flowFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String NESTED_ANALYSIS_CASE = "nestedAnalysisCase";
	public static final String NESTED_VERIFICATION_CASE = "nestedVerificationCase";
	public static final String END_FEATURE = "endFeature";
	public static final String IS_END = "isEnd";
	public static final String NESTED_ITEM = "nestedItem";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String INPUT = "input";
	public static final String NESTED_CALCULATION = "nestedCalculation";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String RELATED_ELEMENT = "relatedElement";
	public static final String NESTED_VIEW = "nestedView";
	public static final String NAME = "name";
	public static final String CONNECTOR_END = "connectorEnd";
	public static final String CONNECTION_DEFINITION = "connectionDefinition";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String NESTED_CASE = "nestedCase";
	public static final String NESTED_ALLOCATION = "nestedAllocation";
	public static final String ASSOCIATION = "association";
	public static final String NESTED_INDIVIDUAL = "nestedIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String NESTED_REFERENCE = "nestedReference";
	public static final String TARGET_FEATURE = "targetFeature";
	public static final String IS_VARIATION = "isVariation";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String PART_DEFINITION = "partDefinition";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String RELATED_FEATURE = "relatedFeature";
	public static final String ITEM_DEFINITION = "itemDefinition";
	public static final String TARGET = "target";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String IS_DIRECTED = "isDirected";
	public static final String NESTED_RENDERING = "nestedRendering";
	public static final String HUMAN_ID = "humanId";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String ALIAS_ID = "aliasId";
	public static final String NESTED_INTERFACE = "nestedInterface";
	public static final String NESTED_VIEWPOINT = "nestedViewpoint";

}

