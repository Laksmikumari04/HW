package Array_Practice;

public class MaxNo {
    public static void main(String[] args) {
        int[] arr  = {10,4,6,8,5,401};
        int max = arr[0];
        for (int i=0; i< arr.length; i++){
            max =arr[i];
        }
        System.out.println(max);
    }
}
