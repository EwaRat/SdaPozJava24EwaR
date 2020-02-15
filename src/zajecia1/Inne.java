package zajecia1;

import java.util.Scanner;

public class Inne {
    public static void main(String[] args) {

        // zad.1
        String name="Ewa Ratajczak";
        int age = 30;
        double annualPay=100000.0;
        System.out.println("Nazywam się " + name + ", mam " + age + " lat\n" + "i chcę zarabiać " + annualPay + " złotych rocznie.");

        // zad.5
        double sale = 0.62;
        double percentage = 4_600_000.0;

        double result= sale * percentage;
        System.out.println("Region mazowiecki wygeneruje sprzedaż równą: " + result);

        // zad.8
        // 40 ciastek=10 porcji = 3000 kalorii => 1 ciastko = 75cal

        Scanner czytnik = new Scanner(System.in);
        int biscuitAmount;
        int calorieAmount;

        System.out.println("Podaj ilość zjedonych ciastek");
        biscuitAmount= czytnik.nextInt();
        calorieAmount = biscuitAmount * 75;
        System.out.println(biscuitAmount + " ciastka to: " + calorieAmount + " kalorii.");

        // zad.10
        double wynik1;
        double wynik2;
        double wynik3;
        double suma;
        double średnia;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj wyniki z trzech testów");
        wynik1= scanner.nextInt();
        wynik2= scanner.nextInt();
        wynik3= scanner.nextInt();

        System.out.println("Wyniki z trzech testów to: " + wynik1 + "\n" + wynik2 + "\n" + wynik3 + "\n");

        suma = wynik1 + wynik2 + wynik3;
        średnia = suma / 3;

        System.out.println("Średnia z trzech testów wynosi: " + średnia);

        // zad. 17
        // na 48 ciasteczek potrzeba: 1.5szkl cukru, 1 szkl masla i 2,75 szkl maki
         int ciasteczka;
         double szklankiCukru;
         double szklankiMasla;
         double szklankiMaki;
         Scanner odczyt = new Scanner (System.in);
         System.out.println("Podaj ile sztuk ciasteczek chcesz upiec");
         ciasteczka = odczyt.nextInt();

         szklankiCukru= ciasteczka * 1.5 / 48;
         szklankiMasla= ciasteczka * 1.0 /48;
         szklankiMaki= ciasteczka * 2.75/48;

        System.out.println("Aby upiec " + ciasteczka + " ciastek potrzeba: " + szklankiCukru + " szklanek cukru, " + szklankiMasla + " szklanek masla oraz " + szklankiMaki + " szklanek maki." );













    }

}
