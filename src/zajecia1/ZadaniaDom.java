package zajecia1;

// zad.1

import java.util.Scanner;

import static java.lang.Math.max;


public class ZadaniaDom {
    public static void main(String[] args) {

        double temperaturaWCelsjuszach= 0;
        double temperaturaWFahrenheitach=0;

        System.out.println("Podaj temperaturę w stopniach Celsjusza:");

        Scanner czytnik = new Scanner(System.in);

        temperaturaWCelsjuszach=czytnik.nextDouble();

        temperaturaWFahrenheitach= temperaturaWCelsjuszach * 1.8 + 32.0;


        System.out.println(temperaturaWCelsjuszach + " stopni Celsjusza jest równe: " + temperaturaWFahrenheitach + " stopni Fahrenheita");

        // zad.2


       System.out.println("Podaj trzy liczby całkowite");

        Scanner czytnik2 = new Scanner(System.in);


        int liczba1, liczba2 = 0;
        int liczba3;
        liczba1=czytnik2.nextInt();

        liczba2=czytnik2.nextInt();

        liczba3=czytnik2.nextInt();

       // double maxVal;
       // maxVal = Math.max((liczba1,liczba2),liczba3);


        //Math.max(liczba1, liczba2); // jak obliczyc min i max 3 liczb???

       // Math.min(liczba1, liczba2);
       //int maxVal=liczba3 Math.max(liczba1,liczba2));
       // System.out.println(maxVal);


       // zad.3

        //BMI=waga/wzrost^2
        System.out.println("Podaj swoją wagę w kg: ");
        Scanner czytnik3= new Scanner(System.in);

        double waga=czytnik3.nextDouble();

        System.out.println("Podaj swój wzrost w m : ");

        double wzrost = czytnik3.nextDouble();
        double bmi= waga/Math.pow(wzrost,2);
        System.out.println("Twoje BMI wynosi: " +bmi);

        if (bmi>18.5 && bmi<24.9) {
            System.out.println("Waga prawidłowa");
       }else if (bmi<18.5) {
             System.out.println("Niedowaga");
       }else{
             System.out.println("Nadwaga");
            }
        }
    }