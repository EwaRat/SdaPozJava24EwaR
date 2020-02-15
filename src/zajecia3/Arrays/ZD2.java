package zajecia3.Arrays;

import java.util.Random;
import java.util.Scanner;

public class ZD2 {

    public static void main(String[] args) {

        System.out.println("Podaj rozmiar tablicy");
        Scanner sc = new Scanner(System.in);
        int rozmiar = sc.nextInt();

        int [] liczby= new int [rozmiar];
        int [] wystapienia = new int [11];

        Random random = new Random();


        for (int i = 0; i <liczby.length ; i++) {
            int liczba= random.nextInt(10)+1;
            liczby[i]=liczba;
        }
        for(int liczba:liczby) {
            System.out.println(liczba);
        }

        for (int i = 0; i <liczby.length ; i++) {

            int index = liczby[i];
            wystapienia[index]++;

        }

        for (int i = 0; i <wystapienia.length; i++) {

            System.out.println(i + "--->" + wystapienia[i]);

        }

    }
}


