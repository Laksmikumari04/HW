package src.Interview_Question.Hashmap;

import java.util.HashMap;

public class IterateMultipleValue_Colours {
    public static void main(String[] args) {
        String[] colors = {"Red", "Yellow", "Red", "Pink","Pink", "Red"};
        // Create a HashMap to store color counts
        HashMap<String,Integer> colorcounts=new HashMap<>();
        // Count occurrences of each color
        for(String color:colors) {
            // Convert the color to lowercase to ignore case sensitivity
            //color = color.toLowerCase();
            colorcounts.put(color, colorcounts.getOrDefault(color, 0) + 1);
        }
            for(String color:colorcounts.keySet()){
                System.out.println(color+" "+colorcounts.get(color)+"time(s)");
            }
        }
    }

