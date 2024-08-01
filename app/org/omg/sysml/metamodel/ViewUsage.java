// THIS IS AN AUTOGENERATED FILE. DO NOT EDIT THIS FILE DIRECTLY.
package org.omg.sysml.metamodel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface ViewUsage extends PartUsage, SysMLType {
    List<? extends Element> getExposedElement();

    List<? extends ViewpointUsage> getSatisfiedViewpoint();

    List<? extends Expression> getViewCondition();

    ViewDefinition getViewDefinition();

    RenderingUsage getViewRendering();
}