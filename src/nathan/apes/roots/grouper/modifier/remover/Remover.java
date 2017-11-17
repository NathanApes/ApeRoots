package nathan.apes.roots.grouper.modifier.remover;

import nathan.apes.roots.grouper.modifier.Modifier;
import nathan.apes.roots.definer.Property;

import java.util.Collection;

public interface Remover extends Modifier{

    void removeProperty(Property property);
    void removeAllProperty(Collection<Property> properties);
}
