package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureChaining;
import org.omg.sysml.metamodel.FeatureDirectionKind;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.TypeFeaturing;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TargetEndImpl.class)
public abstract class TargetEndImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<TargetEndImpl, Feature> chainingFeature;
	public static volatile ListAttribute<TargetEndImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<TargetEndImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<TargetEndImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<TargetEndImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<TargetEndImpl, Type> type;
	public static volatile ListAttribute<TargetEndImpl, Feature> output;
	public static volatile CollectionAttribute<TargetEndImpl, Disjoining> disjoiningTypeDisjoining;
	public static volatile SingularAttribute<TargetEndImpl, Boolean> isSufficient;
	public static volatile ListAttribute<TargetEndImpl, Comment> documentationComment;
	public static volatile SingularAttribute<TargetEndImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<TargetEndImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<TargetEndImpl, UUID> identifier;
	public static volatile SingularAttribute<TargetEndImpl, Boolean> isDerived;
	public static volatile ListAttribute<TargetEndImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<TargetEndImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<TargetEndImpl, String> qualifiedName;
	public static volatile ListAttribute<TargetEndImpl, Documentation> documentation;
	public static volatile ListAttribute<TargetEndImpl, Feature> endFeature;
	public static volatile ListAttribute<TargetEndImpl, Feature> directedFeature;
	public static volatile SingularAttribute<TargetEndImpl, Boolean> isEnd;
	public static volatile ListAttribute<TargetEndImpl, Type> featuringType;
	public static volatile ListAttribute<TargetEndImpl, Feature> input;
	public static volatile SingularAttribute<TargetEndImpl, Boolean> isComposite;
	public static volatile SingularAttribute<TargetEndImpl, String> name;
	public static volatile ListAttribute<TargetEndImpl, Element> ownedMember;
	public static volatile ListAttribute<TargetEndImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<TargetEndImpl, Type> disjointType;
	public static volatile ListAttribute<TargetEndImpl, Membership> membership;
	public static volatile SingularAttribute<TargetEndImpl, Boolean> isPortion;
	public static volatile SingularAttribute<TargetEndImpl, Boolean> isNonunique;
	public static volatile ListAttribute<TargetEndImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile SingularAttribute<TargetEndImpl, Boolean> isReadOnly;
	public static volatile ListAttribute<TargetEndImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<TargetEndImpl, Feature> feature;
	public static volatile ListAttribute<TargetEndImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<TargetEndImpl, Element> member;
	public static volatile ListAttribute<TargetEndImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<TargetEndImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<TargetEndImpl, Feature> inheritedFeature;
	public static volatile SingularAttribute<TargetEndImpl, String> effectiveName;
	public static volatile SingularAttribute<TargetEndImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<TargetEndImpl, Membership> importedMembership;
	public static volatile ListAttribute<TargetEndImpl, Element> ownedElement;
	public static volatile ListAttribute<TargetEndImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<TargetEndImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<TargetEndImpl, Import> ownedImport;
	public static volatile SingularAttribute<TargetEndImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<TargetEndImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile SingularAttribute<TargetEndImpl, String> humanId;
	public static volatile ListAttribute<TargetEndImpl, String> aliasId;
	public static volatile ListAttribute<TargetEndImpl, Specialization> ownedSpecialization;

	public static final String CHAINING_FEATURE = "chainingFeature";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String OUTPUT = "output";
	public static final String DISJOINING_TYPE_DISJOINING = "disjoiningTypeDisjoining";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IDENTIFIER = "identifier";
	public static final String IS_DERIVED = "isDerived";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String END_FEATURE = "endFeature";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String IS_END = "isEnd";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String INPUT = "input";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String NAME = "name";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String DISJOINT_TYPE = "disjointType";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_PORTION = "isPortion";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String OWNED_FEATURE_CHAINING = "ownedFeatureChaining";
	public static final String IS_READ_ONLY = "isReadOnly";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String DIRECTION = "direction";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String HUMAN_ID = "humanId";
	public static final String ALIAS_ID = "aliasId";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";

}

