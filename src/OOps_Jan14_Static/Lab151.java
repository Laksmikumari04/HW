package src.OOps_Jan14_Static;

public class Lab151 {
    public static void main(String[] args) {
        Po1.m2();  // static we can call with class name by directly

        Po1 p1 =new  Po1();
        Po1 p2 =new Po1();
        p1.m1(); // Non-Static with reference

        Po1 p3 =null;
       // p3.m1(); // we can't call null value with
        p3.m2();

    }}
    class Po1{
        static {
            System.out.println("SIB");
        }{
            System.out.println("IIB");
        }
         int a =10;
          static int b =20;

          void m1(){
              System.out.println("m1 value");
              System.out.println(a);
              System.out.println(b);
          }

         static void m2(){
              System.out.println("m2 value");
              System.out.println(b);
              //Can't use instance Variable in Static method !!
              //System.out.println(a);
          }
    }

