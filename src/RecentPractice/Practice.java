package src.RecentPractice;

public class Practice {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        //find max first ,Second & third number
        Integer firstmax=null;
        Integer secondmax=null;
        Integer thirdmax=null;
        for(int num:array){
            if(firstmax==null||num>firstmax){
                thirdmax=secondmax;
                secondmax=firstmax;
                firstmax=num;
            } else if (secondmax==null||num>secondmax) {
                thirdmax=secondmax;
                secondmax=num;

            } else if (thirdmax==null||num>thirdmax) {
                thirdmax=num;

            }
        }
        System.out.println(firstmax);
        System.out.println(secondmax);
        System.out.println(thirdmax);
    }
}
