package zajecia3.Arrays;

import java.util.Scanner;

public class ZadDom1 {

    public static void main(String[] args) {
        System.out.println("Podaj rozmiar tablicy");

        Scanner sc = new Scanner(System.in);
        int rozmiar = sc.nextInt();

        int[] array= new int [rozmiar];

        for (int i = 0; i <array.length ; i++) {
            System.out.println("Podaj " + (i+1) + " element tablicy");
            Scanner scanner = new Scanner (System.in);
            int liczba= scanner.nextInt();
            array[i]=liczba;
        }

        for (int i = 0; i <array.length ; i++) {
            System.out.println("Liczby: " + array[i]);
        }


        int max=array[0];
        for (int i = 0; i <array.length ; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Maximum to: " + max);


        int min=array[0];
        for (int i = 0; i <array.length ; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Minimum to: " + min);

        double suma=0;
        double avg=0;

        for (int i = 0; i <array.length ; i++) {
            suma +=array[i];
            avg= suma/array.length;

        }
        System.out.println("Srednia to: " + avg);

        int licznik=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i] >avg) {
                licznik++;
            }

        }
        System.out.println("Wieksze od max: " + licznik);

        for (int i = array.length-1; i >=0 ; i--) {

            System.out.println(array[i]);

        }
    }

}
