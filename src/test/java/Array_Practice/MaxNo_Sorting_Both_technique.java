package Array_Practice;

public class MaxNo_Sorting_Both_technique {
    public static void main(String[] args) {
        int[] arr ={10,20,60,74,34,80,32};
        int temp=0;

        for(int i=0;i<arr.length;i++){
            for(int j =i+1; j< arr.length;j++){
                if(arr[i]<arr[j]){
                temp =arr[i];
                arr[i] =arr[j];
                arr[j] = temp;
            }}
        }
        System.out.println("Find array first max num :"+ arr[0]);
        System.out.println("Find array second max num :"+ arr[1]);

        //Sorting also
        System.out.println("\"Sorting all arary or decrement way\"");
        for(int i=0; i< arr.length;i++){
           // "Sorting all arary or decrement way :"

            System.out.print(arr[i]+" ");
        }


    }
}
