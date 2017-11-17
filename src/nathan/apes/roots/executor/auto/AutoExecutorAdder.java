package nathan.apes.roots.executor.auto;

import nathan.apes.roots.definer.PropertyExecute;
import nathan.apes.roots.executor.modifier.adder.Adder;

import java.util.Collection;
import java.util.Timer;
import java.util.TimerTask;

public class AutoExecutorAdder extends AutoExecutor implements Adder {

    private String identity;
    private Collection<PropertyExecute> executions;

    private boolean runAuto;

    public AutoExecutorAdder(String identity, Collection<PropertyExecute> executions, boolean runAuto) {
        super(identity, executions, runAuto);
        this.identity = identity;
        this.executions = executions;
        this.runAuto = runAuto;

        autoStart();
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
