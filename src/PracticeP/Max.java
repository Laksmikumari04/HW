package src.PracticeP;

public class Max {
    public static void main(Code_Basic[] args) {
        int[] array={2,4,6,98,78};
        System.out.println(findMaxNumber(array));// findMaxNumber(array);
    }




    public static int findMaxNumber(int[] array){
        int max=Integer.MIN_VALUE;

        for(int num:array){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
}
