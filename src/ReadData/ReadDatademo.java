package src.ReadData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadDatademo  {
    public static void main(String[] args) throws IOException {
        //Create of object of file reader
        FileReader fr = new FileReader("C:\\Users\\laki\\IdeaProjects\\HW\\src\\Read_Write\\properties\\Testdata\\TestData.properties");
        //Create of Object of Properties Class
        Properties p =new Properties();
        //Step 3 : Load the file
        p.load(fr);
        //Step 4: use get Property method to get Property
        System.out.println(p.getProperty("name"));
    }


}
