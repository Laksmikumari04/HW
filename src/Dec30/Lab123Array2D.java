package src.Dec30;

public class Lab123Array2D {
    public static void main(String[] args) {
        int[][] diagonal = new int[3][3];
        diagonal[0][0] =1;
        diagonal[0][1] =2;
        diagonal[0][2] =3;
        diagonal[1][0] =4;
        diagonal[1][1] =5;
        diagonal[1][2] =5;
        diagonal[2][0] =7;
        diagonal[2][1] =8;
        diagonal[2][2] =9;
        // |1 2 3|
        // |4 5 6|
        // |7 8 9|
        // i==j
        for(int i=0; i< diagonal.length ; i++){
            for (int j=0; j< diagonal[i].length ; j++)
            {
                System.out.print("\t"+ diagonal[i][j]);
            }




            System.out.println();
        }

    }
}
