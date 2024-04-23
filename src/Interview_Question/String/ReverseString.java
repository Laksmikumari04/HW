package src.Interview_Question.String;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello World";
      String rev=  ReverseMethod(str);
        System.out.println(rev);
    }
    public static String ReverseMethod(String str){
        StringBuffer reversestring=new StringBuffer();
       // for(int i=0;i<str.length()-1;i--)
         for (int i = str.length() - 1; i >= 0; i--){
            reversestring.append(str.charAt(i));
        }
        return reversestring.toString();
    }
}
