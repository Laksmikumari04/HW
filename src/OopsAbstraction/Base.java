package src.OopsAbstraction;



public  abstract class Base {
    String name;
    String code;
    int EMP_ID;

    //Parameterized Constructor
    Base(String name,String code, int EMP_ID){
        this.code= code;
        this.name = name;
        this.EMP_ID= EMP_ID;
    }


  abstract   String Openbrowser();

  abstract  String Closebrowser();

  void PrintLog(){
      System.out.println("Log");
      System.out.println(name
      );
      System.out.println(code);
      System.out.println(EMP_ID);
  }


}
