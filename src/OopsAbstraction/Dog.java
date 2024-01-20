package src.OopsAbstraction;

public class Dog extends Animal{

    @Override
    void m2() {
        System.out.println("This is Abstract method");

    }

    public static void main(String[] args) {
        Dog D = new Dog();
        D.m2();

       // Animal A = new Animal();
        //'Animal' is abstract; cannot be instantiated
    }

}
