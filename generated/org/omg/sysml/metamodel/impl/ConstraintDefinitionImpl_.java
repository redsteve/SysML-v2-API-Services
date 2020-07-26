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
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.ConnectionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
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
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Step;
import org.omg.sysml.metamodel.Superclassing;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.VariantMembership;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ConstraintDefinitionImpl.class)
public abstract class ConstraintDefinitionImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile CollectionAttribute<ConstraintDefinitionImpl, PortUsage> ownedPort;
	public static volatile ListAttribute<ConstraintDefinitionImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<ConstraintDefinitionImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Usage> usage;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, AnalysisCaseUsage> ownedAnalysisCase;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, ConstraintUsage> ownedConstraint;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Feature> output;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Usage> variant;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, IndividualUsage> ownedIndividual;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, ItemUsage> ownedItem;
	public static volatile SingularAttribute<ConstraintDefinitionImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Comment> documentationComment;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Usage> flow;
	public static volatile SingularAttribute<ConstraintDefinitionImpl, UUID> identifier;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Documentation> documentation;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Feature> endFeature;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, InterfaceUsage> ownedInterface;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Feature> input;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, ActionUsage> ownedAction;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, CaseUsage> ownedCase;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, CalculationUsage> ownedCalculation;
	public static volatile SingularAttribute<ConstraintDefinitionImpl, String> name;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, ReferenceUsage> ownedReference;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Usage> ownedUsage;
	public static volatile ListAttribute<ConstraintDefinitionImpl, Element> ownedMember;
	public static volatile ListAttribute<ConstraintDefinitionImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, StateUsage> ownedState;
	public static volatile ListAttribute<ConstraintDefinitionImpl, Membership> membership;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Superclassing> ownedSuperclassing;
	public static volatile SingularAttribute<ConstraintDefinitionImpl, Boolean> isVariation;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Feature> feature;
	public static volatile ListAttribute<ConstraintDefinitionImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Feature> parameter;
	public static volatile ListAttribute<ConstraintDefinitionImpl, Element> member;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<ConstraintDefinitionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, TransitionUsage> ownedTransition;
	public static volatile ListAttribute<ConstraintDefinitionImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Element> ownedElement;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Expression> expression;
	public static volatile ListAttribute<ConstraintDefinitionImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, ConnectionUsage> ownedConnection;
	public static volatile ListAttribute<ConstraintDefinitionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<ConstraintDefinitionImpl, Import> ownedImport;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, RequirementUsage> ownedRequirement;
	public static volatile SingularAttribute<ConstraintDefinitionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<ConstraintDefinitionImpl, String> humanId;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, String> aliasId;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, Step> step;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, AttributeUsage> ownedAttribute;
	public static volatile CollectionAttribute<ConstraintDefinitionImpl, PartUsage> ownedPart;

	public static final String OWNED_PORT = "ownedPort";
	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String USAGE = "usage";
	public static final String OWNED_ANALYSIS_CASE = "ownedAnalysisCase";
	public static final String OWNED_CONSTRAINT = "ownedConstraint";
	public static final String OUTPUT = "output";
	public static final String VARIANT = "variant";
	public static final String OWNED_INDIVIDUAL = "ownedIndividual";
	public static final String OWNED_ITEM = "ownedItem";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String FLOW = "flow";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String DOCUMENTATION = "documentation";
	public static final String END_FEATURE = "endFeature";
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
	public static final String IS_VARIATION = "isVariation";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String OWNED_TRANSITION = "ownedTransition";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String EXPRESSION = "expression";
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
	public static final String STEP = "step";
	public static final String OWNED_ATTRIBUTE = "ownedAttribute";
	public static final String OWNED_PART = "ownedPart";

}

