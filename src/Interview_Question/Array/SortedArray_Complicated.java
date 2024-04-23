package src.Interview_Question.Array;

public class SortedArray_Complicated {
    public static void main(String[] args) {
        int[] array={2,8,9,7,6,4,5};
         boolean  isSorted= isSortedMethod(array);
        System.out.println(isSorted);
    }

    private static boolean isSortedMethod(int[] array){
        for (int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                return false;

            }
        }

        return true;
    }
}
