package zajecia4;

import java.util.Random;

public class ZadDom3Matrix {
    public static void main(String[] args) {

        int [][] matrix = new int [5][5];

        Random r = new Random();
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[0].length; j++) {
                matrix[i][j] = r.nextInt(11)-5;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }

        // min w wierszach


        int [] minWWierszach = new int [matrix.length];
        for (int i = 0; i <matrix.length ; i++) {
            int min=matrix[i][0];
            for (int j = 0; j <matrix[0].length ; j++) {
                if(min>matrix[i][j]) {
                    min=matrix[i][j];
                }
            }
            minWWierszach[i]=min;
            System.out.println("Minimalna wartosc w wierszu nr " + (i+1) + " to: " + min);
        }
        System.out.println();

        // max w wierszach

        int [] maxWWierszach = new int [matrix.length];

        for (int i = 0; i <matrix.length; i++) {
            int max = matrix[i][0];
            for (int j = 0; j <matrix.length ; j++) {
                if (max<matrix[i][j]) {
                    max=matrix[i][j];

                }

            }
            maxWWierszach[i]=max;
            System.out.println("Maxymalna wartosc w wierszu nr " + (i+1) + " to: " + maxWWierszach[i]);

        }







    }
}
