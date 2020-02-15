package zajecia3;

import java.util.Scanner;

public class ZadanieDomArray1 {
    public static void main(String[] args) {

        System.out.println("podaj rozmiar tablicy");
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();

        int [] array = new int [size];

        for (int i = 0; i <size; i++) {
            System.out.println("Podaj " + (i + 1) + " element tablicy");
            Scanner scanner = new Scanner(System.in);
            int liczba = scanner.nextInt();
            array[i] = liczba;
        }
        for (int i = 0; i <size ; i++) {
            System.out.println((i + 1) + " element tablicy to: " + array[i]);
        }

            //min
            int min = array[0];
            for (int i = 0; i <array.length ; i++) {
                if (array[i] < min) {
                    min=array[i];
                }
        }
        System.out.println("Minimum to: " + min);

            //max
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max=array[i];
            }
        }
        System.out.println("Maximum to: " + max);

            //avg
        float suma=0;
        float avg=0;


        for (int i = 0; i <array.length; i++) {
            suma+=array[i];
            avg=suma/array.length;
        }
        System.out.println("Suma wynosi: " + suma);
        System.out.println("Srednia wynosi: " + avg);

        // ilosc elementow < i > od avg
        int licznik1=0;

        for (int i = 0; i < array.length ; i++) {
            if (array[i]<avg) {
                licznik1++;
            }
        }
        System.out.println("Liczba elementow mniejszych od sredniej to: " + licznik1);

        int licznik2=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>avg) {
                licznik2++;
            }
        }
        System.out.println("liczba elementow wiekszych od sredniej to: " + licznik2);

        // zawartosc tablicy w odwrotnej kolejnosci

        for (int i =array.length-1; i >=0 ; i--) {
            System.out.println("element tablicy nr: " + (i+1) + " wynosi: " + array[i]);


        }








        }







    }

