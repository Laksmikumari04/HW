package src.Array_InterviewQuestion;

import java.util.Map;
import java.util.TreeMap;

public class FridayTest_Session {
    public static void main(String[] args) {
        TreeMap<String,Integer> mapvalue=new TreeMap<>();
        mapvalue.put("A",4);
        mapvalue.put("B",4);
        mapvalue.put("C",4);
        mapvalue.put("D",4);
        mapvalue.put("E",4);
        for(Map.Entry<String,Integer>value:mapvalue.entrySet())
            System.out.println(value.getKey()+" "+ value.getValue());
        System.out.println(mapvalue);





    }
}
