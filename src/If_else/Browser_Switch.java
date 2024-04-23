package src.If_else;

import java.util.Scanner;

public class Browser_Switch {
    public static void main(String[] args) {
        Scanner scr =new Scanner(System.in);
        System.out.println("Enter browser name: Chrome,firefox,edge, opera");
       String browser=  scr.next();
       switch(browser){
           case "Chrome":
               System.out.println("Execute the crome code");
               break;
           case "firefox":
               System.out.println("Execute the code firefox");
               break;
           case "edge":
               System.out.println("Execute the code from edge");
               break;
       }
    }
}
