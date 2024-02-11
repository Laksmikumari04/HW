//package src.MiscellounousOOps;
//
//import java.util.Scanner;
//
//public class TEst {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter String,For Check Palindrome");
//        String user_input =scanner.next();
//       boolean result=  ispalindrome(user_input);
//       if(result){
//           System.out.println("This is a Palindrome");
//       }
//       else{
//           System.out.println("This is not a Plaindrome");
//       }
//    }
//
//    private static boolean ispalindrome(String userInput) {
//        StringBuilder reverseoutput = new StringBuilder(userInput);
//        reverseoutput.reverse();
//        return userInput.equalsIgnoreCase(reverseoutput.toString());
//    }
//}
