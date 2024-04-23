package src.Interview_Question.String;

public class vowel {
    public static void main(String[] args) {
        String str = "Hello world";
        int totalcount = vowelscount(str);
        System.out.println(totalcount);

    }

    public static int vowelscount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;

    }
}
