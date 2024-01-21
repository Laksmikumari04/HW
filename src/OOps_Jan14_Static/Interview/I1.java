package src.OOps_Jan14_Static.Interview;

public class I1 {
    public static void main(String[] args) {
        System.out.println(H.a);
        Pramod pram =new Pramod();
        pram.m1();
    }
}

interface  H{
    //static variable
    // They always interface Variable is "static final"!!
    int a=10;
    int b=20;
    public static final int c =99;  // all above same
    void m1(); // This is not static
}
class Pramod implements H{
    @Override
    public void m1() {

    }
}
