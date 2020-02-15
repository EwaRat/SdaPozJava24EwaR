package zajecia3.j.kozak;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        System.out.println("Podaj liczbę calkowita dodatnia");
        Scanner czytnik=new Scanner(System.in);
        int liczba = czytnik.nextInt();

        for (int i=1; i<=liczba; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // wersja 2
        for (int i=1; i<=liczba; i+=2) {
            System.out.println(i);
        }

    }
}
