package zajecia3;

import java.util.Scanner;

public class ZadaniaDom3 {
    public static void main(String[] args) {

        System.out.println("Podaj liczbe calkowita dodatnia");

        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();

        for (int i=0; liczba>=Math.pow(2,i); i++) {

                System.out.println(Math.pow(2,i));

        }


    }
}
