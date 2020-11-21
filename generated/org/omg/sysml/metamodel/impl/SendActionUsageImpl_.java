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
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
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
@StaticMetamodel(SendActionUsageImpl.class)
public abstract class SendActionUsageImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<SendActionUsageImpl, Generalization> ownedGeneralization;
	public static volatile CollectionAttribute<SendActionUsageImpl, PartUsage> nestedPart;
	public static volatile CollectionAttribute<SendActionUsageImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<SendActionUsageImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<SendActionUsageImpl, Usage> usage;
	public static volatile SingularAttribute<SendActionUsageImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<SendActionUsageImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<SendActionUsageImpl, Subsetting> ownedSubsetting;
	public static volatile CollectionAttribute<SendActionUsageImpl, Type> type;
	public static volatile CollectionAttribute<SendActionUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile CollectionAttribute<SendActionUsageImpl, Feature> output;
	public static volatile CollectionAttribute<SendActionUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<SendActionUsageImpl, TransitionUsage> nestedTransition;
	public static volatile CollectionAttribute<SendActionUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile CollectionAttribute<SendActionUsageImpl, Usage> variant;
	public static volatile SingularAttribute<SendActionUsageImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<SendActionUsageImpl, StateUsage> nestedState;
	public static volatile CollectionAttribute<SendActionUsageImpl, Comment> documentationComment;
	public static volatile SingularAttribute<SendActionUsageImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<SendActionUsageImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<SendActionUsageImpl, UUID> identifier;
	public static volatile CollectionAttribute<SendActionUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile CollectionAttribute<SendActionUsageImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<SendActionUsageImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<SendActionUsageImpl, Usage> flowFeature;
	public static volatile CollectionAttribute<SendActionUsageImpl, Documentation> documentation;
	public static volatile CollectionAttribute<SendActionUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile CollectionAttribute<SendActionUsageImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile CollectionAttribute<SendActionUsageImpl, Feature> endFeature;
	public static volatile CollectionAttribute<SendActionUsageImpl, Behavior> actionDefinition;
	public static volatile SingularAttribute<SendActionUsageImpl, Boolean> isEnd;
	public static volatile CollectionAttribute<SendActionUsageImpl, ItemUsage> nestedItem;
	public static volatile CollectionAttribute<SendActionUsageImpl, Type> featuringType;
	public static volatile CollectionAttribute<SendActionUsageImpl, Feature> input;
	public static volatile CollectionAttribute<SendActionUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile SingularAttribute<SendActionUsageImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<SendActionUsageImpl, ViewUsage> nestedView;
	public static volatile SingularAttribute<SendActionUsageImpl, String> name;
	public static volatile ListAttribute<SendActionUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<SendActionUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<SendActionUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<SendActionUsageImpl, IndividualUsage> nestedIndividual;
	public static volatile ListAttribute<SendActionUsageImpl, Membership> membership;
	public static volatile SingularAttribute<SendActionUsageImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<SendActionUsageImpl, ReferenceUsage> nestedReference;
	public static volatile SingularAttribute<SendActionUsageImpl, Boolean> isVariation;
	public static volatile CollectionAttribute<SendActionUsageImpl, FeatureTyping> ownedTyping;
	public static volatile CollectionAttribute<SendActionUsageImpl, Feature> feature;
	public static volatile ListAttribute<SendActionUsageImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<SendActionUsageImpl, Feature> parameter;
	public static volatile ListAttribute<SendActionUsageImpl, Element> member;
	public static volatile CollectionAttribute<SendActionUsageImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<SendActionUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<SendActionUsageImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<SendActionUsageImpl, Behavior> behavior;
	public static volatile ListAttribute<SendActionUsageImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<SendActionUsageImpl, Element> ownedElement;
	public static volatile CollectionAttribute<SendActionUsageImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<SendActionUsageImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<SendActionUsageImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<SendActionUsageImpl, Import> ownedImport;
	public static volatile SingularAttribute<SendActionUsageImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<SendActionUsageImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<SendActionUsageImpl, VariantMembership> variantMembership;
	public static volatile CollectionAttribute<SendActionUsageImpl, RenderingUsage> nestedRendering;
	public static volatile SingularAttribute<SendActionUsageImpl, String> humanId;
	public static volatile CollectionAttribute<SendActionUsageImpl, ConnectionUsage> nestedConnection;
	public static volatile CollectionAttribute<SendActionUsageImpl, String> aliasId;
	public static volatile CollectionAttribute<SendActionUsageImpl, InterfaceUsage> nestedInterface;
	public static volatile CollectionAttribute<SendActionUsageImpl, ViewpointUsage> nestedViewpoint;

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
	public static final String ACTION_DEFINITION = "actionDefinition";
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
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String NESTED_REFERENCE = "nestedReference";
	public static final String IS_VARIATION = "isVariation";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String BEHAVIOR = "behavior";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String NESTED_RENDERING = "nestedRendering";
	public static final String HUMAN_ID = "humanId";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String ALIAS_ID = "aliasId";
	public static final String NESTED_INTERFACE = "nestedInterface";
	public static final String NESTED_VIEWPOINT = "nestedViewpoint";

}

