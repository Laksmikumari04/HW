package src.Practice;

public class Last4Digit {
    public static void main(String[] args) {
        Integer number=123456789;
       int maskoutput= lastFourDigitnumber(number);
        System.out.println(maskoutput);
    }

    public static int lastFourDigitnumber(int number1){
        //Integer to conver number
      String numberstr= Integer.toString(number1);
      //measure length
       int lenght= numberstr.length();
       if(lenght<=4){
           return number1;}
           //Extract last digit number
      String extarcLastFourNumber = numberstr.substring(0,lenght-4)+"***";

      //Masked all before Digit


        return Integer.parseInt(extarcLastFourNumber);
    }
}
