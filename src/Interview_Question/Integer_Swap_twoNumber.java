package src.Interview_Question;

import src.MiscellounousOOps.Sorting;

public class Integer_Swap_twoNumber {
    public static void main(String[] args) {
        int a=10, b=20;
        System.out.println("Before swap Value is: ");
        System.out.println("A value is:"+a);
        System.out.println("B value is :"+b);
        System.out.println("_____________________");

//        int temp =a;
//         a=b;
//         b=temp;

        //Using Arithmatic logic
        a =a-b;
        b=a+b;
        a=b-a;

        System.out.println("After swap Value is: ");
        System.out.println("A value is:"+a);
        System.out.println("B value is :"+b);

    }


}
