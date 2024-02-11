package src.Interview_Question;
import java.util.Arrays;
public class Hide_No {
    public static void main(String[] args) {
        //Masking number
        String masknumber="5638154862";
        if(masknumber.length()>4) {
            System.out.println(masknumber.replaceAll(".(?=.{4})", "#"));
        }
        else if(masknumber.equalsIgnoreCase(" ")){
            System.out.println(masknumber);
        }
        else {
            System.out.println(masknumber);
        }

    }
}
