package src.Practice;

public class replaceQ {
    public static void main(String[] args) {
        String a = "newpaper";
        System.out.println(a.replaceAll("new",""));
        System.out.println(a.replace("new",""));
        System.out.println(a.replace("paper","123"));
        System.out.println(a.substring(0,3));
      String extractChar=  a.substring(0,3);

    }
}
