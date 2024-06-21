package src.Array_InterviewQuestion;

public class SecondMaxNumber_SortingTechnique {
    public static void main(String[] args) {
        int[] array={2,4,10,20,90,50,};
        int temp;
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        System.out.println("Print Second largest Number"+array[1]);
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }


    }
}
