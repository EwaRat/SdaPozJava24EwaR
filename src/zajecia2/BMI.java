package zajecia2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);

        System.out.println("Podaj swoja wage: ");
        double waga = czytnik.nextDouble();

        System.out.println("Podaj swoj wzrost [w metrach]");
        double wzrost=czytnik.nextDouble();

        double bmi = waga/ Math.pow(wzrost,2);
        // lub wesrsja bez Math.pow
        // double bmi = waga/ (wzrost * wzrost);  - wazny nawias!!

        System.out.println("Twoje BMI wynosi: " + bmi);

        if (bmi<18.5) {
            System.out.println("Waga zbyt niska");
        } else if (bmi < 25 ) {
            System.out.println("Waga ok");
        } else if (bmi < 30) {
            System.out.println("Nadwaga");
        } else {
            System.out.println("Otyłość");
        }
        System.out.println("Koniec programu...");


        }

    }

