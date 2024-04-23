package src.Interview_Question.Array;

import java.util.Arrays;

public class Increment_Array {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int increment=2;
        incrementorder(array,increment);
        System.out.println(Arrays.toString(array));

    }
    public static int[] incrementorder(int[] array,int increment){
        for (int i=0;i< array.length;i++){
            array[i] +=increment;
        }
        return array;
    }
}
