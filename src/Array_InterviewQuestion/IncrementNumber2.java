package src.Array_InterviewQuestion;

public class IncrementNumber2 {
    public static void main(String[] args) {
        int[] array = {1,2 ,3,4, 5,6,7, 8, 9};

        // Increment each number in the array by 1
        for (int i = 0; i < array.length; i++) {
            array[i]++; // Add 1 to the current element
        }

        // Print the updated array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
