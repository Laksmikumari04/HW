package src.String_Questions;

public class String_replacenull {
    public static void main(String[] args) {

        String str = "For learning Java, JavaTpoint is a very good site.";
        int size=str.length();
        System.out.println(size);
        String target=null;
      str=  str.replace(target,"JavaT");
        System.out.println(str);
    }
}
