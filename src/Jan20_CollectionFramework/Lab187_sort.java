package src.Jan20_CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab187_sort {
    public static void main(String[] args) {
        List Mymarks = new ArrayList<>();
        Mymarks.add(90);
        Mymarks.add(95);
        Mymarks.add(100);
        Mymarks.add(99);
        Mymarks.add(187);
        //Collection.s
        Collections.sort(Mymarks);
        System.out.println(Mymarks);


    }
}
