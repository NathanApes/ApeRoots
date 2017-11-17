package nathan.apes.roots.executor.timed;

import nathan.apes.roots.definer.PropertyExecute;
import nathan.apes.roots.executor.modifier.remover.Remover;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Timer;

public class TimedExecutorRemover extends TimedExecutor implements Remover{

    private String identity;
    private Collection<PropertyExecute> executions;

    private long timedDelay;
    private long timedPeriod;

    private Timer executionTimer;

    public TimedExecutorRemover(String identity, long delay) {
        super(identity, delay);
        this.identity = identity;
        this.executions = new ArrayList<>();
        this.timedDelay = delay;

        startCycle(getTimedDelay());
    }

    public TimedExecutorRemover(String identity, long delay, long period) {
        super(identity, delay, period);
        this.identity = identity;
        this.executions = new ArrayList<>();
        this.timedDelay = delay;
        this.timedPeriod = period;

        startCycle(getTimedDelay(), getTimedPeriod());
    }

    public TimedExecutorRemover(String identity, Collection<PropertyExecute> executions, long delay) {
        super(identity, executions, delay);
        this.identity = identity;
        this.executions = executions;
        this.timedDelay = delay;

        startCycle(getTimedDelay());
    }

    public TimedExecutorRemover(String identity, Collection<PropertyExecute> executions, long delay, long period) {
        super(identity, executions, delay, period);
        this.identity = identity;
        this.executions = executions;
        this.timedDelay = delay;
        this.timedPeriod = period;

        startCycle(getTimedDelay(), getTimedPeriod());
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
