package zajecia3;

import java.util.Scanner;

public class ZadaniaDom1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita dodatnia");
        int liczba = sc.nextInt();

        for(int i=1; i<=liczba; i+=2) {
            System.out.println(i);
        }

    }
}
