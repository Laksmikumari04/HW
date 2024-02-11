package src.Interview_Question;

public class MaskNumberLast3 {
    public static void main(String[] args) {
        String inputNumber = "123456789";
        // Mask the number
        String masknumber = masknumber(inputNumber);
        System.out.println(masknumber);

    }

    private static String masknumber(String number) {
        int length = number.length();
        if (length <= 3) {
            return number;
        }
        // Extract last three digit
        String lastThreeDigits = number.substring(length - 3);

        // Mask the middle digits
        StringBuilder maskedMiddle = new StringBuilder();
        for (int i = 0; i < length - 3; i++) {
            maskedMiddle.append("*");
        }


        return maskedMiddle + lastThreeDigits;
    }

}
