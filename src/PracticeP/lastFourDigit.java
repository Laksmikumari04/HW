package src.PracticeP;

public class lastFourDigit {
    public static void main(String[] args) {
        String cardnumber="24683579123";
          int length= cardnumber.length();

          //Extract last Four digit
           String ExtractlastFourDigit=cardnumber.substring(length-4);
          //Mask all Before Digit
        StringBuilder modifynumber=new StringBuilder();
        for(int i=0;i<length-4;i++){
            modifynumber.append("*");
        }
        System.out.println(modifynumber+ExtractlastFourDigit);
    }
}
