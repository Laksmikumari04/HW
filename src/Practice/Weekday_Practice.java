package src.Practice;

import java.util.Scanner;

public class Weekday_Practice {
    public static void main(String[] args) {
        //int number1=10,number2=20;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first Number");
        int number1= scan.nextInt();
        System.out.println("Enter the Second number ");
       int number2= scan.nextInt();
        System.out.println("Select Symbol(+-*/)");
      String calculator =  scan.next();
        //String calculator="-";
      int res;
      switch (calculator){
          case "+":res=number1+number2;
              System.out.println("Addition is :"+res);
              break;
          case "-":res=number1-number2;
              System.out.println("Substraction is :"+res);
              break;
          case "*":res=number1*number2;
              System.out.println("Multiplication is "+res);
              break;
          case"/":res=number1/number2;
              System.out.println("Division is "+res);
              break;
          default:
              System.out.println("It'Invalid Symbol");
      }

    }
}
