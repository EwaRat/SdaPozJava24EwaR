package zajecia5.ZadDomOsoba;

import java.util.Scanner;

public class OsobaProgram {

    public static void main(String[] args) {

        Osoba o2 = new Osoba();
        o2.setImie("Adam");
        o2.setNazwisko("Kot");
        o2.setWiek(22);

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoje imie");
        String imie = sc.nextLine();
        System.out.println("podaj swoje nazwisko");
        String nazwisko= sc.nextLine();
        System.out.println("Podaj swoj wiek");
        int wiek = sc.nextInt();
        Osoba o1 = new Osoba(imie, nazwisko, wiek);

        System.out.println(o1.przedstawSie());
        System.out.println(o2.przedstawSie());
        }


    }




