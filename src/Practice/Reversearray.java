package src.Practice;

import java.util.Arrays;

public class Reversearray
{
    public static void main(String[] args) {
        int[] value={24,35,29,12,99};
       int reverse= ReverseArray(value);
        System.out.println(Arrays.toString(value));

    }
    public static int ReverseArray(int[] array){
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
