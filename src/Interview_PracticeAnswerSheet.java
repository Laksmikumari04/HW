package src;

public class Interview_PracticeAnswerSheet {
    public static void main(String[] args) {
        String input="Hello world";
        //
        String vowel=" ";
        String consonant="";
        for(char ch:input.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel +=ch+" ";

            } else if (Character.isLetter(ch)) {


                consonant +=ch+" ";
            }
        }
        System.out.println("Vowels: " + vowel);

        System.out.println("Consonants: " + consonant);

    }
}
