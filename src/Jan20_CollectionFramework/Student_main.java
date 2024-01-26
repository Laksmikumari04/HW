package src.Jan20_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student_main {
    public static void main(String[] args) {
        Student student = new Student("Ravi",10);
        Student student1 =new Student("Amit",1);
        Student student2 =new Student("LAki",11);


        List students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        System.out.println(students);

        //Collections.sort(students);
        Collections.sort(students,new desc());
        System.out.println(students);
    }


}
