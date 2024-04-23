package src.Array_InterviewQuestion;

public class String_SortingArray {
    public static void main(String[] args) {
        String[] array = {"Amit", "Veronica", "Ravi", "deepak", "Suresh"};
        String temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].compareToIgnoreCase(array[j + 1]) > 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
