package src.basic_23Dec;

import java.util.Scanner;

public class Lab069 {
    public static void main(String[] args) {
        // Take a user input and print the information

        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter the  Name");
        String name =user_input.next();
        System.out.println("Enter the Age");
        int age = user_input.nextInt();
        System.out.println("Enter the Salary");
        double salary =user_input.nextDouble();
        System.out.println("Your details are" + name +" " + age+ " " +salary);
        user_input.close();
    }
}
