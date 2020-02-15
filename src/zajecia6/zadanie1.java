package zajecia6;

import java.util.Random;
import java.util.Scanner;

//Zadania Tablicei pętle1.Napisz program symulujący grę w Lotto:a.Użytkownik typuje 6 cyfrb.Program losuje 6 cyfr z liczb od 1 do 49c.
// Program wypisuje na ekranie wytypowane przez użytkownika cyfryd.
//Program wypisuje na ekranie wylosowane cyfrye.Program wyświetla wynik użytkownika w poniższej formie:i.Trafiono n z 6 cyfr

public class zadanie1 {

    // zad do poprawy zrobic tablice!!

    public static void main(String[] args) {
        System.out.println("Podaj 6 cyfr z zakresu 1-49");
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int liczba1=sc.nextInt();
        System.out.println("Podaj druga liczbe");
        int liczba2=sc.nextInt();
        System.out.println("Podaj trzecia liczbe");
        int liczba3=sc.nextInt();
        System.out.println("Podaj czwarta liczbe");
        int liczba4=sc.nextInt();
        System.out.println("Podaj piata liczbe");
        int liczba5=sc.nextInt();
        System.out.println("Podaj szosta liczbe");
        int liczba6=sc.nextInt();

        System.out.println("Twoje liczby to: " +  liczba1 + ", " + liczba2 + ", " + liczba3 + ", " + liczba4 + ", " + liczba5 + ", " + liczba6);

        Random r = new Random();
        int l1 = r.nextInt(49) +1;
        int l2=r.nextInt(49) +1;
        int l3=r.nextInt(49) +1;
        int l4=r.nextInt(49) +1;
        int l5=r.nextInt(49) +1;
        int l6=r.nextInt(49) +1;

        System.out.println("Wylosowane liczby to: " + l1 + ", " + l2 + ", " + l3 + ", " + l4 + ", " + l5 + ", " + l6 );

        int licznik=0;
        for (int i = 0; i <5 ; i++) {
        if (liczba1==l1) {
            licznik++;
        }

        }
        System.out.println(licznik);
        }



    }

