package src.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeEvennumber {
    public static void main(String[] args) {
        int[] array={3,5,6,7,8,9,10,9,12};
      int[]  finalOutput= findEvenNumber(array);
        System.out.println(Arrays.toString(finalOutput));
    }
    


    public static int[] findEvenNumber(int[] array){
        ArrayList<Integer> evennumber=new ArrayList<>();
        for(int num:array){
            if(num%2==0){
                evennumber.add(num);
            }
        }
        //Conver to int[] Array
        int[] Feven=new int[evennumber.size()];
        for(int i=0;i< evennumber.size();i++){
            Feven[i]= evennumber.get(i);
        }
        return Feven;
    }
}
