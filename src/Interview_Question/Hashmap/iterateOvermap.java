package src.Interview_Question.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class iterateOvermap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);
        for(Map.Entry<String,Integer> enteryvalue:map.entrySet()){
            System.out.println(enteryvalue.getKey()+" "+enteryvalue.getValue());
        }
    }
}
