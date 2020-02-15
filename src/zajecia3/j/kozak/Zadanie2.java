package zajecia3.j.kozak;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);

        System.out.println("Podaj liczbę A: ");
        int a=czytnik.nextInt();
        System.out.println("Podaj liczbe B: ");
        int b=czytnik.nextInt();

        if (a<b) {
            int suma=0;
            for (int i=a; i<=b; i++ ) {
                suma += i;
            }
            System.out.println("Suma przedziału od a= " + a + " do b=" + b + " wynosi: " + suma);

            // wersja 2 - pętla while
            suma =0;
            int index = a;
            while (index <=b) {
                suma +=index;
                index ++;
            }
            System.out.println("Suma przedziału od a= " + a + " do b=" + b + " wynosi: " + suma);

            // wersja 3 - petla do-while

        } else {
            System.out.println("A musi byc mniejsze od B.");
        }





    }
}
