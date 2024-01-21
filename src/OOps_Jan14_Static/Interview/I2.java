package src.OOps_Jan14_Static.Interview;

public class I2 {
    public static void main(String[] args) {
        System.out.println(PP.a);
         foo f =new foo(); // dynamic dispatch
         PP f1 =new foo(); //dynamic dispatch
         Rofl f2 = new foo(); // dynamic dispatch
         PP f3 = new foo(); // dynamic dispatch
        f3.m1();//grand/ parent can't use  object of child method
        f2.say();
        f.say();
    }
}

interface PP{
    int a =10; // final static variable
    void m1();
}
abstract class Rofl implements PP{
  abstract   void say();
}
class foo extends Rofl{

    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    void say() {
        System.out.println("say");
    }
}
