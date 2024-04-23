package src.PracticeP;

import java.util.Arrays;

public class incremArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int increment=2;
        incrementNumber(array,increment);
        System.out.println(Arrays.toString(array));

    }
    public static int incrementNumber(int[]array,int increment){
        for(int i=0;i<array.length;i++){
            array[i] +=increment;

        }
        return increment;
    }

}
