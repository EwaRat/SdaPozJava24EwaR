package zajecia3;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //zad.4 pętle III
        // 1)zapytaj uzytkownika o dowolny napis
        // "Ala ma kota", "Piotr", "Zadanie4"
        // 2)policz liczbe znaków ze spacja i bez
        // 3)wyswietl wynik

        Scanner czytnik=new Scanner(System.in);
        System.out.println("Podaj dowolny łańcuch znakowy");
        String text=czytnik.nextLine();

        //zliczanie dlugosci napisu bez spacji
        int licznik=0;
        for (int i =0; i<text.length(); i++) {
            // pobierz 1 znak
            char znak = text.charAt(i);

            System.out.println("Znak na pozycji: " + i + " to: " + znak );

            // jezeli dany znak jest litera (czyli nie jest spacja to go zliczamy)

            if (znak != ' ') {
                licznik++;
            }

        }
        System.out.println("Długość tekstu bez spacji to: " + licznik);
        System.out.println("Długośc tekstu ze spacjami to: " + text.length());

        // wyswietl napis zapisany malymi i duzymi literami

        System.out.println("Tekst malymi literami to: " + text.toLowerCase());
        System.out.println("Tekst duzymi literami to: " + text.toUpperCase());










    }
}
