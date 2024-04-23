package src.PracticeP;

import java.util.ArrayList;
import java.util.Arrays;

public class OddNumber {
    public static void main(String[] args) {
        int[]  array={2,4,6,5,7,9,63};
       int[] ODDNumber= findOddNumber(array);
        System.out.println(Arrays.toString(ODDNumber));
    }

    public static int[] findOddNumber(int[] array){
        ArrayList<Integer> Odd=new ArrayList<>();
        for(int num:array){
            if(num%2!=0){
                Odd.add(num);
            }
        }
        //Converting Oddd into in int
        int[] fodd=new int[Odd.size()];
        for(int i=0;i<Odd.size();i++){
            fodd[i]= Odd.get(i);
        }

        return fodd;
    }
}
