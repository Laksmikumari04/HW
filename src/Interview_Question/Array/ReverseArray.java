package src.Interview_Question.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int ReverseValue=ReverseArray(array);
        System.out.println(Arrays.toString(array));
    }
    private static int ReverseArray(int[] Array){
        int start=0;
        int end=Array.length-1;
        while(start<end){

            int temp=Array[start];
            Array[start]=Array[end];
            Array[end]=temp;
            start++;
            end--;
        }
        return start;
    }
}
