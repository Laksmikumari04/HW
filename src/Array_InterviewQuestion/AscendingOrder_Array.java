package src.Array_InterviewQuestion;

import java.util.Arrays;

public class AscendingOrder_Array {
    public static void main(String[] args) {
        int[] array={-5,-9,8,12,1,3};
        //for(int i=1;i< array.length;i++){
           // System.out.print(array[i]+" ");
            Arrays.sort(array);

        //}
        System.out.println("Ascending order"+Arrays.toString(array));

    }




}
