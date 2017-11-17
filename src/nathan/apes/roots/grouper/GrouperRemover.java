package nathan.apes.roots.grouper;

import nathan.apes.roots.definer.Property;
import nathan.apes.roots.grouper.modifier.remover.Remover;

import java.util.ArrayList;
import java.util.Collection;

public class GrouperRemover extends Grouper implements Remover{

    private String identity;
    private Collection<Property> properties;

    public GrouperRemover(String identity) {
        super(identity);
        this.identity = identity;
        this.properties = new ArrayList<>();
    }

    public GrouperRemover(String identity, Collection<Property> properties) {
        super(identity, properties);
        this.identity = identity;
        this.properties = properties;
    }

    @Override
    public void removeProperty(Property property) {
        getProperties().remove(property);
    }

    @Override
    public void removeAllProperty(Collection<Property> properties) {
        getProperties().removeAll(properties);
    }
}
