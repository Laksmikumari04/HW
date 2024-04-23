package src.Practice.BasicStringExample;

public class Practi {
    public static void main(String[] args) {
        String name="Testing";
        char removechar='T';
        StringBuffer modifyname=new StringBuffer();
        for(int i=0;i<name.length();i++){
          char Originamename=  name.charAt(i);
          if(Originamename!=removechar){
              modifyname.append(Originamename);
          }
        }
        System.out.println(modifyname);
    }
}
