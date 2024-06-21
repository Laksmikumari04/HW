package src.Interview_Practice_Capgemini;

public class Dirtyhands {
    public static void main(String[] args) {
        int[] arr={3,5,9,4,4};
        int totalSum=0;
        for(int num :arr){
            totalSum +=num;
        }
        int leftSum=0;
        for(int i=0;i< arr.length;i++){
            totalSum -=arr[i]; //RightSum value
            if(leftSum==totalSum){
                System.out.println("Print Equlibrium No :"+arr[i]);
                return;
            }
            leftSum +=arr[i];

        }
        System.out.println("No Equlibrium number found");

    }
}
