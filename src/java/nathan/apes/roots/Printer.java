package nathan.apes.roots;

//Printer: Printing Utility

public class Printer {

    private final String output;
    private static String prefix = "[ROOTS]: ";
    private final boolean enter;
    private final boolean error;

    //Printer Regular
    private Printer(String output){
        this.output = output;
        this.enter = true;
        this.error = false;
        print();
    }

    //Printer with carriage return option
    private Printer(String output, boolean noReturn){
        this.output = output;
        this.enter = !noReturn;
        this.error = false;
        print();
    }

    //Printer with error option
    private Printer(String output, boolean noReturn, boolean error){
        this.output = output;
        this.enter = !noReturn;
        this.error = error;
        print();
    }

    //Main Static Access to Printing
    public static void print(String output){ new Printer(output); }
    public static void printError(String output){ new Printer(output, false, true); }
    public static void printNoReturn(String output){ new Printer(output, true); }

    //Print function
    private void print(){
        //Set Prefixes
        String messagePrefix = prefix;
        if(this.error)
            messagePrefix = messagePrefix.concat("[ERROR]: ");

        //Combine prefix and output for printing
        String finalOutput = messagePrefix + this.output;

        //System print
        if(enter)
            System.out.println(finalOutput);
        else
            System.out.print(finalOutput);
    }

    //Set Custom Prefix
    public static void setCustomPrefix(String customPrefix){ prefix = prefix.replace("ROOTS", customPrefix); }
}
