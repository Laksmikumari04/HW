package src.MiscellounousOOps;

public class ConstructorExample {
    public ConstructorExample() {

    }
    public ConstructorExample(String abc,int value){
        System.out.println(abc+" " +value);


    }




    public static void main(String[] args) {
        ConstructorExample Const = new ConstructorExample();
        ConstructorExample Const1 = new ConstructorExample("Laki",11);
        ConstructorExample Const2 =new ConstructorExample("Amit",15);



    }
}
