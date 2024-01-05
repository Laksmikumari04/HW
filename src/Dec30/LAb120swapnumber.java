package src.Dec30;

import java.util.Scanner;

public class LAb120swapnumber {
    public static void main(String[] args) {

        Scanner swapnumber = new Scanner(System.in);
       System.out.println("Value of a");
       int a =swapnumber.nextInt();
        System.out.println("Value of b");
        int b = swapnumber.nextInt();

        int c = a;  // 10 here already a is 10
         a =b;        //   20 now b value is 20 reason a value is 20
         b=c;    //10 now C value is 10 reason b value is 10
        System.out.println("Value of a"+ " "+ a);
        System.out.println("Value of b"+ " "+ b);
    }
}
