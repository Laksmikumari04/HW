package src.Interview_Question.Array;

public class Array_MaxValue {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 3, 1};
         int maxElementArray= findMaxValue(array);
        System.out.println(maxElementArray);

    }
        public static int findMaxValue(int[] array){
      int max=  Integer.MIN_VALUE;
      for(int num:array){
          if(num>max){
              max=num;
          }
      }

            return max;
        }

}
