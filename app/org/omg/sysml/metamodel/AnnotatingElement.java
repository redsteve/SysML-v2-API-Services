// THIS IS AN AUTOGENERATED FILE. DO NOT EDIT THIS FILE DIRECTLY.
package org.omg.sysml.metamodel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface AnnotatingElement extends Element, SysMLType {
    List<? extends Element> getAnnotatedElement();

    List<? extends Annotation> getAnnotation();

    List<? extends Annotation> getOwnedAnnotatingRelationship();

    Annotation getOwningAnnotatingRelationship();
}