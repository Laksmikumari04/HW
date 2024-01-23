package src.Oops_Jan14;

public class WrapperClass {
    // A wrapper Class is a class whose object warp or contain Primitive data types.
    //They convert primitive data.
    // Data Structure in the Collection framework such as Arraylist and vector store only
    // objects references not primitive types.
    // Primitive to Wrapper
    //  to Primitives
    public static void main(String[] args) {
        int x=123;
       // String st1 =x;
        //String st1 = (String)x;
        String st1 =x+"";
        String s1 =String.valueOf(x);
        System.out.println(st1);
        System.out.println(s1);
    }
}

