package src.Interview_Question;

public class Integer_Swap_oneNumber {
    public static void main(String[] args) {


    int num =123456,
            r =0;
    while(num!=0){
        int digit =num%10;
        r =r*10+digit;
        num=num/10;

    }
        System.out.println(r);
}}
