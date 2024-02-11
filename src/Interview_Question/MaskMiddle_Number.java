package src.Interview_Question;

public class MaskMiddle_Number {
    public static void main(String[] args) {
        String middlenumber ="12345635792468";
        //5450595638154862
        //output 545059******4862

        String maskFinalOP =middlenumbermask(middlenumber);
        System.out.println(maskFinalOP);

    }
    private static String middlenumbermask(String mnumber){
        int lenght =mnumber.length();
        if(lenght<=9){
        return mnumber;}

        //Extract 6 digit number
        String first6digitNumber =mnumber.substring(0,6);

        //Extract Last 4 digit number
        String lastfourdigitNumber =mnumber.substring(lenght-4);
        StringBuffer maskall =new StringBuffer();
        for(int i=6;i<=lenght-4;i++){
            maskall.append("*");

        }
        return first6digitNumber+maskall+lastfourdigitNumber;
    }
}
