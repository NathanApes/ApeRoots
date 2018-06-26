package nathan.apes.roots;

import java.util.*;

//TODO: Add ArrayList utility methods when thought of

public class Grouper<T> extends ArrayList<T> {

    //Importing from primitive array
    //NOTE: Sets up the Grouper FROM SCRATCH
    public void importFromArray(T[] array){
        clear();
        addAll(Arrays.asList(array));
    }

    //Adds the primitive array to the end of this grouper
    //**Useful for working with primitive arrays
    public void addFromArray(T[] array){
        addAll(Arrays.asList(array));
    }
}