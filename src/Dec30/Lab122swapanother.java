package src.Dec30;

import java.util.Scanner;

public class Lab122swapanother {
    public static void main(String[] args) {
        Scanner swapnumber = new Scanner(System.in);
        System.out.println("Value of a");
        int a =swapnumber.nextInt();
        System.out.println("Value of b");
        int b = swapnumber.nextInt();
       // Suppose a =10 & b=20
        a = a*b;      // 10 here already a is 10*20 =200
        b =a/b;         // 200/20 =10
        a =a/b;           // 200/10 =20
        System.out.println("Value of a"+ " "+ a);
        System.out.println("Value of b"+ " "+ b);
    }
}
