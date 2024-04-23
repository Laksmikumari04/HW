package src.Practice;

public class One {
    public static void main(String[] args) {
        int[] Array={1,5,7,8,9,10};
      int finalMaxValue=  findMaxValue(Array);
        System.out.println(finalMaxValue);

    }
    public static int findMaxValue(int[] array){
        int max=Integer.MIN_VALUE;
        for(int num:array){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
}
