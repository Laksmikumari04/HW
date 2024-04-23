package src.PracticeP;

import java.util.HashMap;

public class StringInteger1 {
    public static void main(String[] args) {
        String name="Hello123";
      String finalword=  integerConvertWord(name);
        System.out.println(finalword);
    }
    public  static String integerConvertWord(String name){
        HashMap<Character,String> digitword=new HashMap<>();
        digitword.put('0',"Zero");
        digitword.put('1',"One");
        digitword.put('2',"Two");
        digitword.put('3',"Three");
        digitword.put('4',"Four");
        digitword.put('5',"Five");
        digitword.put('6',"Six");
        digitword.put('7',"Seven");
        digitword.put('8',"Eight");
        digitword.put('9',"Nine");
        StringBuilder result=new StringBuilder();
        for(char ch:name.toCharArray()){
            if(Character.isDigit(ch)){
            //If character is Digit append crossponding digitword to the result
            result.append(digitword.get(ch));
        }
            else {
                //If character is not digit append it in unchanged result
                result.append(ch);
            }




    }
        return result.toString();
    }





    }

