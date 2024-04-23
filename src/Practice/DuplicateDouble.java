package src.Practice;

public class DuplicateDouble {
    public static void main(String[] args) {


    String str="Today is very good Day";
    int count=0;
    char[] chh=str.toCharArray();
    for(int i=0;i<chh.length;i++){
        for(int j=i+1;j<chh.length;j++){
            if(chh[i]==chh[j]){
                System.out.println("Print all duplicates value :"+chh[j]);
            }
        }
        count++;
    }
        System.out.println("Print total no of count :"+count);
}}
