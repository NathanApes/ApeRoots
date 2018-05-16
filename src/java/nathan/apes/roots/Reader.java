package nathan.apes.roots;

import java.io.*;

//Reader: Faster code for reading files - Instantiate constructor to retrieve file content!

public class Reader {

    private final File file;
    private final Grouper<String> content;

    //Setup for reading
    public Reader(File file) {
        this.file = file;
        this.content = new Grouper<>();
        read();
    }

    public Reader(File file, boolean continuous){
        this.file = file;
        this.content = new Grouper<>();
        read();
    }

    //Read
    private void read() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            new Printer("Initiating Reading Sequence.");

            //Read File
            reader.lines().forEach(line -> content.add(line));
            reader.close();
            new Printer("Closed stream. Data has been read.");
        } catch (IOException e) {
            new Printer("Error in reading data... \n" + e.getMessage());
        }
    }

    //Get the Read Content
    public Grouper<String> getReadContent() {
        return content;
    }

    //Ease for Constructor Parameter
    public static File convertStringToFile(String stringFile){ return new File(stringFile); }
}
