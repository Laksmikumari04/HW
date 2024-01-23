package src.OOps_Jan14_Static.Annonymas;

public class Lab155 {
    public static void main(String[] args) {
        Student s1 =new Student() {

            @Override
            public void setId() {
                System.out.println("It's class");

            }
        };
        s1.setId();
        System.out.println("It's anonymous class");
        B b = new B() {


            @Override
            void t() {

            }
        };
        };




    }

abstract class B{

    int var_b =12;
   abstract void t();
}
interface   Student{
    int id =10;
    void setId();

}
