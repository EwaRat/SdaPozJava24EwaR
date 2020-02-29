package zajecia5.ZadDomOsoba;

public class Osoba {

    private String imie;
    private String nazwisko;
    private int wiek;

    public Osoba () {

    }

    public Osoba (String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko=nazwisko;
        this.wiek=wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String przedstawSie () {
        return "Mam na imie " + this.imie + ", nazywam sie " + this.nazwisko + " i mam " + this.wiek + " lat.";
    }



     }







