package src.Array_InterviewQuestion;

public class Vowel_Count
{
    public static void main(String[] args) {
        String str="Hello World123";
       str= str.toLowerCase();
       int vowel=0 ,consonants=0;
       for(char ch:str.toCharArray()){
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
               vowel++;
           } else if (Character.isLetter(ch)) {
               consonants++;
           }

           }
        System.out.println("Vowel count :"+vowel);
        System.out.println("Consonants count :"+consonants);

       }
       }


