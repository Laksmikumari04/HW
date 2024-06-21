package src.Array_InterviewQuestion;

public class String_remove2 {
    public static void main(String[] args) {
        String input = "Selenium with Java";
       // String filtered = input.replaceAll(regex, ""); // Remove vowels and spaces
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) { // Take every second character starting from the first
                output.append(input.charAt(i));

            }
        }

        System.out.println(output.toString());
        System.out.println(output);// Should output "slnu ih jv"
    }
    }

