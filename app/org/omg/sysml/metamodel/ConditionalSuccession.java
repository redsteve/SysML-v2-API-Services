package org.omg.sysml.metamodel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface ConditionalSuccession extends Succession, MofObject {
    Expression getGuard();
}