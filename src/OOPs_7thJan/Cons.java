package src.OOPs_7thJan;
//Attribue name ( Attributes means instance Varraible)
// phone number
//age

//Behaviour like Talk (Behavoiur means method)
// Walk

public class Cons {
    String name; // Instance Varraible are default
    long Phone_Number;
    String email;
    boolean isMarried;
    String Course_Name;

//Default Constructor
    Cons(){
        Course_Name="ATB";
        System.out.println("I am Default Constructor");
    }
    Cons(String ValueofObjectname , String Course_Name){
        System.out.println("Parameterised Constructor");
        this.name=ValueofObjectname;
        this.Course_Name=Course_Name;

    }
    Cons(String name,String email,long Phonenumber,String Course_NAME){
        this.name=name;
        this.email=email;
        this.Phone_Number=Phonenumber;
        this.Course_Name=Course_NAME;

    }
    void talk(){
        System.out.println("Talk");
        System.out.println(name);
        System.out.println(email);
        System.out.println(Phone_Number);
        System.out.println(Course_Name);
    }
    void printDetails(){
        System.out.println(Course_Name);
        System.out.println(this.name);
//        System.out.println(Phone_Number);
//        System.out.println(email);
//        System.out.println(isMarried);

    }
}
