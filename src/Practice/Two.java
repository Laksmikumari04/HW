package src.Practice;

public class Two {
    public static void main(String[] args) {
        //find minimum value
        int[] array={1,2,89,54,32,24};
      int MiniumValue=  findMinValue(array);
        System.out.println(MiniumValue);

    }
    public static int findMinValue(int[] array){
        int min=Integer.MAX_VALUE;
        for(int num:array){
            if(num<min){
                min=num;
            }
        }
        return min;
    }
}
