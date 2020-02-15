package zajecia1;

import java.util.Scanner;

public class zadanie {
    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);

        double temperaturaWCelsjuszach= 0;



        System.out.println("Podaj temperaturę w stopniach Celsjusza: ");

        temperaturaWCelsjuszach=czytnik.nextDouble();


        System.out.println("Temperatura w stopniach Fahrenheita wynosi: " + (temperaturaWCelsjuszach * 1.8 + 32.0));






    }
}
