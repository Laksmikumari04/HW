package src.MiscellounousOOps;

public class Duplicatevalue_Interview {
    public static void main(String[] args){
        String value =new String("Automation Testing");
        int count =0;
        char[] ch_count =value.toCharArray();
        for(int i=0;i<ch_count.length;i++){
            for(int j=i+1;j<ch_count.length;j++){
                if(ch_count[i] == ch_count[j]){
                    System.out.println("Print all duplicate character "+ch_count[j]);
                }
            }
            count++;
        }
        System.out.println("Print all duplicate char-Number: "+count);
    }
}
