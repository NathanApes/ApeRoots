package nathan.apes.roots.executor;

import nathan.apes.roots.definer.PropertyExecute;
import nathan.apes.roots.executor.modifier.adder.Adder;

import java.util.ArrayList;
import java.util.Collection;

public class ExecutorAdder extends Executor implements Adder {

    private String identity;
    private Collection<PropertyExecute> executions;

    public ExecutorAdder(String identity) {
        super(identity);
        this.identity = identity;
        this.executions = new ArrayList<>();
    }

    public ExecutorAdder(String identity, Collection<PropertyExecute> executions) {
        super(identity, executions);
        this.identity = identity;
        this.executions = executions;
    }

    @Override
    public void addExecution(PropertyExecute execution) {
        getExecutions().add(execution);
    }

    @Override
    public void addAllExecution(Collection<PropertyExecute> executions) {
        getExecutions().addAll(executions);
    }
}
