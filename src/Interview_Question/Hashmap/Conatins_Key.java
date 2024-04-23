package src.Interview_Question.Hashmap;

import java.util.HashMap;
import java.util.Objects;

public class Conatins_Key {
    public static void main(String[] args) {
        HashMap<Object,Object> map=new HashMap<>();
        map.put("ID 1","Laki");
        map.put("Id 2","Amit");
        map.put("Id 3","Rahul");
        map.put("Id 4","Supriya");
      boolean exist=  map.containsValue("Supriya");
        System.out.println(exist);
    }
}
