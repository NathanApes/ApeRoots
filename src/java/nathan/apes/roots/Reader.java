package nathan.apes.roots;

import java.io.*;

//Reader: Faster code for reading files - Instantiate constructor to retrieve file content!

public class Reader {

    private final File file;
    private Grouper<String> content;

    //Setup for reading
    public Reader(String file){
        this.file = new File(file);
        this.content = new Grouper<>();
        read();
    }

    //Read
    private void read(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            new Printer("Initiating Reading Sequence.");

            reader.lines().forEach(line -> content.add(line));
            reader.close();
            new Printer("Closed stream. Data has been read.");
        } catch (IOException e) { new Printer("Error in reading data... \n" + e.getMessage()); }
    }

    //Get the Read Content
    public Grouper<String> getReadContent() {
        return content;
    }
}
