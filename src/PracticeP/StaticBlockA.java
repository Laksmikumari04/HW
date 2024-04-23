package src.PracticeP;

public class StaticBlockA {
    static {
        System.out.println("First Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Hello main method");
        //static int b=10; because static can't create under method
    }
    static {
        System.out.println("Second Static Block");
    }
}
