package src.Practice;

public class findMax {
    public static void main(String[] args) {
        int[] value={2,67,86,98,4,2,1};
       int MaxValue= findMax(value);
        System.out.println(MaxValue);
    }


    public static int findMax(int[] value){
        int max=Integer.MIN_VALUE;
        for(int num:value){
            if(num>max){
                max=num;
            }


        }
        return max;
    }
}
