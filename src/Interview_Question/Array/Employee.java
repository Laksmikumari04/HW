package src.Interview_Question.Array;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    String name;
    int EmpID;
    Employee(String name, int EmpId){
        this.name=name;
        this.EmpID=EmpId;
    }

    public static void main(String[] args) {
        List<Employee> employees= new ArrayList<>();
        employees.add(new Employee("Lakshmi",101));
        employees.add(new Employee("ABC",102));
        for(Employee emp:employees){
            System.out.println(emp.EmpID+" "+emp.name);
        }

    }
}
