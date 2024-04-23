package src.Practice;

public class MaskFourDigit {
    public static void main(String[] args) {
        String number="123456789";
        System.out.println(maskNumber(number));//maskNumber(number);
    }

    public static String maskNumber(String number){
      int length= number.length();
      if(length<=4){
          return number;
      }
      //Extract 4 digit number
       String Extract4= number.substring(length-4);
      StringBuffer BeforeMaskNumber=new StringBuffer();
      for(int i=0;i<length-4;i++){
          BeforeMaskNumber.append("*");
      }
      return BeforeMaskNumber+Extract4;
    }

    }

