package src.Array_InterviewQuestion;

public class AnotherWayFindFirstMaxNo {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        int max=array[0];
        for(int i=0;i< array.length;i++){
            max=array[i];
        }
        System.out.println(max);

    }
}
