package zajecia4;

import java.util.Random;
import java.util.Scanner;

public class ZadDomZad2 {
    public static void main(String[] args) {

        System.out.println("Podaj rozmiar tablicy");
        Scanner sc = new Scanner(System.in);
        int rozmiar = sc.nextInt();

        int[] liczby = new int[rozmiar];
        int[] wystapienia = new int[12];

        Random r = new Random();
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = r.nextInt((10) + 1);
        }
        System.out.print("Twoje liczby to: ");
        for  (int liczba : liczby) {
            System.out.print(liczba + ", ");
        }
        System.out.println();


        for (int i = 0; i < liczby.length; i++) {
            int index = liczby[i];
            wystapienia[index]++;
        }

        for (int i = 0; i < wystapienia.length; i++) {

            System.out.println(i + "--->" + wystapienia[i]);

        }
    }
}

