package zajecia4;

import java.util.Random;

public class MatrixIntro {
    public static void main(String[] args) {

        int[][] macierz = new int[3][5];
        //3 - to ilosc wierszy, 5   -to ilosc kolumn

        Random r = new Random();
        //wypelnienie macierzy wartosciami losowymi
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                macierz[i][j] = r.nextInt(10);

            }
        }
        //wyswietlenie macierzy:
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                System.out.print(macierz[i][j] + ", ");
            }
            // po wypisaniu calego wiersza przejdz do nowej linii
            System.out.println();
        }


        // max w wierszach:
        int[] maxwWierszach = new int[macierz.length]; // wyswietlenie macierzy

        for (int i = 0; i < macierz.length; i++) {
            int max = macierz[i][0];
            for (int j = 0; j < macierz[0].length; j++) {

                //w petli wewnerznej przechodzimy caly wiersz, tutaj szukamy max
                if (max < macierz[i][j]) {
                    max = macierz[i][j];
                }
            }
            // po przejsciu calego wiersza znalezlismy max wiec wpisujemy go do tablicy
            maxwWierszach[i] = max;
        }
        // wyswietlenie max w wierszach
        System.out.println("Maksymalne wartosci w wierszach:");
        for (int wWierszach : maxwWierszach) {
            System.out.print(wWierszach + ", ");
        }
        System.out.println();


        //min w wierszach
        int[] minwWierszach = new int[macierz.length];
        for (int i = 0; i < macierz.length; i++) {
            int min = macierz[i][0];
            for (int j = 0; j < macierz[0].length; j++) {
                if (min > macierz[i][j]) {
                    min = macierz[i][j];
                }
            }
            minwWierszach[i] = min;
        }
        System.out.println("Minimalne wartosci w wierszach:");
        for (int wWierszach : minwWierszach) {
            System.out.print(wWierszach + ", ");
        }
        System.out.println();

        // max w kolumnach -????
        int[] maxwKolumnach = new int[macierz[0].length];
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                int max = macierz[0][j];
                {
                    if (max < macierz[i][j]) {
                        max = macierz[i][j];
                    }
                }
                maxwKolumnach[j] = max;
            }
        }
        System.out.println("Maksymalne wartosci w kolumnach:");
        for (int wKolumnach : maxwKolumnach) {
            System.out.print(wKolumnach + ", ");

        }
    }
}















