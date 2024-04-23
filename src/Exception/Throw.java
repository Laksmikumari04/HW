package src.Exception;

public class Throw {
    public static void main(String[] args) {
        int age=-5;
        try {
            if (age < 0) {
 throw new IllegalAccessException("Age value can't be negative");

            }
            System.out.println("Age" + age);
        }catch (IllegalAccessException e){
            System.out.println("Invalid age :"+e.getMessage());

        }

    }
}
