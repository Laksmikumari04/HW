package src.Practice;

import java.util.Arrays;

public class incrementArray {
   public static void main(String[] args) {
       int[] array={1,2,3,4,5};
        int increment =2;
        Inccrement(array,increment);
       System.out.println(Arrays.toString(array));

   }
   public static int[] Inccrement(int[] array,int increment){
       for(int i=0;i< array.length;i++){
           array[i] +=increment;
       }
       return array;
   }



}
