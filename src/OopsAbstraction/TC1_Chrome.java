package src.OopsAbstraction;

public class TC1_Chrome extends Base{
    TC1_Chrome(String name, String code, int EMP_ID) {
        super(name, code, EMP_ID);
    }

    @Override
    String Openbrowser() {
        System.out.println("Google browser Open");
        return null;
    }

    @Override
    String Closebrowser() {
        System.out.println("Google browser close");
        return null;
    }

    public static void main(String[] args) {
        TC1_Chrome chrome = new TC1_Chrome("Laki","Session",31);
        chrome.Openbrowser();
        // If you don't user here 'Printlog method' ,so I have to print (name, code & EMP_Id )one by one.
        chrome.PrintLog();
        chrome.Closebrowser();
    }
}
