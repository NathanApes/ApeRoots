package nathan.apes.roots.definer;

import nathan.apes.roots.identifier.Identity;

public class Property implements Identity {

    private String identity;
    private Object value;

    public Property(String identity, Object value){
        this.identity = identity;
        this.value = value;
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
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
