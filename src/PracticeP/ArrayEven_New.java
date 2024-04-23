package src.PracticeP;

public class ArrayEven_New {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,2,4,6,8};
        for(int num:array){
            if(num%2==0){
                System.out.println(num);
            }
        }
    }
}
