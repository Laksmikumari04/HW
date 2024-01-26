package src.Jan20_CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab182Linkdest {
    public static void main(String[] args) {
        List value =new LinkedList();
        value.add("Ravi");
        value.add("Amit");
        value.add("Pramod");
        value.add(("1234"));
        value.add(true);
        System.out.println(value);
        //value.addAll(1,"Suresh");
        System.out.println(value.get(1));
        System.out.println(value);

        Iterator pvalue =value.iterator();
        while (pvalue.hasNext()){
            System.out.println(pvalue.next());
        }

    }
}
