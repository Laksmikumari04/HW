package src.Interview_Practice_Capgemini;

public class MissingNumber_Find {
    public static void main(String[] args) {
        int[] array={1,2,3,5,6,7,8};
        //Find missing number 4
        int n= array.length+1;
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for(int num:array){
            actualSum +=num;
        }
        int missingNumber=expectedSum-actualSum;
        System.out.println(missingNumber);
    }
}
