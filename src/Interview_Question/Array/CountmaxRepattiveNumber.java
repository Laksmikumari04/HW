package src.Interview_Question.Array;

import java.util.HashMap;
import java.util.Map;

public class CountmaxRepattiveNumber {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 6, 1, 2, 3, 4, 2, 4, 5};
        int mostRepeatedInteger = findMostRepeatedInteger(array);
        System.out.println("Most repeated integer: " + mostRepeatedInteger);
    }

    public static int findMostRepeatedInteger(int[] array) {
        // Create a HashMap to store the count of occurrences of each integer
        Map<Integer, Integer> countMap = new HashMap<>();

        // Iterate over the array and update the countMap
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find the integer with the maximum count
        int maxCount = 0;
        int mostRepeatedInteger = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostRepeatedInteger = entry.getKey();
            }
        }

        return mostRepeatedInteger;
    }
    }

