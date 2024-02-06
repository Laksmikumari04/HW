package src.MiscellounousOOps;

public class SimpleMethod {
    String user;
    int ID;
    String Rollnumber;
    public static void main(String[] args) {
        SimpleMethod test =new SimpleMethod();
        test.AlphaCheck();
        System.out.println(SimpleMethod.userDetailcheck("Test",1111));



    }

    int Digitcheck(){
        System.out.println("This is Intger method");
        return 99; }


void AlphaCheck(){
    System.out.println("String number");

}
 static String userDetailcheck(String user, int ID){


     return (user+" "+ID);
 }
}
