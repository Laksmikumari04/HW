package src.String_Questions;

public class Remove {
    public static void main(String[] args) {
        String str="Hello Worlde";
        System.out.println(str.replaceAll("World","123"));
        System.out.println(str.replaceAll("[Wrld]","123"));
        System.out.println(str.replaceAll("e","1"));
        System.out.println(str.replaceAll("[aeiou]"," "));
        System.out.println(str.replaceAll("[^a-zA-Z]+",""));
        System.out.println(str.replaceAll("l",""));
      ////  str= str.replaceAll("[^a-zA-Z]+", "");
        //System.out.println(str);

    }
}
