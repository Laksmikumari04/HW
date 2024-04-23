package src.PracticeP;

import java.util.Arrays;

public class ReverseNumberArray {
    public static void main(String[] args) {
        int[] array={35,67,23,14,24};
        RevserArray(array);
        System.out.println(Arrays.toString(array));

    }
    public static int RevserArray(int[] array){
        int start=0;
        int end=array.length-1;
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        return start;
    }
}
