package src.PracticeP;

public class PracticeTest {
    public static void main(String[] args) {
        //String name = "Automation Testing";
        int count=0;
        //find duplicate Char
       // char[] ch = name.toCharArray();
//        for (int i = 0; i < ch.length; i++) {
//            for (int j = i + 1; j < ch.length; i++) {
//                if (ch[i] == ch[j]) {
//                    System.out.println("All Duplicate char: " + ch[j]);
//
//                }
//            }
//            count++;
//            System.out.println("All count char"+count);
        String name="Lakshmi Kumari";
        //duplicate char find
        char[] ch= name.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    System.out.println("All duplicate char:"+ch[j]);
                }
            }
        }

    }}