package src.OopsInheritance;

public class Programming {
     int version;
     String author;

     Programming(){
         System.out.println("Programming DC");
     }
     Programming(String author,int version){
         this.author =author;
         this.version =version;
     }
     void printDetails(){
         System.out.println("Program info -->"+this.author);
         System.out.println("Program info -->"+this.version);
     }

     void car(){
         System.out.println("Lambo");
     }
     void BHK3(){
        System.out.println("Banglo");
    }
}
