package nathan.apes.roots;

//Printer: Printing Utility

public class Printer {

    private final String output;
    private final boolean enter;

    //Printer
    public Printer(String output){
        this.output = output;
        this.enter = true;
        print();
    }

    //Printer with carriage return option
    public Printer(String output, boolean noReturn){
        this.output = output;
        this.enter = !noReturn;
        print();
    }

    //Print function
    private void print(){
        //Set Prefix
        String prefix = "[Roots]: ";

        //Combine prefix and output for printing
        String finalOutput = prefix + this.output;

        //System print
        if(enter)
            System.out.println(finalOutput);
        else
            System.out.print(finalOutput);
    }
}
