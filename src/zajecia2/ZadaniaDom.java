package zajecia2;

import java.util.Scanner;

public class ZadaniaDom {
    public static void main(String[] args) {
        // zad 1 - liczby parzyste 0 -100

        int liczba = 0;
        while (liczba <= 100) {
            if (liczba % 2 == 0) {
                System.out.println(liczba);
            }
            liczba++;
        }

        // zad.1-wersja 2

        System.out.println("Liczby parzyste 0-100 - wersja 2");

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // zad.1 - wersja 3

        System.out.println("liczby aparzyste 0-100 - wersja 3");

        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

        // zad.2 - liczby nieparzyste 200-300
        int liczba2 = 200;
        while (liczba2 <= 300) {
            if (liczba2 % 2 != 0) {
                System.out.println(liczba2);
            }
            liczba2++;
        }

        // zad.3 - liczby nieparzyste 100 - 0
        int i = 99;
        while (i >= 0) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i--;
        }

        // zad.3 - wersja 2
        System.out.println("zadanie 3 - wersja 2");

        for (i = 99; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // zad.3 - wersja 3
        System.out.println("zadanie 3 - wersja 3");
        for (i = 99; i > 0; i -= 2) {
            System.out.println(i);
        }

        // zad.4 - suma liczb 0-100
        int suma = 0;
        for (i = 0; i <= 100; i++) suma = suma + i;
        System.out.println("suma liczb od 0 do 100 to: " + suma);

        // zajecia 2 - zadanie 1
        int liczbaCalkowita;

        Scanner czytnik = new Scanner(System.in);

        System.out.println("Podaj liczbę calkowitą dodatnia");
        liczbaCalkowita = czytnik.nextInt();


        for (i = 1; i <= liczbaCalkowita; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // zajecia 2 - zad.3

        int n;
        int wynik;

        Scanner odczyt = new Scanner(System.in);

        System.out.println("Podaj liczbę calkowitą dodatnia");
        n = odczyt.nextInt();

        for (i = 0; i <= n; i++) {

            wynik= (int) Math.pow(2,i);
            if (wynik <=n) {
                System.out.println(wynik);
            }
        }

        // zajecia 2 - zad.4






    }

}