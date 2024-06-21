package src.Array_InterviewQuestion;

public class String_Remove {
    public static void main(String[] args) {
        String input = "Selenium with Java";
        // Remove vowels using regular expression
        String regex="";
        String noVowels = input.replaceAll("regex", " ");

        // Use StringBuilder to collect every second character
        //aeiouAEIOU
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < noVowels.length(); i++) {
            if (i % 2 == 0) { // Check for every second character
                output.append(noVowels.charAt(i));
            }
        }

        System.out.println(noVowels);  // Output: slnu ih jv
        System.out.println(output);
    }
    }






