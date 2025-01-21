// THIS IS AN AUTOGENERATED FILE. DO NOT EDIT THIS FILE DIRECTLY.
package org.omg.sysml.metamodel.impl;

import org.omg.sysml.metamodel.*;
import org.omg.sysml.metamodel.Package;
import org.omg.sysml.metamodel.Class;

import jackson.DataSerializer;
import jackson.DataDeserializer;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import org.hibernate.annotations.Any;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.FetchMode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.EnumType;
import javax.persistence.ElementCollection;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.FetchType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Table;
import javax.persistence.SecondaryTable;
import javax.persistence.CollectionTable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "DocumentationImpl")
@SecondaryTable(name = "Documentation")
@org.hibernate.annotations.Table(appliesTo = "Documentation", fetch = FetchMode.SELECT, optional = false)
@DiscriminatorValue(value = "Documentation")
@JsonTypeName(value = "Documentation")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
public class DocumentationImpl extends SysMLTypeImpl implements Documentation {

    private List<String> aliasIds;

    @Override
    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "Documentation_aliasIds", joinColumns = @JoinColumn(name = "Documentation_id"))
    public List<String> getAliasIds() {
        if (aliasIds == null) {
            aliasIds = new ArrayList<>();
        }
        return aliasIds;
    }

    @JsonSetter
    public void setAliasIds(List<String> aliasIds) {
        this.aliasIds = aliasIds;
    }

    private List<Element> annotatedElement;

    @Override
    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Documentation_annotatedElement", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    public List<Element> getAnnotatedElement() {
        if (annotatedElement == null) {
            annotatedElement = new ArrayList<>();
        }
        return annotatedElement;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = DataDeserializer.class, contentAs = ElementImpl.class)
    public void setAnnotatedElement(List<Element> annotatedElement) {
        this.annotatedElement = annotatedElement;
    }

    private List<Annotation> annotation;

    @Override
    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "AnnotationMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Documentation_annotation", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    public List<Annotation> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<>();
        }
        return annotation;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = DataDeserializer.class, contentAs = AnnotationImpl.class)
    public void setAnnotation(List<Annotation> annotation) {
        this.annotation = annotation;
    }

    private String body;

    @Override
    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    @javax.persistence.Column(name = "body", table = "Documentation")
    public String getBody() {
        return body;
    }

    @JsonSetter
    public void setBody(String body) {
        this.body = body;
    }

    private String declaredName;

    @Override
    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    @javax.persistence.Column(name = "declaredName", table = "Documentation")
    public String getDeclaredName() {
        return declaredName;
    }

    @JsonSetter
    public void setDeclaredName(String declaredName) {
        this.declaredName = declaredName;
    }

    private String declaredShortName;

    @Override
    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    @javax.persistence.Column(name = "declaredShortName", table = "Documentation")
    public String getDeclaredShortName() {
        return declaredShortName;
    }

    @JsonSetter
    public void setDeclaredShortName(String declaredShortName) {
        this.declaredShortName = declaredShortName;
    }

    private List<Documentation> documentation;

    @Override
    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "DocumentationMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Documentation_documentation", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    public List<Documentation> getDocumentation() {
        if (documentation == null) {
            documentation = new ArrayList<>();
        }
        return documentation;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = DataDeserializer.class, contentAs = DocumentationImpl.class)
    public void setDocumentation(List<Documentation> documentation) {
        this.documentation = documentation;
    }

    private Element documentedElement;

    @Override
    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "documentedElement_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "documentedElement_id", table = "Documentation")
    public Element getDocumentedElement() {
        return documentedElement;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = ElementImpl.class)
    public void setDocumentedElement(Element documentedElement) {
        this.documentedElement = documentedElement;
    }

    private java.util.UUID elementId;

    @Override
    @JsonGetter
    @javax.persistence.Column(name = "elementId", table = "Documentation")
    public java.util.UUID getElementId() {
        return elementId;
    }

    @JsonSetter
    public void setElementId(java.util.UUID elementId) {
        this.elementId = elementId;
    }

    private Boolean isImpliedIncluded;

    @Override
    @JsonGetter
    @javax.persistence.Column(name = "isImpliedIncluded", table = "Documentation")
    public Boolean getIsImpliedIncluded() {
        return isImpliedIncluded;
    }

    @JsonSetter
    public void setIsImpliedIncluded(Boolean isImpliedIncluded) {
        this.isImpliedIncluded = isImpliedIncluded;
    }

    private Boolean isLibraryElement;

    @Override
    @JsonGetter
    // @javax.persistence.Transient
    @javax.persistence.Column(name = "isLibraryElement", table = "Documentation")
    public Boolean getIsLibraryElement() {
        return isLibraryElement;
    }

    @JsonSetter
    public void setIsLibraryElement(Boolean isLibraryElement) {
        this.isLibraryElement = isLibraryElement;
    }

    private String locale;

    @Override
    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    @javax.persistence.Column(name = "locale", table = "Documentation")
    public String getLocale() {
        return locale;
    }

    @JsonSetter
    public void setLocale(String locale) {
        this.locale = locale;
    }

    private String name;

    @Override
    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    // @javax.persistence.Transient
    @javax.persistence.Column(name = "name", table = "Documentation")
    public String getName() {
        return name;
    }

    @JsonSetter
    public void setName(String name) {
        this.name = name;
    }

    private List<Annotation> ownedAnnotatingRelationship;

    @Override
    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "AnnotationMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Documentation_ownedAnnotatingRelationship", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    public List<Annotation> getOwnedAnnotatingRelationship() {
        if (ownedAnnotatingRelationship == null) {
            ownedAnnotatingRelationship = new ArrayList<>();
        }
        return ownedAnnotatingRelationship;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = DataDeserializer.class, contentAs = AnnotationImpl.class)
    public void setOwnedAnnotatingRelationship(List<Annotation> ownedAnnotatingRelationship) {
        this.ownedAnnotatingRelationship = ownedAnnotatingRelationship;
    }

    private List<Annotation> ownedAnnotation;

    @Override
    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "AnnotationMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Documentation_ownedAnnotation", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    public List<Annotation> getOwnedAnnotation() {
        if (ownedAnnotation == null) {
            ownedAnnotation = new ArrayList<>();
        }
        return ownedAnnotation;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = DataDeserializer.class, contentAs = AnnotationImpl.class)
    public void setOwnedAnnotation(List<Annotation> ownedAnnotation) {
        this.ownedAnnotation = ownedAnnotation;
    }

    private List<Element> ownedElement;

    @Override
    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Documentation_ownedElement", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    public List<Element> getOwnedElement() {
        if (ownedElement == null) {
            ownedElement = new ArrayList<>();
        }
        return ownedElement;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = DataDeserializer.class, contentAs = ElementImpl.class)
    public void setOwnedElement(List<Element> ownedElement) {
        this.ownedElement = ownedElement;
    }

    private List<Relationship> ownedRelationship;

    @Override
    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    @ManyToAny(metaDef = "RelationshipMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Documentation_ownedRelationship", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    public List<Relationship> getOwnedRelationship() {
        if (ownedRelationship == null) {
            ownedRelationship = new ArrayList<>();
        }
        return ownedRelationship;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = DataDeserializer.class, contentAs = RelationshipImpl.class)
    public void setOwnedRelationship(List<Relationship> ownedRelationship) {
        this.ownedRelationship = ownedRelationship;
    }

    private Element owner;

    @Override
    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "owner_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", table = "Documentation")
    public Element getOwner() {
        return owner;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = ElementImpl.class)
    public void setOwner(Element owner) {
        this.owner = owner;
    }

    private Annotation owningAnnotatingRelationship;

    @Override
    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "AnnotationMetaDef", metaColumn = @javax.persistence.Column(name = "owningAnnotatingRelationship_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningAnnotatingRelationship_id", table = "Documentation")
    public Annotation getOwningAnnotatingRelationship() {
        return owningAnnotatingRelationship;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = AnnotationImpl.class)
    public void setOwningAnnotatingRelationship(Annotation owningAnnotatingRelationship) {
        this.owningAnnotatingRelationship = owningAnnotatingRelationship;
    }

    private OwningMembership owningMembership;

    @Override
    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "OwningMembershipMetaDef", metaColumn = @javax.persistence.Column(name = "owningMembership_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningMembership_id", table = "Documentation")
    public OwningMembership getOwningMembership() {
        return owningMembership;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = OwningMembershipImpl.class)
    public void setOwningMembership(OwningMembership owningMembership) {
        this.owningMembership = owningMembership;
    }

    private Namespace owningNamespace;

    @Override
    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "NamespaceMetaDef", metaColumn = @javax.persistence.Column(name = "owningNamespace_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningNamespace_id", table = "Documentation")
    public Namespace getOwningNamespace() {
        return owningNamespace;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = NamespaceImpl.class)
    public void setOwningNamespace(Namespace owningNamespace) {
        this.owningNamespace = owningNamespace;
    }

    private Relationship owningRelationship;

    @Override
    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    @Any(metaDef = "RelationshipMetaDef", metaColumn = @javax.persistence.Column(name = "owningRelationship_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningRelationship_id", table = "Documentation")
    public Relationship getOwningRelationship() {
        return owningRelationship;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = RelationshipImpl.class)
    public void setOwningRelationship(Relationship owningRelationship) {
        this.owningRelationship = owningRelationship;
    }

    private String qualifiedName;

    @Override
    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    // @javax.persistence.Transient
    @javax.persistence.Column(name = "qualifiedName", table = "Documentation")
    public String getQualifiedName() {
        return qualifiedName;
    }

    @JsonSetter
    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    private String shortName;

    @Override
    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    // @javax.persistence.Transient
    @javax.persistence.Column(name = "shortName", table = "Documentation")
    public String getShortName() {
        return shortName;
    }

    @JsonSetter
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    private List<TextualRepresentation> textualRepresentation;

    @Override
    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "TextualRepresentationMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Documentation_textualRepresentation", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    public List<TextualRepresentation> getTextualRepresentation() {
        if (textualRepresentation == null) {
            textualRepresentation = new ArrayList<>();
        }
        return textualRepresentation;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = DataDeserializer.class, contentAs = TextualRepresentationImpl.class)
    public void setTextualRepresentation(List<TextualRepresentation> textualRepresentation) {
        this.textualRepresentation = textualRepresentation;
    }
}