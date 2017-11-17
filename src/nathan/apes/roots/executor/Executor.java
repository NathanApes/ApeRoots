package nathan.apes.roots.executor;

import nathan.apes.roots.definer.PropertyExecute;
import nathan.apes.roots.executor.modifier.Modifier;

import java.util.ArrayList;
import java.util.Collection;

public class Executor implements Modifier{

    private String identity;
    private Collection<PropertyExecute> executions;

    public Executor(String identity){
        this.identity = identity;
        this.executions = new ArrayList<>();
    }

    public Executor(String identity, Collection<PropertyExecute> executions){
        this.identity = identity;
        this.executions = executions;
    }

    public void executeFunction(String identity){
        getExecution(identity).getExecution().run();
    }

    public void executeFunctions(){
        getExecutions().forEach(execution -> execution.getExecution().run());
    }

    @Override
    public PropertyExecute getExecution(String identity){
        for(int i = 0; i < getExecutions().size(); i++)
            if(((ArrayList<PropertyExecute>)getExecutions()).get(i).getIdentity().equalsIgnoreCase(identity))
                return ((ArrayList<PropertyExecute>)getExecutions()).get(i);

        return null;
    }

    @Override
    public void setExecution(String identity, PropertyExecute replacementExecution) {
        PropertyExecute execution = getExecution(identity);
        getExecutions().remove(execution);
        getExecutions().add(replacementExecution);
    }

    @Override
    public Collection<PropertyExecute> getExecutions(){ return executions; }

    @Override
    public void clearExecutions(){ getExecutions().clear(); }

    @Override
    public String getIdentity() {
        return identity;
    }

    @Override
    public void setIdentity(String identity) {
        this.identity = identity;
    }
}
