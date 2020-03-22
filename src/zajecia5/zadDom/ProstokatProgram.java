package zajecia5.zadDom;


import java.util.Scanner;

public class ProstokatProgram {

    public static void main(String[] args) {

        System.out.println("Podaj boki prostokata 1");
        Scanner scanner= new Scanner(System.in);
        int bokA= scanner.nextInt();
        int bokB=scanner.nextInt();

        Prostokat p1 = new Prostokat(bokA,bokB);

        System.out.println("Podaj boki prostokata 2");

        bokA= scanner.nextInt();
        bokB=scanner.nextInt();

        Prostokat p2 = new Prostokat(bokA,bokB);

        System.out.println("Pole p1 to: " + p1.obliczPole());
        System.out.println("Obwod p1 to: " + p1.obliczObwod());

        System.out.println("Pole p2 to: " + p2.obliczPole());
        System.out.println("Obwod p2 to: " + p2.obliczObwod());






    }

}





