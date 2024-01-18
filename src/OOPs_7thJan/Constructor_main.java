package src.OOPs_7thJan;

public class Constructor_main {
    public static void main(String[] args)
    {
     //main method whatever thing is called first that thing is print first doesn't matter in class which sequence we have written
     Cons p = new Cons();
      p.printDetails();
        //System.out.println("Check main method steps");
        //System.out.println(p.name);
       // System.out.println(p.Phone_Number);
        Cons p2 =new Cons("Amit","Udmey");
           p2.printDetails();

           Cons P3 =new Cons("Pramod","ATB");
           P3.printDetails();
           Cons p4=new Cons("LAki","meet@gmail.com",123456789,"ATB5x");
           p4.talk();



        // Constructor  is used  to construct the object of a class.
        //It's use for intialize the value of instance varaible
    }

}
