package zajecia4.Funkcje;

import java.util.Scanner;

public class Zadanie3 {

    static boolean isPalindrom(String text) {
        //kajak- dlugosc wynosi 5; 5/2=2

        for (int i=0; i<text.length()/2; i++) {
            // porownujemy odpowiadajace sobie litery
            //pierwsza litere musimy porownac z ostatnia
            //druga litere z przedostatnia
            //do uzyskania inf ktora litere od konca musimy porownac
            // obliczamy text.length()-1 -> ostatnia litera i odejmujemy jeszcze i
            // zeby uzyskac przesuniecie, czyli odpowiadajaca litere od tylu
            if (text.charAt(i) == text.charAt(text.length()-1-i)) {
                continue;
            } else {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Podaj tekst-spr czy palindrom");
        String text=sc.nextLine();
        System.out.println(isPalindrom(text));

    }
}
