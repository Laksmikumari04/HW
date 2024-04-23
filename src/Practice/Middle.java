package src.Practice;

public class Middle {
    public static void main(String[] args) {
        String number="5450595638154862";
      String Fcardmask=  MaskMiddle(number);
        System.out.println(Fcardmask);

    }
    public static String MaskMiddle(String number){
        int length=number.length();
        if(length<=9){
            return number;
        }
        //Extract 6 Digit number
        String SixDigitnumber=number.substring(0,6);
        //Extract 4Digit number
        String FourDigitNumber=number.substring(length-4);
        //Converting into StringBuffer
        StringBuffer modifymaskno=new StringBuffer();
        for(int i=6;i<length-4;i++){
            modifymaskno.append("*");
        }
        return SixDigitnumber+modifymaskno+FourDigitNumber;
    }
}
