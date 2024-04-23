package src.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class FifthOddNumber {
    public static void main(String[] args) {
        int[] array={2,4,7,9,1,35,8};
      int[]  Output= findOddNumber(array);
        System.out.println(Arrays.toString(Output));

    }


    public static int[] findOddNumber(int[] array){
        ArrayList<Integer> Oddnumber=new ArrayList<>();
        for(int num:array){
            if(num%2==1){
                Oddnumber.add(num);
            }
        }
        //Conver into int[] array
        int[] FOddnumber=new int[Oddnumber.size()];
        for(int i=0;i< Oddnumber.size();i++){
            FOddnumber[i]=Oddnumber.get(i);

        }
        return FOddnumber;
    }
}
