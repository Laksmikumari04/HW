package src.Practice.BasicStringExample;

public class Stringmethod {
    public static void main(String[] args) {
        /*
        Java String class provides a lot of methods to perform operations on strings such as
        compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.
         */
        //Replace
        String name="Lakshmi";
       String replacename= name.replace("a","");
        System.out.println(name);
        System.out.println(replacename);

        //Split
        String value="Today is good day";
        String[] splitValue=value.split("\\s");
      for(String i:splitValue){
           System.out.println(i);

        }
      //Trim value


        }

    }

