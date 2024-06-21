package src.Array_InterviewQuestion;

public class TestOwn {

    static public void main(String[] args)
    {
        int[] arr = new int[] { 9, 8, 2, 6, 1, 8, 3, 3, 4, 7 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }}

