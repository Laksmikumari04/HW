package src.Interview_Question;

public class StringRemoveChar {
    public static void main(String[] args) {
        String name="Test Testing ";
        char removechar='T';
        StringBuffer modifyname=new StringBuffer();
        for(int i=0;i<name.length();i++){
         char OrignalName = name.charAt(i);
         if(OrignalName!=removechar){
             modifyname.append(OrignalName);
         }
        }
        System.out.println(modifyname);
    }
}
