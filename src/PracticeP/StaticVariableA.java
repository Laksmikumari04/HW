package src.PracticeP;

public class StaticVariableA {
    int emp_id;
    String emp_name;
   static String company_Name="Virtusa";
    StaticVariableA(int emp_id,String emp_name) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;

    }
    void display(){
        System.out.println(emp_id+" "+emp_name+" "+company_Name);

    }

    public static void main(String[] args) {
        StaticVariableA e1=new StaticVariableA(101,"Lakshmi Kumari");
        e1.display();
        StaticVariableA e2=new StaticVariableA(102,"Amit Kumar");
        e2.display();

    }
}
