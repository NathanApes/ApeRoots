package nathan.apes.roots;

import java.util.*;

//Grouper: A Better ArrayList

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

    //Gets the string containing the regex if the Grouper holds String's
    public String getStringContaining(String regex){
        //Check that the Grouper is Grouper<String>
        if((String)get(0) instanceof String) {
            //Look for the String contain the Regex
            for(T object : this) {
                String string = (String) object;
                if (string.contains(regex))
                    return string;
            }
        }
        return null;
    }
}