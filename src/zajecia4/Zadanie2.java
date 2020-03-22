package zajecia4;

import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy:");
        int arraySize=scanner.nextInt();

        //tworzymy 2 tablice
        // pierwsza - "liczby" o rozmiarze podanym przed uzytkownika
        // druga - "wystąpienia: o rozmiarze 11 (dla wystapien od 0 do 10 czyli 11 cyfr)

        int [] liczby=new int [arraySize];
        int [] wystapienia= new int [50];

        //wypelnij tablice "liczby" wartosciami losowymi

        Random rand = new Random();
        for (int i= 0; i < liczby.length; i++) {
            //losujemy liczbe
            int losowaLiczba = rand.nextInt((49) + 1);
            //wpisujemy wylosowana liczbe do tablicy
            liczby[i]=losowaLiczba;
        }
        //mamy wypelniona tablice liczby wiec ja wyswietlimy
        //uzyjemy petli foreach
        //nie mamy zmienniej int i, tracimy informacje o indeksie
        //ale w tym przypadku tego nie potrzebujemy - dla kazdego elementu chcemy go tylko wypisac..
        for (int liczba:liczby) {
            System.out.print(liczba + ", ");     // lub odrazu System.out.print(losowaLiczba + ", ");
        }
        System.out.println(); // przejdz do nowej linii

        //zliczanie elementow

        for (int i = 0; i < liczby.length; i++) {
            //pobierz wartosc z tablicy liczby ->wartosc ta jest indeksem dla tablicy wystapienia
            // np. jezeli trafimy liczba 5 -> to w tablicy "wystapenia"[5] nalezy inkrementowac aktualna wartosc

            int index = liczby[i];
            wystapienia[index]++;
        }

        //wyswietlenie tablicy "wystapienia"
        for (int i = 0;  i< wystapienia.length; i++) {
            System.out.println(i + "--> " + wystapienia[i]);

        }


        }
    }

