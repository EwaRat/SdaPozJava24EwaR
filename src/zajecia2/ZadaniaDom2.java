package zajecia2;

import java.util.Random;
import java.util.Scanner;



public class ZadaniaDom2 {
    public static void main(String[] args) {

        //zadania z kartki petle III - zad.1
        // wersja 1

       int i;
        for( i=1; i<=100; i++) {
            System.out.println(i);
        }

        //wersja 2

        int a =1;
        while(a <=100) {
            System.out.println(a);
            a++;
        }

        // zad.2
        int x;
        for (x=1; x<=500; x++) {
            if (x % 7 == 0) {
            System.out.println(x);
            }
        }

        // zad.3

        int b;
        int suma=0;
        for (b=1; b<=100; b++) {
            suma = suma + b;
        }
        System.out.println("Suma wynosi: " + suma);


        // intr warunkowe II - zad.1

        double c;
        double d;
        double e;

        Scanner odczyt2=new Scanner(System.in);
        System.out.println("podaj pierwsza liczbę");
        c=odczyt2.nextDouble();
        System.out.println("podaj druga liczbę");
        d=odczyt2.nextDouble();
        System.out.println("podaj trzecia liczbe");
        e=odczyt2.nextDouble();

        if ( c*c + d*d == e*e) {
            System.out.println("Podane długosci boków tworzą trójkąt prostokątny");
        } else if (d * d + e * e == c * c) {
            System.out.println("Podane długosci boków tworzą trójkąt prostokątny");
        } else if (c * c + e * e == d * d) {
            System.out.println("Podane długosci boków tworzą trójkąt prostokątny");
        } else {
            System.out.println("podane długości boków nie tworza trojkata prostokątnego");

        }

        // intrukcje warunkowe - zad.2 (z neta rozwiazanie)

        /*double a,b,c;
        Scanner klaw=new Scanner(System.in);
        System.out.print("a=");
        a=klaw.nextFloat();
        System.out.print("b=");
        b=klaw.nextFloat();
        System.out.print("c=");
        c=klaw.nextFloat();
        if(a==0)
            System.out.println("rownanie liniowe");
        else{
            double delta;
            delta=b*b-4*a*c;
            if(delta<0)
                System.out.println("Brak rozwiązań");
            else
            if(delta==0){
                double x;
                x=-b/(2*a);
                System.out.print("Jedno podwójne rozwiązanie x = ");
                System.out.println(x);
            }
            else{
                double x1, x2;
                x1=(-b+sqrt(delta))/(2*a);
                x2=(-b-sqrt(delta))/(2*a);
                System.out.print("x1 = ");
                System.out.println(x1);
                System.out.print("x2 = ");
                System.out.println(x2); */



            Random r= new Random();
            int g = r.nextInt();


    }
            }



