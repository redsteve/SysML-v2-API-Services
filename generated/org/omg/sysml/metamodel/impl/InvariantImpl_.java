package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Parameter;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.Type;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InvariantImpl.class)
public abstract class InvariantImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<InvariantImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<InvariantImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<InvariantImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<InvariantImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<InvariantImpl, Membership> membership;
	public static volatile CollectionAttribute<InvariantImpl, Type> type;
	public static volatile SingularAttribute<InvariantImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<InvariantImpl, Feature> output;
	public static volatile CollectionAttribute<InvariantImpl, Feature> feature;
	public static volatile ListAttribute<InvariantImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<InvariantImpl, Parameter> parameter;
	public static volatile ListAttribute<InvariantImpl, Element> member;
	public static volatile CollectionAttribute<InvariantImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<InvariantImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<InvariantImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<InvariantImpl, Behavior> behavior;
	public static volatile SingularAttribute<InvariantImpl, Boolean> isSufficient;
	public static volatile SingularAttribute<InvariantImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<InvariantImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<InvariantImpl, UUID> identifier;
	public static volatile ListAttribute<InvariantImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<InvariantImpl, Element> ownedElement;
	public static volatile CollectionAttribute<InvariantImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<InvariantImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<InvariantImpl, FeatureMembership> featureMembership;
	public static volatile CollectionAttribute<InvariantImpl, Feature> endFeature;
	public static volatile ListAttribute<InvariantImpl, Import> ownedImport;
	public static volatile CollectionAttribute<InvariantImpl, Type> referencedType;
	public static volatile SingularAttribute<InvariantImpl, Boolean> isAbstract;
	public static volatile SingularAttribute<InvariantImpl, Boolean> isEnd;
	public static volatile CollectionAttribute<InvariantImpl, Feature> input;
	public static volatile SingularAttribute<InvariantImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<InvariantImpl, Type> ownedType;
	public static volatile SingularAttribute<InvariantImpl, String> name;
	public static volatile CollectionAttribute<InvariantImpl, FeatureTyping> typing;
	public static volatile ListAttribute<InvariantImpl, Element> ownedMember;
	public static volatile ListAttribute<InvariantImpl, Membership> ownedMembership;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String MEMBERSHIP = "membership";
	public static final String TYPE = "type";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String OUTPUT = "output";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String BEHAVIOR = "behavior";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IDENTIFIER = "identifier";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String END_FEATURE = "endFeature";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String REFERENCED_TYPE = "referencedType";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String IS_END = "isEnd";
	public static final String INPUT = "input";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String OWNED_TYPE = "ownedType";
	public static final String NAME = "name";
	public static final String TYPING = "typing";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";

}

