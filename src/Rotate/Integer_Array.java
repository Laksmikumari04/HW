package src.Rotate;

import java.util.Arrays;
import java.util.Collections;

public class Integer_Array {
    public static void main(String[] args) {
        // Let us create an array of integers
        Integer arr[] = {10, 20, 30, 40, 50};

        System.out.println("Original Array : " +
                Arrays.toString(arr));

        // Please refer below post for details of asList()
        // https://www.geeksforgeeks.org/array-class-in-java/
        // rotating an array by distance 2
        Collections.rotate(Arrays.asList(arr), 3);

        System.out.println("Modified Array : " +
                Arrays.toString(arr));
    }
}
