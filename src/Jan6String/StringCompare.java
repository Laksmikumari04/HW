package src.Jan6String;

public class StringCompare {
    // There are three ways to Compare
//    1. by Using equals() Method --->It's compare only Object Content
//    2. by Using ==Operator --------> It's compare reference
//    3. by compareTo()Method
    public static void main(String[] args) {
        String s1 ="Sachin";
        String s2="Sachin";
        String s3 =new String("Sachin");
        String s4 =new String("Sourav");
        String s5 = new String("sachin");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
        System.out.println(s1.equals(s5));//false
        System.out.println(s1.equalsIgnoreCase(s5));//true

        //Equal Operator
        System.out.println("Equal Operator Exapmple O/p:");
        String s6="Sachin";
        String s7="Sachin";
        String s8 = new String("Sachin");
        System.out.println(s6==s7);// true (both reference  is same instance means Literal, created in "String Constant Pool")
        System.out.println(s6==s8); // false (because s8  refer to new keyword means created in non pool)
    }
}
