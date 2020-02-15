package zajecia1;

import java.util.Scanner;

public class ZadaniaDom2 {
    public static void main(String[] args) {

        double dochod=0;
        final double PROG_PODATKOWY = 85_528;
        System.out.println("Podaj swój roczny dochód:");

        Scanner czytnik = new Scanner(System.in);

        dochod=czytnik.nextDouble();


        if (dochod<=PROG_PODATKOWY) {
            System.out.println("Twój podatek wynosi " + (dochod * 0.18 - 556.02));
        } else {
            System.out.println("Twoj podatek wynosi: " + (14_839.02 + (dochod-PROG_PODATKOWY) * 0.32));

        }


    }
}
