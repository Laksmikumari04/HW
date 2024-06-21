package src.String_Questions;

public class  String_replac2 {
    public static void main(String[] args) {
        String str="Selenium with Java";
       String val="slnu ih jv";
//      str= str.replace("Selenium with Java","slnu ih jv");
//        System.out.println(str);
        StringBuilder output=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                output.append(str.charAt(i));
            }
        }
        System.out.println(output);

    }


}
