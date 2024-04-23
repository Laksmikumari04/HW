package src;

public class Super_ClassB extends Super_ClassA {
    int a=20;
    void show(int a){
        System.out.println(super.a);
        System.out.println(this.a);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Super_ClassB ob= new Super_ClassB();
        ob.show(30);
        //System.out.println(super.a); Error will show  non-static variable super cannot be referenced from a static context
    }
}
