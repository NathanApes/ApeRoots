package nathan.apes.roots;

//Sleeper: Utility sleep command

public class Sleeper {

    public static void sleep(long time){
        //Set Time to Wake
        long projectedTime = System.currentTimeMillis() + time;

        //Wait for Wake Time
        while(true)
            if(System.currentTimeMillis() == projectedTime)
                break;
    }
}
