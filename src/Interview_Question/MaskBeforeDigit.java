package src.Interview_Question;

public class MaskBeforeDigit {
    public static void main(String[] args) {
        String Bdigit ="55556666";

        String maskBeforOP =beforDigitmask(Bdigit);
        System.out.println(maskBeforOP);
    }
    private static String beforDigitmask(String mask){
        int length=mask.length();
        if(length<8){
            return mask;
        }

        //Extarct last 4 digit
        String lastFourDigit =mask.substring(length-4);

        StringBuffer maskv =new StringBuffer();
        for(int i=0;i<length-4;i++){
            maskv.append("*");
        }


        return maskv+lastFourDigit;
    }


}
