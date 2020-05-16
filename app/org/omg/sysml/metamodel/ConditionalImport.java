package org.omg.sysml.metamodel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface ConditionalImport extends Import {
    ImportCondition getCondition();

    Predicate getSelector();
}