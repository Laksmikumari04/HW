package src.Interview_Question;

public class String_Duplicate {
    public static void main(String[] args) {
        String str =new String("Autaomation Testing");
        int count =0;
        char[] ch =str.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    System.out.println("Here are all duplicate character: "+ch[j]);
                }
            }
            count++;
        }
        System.out.println("Here  are all Character value no count:"+count);

    }
}
