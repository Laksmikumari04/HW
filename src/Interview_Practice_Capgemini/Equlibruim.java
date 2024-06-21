package src.Interview_Practice_Capgemini;

public class Equlibruim {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        int totalSum=0;
        for(int num :arr){
            totalSum +=num;
        }
        //Intalize left sum
        int leftsum=0;
        for(int i=0;i<arr.length;i++){
            totalSum -=arr[i];   //total sum is now rightSum
            if(leftsum==totalSum){
                System.out.println("Eqlibruim index :"+arr[i]);
                return;
            }
            leftsum +=arr[i];
        }
        System.out.println("No Eqlibrium found");



    }
}
