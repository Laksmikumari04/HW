package src.Interview_Question.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumber_Array {
    public static void main(String[] args) {
        int[] array={3,5,4,6,8,9,10};
       int[] finalEvenNumber= filterEvenNumber(array);
        System.out.println(Arrays.toString(finalEvenNumber));
    }
    public static int[] filterEvenNumber(int[] array){
        ArrayList <Integer>evennumber=new ArrayList<>();
        for(int num:array){
            if(num%2==0){
                evennumber.add(num);
            }
            }
        //Converting to int[] array
        int[] feven=new int[evennumber.size()];
        for(int i=0;i< evennumber.size();i++){
            feven[i]= evennumber.get(i);
        }
        return feven;
    }
    }

