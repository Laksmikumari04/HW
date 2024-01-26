package src.Jan20_CollectionFramework;

import java.util.Stack;

public class Lab188_Stack {
    public static void main(String[] args) {
        //FILO
        Stack stack =new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        stack.pop(); //Remove top items
        System.out.println(stack);
        System.out.println(stack.peek()); //show top one
    }
}
