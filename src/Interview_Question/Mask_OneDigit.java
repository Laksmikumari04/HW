package src.Interview_Question;

public class Mask_OneDigit {
    public static void main(String[] args) {
        /*
        Original number: 123456
        Masked number: 12X456
         */
        String one ="123456";
        String FinalOutput =createOneusemask(one);
        System.out.println(FinalOutput);
    }
    public static String createOneusemask(String onemask){
        int length =onemask.length();
        if(length>6){
            return onemask;
        }
        //Extract  two digit from here
        String twoDigit =onemask.substring(0,2);
        //Extract last  3 Digit from here
        String lastThreeDigit =onemask.substring(length-3);

        //For mask Value
        StringBuffer maskDigit =new StringBuffer();
        for(int i=2;i<length-3;i++){
            maskDigit.append("*");
        }
        return twoDigit+maskDigit+lastThreeDigit;
    }
}
