package zajecia3.Arrays;

import java.util.Scanner;

// zad. j.kozak
public class ArraysIntro {
    public static void main(String[] args) {


        //tworzenie tablicy 10-elementowej
        int[] liczby = new int[10];

        //wpisywanie wartosci do tablicy
        liczby[0] = 25;
        liczby[4] = 100;

        //pobieranie wartosci z tablicy
        int wartosc = liczby[4];

        System.out.println(wartosc);
        System.out.println(liczby[0]);

        int dlugoscTablicy = liczby.length;
        System.out.println("Tablica ma długość: " + dlugoscTablicy);

        String[] imiona = {"Ala", "Piotr", "Adam", "Karolina", "Eliza"};
        System.out.println("Dlugosc tablicy to: " + imiona.length);

        //wyswietlenie wszystkich elementów tablicy
        for (int i = 0; i < imiona.length; i++) {

            //pobieranie i-tego imienia z tablicy
            String name = imiona[i];
            System.out.println("Imie nr. " + i + " to: " + name);
        }
            //alternatywnie- odrazu wyswietlenie elementu, bez wczesniejszego tworzenia zmiennej
            //System.out.println("Imie nr. " + i + " to: " + imiona[i]);


        // dynamiczne tworzenie tablicy
        System.out.println("Podaj rozmiar tablicy");
        Scanner scanner = new Scanner(System.in);
        int rozmiar = scanner.nextInt();
        int [] dynamicznaTablica = new int[rozmiar];
        System.out.println("Rozmiar dynamicznej tablicy: " + dynamicznaTablica.length);

    }



}
