package zajecia3.j.kozak;

import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {
        System.out.println("Podaj liczbe calkowita dodatnia");
        Scanner czytnik = new Scanner(System.in);
        int n= czytnik.nextInt();
        int wynik;

        // I rozwiazanie
        for (int i=0; Math.pow(2,i)<=n;i++) {
            System.out.print(Math.pow(2,i) + ", " );
                }
        // II rozwiązanie
        System.out.println("\n2 Rozwiazanie: ");
        for (int i =1; i<=n; i=2*i) {
            System.out.print(i + ", ");
        }



    }
}
