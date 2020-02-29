package zajecia6;


import java.util.Scanner;

public class zadanie5 {
    // Napisz program, który oblicza sumę liczb cyfry tj.
    // dla liczby 52 suma jej pojedynczych cyfr wynosi ‘5’ + ‘2’ -> ‘7’.
    // Podpowiedź: Użyj metody split na obiekcie typu String

    public static void main(String[] args) {

        String mojaLiczba="55335";
        int suma=0;
        for (int i = 0; i <mojaLiczba.length() ; i++) {
            char c = mojaLiczba.charAt(i);
            String wartosc = String.valueOf(c);

            suma = suma + Integer.valueOf(wartosc);
        }
        System.out.println(suma);

    }
}
