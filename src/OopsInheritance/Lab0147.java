package src.OopsInheritance;

public class Lab0147 {
    public static void main(String[] args) {
//        Java j =new Java();
//        Programming p = new Programming();
//        Programming p1 =new Java();
//        Java j1 =new Programming(); (It's not allowing to  child object  attend Parent wedding)
        Java J =new Java();
        J.Printinfo();
        J.car();
        J.BHK3();

        System.out.println("Py");
        Phython P =new Phython();
        P.BHK3();
    }
}
