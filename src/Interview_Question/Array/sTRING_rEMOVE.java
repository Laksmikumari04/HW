package src.Interview_Question.Array;

public class sTRING_rEMOVE {
    public static void main(String[] args) {
        String name="Test Testing";
        String removechar="T";
        StringBuffer modifyname=new StringBuffer();
      String repla=  name.replaceAll(removechar,"");
      modifyname.append(repla);
        System.out.println(modifyname);

    }
}
