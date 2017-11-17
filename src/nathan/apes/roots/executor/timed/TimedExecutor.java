package nathan.apes.roots.executor.timed;

import nathan.apes.roots.definer.PropertyExecute;
import nathan.apes.roots.executor.Executor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Timer;
import java.util.TimerTask;

public class TimedExecutor extends Executor {

    private String identity;
    private Collection<PropertyExecute> executions;

    private long timedDelay;
    private long timedPeriod;

    private Timer executionTimer;

    public TimedExecutor(String identity, long delay) {
        super(identity);
        this.identity = identity;
        this.executions = new ArrayList<>();
        this.timedDelay = delay;

        startCycle(getTimedDelay());
    }

    public TimedExecutor(String identity, long delay, long period) {
        super(identity);
        this.identity = identity;
        this.executions = new ArrayList<>();
        this.timedDelay = delay;
        this.timedPeriod = period;

        startCycle(getTimedDelay(), getTimedPeriod());
    }

    public TimedExecutor(String identity, Collection<PropertyExecute> executions, long delay) {
        super(identity, executions);
        this.identity = identity;
        this.executions = executions;
        this.timedDelay = delay;

        startCycle(getTimedDelay());
    }

    public TimedExecutor(String identity, Collection<PropertyExecute> executions, long delay, long period) {
        super(identity, executions);
        this.identity = identity;
        this.executions = executions;
        this.timedDelay = delay;
        this.timedPeriod = period;

        startCycle(getTimedDelay(), getTimedPeriod());
    }

    public void startCycle(long timedDelay){
        executionTimer = new Timer();
        executionTimer.schedule(new TimerTask() {public void run() { executeFunctions(); terminateTimedExecutions(); }}, timedDelay);
    }

    public void startCycle(long timedDelay, long timedPeriod){
        executionTimer = new Timer();
        executionTimer.schedule(new TimerTask() {public void run() { executeFunctions();}}, timedDelay, timedPeriod);
    }

    public void terminateTimedExecutions(){
        executionTimer.cancel();
    }

    public long getTimedDelay() { return timedDelay; }

    public void setTimedDelay(long timedDelay) { this.timedDelay = timedDelay; }

    public long getTimedPeriod() {
        return timedPeriod;
    }

    public void setTimedPeriod(long timedPeriod) { this.timedPeriod = timedPeriod; }
}
