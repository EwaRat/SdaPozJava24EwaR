package zajecia5;

public class WstepDoObiektowProgram {

    //pierwsze przyklady uzycia obiektow

    public static void main(String[] args) {

        //stworzenie obiektu:
        //czytamy:"student" jest obiektem typu Osoba

        //new Osoba()--> wywolanie konstruktora bezparametrowego klasy Osoba
        Osoba student = new Osoba ();
        student.imie="Ewa";
        student.nazwisko="Ratajczak";
        student.wiek=30;
        student.wzrost=1.60;
        student.waga=55;

        Osoba uczen = new Osoba();
        uczen.imie="Michal";
        uczen.nazwisko="Zaczek";
        uczen.wiek=41;

        //odczyt pola:
        String a =student.imie;
        System.out.println(a);
        //lub:
        //szybszy-preferowany zapis:
        System.out.println("Nazwisko to: " + student.nazwisko);
        System.out.println(student.waga);

        //wartosci drugiego obiektu - wartosci ucznia
        System.out.println(uczen.imie);
        System.out.println(uczen.nazwisko);
        System.out.println(uczen.wiek);

        //zmiana nazwiska studenta
        student.nazwisko="Nowak";
        System.out.println("po zmianie nazwiska u studenta");
        System.out.println(student.nazwisko);
        System.out.println(uczen.nazwisko);

        //tworzenie obiektu z uzyciem konstruktora parametrowego
        Osoba pracownik=new Osoba("Anna", "Adamiak", 20);

        System.out.println(pracownik.imie);
        System.out.println(pracownik.nazwisko);
        System.out.println(pracownik.wiek);

        //wywolujemy metode "przedstaw sie"
        System.out.println(student.przedstawSie());
        System.out.println(uczen.przedstawSie());
        System.out.println(pracownik.przedstawSie());

    }
}
