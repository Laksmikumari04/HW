package src.MiscellounousOOps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> intvalue =new ArrayList<>();
        intvalue.add(10);
        intvalue.add(20);
        intvalue.add(70);
        intvalue.add(80);
        intvalue.add(60);
        intvalue.add(50);
        Collections.sort(intvalue);
        System.out.println(intvalue);

        List<String> Strvalue =new ArrayList<>();
        Strvalue.add("LAki");
        Strvalue.add("Sures");
        Strvalue.add("Amit");
        Strvalue.add("yumm");
        Strvalue.add("Rukul");
        Collections.sort(Strvalue);
        System.out.println(Strvalue);



    }
}
