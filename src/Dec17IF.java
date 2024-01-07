package src;
import java.util.Scanner;
public class Dec17IF {
    public static void main(String[] args){
        //Create a markesheet by user input

        Scanner scr =new Scanner(System.in);
        System.out.println("Enter the Student score");
        int score =scr.nextInt();

        if ( score >=90 && score <=100)
        {
            System.out.println("Your Score --> A ");
        } else if (score >=80 && score <=89)
        {
            System.out.println("Your Score --> B ");
        }
        else if(score >=70 && score<=79)
        {
            System.out.println("Your Score ---> C");
        }
    }
}
