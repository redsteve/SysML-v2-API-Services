package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.Differencing;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureChaining;
import org.omg.sysml.metamodel.FeatureDirectionKind;
import org.omg.sysml.metamodel.FeatureInverting;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Intersecting;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.TypeFeaturing;
import org.omg.sysml.metamodel.Unioning;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MetadataAccessExpressionImpl.class)
public abstract class MetadataAccessExpressionImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile ListAttribute<MetadataAccessExpressionImpl, Feature> chainingFeature;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<MetadataAccessExpressionImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Type> type;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Feature> output;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, Boolean> isSufficient;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Differencing> ownedDifferencing;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<MetadataAccessExpressionImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, UUID> elementId;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, TextualRepresentation> textualRepresentation;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, Boolean> isLibraryElement;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, Boolean> isDerived;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, String> qualifiedName;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Documentation> documentation;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Type> intersectingType;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Feature> endFeature;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Feature> directedFeature;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, Boolean> isEnd;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Type> featuringType;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Feature> input;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, Boolean> isComposite;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, String> name;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, String> shortName;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Element> ownedMember;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<MetadataAccessExpressionImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Membership> membership;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, Boolean> isPortion;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, Boolean> isImpliedIncluded;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, Boolean> isReadOnly;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Feature> feature;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Feature> parameter;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Element> member;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Behavior> behavior;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, String> effectiveName;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Membership> importedMembership;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Element> ownedElement;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, Boolean> isModelLevelEvaluable;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, String> aliasIds;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Import> ownedImport;
	public static volatile SingularAttribute<MetadataAccessExpressionImpl, Boolean> isAbstract;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Type> differencingType;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Unioning> ownedUnioning;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Type> unioningType;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Specialization> ownedSpecialization;
	public static volatile ListAttribute<MetadataAccessExpressionImpl, Intersecting> ownedIntersecting;
	public static volatile CollectionAttribute<MetadataAccessExpressionImpl, FeatureInverting> ownedFeatureInverting;

	public static final String CHAINING_FEATURE = "chainingFeature";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String OUTPUT = "output";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String OWNED_DIFFERENCING = "ownedDifferencing";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String ELEMENT_ID = "elementId";
	public static final String TEXTUAL_REPRESENTATION = "textualRepresentation";
	public static final String IS_LIBRARY_ELEMENT = "isLibraryElement";
	public static final String IS_DERIVED = "isDerived";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String INTERSECTING_TYPE = "intersectingType";
	public static final String END_FEATURE = "endFeature";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String IS_END = "isEnd";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String INPUT = "input";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String NAME = "name";
	public static final String SHORT_NAME = "shortName";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_PORTION = "isPortion";
	public static final String IS_IMPLIED_INCLUDED = "isImpliedIncluded";
	public static final String OWNED_FEATURE_CHAINING = "ownedFeatureChaining";
	public static final String IS_READ_ONLY = "isReadOnly";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String BEHAVIOR = "behavior";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String DIRECTION = "direction";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String IS_MODEL_LEVEL_EVALUABLE = "isModelLevelEvaluable";
	public static final String ALIAS_IDS = "aliasIds";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String DIFFERENCING_TYPE = "differencingType";
	public static final String OWNED_UNIONING = "ownedUnioning";
	public static final String UNIONING_TYPE = "unioningType";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String OWNED_INTERSECTING = "ownedIntersecting";
	public static final String OWNED_FEATURE_INVERTING = "ownedFeatureInverting";

}
