package zajecia3;

import java.util.Scanner;

public class ZadaniaDom4 {
    public static void main(String[] args) {

        System.out.println("Podaj nazwe");
        Scanner sc = new Scanner(System.in);

        String nazwa = sc.nextLine();

        int dlugosc=nazwa.length();
       // System.out.println("Dlugosc lancucha ze spacjami to: " + dlugosc);

        int licznik=0;
        for (int i=0; i<nazwa.length();i++) {
            char znak =nazwa.charAt(i);
                    if (znak != ' ') {
                        licznik ++;
                    }
        }
        System.out.println(dlugosc);
        System.out.println(licznik);

        System.out.println(nazwa.toLowerCase());
        System.out.println(nazwa.toUpperCase());
    }
}
