package src.PracticeP;

import java.util.HashMap;
import java.util.Map;

public class Repeative2 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,2,3,4,2,2};
       int maxcount= findMostRepeative(array);
        System.out.println("This Intger :"+maxcount);
    }
    public static int findMostRepeative(int[] array) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);}

            int findmaxcount = 0;
            int mostRepeativeInteger = 0;
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() > findmaxcount) {
                    findmaxcount = entry.getValue();
                    mostRepeativeInteger = entry.getKey();
                }

            }
        System.out.println("Repeative "+findmaxcount+"times");
        return mostRepeativeInteger;
    }


    }
