package zajecia4;

import java.util.Random;

public class ZD {
    public static void main(String[] args) {

        int [][] matrix = new int[5][5];

        Random rand = new Random();

        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                int liczba=rand.nextInt(10);
                matrix[i][j]=liczba;
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print(matrix[i][j] + ", ");

            }
            System.out.println();
        }

        int[] maxWWierszach=new int [matrix.length];

        for (int i = 0; i <matrix.length ; i++) {
            int max=matrix[i][0];
            for (int j = 0; j <matrix[0].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
                maxWWierszach[i]=max;
            }
            System.out.println("Maxymalne wartosci w wierszach to: ");
            for (int wWierszach:maxWWierszach) {
                System.out.print(wWierszach + ", ");
            }
            System.out.println();

            int[] minWWierszach= new int [matrix.length];
            for (int i = 0; i <matrix.length ; i++) {
            int min=matrix[i][0];
            for (int j = 0; j <matrix[0].length; j++) {
                if (min>matrix[i][j]) {
                    min=matrix[i][i];
                }
            }
            minWWierszach[i]=min;
        }
        System.out.println("Min wartosci w wierszach to: ");
        for(int wWierszach : minWWierszach) {
            System.out.print(wWierszach + ", ");
        }
        }

    }

