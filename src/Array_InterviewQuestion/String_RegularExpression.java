package src.Array_InterviewQuestion;

public class String_RegularExpression {
    public static void main(String[] args) {
        String str = "dgjf58$%^#$fdjf574#&@(&vdjfg$&543v42634dh$%#$#^vdh4376fdg$$%^";

        // Separate alphabetic characters
        String alphabets = str.replaceAll("[^a-zA-Z]+", "");
        System.out.println("Alphabets: " + alphabets);

        // Separate numeric characters
        String numerics = str.replaceAll("[^0-9]+", "");
        System.out.println("Numerics: " + numerics);

        // Separate dollar signs
       // String dollarSigns = str.replaceAll("[^$#@]+", "");
       // System.out.println("Dollar Signs: " + dollarSigns);

        String specialChars = str.replaceAll("[a-zA-Z0-9]+", "");
        System.out.println("Special Characters: " + specialChars);
    }
    }

