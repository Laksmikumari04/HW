package src.Practice;

public class findMin {
    public static void main(String[] args) {
        int[] array={24,34,54,54,74};
     int value= findMin(array);
        System.out.println(value);
    }
    public static int findMin(int[] array){
        int min=Integer.MAX_VALUE;
        for(int num:array){
            if(num<min){
                min=num;

            }
        }
        return min;
    }
}
