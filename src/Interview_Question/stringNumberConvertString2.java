package src.Interview_Question;

import java.util.HashMap;
import java.util.Map;

public class stringNumberConvertString2 {
    public static void main(String[] args) {
        String input="Hello1world2Java3";
        String output = replaceDigitsWithWords(input);
        System.out.println("Output: " + output);
    }
    public static String replaceDigitsWithWords(String input) {
        // Define mapping between digits and words
        Map<Character, String> digitToWord = new HashMap<>();
        digitToWord.put('1', "One");
        digitToWord.put('2', "Two");
        digitToWord.put('3', "Three");

        StringBuilder result = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        // Iterate through the characters of the input string
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                // If the character is a digit, append it to the current word
                currentWord.append(c);
            } else {
                // If the character is not a digit, append the current word and reset it
                if (currentWord.length() > 0) {
                    result.append(digitToWord.get(currentWord.charAt(0))); // Append corresponding word
                    currentWord.setLength(0); // Reset current word
                }
                // Append the current character
                result.append(c);
            }
        }

        // Append the last word if it exists
        if (currentWord.length() > 0) {
            result.append(digitToWord.get(currentWord.charAt(0)));
        }

        return result.toString();

    }
}
