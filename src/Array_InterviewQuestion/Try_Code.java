package src.Array_InterviewQuestion;

public class Try_Code {
    public static void main(String[] args) {
        String str="Hello World";
        str=str.toLowerCase();
        String vowel=" ";
        String consonants=" ";
        for(char ch:str.toCharArray()){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            //System.out.println("It's a String :"+ch);
            vowel +=ch+"";
        } else {

        }
            {
           // System.out.println("it's a cosonants :"+ch);
            consonants +=ch +" ";
        }




        }
        System.out.println("It's a String"+vowel);
        System.out.println("consonants :" +consonants);}
}
