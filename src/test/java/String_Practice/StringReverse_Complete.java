package String_Practice;

public class StringReverse_Complete {
    public static void main(String[] args) {
        String str = "My name is Laki";
        // O/P -> LaKi is name My
       String[] words = str.split(" ");
       String rev =" ";

       for(int i=words.length-1;i>=0; i--){
           rev +=words[i];
           if(i !=0){
               rev +=  " ";
           }
       }
        System.out.println("Reversed String : "+ rev);
    }
}
