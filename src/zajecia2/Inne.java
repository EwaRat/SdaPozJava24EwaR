package zajecia2;

import java.util.Scanner;

public class Inne {
    public static void main(String[] args) {

        // zad.3

        double waga;
        double wzrost;
        double bmi;

        Scanner skaner = new Scanner(System.in);
        System.out.println(" Podaj swoją wagę w kg");
        waga = skaner.nextDouble();
        System.out.println("Podaj swoj wzrost w m");
        wzrost = skaner.nextDouble();

        bmi= waga / Math.pow(wzrost,2);

        System.out.println("Twoje bmi wynosi: " + bmi);

        if (bmi>= 18.5 && bmi<=25) {
            System.out.println("Twoja waga jest optymalna");
        }else if (bmi < 18.5) {
            System.out.println("Masz niedowagę");
        } else {
            System.out.println("Masz nadwagę");
        }

        // zad.4

        int wynik1, wynik2, wynik3;
        int suma;
        int srednia;



        Scanner scaner = new Scanner (System.in);
        System.out.println("Podaj trzy wyniki testów");
        wynik1=scaner.nextInt();
        wynik2=scaner.nextInt();
        wynik3=scaner.nextInt();
        suma= wynik1 + wynik2 + wynik3;
        srednia = suma/3;

        System.out.println("Średnia wyników wynosi: " + srednia);

        if (srednia >=90 && srednia<=100) {
            System.out.println("Twoja ocena to: 5");
        } else if (srednia >=80 && srednia <90) {
            System.out.println("Twoja ocena to: 4");
        } else if (srednia >=70 && srednia <80) {
            System.out.println("Twoja ocena to: 3");
        } else if (srednia >=60 && srednia <70) {
            System.out.println("Twoja ocena to: 2");
        } else if (srednia >100 || srednia <0) {
            System.out.println("Wprowadzone wartości wyników z testów są niepoprawne. Sprobuj ponownie");
        } else {
            System.out.println("Twoja ocena to:1");
        }

        // zad.8

        int iloscSztuk;



        Scanner keybord = new Scanner(System.in);
        System.out.println("Podaj liczbe zakupionych pakietow");
        iloscSztuk=keybord.nextInt();




        if ( iloscSztuk>=10 && iloscSztuk<=19) {
            System.out.println("Rabat wynosi 20%");
            double wartoscRabatu=0.2;
            System.out.println("Kwota wynosi: " + (99 * iloscSztuk - wartoscRabatu *(99*iloscSztuk)));

        } else if ( iloscSztuk >=20 && iloscSztuk<=49) {
            System.out.println("Rabat wynosi 30%");
            double wartoscRabatu=0.3;
            System.out.println("Kwota wynosi: " + (99 * iloscSztuk - wartoscRabatu *(99*iloscSztuk)));
        } else if (iloscSztuk>=50 && iloscSztuk<=99) {
            System.out.println("Rabat wynosi 40%");
            double wartoscRabatu=0.4;
            System.out.println("Kwota wynosi: " + (99 * iloscSztuk - wartoscRabatu *(99*iloscSztuk)));
        } else if (iloscSztuk >= 100) {
            System.out.println("Rabat wynosi 50%");
            double wartoscRabatu=0.5;
            System.out.println("Kwota wynosi: " + (99 * iloscSztuk - wartoscRabatu *(99*iloscSztuk)));
        } else {
            System.out.println("Wprowadzona wartosc jest nieprawidlowa. Sprobuj ponownie");



        }





    }
}
