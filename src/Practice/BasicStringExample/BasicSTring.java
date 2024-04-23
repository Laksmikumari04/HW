package src.Practice.BasicStringExample;

public class BasicSTring {
    public static void main(String[] args) {
        //String into convert into char
        String name="Lakshmi";
        char[] ch=name.toCharArray();//Both is same
        System.out.println(ch);
        System.out.println("________________________");

//Char conver into String
        char[] chh={'L','a','k','s','h','m','i'};
        String name2=new String(chh);
        System.out.println(name2);
        System.out.println("______________________");



//char convert into String Buffer
        char[] chh1={'L','a','k','s','h','m','i'};
        StringBuffer name3=new StringBuffer();
        for(char nvalue:chh1){
            name3.append(nvalue);
            System.out.println(name3);
        }
        System.out.println("______________________");

        //String into StringBuffer
        String value="Lakshmi";
        StringBuffer name4=new StringBuffer(value);
        System.out.println(name4);
        System.out.println("___________________________");

        //String Convert into Array
        String value1="Lakshmi";
        //Convert into String Array
        char[] chq=value1.toCharArray();
        //Print to char array
        for(char kk:chq){
            System.out.println(kk+"");
        }

    }
}
