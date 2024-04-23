package src.Array_InterviewQuestion;

public class FindFirstMaxNo {
    public static void main(String[] args) {


    int[] array={10,20,30,40,50};
    Integer maxNo=null;
    for(Integer num:array)
    // we can use int here; Integer uses :(In addition, this class provides several methods for converting an int to a String and a String to an
        // int, as well as other constants and methods useful when dealing with an int.
        {
        if(maxNo==null || num>maxNo){
            maxNo=num;
        }
    }
        System.out.println("Find max value :"+maxNo);
}}
