package src.Interview_Question.Array;

public class Array_MinimumValue {
    public static void main(String[] args) {
        int[] array={22,10,45,65,23,};
       int findmin= findMinValue(array);
        System.out.println(findmin);
    }
    private  static int findMinValue(int[] array){
        int min=Integer.MAX_VALUE;
        for(int num:array){
            if(num<min){
                min=num;


            }
        }

        return min;
    }
}
