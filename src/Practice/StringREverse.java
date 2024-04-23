package src.Practice;

public class StringREverse {
    public static void main(String[] args) {
        String name ="NAMAN";
        String y=" ";
        for(int i=name.length()-1;i>=0;i--){
            y=y+name.charAt(i);
        }
        System.out.println(y);
        if (name.equals(y)){
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not A Palindrome String");
        }

        }
    }


