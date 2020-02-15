package zajecia1;

import java.util.Scanner;

public class BMI_Kalkulator {

    public static void main(String[] args) {


        Scanner czytnik = new Scanner(System.in);

        double masa = 0;

        System.out.println("Podaj swoją wagę w kg: ");

        masa = czytnik.nextDouble();

        double wzrost = 0;

        System.out.println("Podaj swoj wzrost w m: ");

        wzrost = czytnik.nextDouble();


        System.out.println("Twoje BMI wynosi: " + (masa / Math.pow(wzrost, 2)));


        double bmi = 26.5;

        if (bmi > 18.5 && bmi < 25) {
            System.out.println("WAGA OK - waga w normie");
        } else {
            System.out.println("Zły wynik - waga za duza, badz za mala");



        }


    }


}
