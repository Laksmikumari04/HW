package src.PracticeP;

public class String_Palindrome01 {
    public static void main(String[] args) {
        String name="mame";
        // length, charAT(), equals
      int lenght=   name.length();
      String reverse="";
      for(int i=lenght-1;i>=0;i--){
          reverse=reverse+name.charAt(i);
      }
       // System.out.println(reverse);
        if(name.equals(reverse)){
            System.out.println("This name is Palindrome");
        }
        else{
            System.out.println("This is not palindrome");
        }
    }
}
