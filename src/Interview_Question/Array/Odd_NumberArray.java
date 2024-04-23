package src.Interview_Question.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Odd_NumberArray {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7};
      int[]  oddNumber= filterOddNumber(array);
        System.out.println(Arrays.toString(oddNumber));

    }
    public static int[] filterOddNumber(int[]array){
        ArrayList<Integer> oddlist=new ArrayList<>();
        for(int num:array){
            if(num%2!=0){
                oddlist.add(num);
            }
        }
        //Converting to array
        int[] inOdd=new int[oddlist.size()];
        for (int i=0;i< oddlist.size();i++){
            inOdd[i]=oddlist.get(i);

    }

        return inOdd;
    }
}
