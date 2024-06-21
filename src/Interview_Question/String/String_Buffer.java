package src.Interview_Question.String;

public class String_Buffer {
    public static void main(String[] args) {
        String str="Lakshmi";
        StringBuffer modifyname=new StringBuffer(str);
        modifyname.reverse();
        System.out.println(modifyname);
    }
}
