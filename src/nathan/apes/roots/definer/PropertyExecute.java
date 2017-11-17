package nathan.apes.roots.definer;

import nathan.apes.roots.identifier.Identity;

public class PropertyExecute implements Identity{

    private String identity;
    private Runnable execution;

    public PropertyExecute(String identity, Runnable execution) {
        this.identity = identity;
        this.execution = execution;
    }

    public Runnable getExecution(){ return execution; }

    public void setExecution(Runnable execution) { this.execution = execution; }

    @Override
    public String getIdentity() {
        return identity;
    }

    @Override
    public void setIdentity(String identity) {
        this.identity = identity;
    }
}