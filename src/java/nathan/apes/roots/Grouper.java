package nathan.apes.roots;

import java.util.ArrayList;

//TODO: Add ArrayList utility methods when thought of

public class Grouper<T> extends ArrayList<T> {

    //Importing from regular
    //NOTE: Only works with empty Grouper's!
    public void importFromArray(T[] array){
        clear();
        for(T element : array)
            add(element);
    }
}