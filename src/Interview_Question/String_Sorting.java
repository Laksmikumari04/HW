package src.Interview_Question;

import java.util.*;

public class String_Sorting {
    public static void main(String[] args) {
        //Sort using Collections class
        List<String> sort_str =new ArrayList<>();
        sort_str.add("Ravi");
        sort_str.add("Suman");
        sort_str.add("Amit");
        sort_str.add("Laki");
        sort_str.add("Pramod");
        sort_str.add("Rohit");
        Collections.sort(sort_str);
        System.out.println(sort_str);

//   Using Set Interface & TreeSet by default rule
        Set<String> setsort_Value =new TreeSet<>();
        setsort_Value.add("Ravi");
        setsort_Value.add("Suresh");
        setsort_Value.add("LaKi");
        setsort_Value.add("Amit");
        System.out.println(setsort_Value);



    }
}
