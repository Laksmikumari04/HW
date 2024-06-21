package src.Array_InterviewQuestion;

public class Remove_Char_String {
    public static void main(String[] args) {
//        String name="Test Testing";
//        char removeChar='T';
//        StringBuffer modifyname=new StringBuffer();
//        for(int i=0;i<name.length();i++){
//            char OriginalName=name.charAt(i);
//            if(OriginalName!=removeChar){
//                modifyname.append(OriginalName);
//            }
//        }
//        System.out.println(modifyname);

        String str="Test Academyt";
        char removechar='T';
        StringBuffer modifyname=new StringBuffer();
        for(int i=0;i<str.length();i++){
           char Orignalname= str.charAt(i);
           if(Orignalname!=removechar){
               modifyname.append(Orignalname);
           }
        }
        System.out.println(modifyname);

    }
}
