package src.PracticeP;

public class StringDigit {
    public static void main(String[] args) {
        String name="Hello0456";
      String changeValue=  converintoWords(name);
        System.out.println(changeValue);
    }
    public static String converintoWords(String name) {
        //Mapping  between digit and words
        String[] Digitwords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight","Nine"};
      StringBuilder result=new StringBuilder();
      //Iterate character of input String
        for(char c:name.toCharArray()){
           if(Character.isDigit(c)){
               //If character is Digit append result corresponding  of word
            int digit=  Character.getNumericValue(c);
            result.append(Digitwords[digit]);
           }
           //If character is not digit append result is unchanged
            else{
                result.append(c);
           }
        }
        return result.toString();
    }
    }

