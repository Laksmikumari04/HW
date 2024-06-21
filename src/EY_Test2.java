package src;

import java.util.HashMap;

public class EY_Test2 {
    public static void main(String[] args) {
//        String str = "Today Is Friday";
//       // outout = todaY is fridaY

//      // char[] modify= str.toCharArray();
//       // str.replaceAll("st","todaY is fridaY")''
//      String[] s=  str.split(str);
//        System.out.println(s);
//        int [] inAr = {1,2,3,4,5,6,7};
//        //(1,6),(2,5),(3,4)
//        System.out.println(inAr[0]+","+inAr[5]);
//        for(int num:inAr){
//
//        }
//        String str = "abc123DEF";
//        System.out.println(str.replaceAll("[^0-9]+",""));
//       String modify= str.replaceAll("[^0-9]+","");
//     // String []sum= modify.split(modify);

        int[] inAr = {1, 2, 3, 4, 5, 6, 7};

        // Loop to find and print the pairs
        for (int i = 0; i < inAr.length / 2; i++) {
            int j = inAr.length - 1 - i;
            System.out.println("(" + inAr[i] + "," + inAr[j] + ")");


        }
    }}
