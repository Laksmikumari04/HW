package src.Interview_Question.String;

public class StringManuplation_Replace {


    public static void main(String[] args) {
        //Orginal String
        String name="Lakshmi123";
        //Converting String
      String convertName=  name.replace("123","OneTwoThree");
      System.out.println(convertName);

      String name1="1Lakshmi123";
       String check2= RevseerNumber(name1);
        System.out.println(check2);

    }
    public  static String RevseerNumber(String name1){
        //Extract one digit 1
      String extract1=  name1.substring(0,1);//now 1 digit has extracted
              String remainingString =name1.substring(1);// Extract the Remaning String
//Replace 123 String into OneTwoThree
       String replaceString= remainingString.replace("123","OneTwoThree");
       //Concate the extract 1 and replaceString
          String Finaloutput=  extract1+replaceString;



        return Finaloutput;
    }
}




