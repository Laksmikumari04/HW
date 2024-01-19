package src.Encapsulation;

public class B {
    public static void main(String[] args) {
        vwoLogin vwol = new vwoLogin("admin","pass");

        boolean Check = vwol.isLoggedIn("admin","password");
        System.out.println(Check);

        System.out.println("After Change password O/P:");
        //vwol.password ="password";

        boolean Check2 = vwol.isLoggedIn("admin","password");
        System.out.println(Check2);
        vwol.setUsername("Ravi");
        System.out.println(vwol.getUsername());
        System.out.println(vwol.getPassword());



}}
 class vwoLogin{


     public String getUsername() {
         return username;
     }

     public void setUsername(String username) {
         this.username = username;
     }
     private   String username ;

     public String getPassword() {
         return password;
     }

     private  String password;
     public vwoLogin(String username, String password) {
         this.username = username;
         this.password = password;
     }
boolean isLoggedIn(String username,String password){
         if(this.username.toLowerCase().equals(username)&& this.password.toLowerCase().equals(password)){
             System.out.println("System Logged!!");
             return true;
         }
         else {
             System.out.println("System not Logged  IN");
             return false;
         }
}
}

//Encapsulated our data member & function.
//data hiding
//binding
// using get & set method

