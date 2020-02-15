 package zajecia2;

import java.util.Scanner;

public class RatyZadanie {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);

        double cena = 0;
        int liczbaRat = 0;

        System.out.println("Podaj cene towaru: ");
        cena = czytnik.nextDouble();

        System.out.println("Podaj ilosc rat: ");
        liczbaRat = czytnik.nextInt();

        double miesiecznaRata = 0;

        if ((cena >= 100 && cena <= 10000) && (liczbaRat > 6 && liczbaRat < 48)) {
            System.out.println("Obliczam raty...");

            // 1.1 bo cena * odsetki + cena czyli 100% + 2.5%
            if (liczbaRat <= 12) {
                miesiecznaRata = 1.025 * cena / liczbaRat;
            } else if (liczbaRat <= 24) {
                miesiecznaRata = 1.05 * cena / liczbaRat;
            } else {
                miesiecznaRata = 1.1 * cena / liczbaRat;
            }

            System.out.println("Miesieczna rata wynosi: " + miesiecznaRata);

        } else {
            System.out.println("Wprowadzone dane sa niepoprawne - urucham program ponownie");


        }
    }
}





