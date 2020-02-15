package zajecia3.Arrays;

import java.util.Scanner;

//j.kozak
public class Zadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int size = scanner.nextInt();

        //tworzymy nowa tablice
        int[] array = new int[size];

        //wypełnij w petli for tablice
        //np
        //"podaj 1 element tablicy"
        //"podaj 2 element tablicy"
        //"podaj n-ty element tablicy"

        //wyswietl elementy tablicy

        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj " + (i + 1) + " element tablicy"); // i+1 zeby pytalo od podaj 1 element tablicy(nie od 0)
            Scanner sc = new Scanner(System.in);
            int liczba = scanner.nextInt();
            array[i] = liczba;
        }
        for (int i = 0; i < array.length; i++)
            System.out.println("Element nr  " + i + " to: " + array[i]);


        //obl. min max, avg, itd.

        //min
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimalna wartosc w tablicy to: " + min);

        //max
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max > array[i]) {
                //aktualny max max wiekszy od i-tego elementu wiec nic nie robie
                //kontynuujemy petle i zaczynamy nowy obieg petli
                continue;
            }
            //podmiana max
            max = array[i];
        }
        System.out.println("Maxymalna wartosc w tablicy to: " + max);

        // srednia = avg

        float suma = 0;
        float avg = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        avg = suma / array.length;
        System.out.println("Srednia to: " + avg);

        //ilosc elementow mniejszych od sredniej
        int licznik1=0;
        for (int i = 0; i<array.length ; i++) {
            if (array[i] <avg) {
                licznik1++;
            }
        }
        System.out.println("Liczba elementow mniejszych od sredniej: " + licznik1);

        // ilosc elementow wiekszych od sredniej

        int licznik2=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>avg) {
                licznik2++;
            }
        }
        System.out.println("Liczba elementow wiekszych od sredniej: " + licznik2);


        // elementy tablicy w odwrotnej kolejnosci:

        for (int i = array.length-1; i >=0; i--)
            System.out.println("Element nr " + (i+1) + " to: " + array[i]);

            }

        }










