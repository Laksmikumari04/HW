package String_Practice;

public class VowelConsonant_SepratedCount {
    public static void main(String[] args) {
        String str = " Hello World";
        str =str.toLowerCase();
       // char [] ch = str.toCharArray();
        String vowelWord =" ";
        int vowelCount =0;
        String consonantWord = "";
        int consonantcount =0;
        for (char ch : str.toCharArray()){
            if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'||ch == 'u'){
                vowelWord += ch +" ";
                vowelCount++;
            } else if (Character.isLetter(ch)) {
                consonantWord += ch + " ";
                consonantcount++;

            }
        }
        // for loop close
        System.out.println(vowelWord);
        System.out.println(vowelCount);
        System.out.println(consonantWord);
        System.out.println(consonantcount);

    }
    }

