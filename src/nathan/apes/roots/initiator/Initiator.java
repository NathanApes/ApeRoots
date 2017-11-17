package nathan.apes.roots.initiator;

import nathan.apes.roots.executor.Executor;
import nathan.apes.roots.executor.timed.TimedExecutor;
import nathan.apes.roots.grouper.Grouper;
import nathan.apes.roots.identifier.Identity;

public class Initiator implements Identity{

    private String identity;

    private Grouper qualities;
    private Grouper runtimeTasks;
    private Executor storedTasks;

    public Initiator(String identity, Grouper qualities, Grouper runtimeTasks){
        this.identity = identity;
        this.qualities = qualities;
        this.runtimeTasks = runtimeTasks;
    }

    public Initiator(String identity, Grouper qualities, Grouper runtimeTasks, Executor storedTasks){
        this.identity = identity;
        this.qualities = qualities;
        this.runtimeTasks = runtimeTasks;
        this.storedTasks = storedTasks;
    }

    public void terminateRuntime(){
        getRuntimeTasks().getProperties().forEach(
            executor -> {
                if(executor.getValue() instanceof TimedExecutor)
                    ((TimedExecutor)executor.getValue()).terminateTimedExecutions();
            }
        );
    }

    public Grouper getQualities() {
        return qualities;
    }

    public void setQualities(Grouper qualities) {
        this.qualities = qualities;
    }

    public Grouper getRuntimeTasks() {
        return runtimeTasks;
    }

    public void setRuntimeTasks(Grouper runtimeTasks) {
        this.runtimeTasks = runtimeTasks;
    }

    public Executor getStoredTasks() {
        return storedTasks;
    }

    public void setStoredTasks(Executor storedTasks) {
        this.storedTasks = storedTasks;
    }

    @Override
    public String getIdentity() {
        return identity;
    }

    @Override
    public void setIdentity(String identity) {
        this.identity = identity;
    }
}
