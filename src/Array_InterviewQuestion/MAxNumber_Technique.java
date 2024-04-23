package src.Array_InterviewQuestion;

public class MAxNumber_Technique {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        int max=array[0];
        for(int i=1;i<array.length;i++){
           // max=array[i];
            if(array[i]>max){
                max=array[i];  //Example max 0=10 and i=1 means 20
            }
        }
        System.out.println(max);

    }
}
