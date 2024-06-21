package src;

public class Capgemini_Interview {

    public static void main(String[] args) {
       int[] arra= { 1, 2, 3, 5, 6, 7 };
       int temp;
       for(int i=0;i<arra.length;i++){
           for(int j=i+1;j<arra.length;j++){
               if(arra[i]<arra[j]){
                   temp=arra[i];
                   arra[i]=arra[j];
                   arra[j]=temp;
               }
           }
       }
       //for(int i=0;i<arra.length;i++){
           System.out.println(arra[1]);
      // }



    }}





