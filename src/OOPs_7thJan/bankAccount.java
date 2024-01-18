package src.OOPs_7thJan;

public class bankAccount {
    String name;
    String BankName;
    long Account_No;
    String Bankcode;

    bankAccount(String name,String BankName,String BankCode,long AccountNo){
        this.name=name;
        this.BankName=BankName;
        this.Bankcode=BankCode;
        this.Account_No=AccountNo;

    }
    void BankDetails()
    {
        System.out.print(name);
        System.out.print(" "+BankName);
        System.out.print(" "+Bankcode);
        System.out.print(" "+Account_No);

    }
}
