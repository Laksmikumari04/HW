package src.PracticeP;

import java.util.HashMap;

public class StringmostRepeative {
    public static void main(String[] args) {
        String[] arrayColour={"Red","Yellow","Red","Pink","Red","Pink"};
        //create a Hashmap Store colourCounts
        HashMap<String,Integer> coulourCounts=new HashMap<>();

        for(String findColour:arrayColour){
            coulourCounts.put(findColour,coulourCounts.getOrDefault(findColour,0)+1);
        }

        for(String findcolour:coulourCounts.keySet()){
            System.out.println(findcolour+" "+coulourCounts.get(findcolour)+"times");
        }

    }
}
