package src.Dec30;

public class Lab123String_swap {
    public static void main(String[] args) {
        String name  ="LAKSHMI";
        char[] CharName = name.toCharArray();
        System.out.println(CharName.length);

        int left = 0;
        int right  =CharName.length-1;

        while(left<right){
            char temp =CharName[left]; //left is A
            CharName[left] =CharName[right]; // left A == Right b
            CharName[right] =temp;           // Right b ==left A
            left++;
            right--;


        }
        //String rev_name = new String(CharName);
        //System.out.println(rev_name);
        System.out.println(CharName);


    }
}
