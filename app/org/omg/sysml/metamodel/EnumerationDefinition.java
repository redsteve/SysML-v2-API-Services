// THIS IS AN AUTOGENERATED FILE. DO NOT EDIT THIS FILE DIRECTLY.
package org.omg.sysml.metamodel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface EnumerationDefinition extends AttributeDefinition, SysMLType {
    List<? extends EnumerationUsage> getEnumeratedValue();

    @Override
    Boolean getIsVariation();
}