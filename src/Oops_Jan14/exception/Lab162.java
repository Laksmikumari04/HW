package src.Oops_Jan14.exception;

public class Lab162 {
    public static void main(String[] args) {
        try {
            String name = null;
            name.trim();
            System.out.println("I am Laki");
        }catch (Exception e){
            System.out.println("You are trying  to null String trim that is not possible to in Java");
        }
        //NullPointerException
        // Note: If no exception is handled, control passed to JVM, which terminates the program

        // Exception: An exception is an event during the execution of a program that disrupts normal flow of instruction
    }
}

