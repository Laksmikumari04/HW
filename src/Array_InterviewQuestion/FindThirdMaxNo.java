package src.Array_InterviewQuestion;

public class FindThirdMaxNo {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        Integer firstmax=null;
        Integer secondmax=null;
        Integer thirdmax=null;
        for(Integer num:array){
            if(firstmax==null ||num>firstmax){
                thirdmax=secondmax;
                secondmax=firstmax;
                firstmax=num;
            } else if (secondmax==null|| num>secondmax) {
                thirdmax=secondmax;
                secondmax=num;}
            else if ((thirdmax==null||num>thirdmax)) {
                thirdmax=num;


            }


        }
        System.out.println("Find ThirdMax Value :"+thirdmax);
        System.out.println("__________________");
        System.out.println("Find FirstMaxValue :"+firstmax);
        System.out.println("Find SecondMAxValue :"+secondmax);
        System.out.println("Find ThirdMax Value :"+thirdmax);
        }
    }

