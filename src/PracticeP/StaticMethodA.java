package src.PracticeP;

public class StaticMethodA {
    int a=10;
    static int b=20;


static void showA(){
    int d=b+10;
    int e=d+b;
    System.out.println(e);

    System.out.println(d);
    System.out.println("This is Static method");
    System.out.println(b);



}
  void display(){
    int c=a+b;
      System.out.println("This is non-static method");
      System.out.println(a);
      System.out.println(b);
      showA();
      System.out.println(this.b);

  }
    public static void main(String[] args) {

    showA();
   // StaticClassA ob=new StaticClassA();
    //ob.display();



    }
}
