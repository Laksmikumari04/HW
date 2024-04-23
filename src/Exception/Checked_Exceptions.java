package src.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked_Exceptions {
    public static void main(String[] args) {
        //Compile time by compiler
        try {
            FileInputStream file = new FileInputStream("file.text");
        }catch (FileNotFoundException e){
            System.out.println("File not Found :"+e.getMessage());
        }
        try{
            String value=null;
            System.out.println(value.length());}
        catch (NullPointerException e){
            System.out.println("Value can't be null :"+e.getMessage());
        }
    }
}
