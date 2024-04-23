package src.Interview_Question;

public class MasknumberLast4 {
    public static void main(String[] args) {
        String cardnumber ="24689765438";

        String maskoutput= masknumber1(cardnumber);
        System.out.println(maskoutput);
    }


    public static String masknumber1(String number){
       int lenght=  number.length();
        if (lenght<=4){
        return number;
        }

        //Extraxt last 4digit number
        String lastFourDigitNumber =number.substring(lenght-4);

        // Mask all before digit
        StringBuffer maskbefore =new StringBuffer();
        for (int i=0;i<lenght-4;i++){
            maskbefore.append("*");
        }


        return maskbefore +lastFourDigitNumber;
    }
}
