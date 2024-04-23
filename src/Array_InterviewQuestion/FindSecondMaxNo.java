package src.Array_InterviewQuestion;

public class FindSecondMaxNo {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        Integer firstmax=null;
        Integer secondmax=null;
        for(Integer num:array){
            if(firstmax==null || num>firstmax){
                secondmax=firstmax;
                firstmax=num;
            } else if (secondmax==null || num>secondmax) {
                secondmax=num;

            }
        }
        System.out.println("Find SecondMax Value :"+secondmax);
    }
}
