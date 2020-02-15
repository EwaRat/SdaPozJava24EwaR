package zajecia1; // pakiet zajecia1

import java.util.Scanner;

public class ZadaniaDom3 { // klasa o nazwie ZadaniaDom3
    public static void main(String[] args) { // metoda main
        System.out.println("Hello World:)"); // to co w " " wyświetli sie na konsoli


        byte liczba1 = 5;
        short liczba2 = 12345;
        int liczba3 = 566;
        long liczba4 = 5_000_000_000L;

        float ulamek1 = 1.12F;
        double ulamek2 = 1.2;

        char znak = 'a';
        znak = 'b';

        final char znak2 = 'A';
        // char znak2 = 'c'; - tak nie mozna!! bład!!



        String imie = "Ewa";
        imie = "Michal";
        String wiek = "30";
        String nazwisko = "Ratajczak";
        String zawod = "Chemik";
        String imieWiekNazwiskoZawod= imie + " " + wiek + " " + nazwisko + " " + zawod;


        boolean czyPada = true;

        System.out.println(liczba1);
        System.out.println(liczba2);
        System.out.println(liczba3);
        System.out.println(liczba4);
        System.out.println(ulamek1);
        System.out.println(ulamek2);
        System.out.println(znak);
        System.out.println(imie);
        System.out.println(czyPada);
        System.out.println(imieWiekNazwiskoZawod);

        double a;
        double b;

        Scanner czytnik = new Scanner(System.in);

        System.out.println("Podaj długość pierwszego boku w cm");
        a = czytnik.nextDouble();

        System.out.println("Podaj długość drugiego boku w cm");
        b = czytnik.nextDouble();

        double poleProstokata = a*b;

        System.out.println("Pole prostokąta o podanych bokach wynosi: " + poleProstokata);

        //zadanie kalkulator

        double liczbaA;
        double liczbaB;

        Scanner odczyt = new Scanner(System.in);

        System.out.println("Podaj liczbę A");
        liczbaA= odczyt.nextDouble();

        System.out.println("Podaj liczbe B");
        liczbaB= odczyt.nextDouble();

        double dodawanie = liczbaA + liczbaB;
        double odejmowanie = liczbaA - liczbaB;
        double odejmowanie2= liczbaB - liczbaA;
        double mnozenie= liczbaA * liczbaB;
        double dzielenie = liczbaA / liczbaB;
        double dzielenie2 = liczbaB / liczbaA;

        System.out.println(dodawanie);
        System.out.println(odejmowanie);
        System.out.println(odejmowanie2);
        System.out.println(mnozenie);
        System.out.println(dzielenie);
        System.out.println(dzielenie2);

        // zadanie
         double A;
         double B;
         double C;

         Scanner czytnik2 = new Scanner (System.in);

        System.out.println("Podaj liczbe A");
        A = czytnik2.nextDouble();

        System.out.println("Podaj liczbe B");
        B = czytnik2.nextDouble();

        System.out.println("Podaj liczbe C");
        C = czytnik2.nextDouble();

        double operator1= (A+B)*C;
        double operator2= A-B/C;

        boolean porownanie = (A + B)>C;
        boolean porowanie2 = (A==B);

        System.out.println("wynik1 to:" + operator1);
        System.out.println("wynik2 to: " + operator2);
        System.out.println("Porówanie: " + porownanie);
        System.out.println("Porównianie2: " + porowanie2);

        //zajęcia 1 - zad.1 konwersja temperatury

        double temperatura;

        Scanner odczyt2 = new Scanner (System.in);

        System.out.println("podaj temperature w stopniach Celsjusza");
        temperatura= odczyt2.nextDouble();

        double temperatura2 = temperatura * 1.8 + 32.0;

        System.out.println(temperatura + " stopni Celsjusza to:" + temperatura2 + " stopni Fahrenheita");

        // zajecia 1 - zadanie 3

        double waga;
        double wzrost;

        Scanner odczyt3= new Scanner(System.in);

        System.out.println("Podaj swoją wage w kg");
        waga = odczyt3.nextDouble();

        System.out.println("podaj swoj wzrost w m");
        wzrost = odczyt3.nextDouble();

        double bmi = waga / (wzrost*wzrost);

        System.out.println("Twoje BMI wynosi: " + bmi) ;

        if( bmi> 18.5 && bmi< 24.9) {
            System.out.println("waga prawidlłowa");
        } else if( bmi < 18.5) {
            System.out.println("niedowaga");
        } else if ( bmi > 24.9) {
            System.out.println("nadwaga");
        }

        // zajecia 1 - zad.4

        double dochod;
        double podatek;

        Scanner odczyt4 = new Scanner(System.in);

        System.out.println("Podaj swoj roczny dochod");
        dochod = odczyt3.nextDouble();

        final double progPodatkowy = 85_528;

        if( dochod <= progPodatkowy) {
            podatek = (dochod * 0.18 - 556.02);
        } else {
            podatek = 14_839.02 + (dochod - progPodatkowy)* 0.32;
        }
        System.out.println("Podatek wynosi: " + podatek);


        // zajecia 1 - zad.5

        double cena;
        int liczbaRat;
        double miesiecznaRata;

        Scanner czytnik3 = new Scanner(System.in);

        System.out.println("Podaj cene towaru");
        cena = czytnik3.nextDouble();

        System.out.println("Podaj liczbe rat");
        liczbaRat=czytnik3.nextInt();

        if ((cena >= 100 && cena <= 10000) && (liczbaRat >= 6 && liczbaRat <= 48)) {
            System.out.println("Obliczam rate");

            if (liczbaRat <=12) {
                miesiecznaRata = 1.025 * cena / liczbaRat;
            } else if (liczbaRat <= 24) {
                miesiecznaRata = 1.05 * cena / liczbaRat;
            } else {
                miesiecznaRata = 1.1 * cena / liczbaRat;
            }
            System.out.println("Twoja rata wynosi " + miesiecznaRata);

        } else {
            System.out.println("Wprowadzone dane sa niepoprawde, sproboj ponownie...");
        }



    }


}


