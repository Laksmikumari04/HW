package src.Interview_Question;

public class stringNumberConvertString {
    public static void main(String[] args) {
        String name="Lakshmi123";
        //OutPut=LakshmiOneTwoThree
       String finalOutput= ConvertintoWords(name);
        System.out.println(finalOutput);
    }
    public static String ConvertintoWords(String name){
        //Map Each numeric value into words
        String [] digitWords={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

        StringBuilder output=new StringBuilder();
        //Iterate through Character of the input String
        for(char c:name.toCharArray()){
            if(Character.isDigit(c)){
                //If Character is Digit append crossponding words to the result
             int digit=   Character.getNumericValue(c);
             output.append(digitWords[digit]);
            }
            //If Character is nto digit append it unchanged to the result
            else{
                output.append(c);
            }
        }

        return output.toString();
    }
}
