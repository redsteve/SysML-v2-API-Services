package org.omg.sysml.metamodel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface InterfaceDefinition extends AssociationBlock {
    Collection<? extends PortUsage> getInterfaceEnd();
}