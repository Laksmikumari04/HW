package src.OopsInheritance.Multilevel;

import src.OopsInheritance.Single.Programming;

public class Java  extends Programming {
    String new_Feature;

    Java(){
        System.out.println("DC");
    }
    Java(String NewFeature){
        this.new_Feature=NewFeature;
        }

        void Printinfo(){
            System.out.println("Java info-->"+new_Feature);
            System.out.println("Java info-->"+author);
        }

    }

