package src.Jan20_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab183 {
    public static void main(String[] args) {
        List courselist = new ArrayList<>();
        courselist.add("ATB");
        courselist.add("XTB");
        courselist.add("MTB");
        courselist.add("RTB");
        courselist.add("SDET CLUB");

        List numberlist = new ArrayList<>();
        numberlist.add(100);
        numberlist.add(200);
        numberlist.add(300);
        numberlist.add(400);
        numberlist.add(500);

        courselist.addAll(numberlist);
        System.out.println(courselist);
    }
}
