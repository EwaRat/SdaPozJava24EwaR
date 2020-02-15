package zajecia2;


import java.util.Scanner;


public class Kalkulator {
    public static void main(String[] args) {

        System.out.println("Jestem prostym kalkulatorem, mogę wykonać dodawanie,odejmowanie,mnozenie i dzielenie na 2 liczbach");

        double liczba1;
        double liczba2;
        char symbol;
        double wynik = 0;
        String odpowiedz = "Y";


        Scanner czytnik = new Scanner(System.in);


        System.out.println("Podaj pierwszą liczbę");
        liczba1 = czytnik.nextDouble();

        System.out.println("Wpisz sumbol operacji arytmetycznej: +, -, * lub /");
        symbol = czytnik.next().charAt(0);


        switch (symbol) {

            case '+':
                System.out.println("Podaj druga liczbe");
                liczba2 = czytnik.nextDouble();
                wynik = liczba1 + liczba2;
                System.out.println("Wynik to: " + wynik);


                break;
            case '-':
                System.out.println("Podaj druga liczbe");
                liczba2 = czytnik.nextDouble();
                wynik = liczba1 - liczba2;
                System.out.println("Wynik to: " + wynik);


                break;
            case '*':
                System.out.println("Podaj druga liczbe");
                liczba2 = czytnik.nextDouble();
                wynik = liczba1 * liczba2;
                System.out.println("Wynik to: " + wynik);


                break;
            case '/':
                System.out.println("Podaj druga liczbe");
                liczba2 = czytnik.nextDouble();
                wynik = liczba1 / liczba2;
                System.out.println("Wynik to: " + wynik);


            {
                if (liczba2 == 0)
                    System.out.println("Nie dzielimy przez 0!!");
            }
            break;
            default:
                System.out.println("Wprowadzono niepoprawny symbol. Spróbuj ponownie");

/* jak zakonczyc po nacisieniu enter??
        System.out.println("Czy chcesz zakończyc?(enter)");

        if (czytnik.next().toUpperCase().equals(odpowiedz)) {

            czytnik.close();

            System.out.println("Koniec programu");


        } */


        }
    }

}




