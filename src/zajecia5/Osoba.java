package zajecia5;

public class Osoba {

    //pola w klasie
    public String imie; // narazie nie przypisujemy wartosci - nie znamy imion, nazwisk,wieku itd
    public String nazwisko;
    public int wiek;
    public double wzrost;
    public double waga;

    //konstruktor bezparametrowy
    //jesli nie ma zadnego konstruktora to pusty konstruktor jest generowany automatycznie
    //ale jesli zdefiniujemy jawnie konstruktor parametrowy to ten konstruktor juz nie jest generowany automatycznie
    //jesli potrzebujemy domyslnego konstruktora to musimy go zdefiniowac jawnie
    //jesli usuniemy ten konstruktor to bedziemy musieli zawsze tworzyc obiekty
    //osoba za pomoca kontstruktora 3 argumentowego
    public Osoba() {
        System.out.println("Tworze obiekt typu osoba...");  // konstruktor bezparametrowy


    }

    //przeciazanie konstruktora

    public Osoba(String imie, String nazwisko,int w) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        //trzeci parametr nazywa sie inaczej niz pole wiec
        //this.wiek niepotrzebne,
        //mozna odrazu wiek=w
        wiek=w;

        }

    //definicja metody do opisu osoby

        public String przedstawSie() {
        return "Na imie mam " + this.imie + ", nazywam sie " + this.nazwisko + " i mam " + wiek + " lat.";


        }



}
