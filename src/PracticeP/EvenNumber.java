package src.PracticeP;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumber {
    public static void main(Code_Basic[] args) {
        int[] value={2,4,3,5,8,4,2,1};
      int[]   finalvalue= findEvenValue(value);
        System.out.println(Arrays.toString(finalvalue));


    }
    public static int[] findEvenValue(int[] array){
        ArrayList<Integer> even=new ArrayList<>();
        for(int num:array){
            if(num%2==0){
                even.add(num);
            }
        }
        //Converting into int[]
        int[] feven=new int[even.size()];
        for(int i=0;i< even.size();i++){
            feven[i]=even.get(i);
        }
        return feven;
    }
}
