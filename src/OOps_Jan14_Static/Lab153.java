package src.OOps_Jan14_Static;

public class Lab153 {
    public static void main(String[] args) {
        Car C = new Car("Lambo 137");
        C.driver();
        //Syntax: OuterClass.InnerClass Inref = OCref.new IC();
        Car.Engine engine =C.new Engine("400C");
        engine.start();
        C.driver();
    }
}

class Car{
    String make; //instance variable

    //Parameterized Constructor
   public Car(String make){
        this.make=make;

    }
    void driver(){
        System.out.println("You can drive car");
    }
    public class Engine{
       String HorsePower;

       //Parametrised Constructor
       public Engine(String HorsePower){
           this.HorsePower =HorsePower;}

        //method
           void start(){
               System.out.println("Engine is Started -->"+make);
           }

       }
    }

