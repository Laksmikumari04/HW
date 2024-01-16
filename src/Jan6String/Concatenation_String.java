package src.Jan6String;

public class Concatenation_String {
    //1. By +(String concatenation ) Operator
    //2. By concat() method
    public static void main(String[] args) {
        String s=("Sachin" +"Tendulkar");
        String s4="Ravi" +"Shankar";
        System.out.println(s);
        System.out.println(s4);

        String value =50+30+"Sachin"+50+30;
        System.out.println(value);//80Sachin5030 bcoz in String part left will adding operation but right side will not happen


        String s1 = "Ravi";
        String S2="Shankar";
        System.out.println(s1.concat(S2));

    }
}
