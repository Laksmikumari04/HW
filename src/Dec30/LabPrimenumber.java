package src.Dec30;

import java.util.Scanner;

public class LabPrimenumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number");

        int number =scr.nextInt();
        int temp=0;
        for (int i=2; i<=number-1; i++){
            if(number%i ==0){
                temp =temp+1;
            }
            if(temp == 0)
            {
                System.out.println(number+" is prime no");
            }
            //System.out.println(number+" is prime no");
            else{
                System.out.println(number+ "is not prime ");
            }

        }

    }
}
