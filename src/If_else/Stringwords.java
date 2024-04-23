package src.If_else;

import java.util.Scanner;

public class Stringwords {
    public static void main(String[] args) {
       String str="shootmyskills";
        //Convert string to array character

          char[]  chararray= str.toCharArray();
          //Iterate over and print each character
        for(char c :chararray){
            System.out.println(c);
            switch (c){
                case 's':
                    System.out.println("It's a string");
                    break;
                case 'h':
                        System.out.println("It's a string");
                        break;
                case 'o':
                    System.out.println("It's a string");
                    break;
                case 'O':
                    System.out.println("It's a string");
                    break;
                case 't':
                    System.out.println("It's a string");
                    break;
                case 'm':
                    System.out.println("It's a string");
                    break;
                case 'y':
                    System.out.println("It's a string");
                    break;
                case 'S':
                    System.out.println("It's a string");
                    break;
                case 'k':
                    System.out.println("It's a string");
                    break;
                    case 'i':
                    System.out.println("It's a string");
                    break;
                    case 'l':
                    System.out.println("It's a string");
                    break;
                case 'L':
                    System.out.println("It's a string");
                    break;


                default:
                    System.out.println("It's not a string");
            }

        }

    }
}
