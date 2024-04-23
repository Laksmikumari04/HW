package src;

abstract class Vehicle_Abstarct {
   static int no_of_tyres=4;
   int check=10;
   Vehicle_Abstarct(){
       int a=10;
       System.out.println("Constructor Variable"+a);
       System.out.println("I am Constructor");//No benfit to create Object Constructor because we can't create Object of Abstract class.
       //Construct only call when create Object or new Keyword;
   }
   abstract void start();

  private void engine(){
       System.out.println("Hide implementation of Engine ");
   }

}
