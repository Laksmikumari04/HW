package src.Practice.BasicStringExample;

public class String_Remove {
    public static void main(String[] args) {
        //Remove a char
        String name="Lakshmi";
        char charRemove='a';
        StringBuffer modifename=new StringBuffer();
        for(int i=0;i<name.length();i++){
            char currentchar=name.charAt(i);
            if(currentchar!=charRemove){
               modifename.append(currentchar) ;
            }

        }
        System.out.println(modifename);

        System.out.println("Another Simple Way to Remove a");
        String name2="Lakshmi";
       String replacename= name2.replace("a","");
        System.out.println(replacename);

    }
}
