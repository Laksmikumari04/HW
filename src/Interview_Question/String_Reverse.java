package src.Interview_Question;

public class String_Reverse {
    public static void main(String[] args) {
        String name = "Pramod";
        String y = "";
//be careful for  for value
        for (int i = name.length() - 1; i >= 0; i--) {
            y = y + name.charAt(i);

        }
        System.out.println(y);

        //String name2 ="Automaion";

        StringBuffer name2=new StringBuffer("Automation");
        name2.reverse();
        System.out.println(name2);

    }
}

