package src.Interview_Question;

public class Test {
    //public static void main(String[] args) {
        static void creditcard(String cc) {

            StringBuffer s = new StringBuffer();

            if (cc.length() <= 4) {
                System.out.println(cc);
            } else if (cc.length() > 16) {
                System.out.println("Give a valid 16 digit CC number");
            }

            else {
                for (int i = cc.length() - 4; i > 0; i--) {
                    s.append("#");
                }
                System.out.println(s + "" + cc.substring(cc.length() - 4));
            }
        }

    public static void main(String[] args) {
        creditcard("11111111111111111111111111111111");
    }


        }



