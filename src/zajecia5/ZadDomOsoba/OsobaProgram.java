package zajecia5.ZadDomOsoba;

import java.util.Scanner;

public class OsobaProgram {
    public static void main(String[] args) {


        Osoba student = new Osoba();
        student.imie = "adam";
        student.nazwisko="nowak";
        student.wiek=30;

        System.out.println(student.przedstawSie());

        Osoba uczen = new Osoba("anna", "nowak", 50);

        System.out.println(uczen.przedstawSie());

    }
}
