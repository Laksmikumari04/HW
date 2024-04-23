package src.Array_InterviewQuestion;

public class SortingArray {
    public static void main(String[] args) {


    int[] array={36,19,23,17,5};
    //Using Bubbleshort Technique
    for(int i=0;i<array.length;i++){
        int temp;
        for(int j=0;j<array.length-1;j++){
            if(array[j]>array[j+1]){
                temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;


            }
        }

    }
   for(int i=0;i<array.length;i++){
        System.out.println(array[i]);
    }
}}
