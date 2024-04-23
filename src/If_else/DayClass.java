package src.If_else;

import java.util.Scanner;

public class DayClass {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter digit 1 to 7, I'lll tell you about day");
      int daynumber=  scr.nextInt();
      switch (daynumber){
          case 1:
              System.out.println("Mon");
              break;
          case 2:
              System.out.println("Tue");
              break;
          case 3:
              System.out.println("Wed");
              break;
          case 4:
              System.out.println("Thur");
              break;
          case 5:
              System.out.println("Fri");
              break;
          case 6:
              System.out.println("Sat");
              break;
          case 7:
              System.out.println("Sun");
              break;
          default:
              System.out.println("You enter wrong number");
      }
        System.out.println("Code is End");

    }
}
