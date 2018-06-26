package nathan.apes.roots;

import java.io.*;

//Reader: Faster code for reading files

public class Reader {

    private BufferedReader reader;

    //Access Reader
    public Reader(File file) {
        //Open the Buffered Reader
        try {
            this.reader = new BufferedReader(new FileReader(file));
            new Printer("Opened file.");
        } catch (FileNotFoundException e){
            new Printer("Error while setting file. Maybe a broken path? Otherwise troubleshoot.");
            e.printStackTrace();
        }
    }

    //Read
    public String read() {
        try {
            new Printer("Reading...");
            return reader.readLine();
        } catch (IOException e) {
            new Printer("Error while reading line. Troubleshooting is probably necessary.");
            e.printStackTrace();
        }
        return null;
    }

    //Close reading stream
    public void close(){
        try {
            reader.close();
            new Printer("Closed stream.");
        } catch (IOException e){
            new Printer("Error in closing stream. Troubleshooting is probably necessary.");
            e.printStackTrace();
        }
    }

    //Get status of data stream
    public boolean isValid(){
        try {
            return reader.ready();
        } catch (IOException e){
            new Printer("Error in checking stream status. Troubleshooting is probably necessary.");
            e.printStackTrace();
        }
        return false;
    }

    //Ease for Constructor Parameter
    public static File fromString(String path){ return new File(path); }
}
