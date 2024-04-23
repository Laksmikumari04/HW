package src.PracticeP;

public class Constructor {
    //Uses: to intalize an Object
    String name;
    int Emp_Id;
    float marks;
    Constructor(String name,int Emp_ID){
        this.name=name;
        this.Emp_Id=Emp_ID;
        System.out.println("Paramterized Constructor");
    }
    Constructor(int Emp_ID,float marks){
        this.Emp_Id=Emp_ID;
        this.marks=marks;
    }

    public static void main(String[] args) {
        Constructor e1 =new Constructor("Lakshmi",101);
        Constructor e2 =new Constructor("ABC",200);
        Constructor e3=new Constructor(101,96.4f);

    }

}
