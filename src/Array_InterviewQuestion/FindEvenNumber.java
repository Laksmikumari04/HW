package src.Array_InterviewQuestion;

public class FindEvenNumber {
    public static void main(String[] args) {
        int[] array={2,4,6,7,3,5,6,8,10};
        for(int num:array){
            if(num%2==0){
                System.out.println("Even Number :"+num);
            }
        }
    }
}
