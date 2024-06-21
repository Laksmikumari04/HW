package src.Array_InterviewQuestion;

import java.util.Set;
import java.util.TreeSet;

public class Remove_Value {
    public static void main(String[] args) {
        int[] array={10,2,3,7,5,8};
        //O/P- SEcond highestNo
//        Set<int> remove= new TreeSet<int>();
//        remove.add(array);
//        Sysetm.out.println(remove);
//        for(int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//
//        }
        Set<Object> remove=new TreeSet<Object>();
        remove.add(10);
        remove.add(2);
        remove.add(10);
        remove.add(3);
        remove.add(7);
        remove.add(5);
        remove.add(7);
       // System.out.println(remove.get);
        System.out.println(remove);

    }
}
