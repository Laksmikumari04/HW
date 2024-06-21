package src.Array_InterviewQuestion;

public class Vowel_String {
    public static void main(String[] args) {
        String input = "Hello World"; // Example input string
        input = input.toLowerCase(); // Convert the input to lowercase for case-insensitive comparison

        String vowels = "";
        String consonants = "";

        for (char ch : input.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels += ch+" " ;
                //System.out.println("It's a vowel :" + ch);

            } else if (Character.isLetter(ch)) {
                 consonants += ch + " ";
                //System.out.println("It's a consonants :" + ch);
            }
        }

        System.out.println("Vowels: " + vowels);

         System.out.println("Consonants: " + consonants);
    }
}

