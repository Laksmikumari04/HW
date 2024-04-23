package src.Practice;

import java.util.Scanner;

public class Switch_Weekday {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter WeekDay name ");
       String day= scan.next();
       switch(day){
           case"Monday":
               System.out.println("It's a Weekday");
               break;
           case"Tuesday":
               System.out.println("It's a Weekday");
               break;
           case"Wednesday":
               System.out.println("It's a Weekday");
               break;
           case"Thurday":
               System.out.println("It's a Weekday");
               break;
           case"Friday":
               System.out.println("It's a Weekday");
               break;case"Saturday":
               System.out.println("It's a Weekday");
               break;
               case"Sunday":
               System.out.println("It's a Weekday");
               break;
           default:
               System.out.println("It not valid Input");


       }
    }
}
