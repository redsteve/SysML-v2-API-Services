// THIS IS AN AUTOGENERATED FILE. DO NOT EDIT THIS FILE DIRECTLY.
package org.omg.sysml.metamodel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface Annotation extends Relationship, SysMLType {
    Element getAnnotatedElement();

    AnnotatingElement getAnnotatingElement();

    AnnotatingElement getOwnedAnnotatingElement();

    Element getOwningAnnotatedElement();

    AnnotatingElement getOwningAnnotatingElement();
}