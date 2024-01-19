package src.OopsInheritance.Multilevel;

public class Lab0148 {
    public static void main(String[] args) {
//        GrandFather G =new GrandFather();
//        Father F = new Father();
//        Son S = new Son();
        //GrandFather g1 =new Father();
        //g1.bhk3(); //grand can access only his method


        GrandFather g1 = new GrandFather();
        g1.bhk3();
        System.out.println("\"___________________\"");
       // Father f1 = new GrandFather(); Not Possible access Grand Object
        Father f2 = new Father();
        f2.bhk3();
        f2.bhk2();// Father can access  grand and his method
        System.out.println("___________________");
        Son S1 = new Son();
        S1.bhk3();
        S1.bhk2();
        S1.bhk1();
    }
}
