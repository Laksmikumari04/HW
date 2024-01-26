package src.Jan20_CollectionFramework;

import java.util.Comparator;

class asec implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
class desc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
    class sortbyname implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
public class Student implements Comparable<Student> {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    String name;
    Integer Id;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                '}';
    }

    public Student(String name , Integer Id) {
        this.name = name;
        this.Id=Id;
    }


    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.Id,student.Id);
    }
}
//Collection - Natural Sorting

//Comparable - ID/ name not both are allowed
//has only compare methods
//java .lang

// Comparator - both allowed Id & Name
// has two method i>equal & ii>compare
// seprate class -> java.util
