package src.OOps_Jan14_Static;

public class Lab154_StaticInner {
    public static void main(String[] args) {
        OOC ooc = new OOC();
        OOC.SNCI sinner =new OOC.SNCI();
        sinner.show();

    }
}
    class OOC{
        static int d =100;
         int e =200;
         static  class SNCI{
             void  show(){
                 System.out.println(d);
                 //System.out.println(e); instance variable can't access in static

             }
         }


}
