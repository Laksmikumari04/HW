package src.Practice;

public class DuplicateString {
    public static void main(String[] args) {
        String str= new String("Automationa Testing");
        int count1=0;
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            //for(int i=0;i<ch.length;i++)
            for(int j=i+1;j<ch.length;j++){
               // if(ch[i]==ch[j])
                if(ch[i]==ch[j]){
                    System.out.println("Print all duplicates Value :"+ch[j]);
                }
   }
                /*
                 int count =0;
        char[] ch =str.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                 */
            }
            count1++;
        }



    }

