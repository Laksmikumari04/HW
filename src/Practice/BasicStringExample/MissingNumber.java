package src.Practice.BasicStringExample;

public class MissingNumber {
    public static void main(String[] args) {
        // The given string with missing characters
        String str = "abdfghj";

        // The expected full sequence (from 'a' to 'f' in this case)
        String expected = "abcdefghij";

        // Print a message to indicate what the output represents
        //System.out.print("Missing characters: ");

        // Iterate through each character in the expected sequence
        for (char ch : expected.toCharArray()) {
            // Check if the current character is present in the given string
            if (str.indexOf(ch) == -1) {
                // If the character is not found in the string, print it as missing
                System.out.print(ch + " ");
            }
        }
    }
}
