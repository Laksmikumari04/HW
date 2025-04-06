package String_Practice;

public class VowelConsonant_Count {
    public static void main(String[] args) {


    String str ="HelloWorld";
    int vowelcount =0;
    int consonantcount =0;
    int numericcount=0;
    for(char ch : str.toCharArray()){
        if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'||ch == 'u'){
        vowelcount++;
    } else if (ch =='1'|| ch=='2'|| ch=='3') {
            numericcount++;

        } else if (Character.isLetter(ch)) {
            consonantcount++;

        }
    }
        System.out.println("Vowel :" +vowelcount);
        System.out.println("Numeric : " +numericcount);
        System.out.println("Consonant :" + consonantcount);
    }}
