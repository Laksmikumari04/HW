package src.Interview_Question;

public class String_Palindrome {
    public static void main(String[] args) {
        String user_input =new String("Mom");
            boolean result= isplaindrome(user_input);
            if(result){
                System.out.println("This String is Palindrome");
            }
            else {
                System.out.println("This is not palindrome");
            }
    }

    private static boolean isplaindrome(String userInput) {
        String OrignalValue =userInput;
        StringBuffer reverseValue =new StringBuffer(OrignalValue);
        reverseValue.reverse();
        return OrignalValue.equalsIgnoreCase(reverseValue.toString());
    }
}
