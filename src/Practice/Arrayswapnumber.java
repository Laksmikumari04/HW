package src.Practice;

import java.util.Arrays;

public class Arrayswapnumber {
    public static void main(String[] args) {
        int[] array = {1, 4, 24, 56, 89};
        ReverseNumber(array);
        System.out.println(Arrays.toString(array));
    }
    public static int ReverseNumber(int[] array){
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
