package nathan.apes.roots.grouper;

import nathan.apes.roots.grouper.modifier.Modifier;
import nathan.apes.roots.definer.Property;

import java.util.ArrayList;
import java.util.Collection;

public class Grouper implements Modifier{

    private String identity;
    private Collection<Property> properties;

    public Grouper(String identity){
        this.identity = identity;
        this.properties = new ArrayList<>();
    }

    public Grouper(String identity, Collection<Property> properties){
        this.identity = identity;
        this.properties = properties;
    }

    public GrouperAdder toGrouperAdder(String identity){
        return new GrouperAdder(identity, getProperties());
    }

    public GrouperRemover toGrouperRemover(String identity){
        return new GrouperRemover(identity, getProperties());
    }

    @Override
    public Property getProperty(String identity) {
        for(int i = 0; i < getProperties().size(); i++)
            if(((ArrayList<Property>) getProperties()).get(i).getIdentity().equalsIgnoreCase(identity))
                return ((ArrayList<Property>)getProperties()).get(i);

        return null;
    }

    @Override
    public void setProperty(String identity, Property replacementProperty) {
        Property property = getProperty(identity);
        getProperties().remove(property);
        getProperties().add(replacementProperty);
    }

    @Override
    public Collection<Property> getProperties() {
        return properties;
    }

    @Override
    public void clearProperties() {
        getProperties().clear();
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
