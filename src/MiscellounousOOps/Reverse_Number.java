package src.MiscellounousOOps;

public class Reverse_Number {
    public static void main(String[] args) {
//        int number =123456789, r =0;
//         while(number!=0){
//             int digit =number%10;
//         r=r*10 +digit;
//         number=number/10;
//         }
//        System.out.println(r);

        int number =123455,
         r=0;
        while(number!=0){
            int digit =number%10;
            r=r*10+digit;
            number=number/10;
        }
        System.out.println(r);


        int num =234567, num2=0;
        while(num!=0){
            int digit =num%10;
            num2 =num2*10+digit;
            num=num/10;
        }
        System.out.println(num2);
}
    }

