package src.Array_InterviewQuestion;

public class TestOwn {
    static public void main(String[] args){
        String str="Automation Testing";
        int count=0;
        //Convert to char Array
        char[] ch=str.toCharArray();
        for(int i=0; i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    System.out.println("Here All duplicate char :" +ch[i]);
                }
            }
            count++;
        }
        System.out.println("Here all char value no count:"+count);

    }

}
