package src.OOps_Jan14_Static;

public class StaticDemo {
       //Static Variable
    public static  String college_Name ="The Testing Academy";
    public int version =3;      //Instance Variable

    public  static  void PrintName(){
        int age =40; //Local Variable
        System.out.println("Name is:" +college_Name);
        System.out.println(age);
        //You can't use instance Variable into static method !!
        //System.out.println("Version is:"+version);

    }

    public void PrintVersion(){
        System.out.println("Name is :"+college_Name);
        System.out.println("Version is: "+version);
        //You can use another method Local Variable
        //System.out.println(age);
    }

}
