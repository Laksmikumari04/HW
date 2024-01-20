package src.OopsAbstraction;

public class Firefox extends Base{
    Firefox(String name, String code, int EMP_ID) {
        super(name, code, EMP_ID);
    }

    @Override
    String Openbrowser() {
        System.out.println("Open firefox browser");
        return null;
    }

    @Override
    String Closebrowser() {
        System.out.println("Close firefox browser");
        return null;

    }

    public static void main(String[] args) {
        Firefox Fire = new Firefox("Uma","101",28);
        Fire.Openbrowser();
        Fire.PrintLog();
        Fire.Closebrowser();
    }
}
