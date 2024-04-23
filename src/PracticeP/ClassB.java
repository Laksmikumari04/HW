package src.PracticeP;

public class ClassB {
    public static void main(String[] args) {
        ClassA instance1=new ClassA();
      int p=  instance1.a;//called another class from instance variable
        System.out.println("Print p o/p :"+p);
        ClassA.methodB();  //called static method
       int c= ClassA.b+20;   //called static variable
        System.out.println("Print c o/p :"+c);
       int d= ClassA.b;
        System.out.println(d);

    }
}
