package src;

import java.util.HashMap;
import java.util.Map;

public class Test_Selenium {
    static int a=10;
    public static void main(String[] args) {
        Map<String,Integer> mapvale=new HashMap<>() ;
            mapvale.put("LAkshmi",11);
            mapvale.put("Banana",6);
       // System.out.println(mapvale);
        for(Map.Entry<String,Integer>count:mapvale.entrySet()){
            System.out.println(count.getValue());
        }


    }
}
