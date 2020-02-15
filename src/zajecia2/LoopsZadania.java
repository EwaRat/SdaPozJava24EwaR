package zajecia2;

public class LoopsZadania {

    //zad.1 - wypisz liczby parzyste od 0-100 (while)
    //zad.2 wypisz liczby nieparzyste od 200-300 (for)

    //zad.1 -wersja 1

    public static void main(String[] args) {
        int liczba = 0;
        while (liczba <= 100) {
            if (liczba % 2 == 0) {
                System.out.println(liczba);
            }
            liczba++;
        }

        // zad.1 - wersja 2

        System.out.println("parzyste liczby od 0 do 100 - wersja 2");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

        // zad.1 - wersja 3

        System.out.println("Parzyste liczby od 0 do 100 - wersja 3");
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i + " ");
        }

        // zad.2 - liczby nieparzyste od 0 do 100 w odwrotnej kolejnosci

        System.out.println("Liczby nieparzyste od 100 - 0 - wersja 1");
        for( int i = 99; i >0; i-=2) {
            System.out.println(i + " ");
        }

        // zad.2 - wersja 2

        System.out.println("Liczby nieparzyste od 100 do 0 - wersja 2");
        for (int i = 99; i >0; i-- ) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }

        // zad.3 - suma liczb od 0 do 100

        int suma = 0;
        for (int i = 0; i <= 100; i++) {
            suma = suma + i; // alternatywnie suma += i
        }

        System.out.println("suma liczb od 0 do 100: " + suma);
    }
}



