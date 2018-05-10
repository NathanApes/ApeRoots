package nathan.apes.roots;

//Printer: Printing Utility

public class Printer {

    private final String output;

    //Printer Setup
    public Printer(String output){
        this.output = output;
        print();
    }

    //Print
    private void print(){
        //Set logging prefix before printing output
        String prefix = "[ApeRoots]: ";

        //Output
        if(output.contains("\n")) {
            String[] lineBreakOutput = output.split("\n");
            for(String line : lineBreakOutput)
                System.out.println(prefix + line);
        } else
            System.out.println(prefix + output);
    }
}
