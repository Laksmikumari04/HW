package src.OopsAbstraction.Interfaces;
 interface FatherI {

     int b=10;

     void loan1k();

     default  void Print1(){
         System.out.println("Default allowed in Interface");
     }

      static  void Print2(){
          System.out.println("Static allowed in Interface");
      }


}


