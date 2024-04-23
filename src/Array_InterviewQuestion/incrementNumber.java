package src.Array_InterviewQuestion;

public class incrementNumber {
    public static void main(String[] args) {
        int[] array={1,2,4,5,6,8,9};
        int incementNo=1;
        for(int i=0;i<array.length;i++){
            array[i]+=incementNo;
        }
        for(int num:array){
            System.out.println(num);
        }

    }
}
