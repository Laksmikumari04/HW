package src.MiscellounousOOps;

public class Method {

    public static void main(String[] args) {
        System.out.println(Method.LoginDetails("Ravi","Suresh"));
        System.out.println(Method.LoginDetails("Laki","Laki123"));
        Method.LoginOutdetails();
        //Method.Anotherclassinherit("123");


    }

   static String LoginDetails(String username, String password){
       System.out.println("Login Syntax!!");
       //System.out.println(username+" "+password);
       return (username+" "+password);

    }

    static void LoginOutdetails(){
        LoginDetails("Titu","Titu1234");
        System.out.println("Logout Syntax!!");

    }
    static SimpleMethod Anotherclassinherit(SimpleMethod String){

        return String;
    }



}
