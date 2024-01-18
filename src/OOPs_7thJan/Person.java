package src.OOPs_7thJan;

public class Person {
    String name;
    String College;

    Person(){
        System.out.println("DC");
        name="Laki";
    }
    Person(String name,String College){
        System.out.println("Parameterised Cons");
        this.name=name;
        this.College=College;
    }
    void PrintDEtails(){
        System.out.println(this.name);
        System.out.println(this.College);

    }

    public static void main(String[] args) {
        Person ref= new Person();
        ref.PrintDEtails();

        System.out.println("_____");
        Person ref2 = new Person("Amit","RGPV");
        ref2.PrintDEtails();
    }

}
