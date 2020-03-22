package zajecia6;

//Zadania Tablicei pętle1.
// Napisz program symulujący grę w Lotto:
// a.Użytkownik typuje 6 cyfr
// b.Program losuje 6 cyfr z liczb od 1 do 49
// c.Program wypisuje na ekranie wytypowane przez użytkownika cyfry
// d.Program wypisuje na ekranie wylosowane cyfry
// e.Program wyświetla wynik użytkownika w poniższej formie:i.Trafiono n z 6 cyfr


import java.util.Random;
import java.util.Scanner;

public class zadanie1 {

    public static void main(String[] args) {


        int[] liczbyUzytkownika = new int[6];
        int[] wylosowaneLiczby = new int[6];

        System.out.println("Podaj 6 liczb z przedzialu 1-49");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            liczbyUzytkownika[i] = sc.nextInt();

        }
        System.out.print("Twoje liczby to: ");
        for (int liczba : liczbyUzytkownika) {
            System.out.print( liczba + ", ");
        }
        System.out.println();

        Random r = new Random();
        for (int i = 0; i <6 ; i++) {
            int losowaLiczba = r.nextInt(49) + 1;
            wylosowaneLiczby[i] = losowaLiczba;
        }
        System.out.print("Wylosowane liczby to: ");

            for(int liczba:wylosowaneLiczby) {
                System.out.print(liczba + ", ");
            }
            System.out.println();

            int licznik=0;

        for (int i = 0; i <6 ; i++) {
            if (liczbyUzytkownika[i] == wylosowaneLiczby[i]) {
                licznik++;
            }

            }
        System.out.println("Trafiles " + licznik + " z 6 liczb");

        }

        }















