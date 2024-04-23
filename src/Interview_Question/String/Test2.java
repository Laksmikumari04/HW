

public static void main(String[] args) {

    String input = "hello1name2value3";
     String output = convertString(input);
     System.out.println("Output: " + output);
    }

public static String convertString(String str) {
    // Define an array to store the textual representations of digits
    String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    // Define a StringBuilder to build the output string
    StringBuilder result = new StringBuilder();

    // Iterate over each character in the input string
    for (char ch : str.toCharArray()) {
        if (Character.isDigit(ch)) {
            // If the character is a digit, append its textual representation to the result
            int digit = Character.getNumericValue(ch);
            result.append(digits[digit]).append(" ");
        } else {
            // If the character is not a digit, append it to the result as it is
            result.append(ch);
        }
    }

    // Trim any leading or trailing spaces from the resulting string
    String output = result.toString().trim();

    return output;
}
