package nathan.apes.roots.grouper;

import nathan.apes.roots.grouper.modifier.adder.Adder;
import nathan.apes.roots.definer.Property;

import java.util.ArrayList;
import java.util.Collection;

public class GrouperAdder extends Grouper implements Adder{

    private String identity;
    private Collection<Property> properties;

    public GrouperAdder(String identity){
        super(identity);
        this.identity = identity;
        this.properties = new ArrayList<>();
    }

    public GrouperAdder(String identity, Collection<Property> properties) {
        super(identity, properties);
        this.identity = identity;
        this.properties = properties;
    }

    @Override
    public void addProperty(Property property) {
        getProperties().add(property);
    }

    @Override
    public void addAllProperty(Collection<Property> properties) {
        getProperties().addAll(properties);
    }
}
