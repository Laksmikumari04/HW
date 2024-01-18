package src.OOPs_7thJan;

public class Bankmain {
    public static void main(String[] args) {
        bankAccount A=new bankAccount("Amit","PNB","PNB101",991122);
        A.BankDetails();
        System.out.println();
        bankAccount B=new bankAccount("Laki","HDFC","HDFC3782",110099);
        B.BankDetails();
        System.out.println();
        bankAccount C=new bankAccount("Pramod","ICICI","ICICI001",897773);
        C.BankDetails();
    }
}
