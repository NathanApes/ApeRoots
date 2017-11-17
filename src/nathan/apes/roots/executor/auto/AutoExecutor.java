package nathan.apes.roots.executor.auto;

import nathan.apes.roots.definer.PropertyExecute;
import nathan.apes.roots.executor.Executor;

import java.util.Collection;
import java.util.Timer;
import java.util.TimerTask;

public class AutoExecutor extends Executor {

    private String identity;
    private Collection<PropertyExecute> executions;

    private boolean runAuto;

    public AutoExecutor(String identity, Collection<PropertyExecute> executions, boolean runAuto) {
        super(identity, executions);
        this.identity = identity;
        this.executions = executions;
        this.runAuto = runAuto;

        autoStart();
    }

    public void autoStart(){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {public void run() { if(getAuto()){ executeFunctions(); setAuto(false); timer.cancel(); } }}, 0L, 200L);
    }

    public boolean getAuto(){ return runAuto; }

    public void setAuto(boolean b){ runAuto = b; }
}
