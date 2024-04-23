package src.PracticeP;

public class TestA {
    String name;
    int Emp_ID;
    TestA(String name,int EmP_ID){
        this.name=name;
        this.Emp_ID=EmP_ID;
    }
    public static void main(String[] args) {
        TestA e1=new TestA("LAki",11);
        System.out.println(e1.name+" " +e1.Emp_ID);

    }
}
