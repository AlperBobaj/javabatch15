package class31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo2 {
    public static void main(String[] args) throws IOException {

        /*
        Path where we want to create the new file and the name of the file with its extension
         */

        String path="Files/test.properties";
        /*
        we use FileOutputStream when we have to write the data to a file
         */
        FileOutputStream fileOutputStream=new FileOutputStream(path);

        Properties properties=new Properties();
        /*
        we use the setProperty method to store data inside a properties files
         */
        properties.setProperty("Name","Anees");
        /*
        A method to write the data to the disk
         */
        properties.store(fileOutputStream,"A new has been added");
    }
}
