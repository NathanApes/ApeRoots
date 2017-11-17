package nathan.apes.roots.executor.auto;

import nathan.apes.roots.definer.PropertyExecute;
import nathan.apes.roots.executor.modifier.remover.Remover;

import java.util.Collection;
import java.util.Timer;
import java.util.TimerTask;

public class AutoExecutorRemover extends AutoExecutor implements Remover{

    private String identity;
    private Collection<PropertyExecute> executions;

    private boolean runAuto;

    public AutoExecutorRemover(String identity, Collection<PropertyExecute> executions, boolean runAuto) {
        super(identity, executions, runAuto);
        this.identity = identity;
        this.executions = executions;
        this.runAuto = runAuto;

        autoStart();
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
