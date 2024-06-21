package src.Array_InterviewQuestion;

public class Practice_Vowel {
    public static void main(String[] args) {
        String str="Hello World";
        str=str.toLowerCase();
        int vowel=0;
        int consonants=0;
     char[]  value= str.toCharArray();
     for(char ch:value){
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
             vowel++;
         } else if (Character.isLetter(ch)) {
             consonants++;

         }
     }
        System.out.println("Vowel :"+vowel);
        System.out.println("Consonants :"+consonants);

    }
}
