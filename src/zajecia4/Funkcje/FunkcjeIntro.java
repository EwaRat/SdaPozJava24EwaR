package zajecia4.Funkcje;

public class FunkcjeIntro {

    // prosta funkcja pobierajaca 2 argumenty i zwracajaca ich sume
    // funkcje(metody) definiujemy w ciele Klasy a wiec nie w mainie!!
    static int dodaj(int a, int b) {
        return a + b;
    }

    // funkcja ktora nic nie zwraca ale wypisuje zawartosc tablicy - void
    static void printArray (String[]array) {
        System.out.print("[ ");
        for (String i : array) {
            System.out.print(i + ", ");
        }

        // kasujemy ostatni przecinek
        // na przyszlosc" eleganckie" rozwiazanie z uzyciem z StringBuilder
        System.out.print('\b');
        System.out.print('\b');
        System.out.print(" ]");


        // lub:
        //  for (int i = 0; i <array.length ; i++) {
        // System.out.println(array[i]);
        //  }
    }

    //funkcja do obliczania n-tego wyrazu ciagu Fibonacciego - int

    static int fibonacci(int n) {
        int fib1=1;
        int fib2=1;
        int suma=0;


        for(int i=3; i<=n; i++) {
            suma=fib1+fib2;
            fib1=fib2;
            fib2=suma;
        }
        return suma;
    }


    public static void main(String[] args) {

        //dodawanie
        int pierwszaLiczba=10;
        int drugaLiczba=20;
        int wynik = dodaj (pierwszaLiczba, drugaLiczba);
        System.out.println("wynik dodawania to: "+ wynik);

        //imiona
        String[] imiona = {"Ala", "Tomek", "Piotr"};
        printArray(imiona);

        //Fibonacci -wywolanie funkcji - ?? dopisac
        System.out.println();
       // int liczba=fibonacci(10);
        // System.out.println(fibonacci(10) + liczba);
        int suma = fibonacci(10);
        System.out.println(suma);





    }
}
