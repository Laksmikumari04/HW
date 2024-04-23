package src.Practice;

public class Mask3digit {
    public static void main(String[] args) {
        String cardnumber="123456789";
       String maskOutput=  maskLastThreeDigit(cardnumber);
        System.out.println(maskOutput);
    }



    public static String maskLastThreeDigit(String number){
        //Get the length
          int length  = number.length();

          if (length<=3){
              return number;
          }
              //Extract  last 3 didit number
      String lastthreeDigit=  number.substring(length-3);
          //Masedk all Digit before the last 3
        StringBuffer maskbefore=new StringBuffer();
        for(int i=0;i<length-3;i++){
            maskbefore.append("*");
        }


        return  maskbefore +lastthreeDigit;
    }
}
