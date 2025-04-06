package Array_Practice;

public class MaxNumber_First_Technique {
    public static void main(String[] args) {
        int[] arr ={2,4,6,8,14,10};
        Integer maxNo = null;
        for(Integer num : arr)
        {
            if( maxNo == null || num>maxNo){
                maxNo =num;
            }
        }
        System.out.println("Find max value :"+maxNo);


    }
}
