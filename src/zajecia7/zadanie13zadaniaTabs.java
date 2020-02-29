package zajecia7;

import java.util.Scanner;

public class zadanie13zadaniaTabs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ile poziomow ma miec choinka nr 1");
        int liczba = sc.nextInt();

        for (int i = 0; i < liczba; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("# ");  // tu nie println!! tylko print //
            }
            System.out.println(" ");
        }


        System.out.println("Podaj ile poziomow ma miec choinka nr 1/1");
        int liczba2 = sc.nextInt();

        for (int i = 0; i < liczba2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("# " + "{i: " + i + "|j:" + j);
            }
            System.out.println(" ");

        }
        
        System.out.println("Podaj ile wierszy ma choinka nr 2:");
        int liczba3 = sc.nextInt();
        for (int i = 0; i < liczba3; i++) {
            for (int j = 0; j < liczba3 - i; j++) {
                System.out.print("# ");
            }
            System.out.println(" ");
        }

        System.out.println("Podaj ile wierszy ma choinka nr 3");
        int liczba4=sc.nextInt();
        for (int i = 0; i <liczba4 ; i++) {
            for (int j = 0; j < liczba4; j++) {
                if (j >= i) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }


            }
            System.out.println();
        }

        System.out.println("Podaj ile wierszy ma choinka nr 4");
        int liczba5=sc.nextInt();
        for (int i = 0; i <liczba5; i++) {
            for (int j = 0; j <liczba5 ; j++) {
                if (j>=liczba5-i-1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }


        }













