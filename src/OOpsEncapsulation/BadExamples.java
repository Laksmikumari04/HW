//package src.Encapsulation;
//
//public class BadExamples {
//    public static void main(String[] args) {
//        vwoLogin vwo =new vwoLogin("admin","pass");
//        boolean check = vwo.isLoggedIn("admin","pass");
//        System.out.println(check);
//
//       //boolean check = vwo.isLoggedIn("admin","password");
//        //vwo.password= "login";
//        //vwo.username="ad";
//       // boolean check2 = vwo.isLoggedIn("admin","pass");
//       // System.out.println(check2);
//
//
//    }
//}
//
//class vwoLogin{
//
//
//    public String username;
//    public String password;
//
//    //This is Parameterized Constructor
//    public vwoLogin(String username,String password){
//        this.username=username;
//        this.password=password;
//
//    }
//    boolean isLoggedIn(String username, String password) {
//        if (this.username.toLowerCase().equals(username) && this.username.toLowerCase().equals(password)) {
//            System.out.println("System Logged IN!!");
//            return true;
//
//        }
//        else {
//            System.out.println("Wrong");
//            return false;
//        }
//    }
//}
