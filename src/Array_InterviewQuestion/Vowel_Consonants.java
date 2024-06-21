package src.Array_InterviewQuestion;

public class Vowel_Consonants {
    public static void main(String[] args) {
        char ch='a';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
        char cha = 'z';

        switch (cha) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(cha + " is vowel");
                break;
            default:
                System.out.println(cha + " is consonant");
                //System.out.println('c'+'a');uni code
        }

    }
    }



