package nathan.apes.roots.executor.modifier;

import nathan.apes.roots.definer.PropertyExecute;
import nathan.apes.roots.identifier.Identity;

import java.util.Collection;

public interface Modifier extends Identity{

    PropertyExecute getExecution(String identity);
    void setExecution(String identity, PropertyExecute replacementExecution);

    Collection<PropertyExecute> getExecutions();
    void clearExecutions();
}
