package zajecia3.Arrays;

import java.util.Random;
import java.util.Scanner;

public class ZadaniaDom2 {

    public static void main(String[] args) {

        System.out.println("Podaj rozmiar tablicy");
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int [] liczby = new int [size];
        int [] wystapienia = new int [11];

        Random r = new Random();
        for (int i = 0; i <liczby.length ; i++) {

            int losowaLiczba = r.nextInt(10) + 1;
            liczby[i] = losowaLiczba;

            System.out.print(losowaLiczba + ", ");
        }

        System.out.println();

            for (int i = 0; i <liczby.length; i++) {
               int index= liczby[i];
               wystapienia[index]++;
            }

            for (int i = 0; i <wystapienia.length ; i++) {
                System.out.println(i + " ---> " + wystapienia[i]);

            }

        }



    }

