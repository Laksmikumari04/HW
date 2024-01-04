package src.basic;

public class Lab008 {
    public static void main(String[] args) {
        int number=9;
        //System.out.printf("%d*1=%d*1",number,2);

        //Why are using this ?
        //Formatting Purpose
        String name= "LAKI";//bunch of character
        //Concate +
        System.out.println("My name is " +name);
        //Formatting way
        System.out.printf("My name is %s",name);
        System.out.println();
        //%d for byte short int long
        //%c for char
        //%s for string
        //%f for float
        float pi =2424242.09f;
        System.out.printf("your value is %f",pi);
    }
}
