package src.Jan6String;


public class StringBuffer {




    //Java StringBuffer class is used to create mutable (modifiable) String objects.
    //Notes:
    //Java StringBuffer class is thread-safe i.e. multiple threads cannot
    // access it simultaneously. So it is safe and will result in an order.
    //A String that can be modified or changed is known as mutable String.
    public static void main(String[] args) {
        java.lang.StringBuffer src = new java.lang.StringBuffer("Java");
        src.append("Hello");// Now Original String is change
        System.out.println(src);// mutable VAlue has changed

        // Using Insert() Method
        java.lang.StringBuffer value = new java.lang.StringBuffer("Hello");
       java.lang.StringBuffer Changed_Value =value.insert(5,"Java");
        //value.insert(1,"Java");

        //String Buffer Replace()
        java.lang.StringBuffer replace_value = new java.lang.StringBuffer("HEllo");
        System.out.println(replace_value.replace(0,5,"Java"));
       // System.out.println(replace_value.repeat(0,1,"ch"));
        System.out.println("Below is Repeat Valuee");
        replace_value.repeat(2,5);
        //System.out.println(replace_value);
        System.out.println("Delete Method O/P:");
        java.lang.StringBuffer Delete_Method =new java.lang.StringBuffer("Ravi");
        Delete_Method.delete(0,1);
        Delete_Method.deleteCharAt(0);
        System.out.println(Delete_Method);

        System.out.println("Reverse Method O/P:");
        java.lang.StringBuffer Rev =new java.lang.StringBuffer("Lakshmi");
        Rev.reverse();
        System.out.println(Rev);
    }

}






