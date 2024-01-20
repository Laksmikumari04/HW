package src.OopsAbstraction.Interfaces.RealtimeExample;

public class Car implements Engine,Break
{
    void start(){
        System.out.println("Starting the car");

    }

    @Override
    public void StartEngine() {

        System.out.println("Started Enegine");

    }

    @Override
    public void Bbreak() {
        System.out.println("break is working fine");
    }
}
