package src.Interview_Question.String;

public class String_Remove {
    public static void main(String[] args) {
        String name="Selenium$ with java";
        String filtered=name.replaceAll("[$&]","");
        StringBuffer modifyname=new StringBuffer();
        for(int i=0;i<filtered.length();i++){
            if(i%2==0){
                modifyname.append(filtered.charAt(i));
            }
        }
        System.out.println(modifyname);
    }
}
