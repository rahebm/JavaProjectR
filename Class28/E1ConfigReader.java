package Class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        //String path="C:\\Users\\Raheb\\IdeaProjects\\JavaprojectR\\Files\\Config.properties"; //located the file this is the first step.
        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";
        FileInputStream fis=new FileInputStream(path); //moves the file from perm storage to RAM.
        Properties properties=new Properties(); //That one class/software that will assist us to read/write data from file.
        properties.load(fis);
        System.out.println(properties.get("userName"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));

        System.out.println(System.getProperty("user.dir"));


    }
}
