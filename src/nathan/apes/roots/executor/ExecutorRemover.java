package nathan.apes.roots.executor;

import nathan.apes.roots.definer.PropertyExecute;
import nathan.apes.roots.executor.modifier.remover.Remover;

import java.util.ArrayList;
import java.util.Collection;

public class ExecutorRemover extends Executor implements Remover{

    private String identity;
    private Collection<PropertyExecute> executions;

    public ExecutorRemover(String identity){
        super(identity);
        this.identity = identity;
        this.executions = new ArrayList<>();
    }

    public ExecutorRemover(String identity, Collection<PropertyExecute> executions) {
        super(identity);
        this.identity = identity;
        this.executions = executions;
    }

    @Override
    public void removeExecution(PropertyExecute execution) {
        getExecutions().remove(execution);
    }

    @Override
    public void removeAllExecution(Collection<PropertyExecute> executions) {
        getExecutions().removeAll(executions);
    }
}
