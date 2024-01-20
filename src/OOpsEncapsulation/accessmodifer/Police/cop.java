package src.OOpsEncapsulation.accessmodifer.Police;

public class cop {

   public int gun;

    public cop(int gun)
    {
        this.gun=gun;
        System.out.println("DC");
    }
   protected void CanIshoot()
    {
        System.out.println("Ofcourse, Shoot");
    }
}
