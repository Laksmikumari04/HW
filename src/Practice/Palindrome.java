package src.Practice;

public class Palindrome {
    public static void main(String[] args) {
        String name="NAMAN";
         boolean result= isPlaindrome(name);
         if (result){
             System.out.println("This is Palindrome");
         }
         else{
             System.out.println("This is not Palindrome");
         }

    }

    public static boolean isPlaindrome(String name){
        String OriginalName=name;
        StringBuffer reversename=new StringBuffer(OriginalName);
        reversename.reverse();
      return OriginalName.equalsIgnoreCase(reversename.toString());
    }
}
