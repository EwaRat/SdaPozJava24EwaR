package zajecia4.Funkcje;
// j.kozak - zajecia4- lancuchy zkanow(String)

import java.util.Scanner;

public class Zadanie1 {

    static int counLastLetter(String text) {
        //pobieramy ostatnia litere w napisie
        text=text.toLowerCase(); // zeby liczylo tez ewentualnie duza litere

        char lasLetter=text.charAt(text.length()-1);
        int counter=0;
        for (int i =0; i<text.length(); i++) {
            char litera = text.charAt(i);
            if (lasLetter== litera) {
                // jezeli ostatnia litera (last Letter) zgadza sie z aktulana litera(letter) to zwieksz licznik
                counter ++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {

        System.out.println("Podaj dowolny napis, a ja policze ilosc wystapien ostatniej litery");

        Scanner scanner = new Scanner(System.in);

        String napis= scanner.nextLine();
        // wywolujemy funkcje, ktora ma nam to policzyc - przed mainem!!

        int liczbaWystapien=counLastLetter(napis);

        System.out.println("ostatnia litera w wyrazie wystapila " + liczbaWystapien + " razy");


    }

}
