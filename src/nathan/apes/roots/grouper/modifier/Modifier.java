package nathan.apes.roots.grouper.modifier;

import nathan.apes.roots.identifier.Identity;
import nathan.apes.roots.definer.Property;

import java.util.Collection;

public interface Modifier extends Identity{

    Property getProperty(String identity);
    void setProperty(String identity, Property replacementProperty);

    Collection<Property> getProperties();
    void clearProperties();
}
