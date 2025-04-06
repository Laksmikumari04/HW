package Array_Practice;

public class EqulibriumNo {
    public static void main(String[] args) {
        int[] array ={4,5,2,2};
        //int[] array ={1,3,5,2,2};
        int totalSum =0;
        for(int num:array){
            totalSum +=num;
        }
        //Inatlize left sum
       int leftSum  =0;
        for(int i=0;i<array.length;i++){
            totalSum -= array[i]; //totalSum is like rightSum
            if(leftSum ==totalSum){
                System.out.println("Equlibrium No :"+array[i]);
                return;
            }
            leftSum +=array[i];

        }
        {
            System.out.println("No Equlibrium No. found ");
        }
    }
}
