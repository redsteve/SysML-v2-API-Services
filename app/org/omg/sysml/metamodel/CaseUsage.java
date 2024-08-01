// THIS IS AN AUTOGENERATED FILE. DO NOT EDIT THIS FILE DIRECTLY.
package org.omg.sysml.metamodel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface CaseUsage extends CalculationUsage, SysMLType {
    List<? extends PartUsage> getActorParameter();

    CaseDefinition getCaseDefinition();

    RequirementUsage getObjectiveRequirement();

    Usage getSubjectParameter();
}