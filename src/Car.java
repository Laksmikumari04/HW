package src;

public class Car extends Vehicle_Abstarct{
    @Override
  final void start() {
        System.out.println("Car start with Key");
    }

}
class Scooter extends Vehicle_Abstarct{
    @Override
    void start() {
        System.out.println("Scooter start with key");

    }

    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        Scooter s=new Scooter();
        s.start();
        //System.out.println(Vehicle_Abstarct.no_of_tyres);

    }

}