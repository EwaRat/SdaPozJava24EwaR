package zajecia3.Arrays;

import java.util.Scanner;

public class ZadDom2 {

    public static void main(String[] args) {

        System.out.println("Podaj dlugosc tablicy");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] tablica = new int [n];

        if (n>=1 && n<=30) {
            for (int i = 0; i <n; i++) {
                tablica[i]=i;

                System.out.println(i*i);
            }

        } else {
            System.out.println("Liczba powinna nalezec do zakresu 1-30");
        }

    }
}
