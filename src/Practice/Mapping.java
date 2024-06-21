package src.Practice;

import java.util.HashMap;
import java.util.Map;

public class Mapping {
    public static void main(String[] args) {
        HashMap<String,Integer> count=new HashMap<>();
        count.put("A",10);
        count.put("B",20);
        count.put("D",40);
        count.put("C",30);
        for(Map.Entry<String,Integer>value:count.entrySet()){
            System.out.println(value.getKey()+" "+value.getValue());
        }

    }
}
