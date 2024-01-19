package src.OopsInheritance.Hierarchical;

public class Lab0149 {
    public static void main(String[] args) {
        Vehicle v =new Vehicle();
         v.PrinDetails();
        System.out.println("Here will Print Car access details :");
         Car C =new Car();
         C.Lambor();
         C.PrinDetails();
        System.out.println("Here will print Truck details:");
        Truck t = new Truck();
        t.PrinDetails();
        t.RedTruck();

    }
}

// Notes:  Grand or Parent Class only can access their method in child class.
//            Grand or Parent can  also access child class object
//        like : Grand G = new Son/grandson();

//Notes2: Child Class access all class method Superclass(Grand)
        //  Child class can't access Superclass/Parent class Object
          // like Child class =G Grand(); ERROR will come

//Note 3 : Parent Class/ Super Class/ base class

// Note 4 : Child class / subclass/ derived class

// Note 5 : types :Sinle 2. Multilevel ( A->B -> C) 3.Hierarchical (A->B) (A->C)
// Note 6 : Only instance Varaible can access another extends class
// Note 7 : Local Varraible only use in internal means in method class or in main class.