package src.basic_23Dec;

import java.util.Scanner;

public class Lab068If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X");
        double x= sc.nextDouble();
        System.out.println("Enter the Y");
        double y= sc.nextDouble();
        System.out.println("Enter the Z");
        double z= sc.nextDouble();

        double result =0;

        // 3/ x^2 + y^2 -|z|
        // A+B+C -> A-> X^2, B-> Y^2, C ->|Z| abs(Z) -1 -> 1, -199.98 -> +199.98
        result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) -Math.abs(z));
        System.out.println(result);

        sc.close();
        //sc.nextInt();
        //sc.nextDouble()
       //sc.nextFloat()
        // sc.toString();
       // sc.nextBoolean();

    }
}
