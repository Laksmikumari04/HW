package src.Interview_Question;

public class Integer_Swap_oneNumber {
    public static void main(String[] args) {
        int number=123456;
        int swappedNumber = swapDigits(number);
        System.out.println("Original number: " + number);
        System.out.println("Swapped number: " + swappedNumber);


   /* int num =123456,
            r =0;
    while(num!=0){
        int digit =num%10;
        r =r*10+digit;
        num=num/10;

    }
        System.out.println(r);*/
}
    public static int swapDigits(int number1) {
        // Convert the number to a string
        String numberStr = Integer.toString(number1);

        // Swap the first and last digits
        char firstDigit = numberStr.charAt(0);
        char lastDigit = numberStr.charAt(numberStr.length() - 1);

        // Create the new string with swapped digits
        String swappedStr = lastDigit + numberStr.substring(1, numberStr.length() - 1) + firstDigit;

        // Convert the new string back to an integer
        return Integer.parseInt(swappedStr);
    }
}
