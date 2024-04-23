package src.Practice;

import java.util.ArrayList;
import java.util.List;

public class Array2DinterviwQuestion {
    public static void main(String[] args) {
        int[][] numbers={{1,1,1},{1,1,1},{1,1,1}};
        List<Integer> sums=new ArrayList<>();
        //Iterate over each row
        for(int[] row:numbers){
            int rowsum =0;

        //Iterate over each element in row
        for(int num:row){
            rowsum +=num;// add number in rowsum
            }

            sums.add(rowsum);
        }
        System.out.println(sums);
//        int[][] numbers = {
//                {1, 1, 1},
//                {1, 1, 1},
//                {1, 1, 1}
//        };
//
//        // Initialize a list to store the sum of each row
//        List<Integer> sums = new ArrayList<>();
//
//        // Iterate over each row
//        for (int[] row : numbers) {
//            int rowSum = 0;
//            // Iterate over each element in the row
//            for (int num : row) {
//                rowSum += num; // Add the number to the row sum
//            }
//            sums.add(rowSum); // Add the row sum to the list
//        }
//
//        // Print the sums
//        System.out.println("Sum of each row: " + sums);

    }
}
