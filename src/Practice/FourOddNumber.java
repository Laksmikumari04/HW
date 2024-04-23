package src.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOddNumber {
    public static void main(String[] args) {
        //Find Odd Number
        int[] array={2,5,8,9,10,15,7,3};
     int[] OutputOdd=   findOddNumber(array);
        System.out.println(Arrays.toString(OutputOdd));

    }
    public static int[] findOddNumber(int[] array){
        ArrayList<Integer> Odd=new ArrayList<>();
        for(int num:array){
            if(num%2==1){
                Odd.add(num);
            }
        }
        //Convert to int[] array
        int[] fOdd =new int[Odd.size()];
        for(int i=0;i< Odd.size();i++){
            fOdd[i]= Odd.get(i);
        }
        return fOdd;
    }
}
