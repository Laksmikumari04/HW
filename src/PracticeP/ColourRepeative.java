package src.PracticeP;

import java.util.HashMap;

public class ColourRepeative {
    public static void main(String[] args) {
        String[] colors = {"Red", "Yellow", "Red", "Pink","Pink", "Red"};
        HashMap<String,Integer> colourCount= new HashMap<>();
        for(String str:colors){
            colourCount.put(str,colourCount.getOrDefault(str,0)+1);
        }
        for(String str:colourCount.keySet()){
            System.out.println(str+colourCount.get(str)+"time(s)");
        }
    }

}
