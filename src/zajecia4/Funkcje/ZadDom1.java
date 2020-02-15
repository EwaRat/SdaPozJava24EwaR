package zajecia4.Funkcje;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ZadDom1 {

    static int policz(String text) {

        text = text.toLowerCase();
        char lastLetter = text.charAt(text.length() - 1);
        int licznik = 0;
        for (int i = 0; i < text.length(); i++) {
            char litera = text.charAt(i);
            if (lastLetter == litera) {
                licznik++;

            }
        }
        return licznik;
    }


    public static void main(String[] args) {
        System.out.println("napisz text");
        Scanner sc = new Scanner(System.in);

        String slowo = sc.nextLine();

        int liczba = policz(slowo);

        System.out.println(liczba);
    }


}




