package Array_Practice;

public class MaxNo_Second {
    public static void main(String[] args) {
        int[] arr ={2,4,6,8,14,10};
        Integer first_maxNo= null;
        Integer Second_maxNo =null;
        for(Integer num: arr){
            if(first_maxNo == null || num> first_maxNo){
                Second_maxNo =first_maxNo;
                first_maxNo=num;
            } else if (Second_maxNo == null || num>Second_maxNo) {
                Second_maxNo =num;

            }
        }
        System.out.println("FirstMax Number : "+first_maxNo);
        System.out.println("SecondMax Number :"+Second_maxNo);
    }
}
