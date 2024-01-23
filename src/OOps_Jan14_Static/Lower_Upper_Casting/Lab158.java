package src.OOps_Jan14_Static.Lower_Upper_Casting;

public class Lab158 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        child Child = new child();
        parent =Child;
       // Child =parent; child can't access PArent marraige like

        hello Hello = new hello();
        //child2 Child2 = new child2();

       child2 Child2=(child2) Hello; //It's Down casting in class


    }
}

class hello{

}
class child2 extends hello{

}

class  Parent{

}
class child extends Parent{

}
