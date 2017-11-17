package nathan.apes.roots.executor.modifier.adder;

import nathan.apes.roots.definer.PropertyExecute;
import nathan.apes.roots.executor.modifier.Modifier;

import java.util.Collection;

public interface Adder extends Modifier {

    void addExecution(PropertyExecute execution);
    void addAllExecution(Collection<PropertyExecute> executions);
}
