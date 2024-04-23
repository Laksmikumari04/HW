package src.Interview_Question.Hashmap;

import src.Genric;

import java.util.HashMap;

public class Reterive_Value {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<String, Integer>();
        map.put("banana",20);
        map.put("Watermelon",200);
        map.put("Mango",60);
      Integer value=  map.get("Mango");
        System.out.println(value);
    }
}

