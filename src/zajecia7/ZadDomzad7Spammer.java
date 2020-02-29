package zajecia7;

import java.util.Scanner;

public class ZadDomzad7Spammer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dowolne slowo");
        String slowo = sc.nextLine();
        System.out.println("Podaj ile razy ma byc wyswietlone slowo");
        int iloscPowtorzen = sc.nextInt();


            int licznik = 0;
            do {
                System.out.println(slowo);
                licznik++;
            }

            while (licznik < iloscPowtorzen);
            System.out.println(" ");

            // !slowo.equals(" ") ???
        }
    }


