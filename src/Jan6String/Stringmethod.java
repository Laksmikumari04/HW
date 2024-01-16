package src.Jan6String;

public class Stringmethod {
    public static void main(String[] args) {
        String s1 ="Laki";
        System.out.println(s1.toLowerCase());// all value will come in lower
        System.out.println(s1.toUpperCase());// all value will come in upper
        System.out.println(s1);//

        // trim () method
        String s2 ="  Sachin";
        System.out.println(s2.trim());//eliminates white spaces before and after the String.
        System.out.println(s2);

        //startsWith() & endsWith()
        String s4= "RaviShankar";
        System.out.println(s4.startsWith("Ra"));
        System.out.println(s4.endsWith("ar"));

        //charAt() Method
        String s5 ="RaviShakar";
        System.out.println(s5.charAt(0));//returns a character at specified index.
        System.out.println(s5.charAt(7));

        //length() method
        System.out.println(s5.length());// return lenght of specified String
        System.out.println(s5.intern());

        //The String class valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into String.
         int a =10;
         String s =String.valueOf(a);
        System.out.println(s);
        System.out.println(s+10);
        System.out.println(10+s+10);

        //replace() Method
        String value ="Java is a programming language. Java is a platform. Java is an Island.";
        System.out.println(value.replace("Java","Kava"));

    }
}
