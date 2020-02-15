package zajecia5;

import java.util.Scanner;

public class ProstokatProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wymiary prostokata 1");
        int bokA=sc.nextInt(); // moze byc rownie dobrze int a i int
        int bokB=sc.nextInt();

        Prostokat p1=new Prostokat(bokA,bokB);

        System.out.println("Podaj wymiary prostokata 2");
        bokA=sc.nextInt(); // tu juz bez int!!
        bokB=sc.nextInt();

        Prostokat p2=new Prostokat(bokA,bokB);

        System.out.println("Podaj wymiary prostokata 3");
        bokA=sc.nextInt(); // tu juz bez int!!
        bokB=sc.nextInt();

        Prostokat p3=new Prostokat(bokA,bokB);


        System.out.println("Pole p1: " + p1.obliczPole());
        System.out.println("Obwod p1: " + p1.obliczObwod());

        System.out.println("Pole p2: " + p2.obliczPole());
        System.out.println("Obwod p2: " + p2.obliczObwod());

        System.out.println("Pole p3: " + p3.obliczPole());
        System.out.println("Obwod p3: " + p3.obliczObwod());








    }
}
