package org.omg.sysml.query.impl;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.lifecycle.impl.ElementIdentityImpl;
import org.omg.sysml.lifecycle.impl.ProjectImpl;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(QueryImpl.class)
public abstract class QueryImpl_ extends org.omg.sysml.record.impl.RecordImpl_ {

	public static volatile SetAttribute<QueryImpl, String> select;
	public static volatile SetAttribute<QueryImpl, ElementIdentityImpl> scope;
	public static volatile SingularAttribute<QueryImpl, ProjectImpl> containingProject;

	public static final String SELECT = "select";
	public static final String SCOPE = "scope";
	public static final String CONTAINING_PROJECT = "containingProject";

}

