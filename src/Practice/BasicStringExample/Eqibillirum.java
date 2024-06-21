package src.Practice.BasicStringExample;

public class Eqibillirum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};

        // Calculate the total sum of the array
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // Initialize leftSum to 0
        int leftSum = 0;

        // Iterate through the array to find the equilibrium index
        for (int i = 0; i < arr.length; i++) {
            // totalSum is now right sum for index i
            totalSum -= arr[i];

            // Check if leftSum equals right sum
            if (leftSum == totalSum) {
                System.out.println("Equilibrium index: " + arr[i] );
                return;
            }

            // Update leftSum for the next iteration
            leftSum += arr[i];
        }

        // If no equilibrium index is found
       System.out.println("No equilibrium index found");
    }
}


