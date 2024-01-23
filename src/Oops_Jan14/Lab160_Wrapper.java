package src.Oops_Jan14;

public class Lab160_Wrapper {
    public static void main(String[] args) {


    int a=10;
    Integer a2 =a; // Primitive to Wrapper
    Integer a3 =Integer.valueOf(a);
    //Uses:
    // Collect framework -> class - Class hates Primitive data types
    // you have to use wrapper class in selenium
    // In Automation also use Wrapper Classes only.

    Character ch ='a';
     //Unboxing -> Character Object to Primitive Conversions
    char v =ch;
        System.out.println(Integer.max(45,78));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.min(10,20));

        double d=90.87;
        String s =String.valueOf(d);
        Double in =Double.valueOf((int) d);



}}
