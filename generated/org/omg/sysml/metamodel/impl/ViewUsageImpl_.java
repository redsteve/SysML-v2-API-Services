package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.AnalysisCaseUsage;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Class;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.ConnectionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.IndividualUsage;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Package;
import org.omg.sysml.metamodel.PartDefinition;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StateUsage;
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
@StaticMetamodel(ViewUsageImpl.class)
public abstract class ViewUsageImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<ViewUsageImpl, Generalization> ownedGeneralization;
	public static volatile CollectionAttribute<ViewUsageImpl, PartUsage> nestedPart;
	public static volatile CollectionAttribute<ViewUsageImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<ViewUsageImpl, Usage> usage;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<ViewUsageImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<ViewUsageImpl, Subsetting> ownedSubsetting;
	public static volatile CollectionAttribute<ViewUsageImpl, Type> type;
	public static volatile CollectionAttribute<ViewUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile CollectionAttribute<ViewUsageImpl, Feature> output;
	public static volatile CollectionAttribute<ViewUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<ViewUsageImpl, TransitionUsage> nestedTransition;
	public static volatile CollectionAttribute<ViewUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile CollectionAttribute<ViewUsageImpl, Usage> variant;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<ViewUsageImpl, StateUsage> nestedState;
	public static volatile CollectionAttribute<ViewUsageImpl, Comment> documentationComment;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<ViewUsageImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<ViewUsageImpl, UUID> identifier;
	public static volatile CollectionAttribute<ViewUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile CollectionAttribute<ViewUsageImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<ViewUsageImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<ViewUsageImpl, Usage> flowFeature;
	public static volatile CollectionAttribute<ViewUsageImpl, Documentation> documentation;
	public static volatile CollectionAttribute<ViewUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile CollectionAttribute<ViewUsageImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile CollectionAttribute<ViewUsageImpl, Feature> endFeature;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isEnd;
	public static volatile CollectionAttribute<ViewUsageImpl, ItemUsage> nestedItem;
	public static volatile CollectionAttribute<ViewUsageImpl, Type> featuringType;
	public static volatile CollectionAttribute<ViewUsageImpl, Feature> input;
	public static volatile CollectionAttribute<ViewUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<ViewUsageImpl, ViewUsage> nestedView;
	public static volatile SingularAttribute<ViewUsageImpl, String> name;
	public static volatile ListAttribute<ViewUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<ViewUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<ViewUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<ViewUsageImpl, IndividualUsage> nestedIndividual;
	public static volatile ListAttribute<ViewUsageImpl, Membership> membership;
	public static volatile CollectionAttribute<ViewUsageImpl, ViewpointUsage> satisfiedViewpoint;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<ViewUsageImpl, ReferenceUsage> nestedReference;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isVariation;
	public static volatile CollectionAttribute<ViewUsageImpl, FeatureTyping> ownedTyping;
	public static volatile CollectionAttribute<ViewUsageImpl, Feature> feature;
	public static volatile ListAttribute<ViewUsageImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<ViewUsageImpl, Package> exposedPackage;
	public static volatile ListAttribute<ViewUsageImpl, Element> member;
	public static volatile CollectionAttribute<ViewUsageImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<ViewUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<ViewUsageImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<ViewUsageImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<ViewUsageImpl, Element> ownedElement;
	public static volatile CollectionAttribute<ViewUsageImpl, PartDefinition> partDefinition;
	public static volatile CollectionAttribute<ViewUsageImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<ViewUsageImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<ViewUsageImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<ViewUsageImpl, Import> ownedImport;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<ViewUsageImpl, Class> itemDefinition;
	public static volatile CollectionAttribute<ViewUsageImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<ViewUsageImpl, VariantMembership> variantMembership;
	public static volatile CollectionAttribute<ViewUsageImpl, RenderingUsage> nestedRendering;
	public static volatile SingularAttribute<ViewUsageImpl, String> humanId;
	public static volatile CollectionAttribute<ViewUsageImpl, ConnectionUsage> nestedConnection;
	public static volatile CollectionAttribute<ViewUsageImpl, String> aliasId;
	public static volatile CollectionAttribute<ViewUsageImpl, InterfaceUsage> nestedInterface;
	public static volatile CollectionAttribute<ViewUsageImpl, ViewpointUsage> nestedViewpoint;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String NESTED_PART = "nestedPart";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String USAGE = "usage";
	public static final String IS_UNIQUE = "isUnique";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
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
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String FLOW_FEATURE = "flowFeature";
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
	public static final String NESTED_VIEW = "nestedView";
	public static final String NAME = "name";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String NESTED_CASE = "nestedCase";
	public static final String NESTED_INDIVIDUAL = "nestedIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String SATISFIED_VIEWPOINT = "satisfiedViewpoint";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String NESTED_REFERENCE = "nestedReference";
	public static final String IS_VARIATION = "isVariation";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String EXPOSED_PACKAGE = "exposedPackage";
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
	public static final String ITEM_DEFINITION = "itemDefinition";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String NESTED_RENDERING = "nestedRendering";
	public static final String HUMAN_ID = "humanId";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String ALIAS_ID = "aliasId";
	public static final String NESTED_INTERFACE = "nestedInterface";
	public static final String NESTED_VIEWPOINT = "nestedViewpoint";

}

