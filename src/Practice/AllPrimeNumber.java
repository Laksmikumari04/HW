package src.Practice;

public class AllPrimeNumber {
   // int temp=0;
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int temp = 0;
            for (int j = 2; j <= i - j; j++) {
                if (i % j == 0) {
                    temp = temp + 1;}
                }
                if (temp == 0) {
                    System.out.println(i);
                } else {
                    temp=0;
                    //System.out.println("IT's not prime number");
                }
            }
        }
    }
