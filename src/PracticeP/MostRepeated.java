package src.PracticeP;

import java.util.HashMap;
import java.util.Map;

public class MostRepeated {
    public static void main(String[] args) {
        int[] array={1,2,3,4,2,3,4,2};
       int  MostrepeatInteger =repeatedInteger(array);
        System.out.println("Integer :"+MostrepeatInteger);
    }

   public static int repeatedInteger(int[] array) {
       Map<Integer,Integer> countMap=new HashMap<>();
       for(int num:array){
           countMap.put(num,countMap.getOrDefault(num,0)+1);
       }
       //find most maxcount Integer
       int maxCount=0;
       int mostRepeatedIntger=0;
       for(Map.Entry<Integer,Integer> entry:countMap.entrySet()){
           if(entry.getValue()>maxCount){
               maxCount= entry.getValue();
               mostRepeatedIntger= entry.getKey();
           }
       }
       return mostRepeatedIntger;
   }








}
