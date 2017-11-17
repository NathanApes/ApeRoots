package nathan.apes.roots.executor.modifier.remover;

import nathan.apes.roots.definer.PropertyExecute;
import nathan.apes.roots.executor.modifier.Modifier;

import java.util.Collection;

public interface Remover extends Modifier {

    void removeExecution(PropertyExecute execution);
    void removeAllExecution(Collection<PropertyExecute> executions);
}
