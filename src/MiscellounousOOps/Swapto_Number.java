package src.MiscellounousOOps;

public class Swapto_Number {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before value of swap number");
        System.out.println("Value of a"+a);
        System.out.println("Value of b"+b);

//        int temp =a;
//        a=b;
//        b=temp;
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("After value of swap number");
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);

    }
}
