package zajecia5.zadDom;


import java.util.Scanner;

public class ProstokatProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wymiary bryly1");
        int bokA=sc.nextInt();
        int bokB=sc.nextInt();
        int bokC=sc.nextInt();
        Prostokat p1 = new Prostokat(bokA,bokB,bokC);

        System.out.println("Podaj wymiary bryly 2");
        bokA=sc.nextInt();
        bokB=sc.nextInt();
        bokC=sc.nextInt();
        Prostokat p2 = new Prostokat(bokA,bokB, bokC);

        System.out.println("Podaj wymiary bryly 3");
        bokA=sc.nextInt();
        bokB=sc.nextInt();
        bokC=sc.nextInt();
        Prostokat p3 = new Prostokat(bokA,bokB,bokC);

        System.out.println("Objetosc bryly 1  wynosi: " + p1.obliczObjetosc());
        System.out.println("objetosc bryly 2 wynosi: " + p2.obliczObjetosc());
        System.out.println("objetosc bryly 3 wynosi: " + p3.obliczObjetosc());

        //System.out.println("Obwod prostokata 1 wynosi: " + p1.obliczObwod());
        //System.out.println("Obwod prostokata 2 wynosi: " + p2.obliczObwod());
        //System.out.println("Obwod prostokata 3 wynosi: " + p3.obliczObwod());




    }



}

