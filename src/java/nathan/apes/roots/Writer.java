package nathan.apes.roots;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

//Writer: Faster code for writing to files

public class Writer {

    private final File file;
    private BufferedWriter writer;

    //Access Writer
    public Writer(File file){
        //Set File
        this.file = file;

        //Open the BufferedWriter
        try {
            writer = new BufferedWriter(new FileWriter(this.file, true));
            new Printer("Opened file.");
        } catch (IOException e){
            new Printer("Error in setting file. Maybe a broken path? Otherwise troubleshoot.");
            e.printStackTrace();
        }
    }

    //Write
    public void write(String line) {
        try {
            //Get File Size for Seeing if the File Has Been Written On
            BasicFileAttributes sizeDescriptor = Files.readAttributes(this.file.toPath(), BasicFileAttributes.class);

            //Only Write a Line Break if the File Already has Data, Otherwise Write Data
            if (sizeDescriptor.size() == 0)
                writer.write(line);
            else {
                writer.newLine();
                writer.write(line);
            }

            //Send data
            writer.flush();
            new Printer("Line Written.");
        } catch (IOException e) {
            new Printer("Error in writing to file. Troubleshooting is probably necessary.");
            e.printStackTrace();
        }
    }

    //Close writing stream
    public void close(){
        try {
            writer.close();
            new Printer("Closed stream.");
        } catch (IOException e){
            new Printer("Error in writing to file. Troubleshooting is probably necessary.");
            e.printStackTrace();
        }
    }

    //Ease for Constructor Parameter
    public static File fromString(String string){ return new File(string); }

    //Create the file, if not already created
    public void finalizeFile(){
        try {
            file.createNewFile();
            new Printer("Created file '" + file.getName() + "' on disk.");
        } catch (IOException e){
            new Printer("Error in creating file on disk. Troubleshooting is probably necessary.");
            e.printStackTrace();
        }
    }
}