package src.Interview_Practice_Capgemini;

public class Capgemini {
    public static void main(String[] args) {
        //Finding Missing Number

                int[] array = { 1, 2, 3, 5, 6,7 };

                int n = array.length + 1; // Since one number is missing
        System.out.println(n);
                int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        System.out.println(expectedSum);

                int actualSum = 0;
                for (int num : array) {
                    actualSum += num;
                }

                int missingNumber = expectedSum - actualSum;

                System.out.println("Missing number is: " + missingNumber);
            }
    }

