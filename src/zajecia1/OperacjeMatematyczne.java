package zajecia1;

import java.util.Scanner;

public class OperacjeMatematyczne {
    public static void main(String[] args) {

        int a = 25;
        int b = 10;

        int wynik1 = a + b;

        System.out.println(wynik1);


        System.out.println(a);
        System.out.println(b);

        int wynik2 = a - b;
        System.out.println(wynik2);

        int wynik3 = a*b;
        System.out.println(wynik3);

        int wynik4 = a/b;
        System.out.println(wynik4);

        double x = 2.5;
        double y = 3.5;
        double z = 4.5;

        double wynik = ((x+y)*z);
        System.out.println(wynik);

        double wyniki = ((x-y)/z);
        System.out.println(wyniki);

        boolean czyPrawda = ((x+y)>z);
        System.out.println(czyPrawda);

        boolean czyPrawda2 = (x==y);
        System.out.println(czyPrawda2);

        double liczba1;
        double liczba2;

        Scanner czytnik = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        liczba1=czytnik.nextDouble();

        System.out.println("Podaj drugą liczbę: ");
        liczba2=czytnik.nextDouble();

        double dodawanie= (liczba1 + liczba2);
        double odejmowanie = (liczba1 - liczba2);
        double mnozenie = (liczba1 * liczba2);
        double dzielenie = (liczba1/liczba2);

        System.out.println("Suma podanych liczb to: " + dodawanie);
        System.out.println("Różnica podanych liczb to: " + odejmowanie);
        System.out.println("Iloczyn podanych liczb to: " + mnozenie);
        System.out.println("Iloraz podanych liczb to: " + dzielenie);








    }

}
