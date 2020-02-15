package zajecia1;

import java.util.Scanner;

public class CzytnikIntro {
    public static void main(String[] args) {
        //aby móc czytać dane od użytkownika należy utworzyć obiekt typu Scanner:

        Scanner czytnik = new Scanner (System.in);
        // czytnik to zmienna typu Scanner

        //wiek to zmienna typu int
        //w momencie pisania kodu nie wiemy ile konkretny uzytkownik ma lat to wiek int=0

        String imie;
        double wiek = 0;

        System.out.println("Podaj swoje imie: ");
        imie=czytnik.nextLine();

        System.out.println("Witaj" + imie);

        System.out.println("Ile masz lat?");

        wiek=czytnik.nextDouble();

        System.out.println( "Witaj, " + imie + "! Masz " + wiek + " lat");





    }
}
