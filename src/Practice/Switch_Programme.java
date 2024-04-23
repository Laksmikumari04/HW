package src.Practice;

import java.util.Scanner;

public class Switch_Programme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter char");
       String input= scan.next();

       // String name="ShoOtme";
        switch (input){
            case "S":
                System.out.println("It's a String");
                break;
            case"h":
                System.out.println("It's a String");
                break;
            case "o":
                System.out.println("It's a String");
                break;
            case "O":
                System.out.println("It's a String");
                break;
            case "t":
                System.out.println("It's a String");
                break;
            case "m":
                System.out.println("It's a String");
                break;
            case "e":
                System.out.println("It's a String");
                break;
            default:
                System.out.println("It;s not a String");
                break;


        }
    }
}
