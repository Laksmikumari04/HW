package src.Exception;

public class Unchecked_Exceptions {
    public static void main(String[] args) {
        // run time exception
        String name=null;
        System.out.println(name.length());//NullPointer Exception
        //NullPointerException


        int result=10/0;//ArithmeticException
        System.out.println(result);

        int[] array={1,2,3,4};
        System.out.println(array[4]);//ArrayOutOfBoundException

    }
}
