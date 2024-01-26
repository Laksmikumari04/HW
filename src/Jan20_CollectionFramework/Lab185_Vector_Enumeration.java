package src.Jan20_CollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class Lab185_Vector_Enumeration {
    public static void main(String[] args) {
        Vector<String> Va =new Vector<>();
        Va.add("Ravi");
        Va.add("Tabby");
        Va.add("Chubby");
        Va.add("Khabby");

        System.out.println(Va);
        Va.set(3,"LAT");
        System.out.println(Va);

        Enumeration e2 = Va.elements();
        while (e2.hasMoreElements()){
            System.out.println(e2.nextElement());
        }



    }
}
