package src.PracticeP;

public class Employee {
    String name;
    int Emp_Id;
    float marks;
    Employee(String name,int Emp_ID){
        this.name=name;
        this.Emp_Id=Emp_ID;
    }
    Employee(int Emp_ID,float marks){
        this.Emp_Id=Emp_ID;
        this.marks=marks;
    }

    public static void main(String[] args) {
        Employee e1 =new Employee("Lakshmi",101);
        Employee e2 =new Employee("ABC",200);
        Employee e3=new Employee(101,96.4f);
        System.out.println(e1.name+e1.Emp_Id);
        System.out.println(e2.name+e1.Emp_Id);
        //Output=Lakshmi101
        //ABC101
}}
