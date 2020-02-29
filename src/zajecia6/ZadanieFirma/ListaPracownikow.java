package zajecia6.ZadanieFirma;

import java.util.Scanner;

public class ListaPracownikow {

    private Osoba[] listaPracownikow = new Osoba[100]; //odnosi sie do klasy Osoba poprzez F4 moge do niej wejsc
    private int licznikPracownikow = 0;

    public ListaPracownikow() {
        Osoba osoba1 = new Osoba("Filip", "Nowak", 'M', 1, 200, 31, 0, true);
        listaPracownikow[licznikPracownikow++] = osoba1;

        Osoba osoba2 = new Osoba("Anna", "Kot", 'K', 2, 300, 35, 2, true);
        listaPracownikow[licznikPracownikow++] = osoba2;
    }

    public void dodajNowegoPracownika() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imie: ");
        String imie = scanner.nextLine();

        System.out.println("Nazwisko: ");
        String nazwisko = scanner.nextLine();

        System.out.println("Plec: ");
        char plec = scanner.nextLine().charAt(0);

        System.out.println("Numer dzialu: ");
        int nr_dzialu = Integer.parseInt(scanner.nextLine());

        System.out.println("Placa: ");
        float placa = Float.parseFloat(scanner.nextLine());

        System.out.println("Wiek: ");
        int wiek = Integer.parseInt(scanner.nextLine());

        System.out.println("Dzieci: ");
        int dzieci = Integer.parseInt(scanner.nextLine());

        System.out.println("Stan cywilny: ");
        boolean stan_cywilny = Boolean.parseBoolean(scanner.nextLine());

        Osoba nowaOsoba = new Osoba(imie, nazwisko, plec, nr_dzialu, placa, wiek, dzieci, stan_cywilny);
        listaPracownikow[licznikPracownikow++] = nowaOsoba;
    }

    public void usunPracownika() {
        int ileMamyPracownikow = ileMamyPracownikow();
        if (ileMamyPracownikow > 0) {
            int index = pobierzIndexPracownika(); // to zeby podawac index pracownika do usuniecia
            listaPracownikow[index] = null;
            System.out.println("usunieto pracownika");
        } else {
            System.out.println("Masz pusta liste pracownikow");

        }
    }

    private int ileMamyPracownikow() {
        int suma = 0;
        for (int i = 0; i < listaPracownikow.length; i++) {
            if (listaPracownikow[i] != null) {
                suma++;
            }
        }
        return suma;
    }

    private int pobierzIndexPracownika() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj index pracownika do usuniecia: ");
        int index = Integer.parseInt(scanner.nextLine());
        return index;
    }

    public void wypiszWszystkichPracownikow() {
        for (int i = 0; i < listaPracownikow.length; i++) {
            if (listaPracownikow[i] != null) {  // null - jesli nie ma pracownika to sie nie przedstawi itd
                listaPracownikow[i].wypiszOkrojoneDane(i); //dostep do konkretnego pracownika
            }
        }
    }
}
