package nathan.apes.roots.grouper.modifier.adder;

import nathan.apes.roots.grouper.modifier.Modifier;
import nathan.apes.roots.definer.Property;

import java.util.Collection;

public interface Adder extends Modifier{

    void addProperty(Property property);
    void addAllProperty(Collection<Property> properties);
}
