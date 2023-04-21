package class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo3 {
    public static void main(String[] args) throws IOException {

        String path="Files/config.properties";

        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();

        properties.setProperty("Name","Alper");
        properties.store(fileOutputStream,"A new has added");


    }
}
