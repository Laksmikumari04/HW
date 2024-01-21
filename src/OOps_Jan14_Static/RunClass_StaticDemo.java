package src.OOps_Jan14_Static;

public class RunClass_StaticDemo {
    public static void main(String[] args) {
        //We can call directly static Variable & Method by class name.
        System.out.println("Static Variable & Method");
        System.out.println(StaticDemo.college_Name);
        StaticDemo.PrintName();

        //Instance Variable/ Method (Non-static for Create class)
        System.out.println("Instance ________");
          StaticDemo instance = new StaticDemo();
          instance.PrintVersion();
         System.out.println(instance.version);
         instance.version=99;

         StaticDemo.college_Name="TTA";

        System.out.println("After Change Static Value");
         StaticDemo S2 = new StaticDemo();
         S2.version=299;
         S2.PrintVersion();
    }
}
