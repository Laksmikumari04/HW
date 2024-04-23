package src.PracticeP;

public class ArrayMAx_New {
    public static void main(String[] args) {
    int[] array={2,4,6,8,1,2,3,4,5};
    int max=array[0];
    for(int i=0;i<array.length;i++){
        if(array[i]>max){
            max=array[i];
        }

    }
        System.out.println(max);

}}
