package zajecia7;

import java.util.Scanner;

public class zadDomKozak2zad8 {

    // choinka 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe wierszy choinki");
        int liczba = sc.nextInt();

        for (int i = 0; i < liczba; i++) {
            for (int j = 0; j < liczba - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}








