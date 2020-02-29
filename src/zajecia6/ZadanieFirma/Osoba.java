package zajecia6.ZadanieFirma;

public class Osoba {

    private String imie;
    private String nazwisko;
    private char plec;
    private int nr_dzialu;
    private float placa;
    private int wiek;
    private int dzieci;
    private boolean stan_cywilny;


    public Osoba(String imie, String nazwisko, char plec, int nr_dzialu, float placa, int wiek, int dzieci, boolean stan_cywilny) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.plec=plec;
        this.nr_dzialu=nr_dzialu;
        this.placa=placa;
        this.wiek=wiek;
        this.dzieci=dzieci;
        this.stan_cywilny=stan_cywilny;
    }

    public void wypiszOkrojoneDane(int index) {  // to skopiowane z metody string toString
        String napis= "Index " + index + "|" + "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", placa=" + placa +
                '}';
        System.out.println(napis);
    }

    public void wypiszSpecjalneDane () {
        String napis="Osoba{" +
                "imie='" + imie.toUpperCase() + '\'' +
                ", nazwisko='" + nazwisko.toUpperCase() + '\'' +
                '}';
        System.out.println(napis);
    }

    public boolean czyPlacaJestPowyzejPodanejWartosci(float podanaWartosc) {
        return placa > podanaWartosc;  //zwroci true albo false => gry placa> to true
    }

    @Override //adnotacja - wygenerowane automatycznie alt+insert i toString - to oznacza ze String bezparamatrow
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec=" + plec +
                ", nr_dzialu=" + nr_dzialu +
                ", placa=" + placa +
                ", wiek=" + wiek +
                ", dzieci=" + dzieci +
                ", stan_cywilny=" + stan_cywilny +
                '}';
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

    public char getPlec() {
        return plec;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public int getNr_dzialu() {
        return nr_dzialu;
    }

    public void setNr_dzialu(int nr_dzialu) {
        this.nr_dzialu = nr_dzialu;
    }

    public float getPlaca() {
        return placa;
    }

    public void setPlaca(float placa) {
        this.placa = placa;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getDzieci() {
        return dzieci;
    }

    public void setDzieci(int dzieci) {
        this.dzieci = dzieci;
    }

    public boolean isStan_cywilny() {
        return stan_cywilny;
    }

    public void setStan_cywilny(boolean stan_cywilny) {
        this.stan_cywilny = stan_cywilny;
    }






}
