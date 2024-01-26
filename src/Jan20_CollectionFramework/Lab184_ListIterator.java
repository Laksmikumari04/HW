package src.Jan20_CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab184_ListIterator {
    public static void main(String[] args) {
        //ListIterator can use only with arraylist & Linkedlist
        // by ListIterator we can do back & forward
        List mylist = new ArrayList<>();
        mylist.add("pramodd");
        mylist.add("123");
        mylist.add("Amit");
         mylist.add(true);
         mylist.add(99.9f);

        ListIterator iterator =mylist.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("_______");

        ListIterator back =mylist.listIterator(mylist.size());
        while (back.hasPrevious()){
            System.out.println(back.previous());
        }
    }
}
