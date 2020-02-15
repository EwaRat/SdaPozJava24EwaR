package zajecia3;

import java.util.Scanner;

public class ZadaniaDom2 {
    public static void main(String[] args) {

        System.out.println("Podaj pierwsza liczbe całkowita");
        Scanner sc = new Scanner(System.in);
        int liczbaA=sc.nextInt();

        System.out.println("Podaj druga liczbe, wiejsza od pierwszej");
        Scanner scanner = new Scanner(System.in);
        int liczbaB=scanner.nextInt();


        if (liczbaA<liczbaB) {
            int suma=0;
            for(int i=liczbaA; i<=liczbaB; i++) {
                suma += i;
        }
            System.out.println(suma);



        }

    }
}
