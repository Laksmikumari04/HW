package src.Jan20_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab179 {
    public static void main(String[] args) {
        List mylist = new ArrayList<>();
        mylist.add("pramodd");
        mylist.add("123");
        mylist.add("Amit");
        mylist.add(true);
        mylist.add(99.9f);

        System.out.println(mylist);
        System.out.println(mylist.get(1));
        mylist.set(1, "LAKI");
        System.out.println(mylist.get(1));
        mylist.remove(4);
        System.out.println(mylist);


        int i;
        for (i = 0; i < mylist.size(); i++) {
        System.out.println(mylist.get(i));
    }
        for(Object p:mylist){
            System.out.println(p);
        }
    }

}
