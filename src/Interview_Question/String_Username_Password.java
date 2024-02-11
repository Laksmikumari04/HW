package src.Interview_Question;

public class String_Username_Password {
    public static void main(String[] args) {
        String username ="Lakshmi";
        String password ="Lakshmi123";
        System.out.println(LoginDetails(username," "+password));

    }
    private static String LoginDetails(String usernamem, String passwordm){
        System.out.println("Login Successfully");

        return usernamem +passwordm;
    }
}
