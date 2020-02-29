package zajecia6.ZadanieFirma;

import java.util.Scanner;

public class Menu {

    //pokazuje wszystkie akcje dla uzytkownika
    public void pokazGlowneMenu() { // nic nie zwraca tylko wyswietla na konsoli
        System.out.println("Witamy w aplikacji Lista pracownikow. Wybierz z menu co chcialbys zrobic");
        System.out.println("1-Wypisywanie listy wszystkich pracownikow(okrojone)");
        System.out.println("2- Dodaj nowego pracownika");
        System.out.println("3- Eksport danych");
        System.out.println("4- Usuwanie pracownikow");
        System.out.println("5 - Edycja danych");
        System.out.println("e lub q - Zakonczenie aplikacji");
    }
    // do obslugi menu
    public String pobierzAkcjeodUzytkownika() { // chce zeby zwracalo Stringa
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line.toLowerCase();
    }



}
