package nathan.apes.roots;

import java.io.*;

import static nathan.apes.roots.Printer.print;
import static nathan.apes.roots.Printer.printError;

//Reader: Faster code for reading files

public class Reader {

    private BufferedReader reader;

    private boolean verbose;

    //Default Constructor
    public Reader(){}

    //Access Reader
    public Reader(File file) {
        //Set Verbose
        this.verbose = false;

        //Open the Buffered Reader
        try {
            this.reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e){
            printError("Error while setting file. Maybe a broken path? Otherwise troubleshoot.");
            e.printStackTrace();
        }
    }

    //Read
    public String read() {
        try {
            if(!verbose)
                print("Reading...");
            return reader.readLine();
        } catch (IOException e) {
            printError("Error while reading line. Troubleshooting is probably necessary.");
            e.printStackTrace();
        }
        return null;
    }

    //Close reading stream
    public void close(){
        try {
            reader.close();
            if(!verbose)
                print("Closed stream.");
        } catch (IOException e){
            printError("Error in closing stream. Troubleshooting is probably necessary.");
            e.printStackTrace();
        }
    }

    //Get status of data stream
    public boolean isValid(){
        try {
            return reader.ready();
        } catch (IOException e){
            printError("Error in checking stream status. Troubleshooting is probably necessary.");
            e.printStackTrace();
        }
        return false;
    }

    //Specifies SilentRunning
    public void verbose(boolean verbose){ this.verbose = verbose; }

    //Ease for Constructor Parameter
    public static File fromString(String path){ return new File(path); }
}
