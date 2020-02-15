package zajecia5.ZadDomOsoba;

public class Osoba {

    private String imie;
    private String nazwisko;
    private int wiek;

    public Osoba() {
        System.out.println("Kontstruktor bezparametrowy");
    }


    public Osoba (String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String przedstawSie() {
        return "Mam na imie " + imie + " nazywam sie " + nazwisko + " i mam " + wiek + " lat.";
     }





}

