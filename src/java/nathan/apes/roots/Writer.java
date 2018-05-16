package nathan.apes.roots;

import java.io.*;

//Writer: Faster code for writing to files - Instantiate constructor and it writes!

public class Writer {

    private final File file;
    private final Grouper<String> content;
    private final boolean startAtEnd;

    //Setup Writer
    public Writer(File file, Grouper<String> content, boolean startAtEnd){
        this.file = file;
        this.content = content;
        this.startAtEnd = startAtEnd;
        write();
    }

    //Write to file
    private void write(){
        //Include whats already written
        if(startAtEnd) {
            Grouper<String> dataAlreadyInFile = new Reader(file).getReadContent();
            dataAlreadyInFile.addAll(content);
            content.clear();
            content.addAll(dataAlreadyInFile);
        }

        //Write Process
        try {
            //Create BufferedWriter
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(this.file));
            new Printer("Initiating writing sequence.");

            //Write each line of content
            for(String line : this.content) {
                fileWriter.write(line);
                fileWriter.newLine();
            }
            fileWriter.flush();
            fileWriter.close();
            new Printer("Closed Stream. Data has been written.");
        } catch (IOException e) { new Printer("Error in writing data... \n" + e.getMessage()); }
    }

    //Ease for Constructor Parameter
    public static File convertStringToFile(String stringFile){ return new File(stringFile); }

    //Create the file specified
    public void finalizeFile(){
        try {
            file.createNewFile();
        } catch (IOException e){
            new Printer("Error in creatng file on disk... \n" + e.getMessage());
        }
    }
}