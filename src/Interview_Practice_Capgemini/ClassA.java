package src.Interview_Practice_Capgemini;

public class ClassA {
    void methodA()
    {
        System.out.println("Method A");
    }}
    class ClassBB extends ClassA {
        void methodB()
        {
            System.out.println("Method B");
        }

        class ClassC {

            public static void main(String[] args) {
                ClassBB B = new ClassBB();
                B.methodB();
                B.methodA();

                ClassA A = new ClassA();
                A.methodA();
                // A.methodB(); -> It will not allow

                // ClassBB B1=new ClassA(); -> It will not allow

                ClassA A1 = new ClassBB();
                A1.methodA();




            }


        }
    }





