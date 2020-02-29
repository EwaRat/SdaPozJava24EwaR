package zajecia5.ZadDomZamowienie;

import java.util.Arrays;

public class Zamowienie {


    private final static int DOMYSLNY_ROZMIAR_ZAMOWIENIA = 10;
    private Pozycja[] pozycje;
    private int ileDodanych;
    private int maksRozmiar;



    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
        pozycje = new Pozycja[maksRozmiar];
    }

    public Zamowienie() {
        this(DOMYSLNY_ROZMIAR_ZAMOWIENIA);
    }



    public void dodajPozycje(Pozycja p) {
        if (this.ileDodanych >= maksRozmiar) {
            System.out.println("Nie mozna dodac zamowienia - osiagnieto max rozmiar");
        } else {
            this.pozycje[ileDodanych] = p;  // tablicowy operator []
            ileDodanych++;
        }
    }

    public double obliczWartosc() {
        double wartoscZamowienia = 0;
        for (Pozycja p : pozycje) {
            if (p != null) {
                wartoscZamowienia += p.obliczWartosc();
            }
        }
        return wartoscZamowienia;
    }

    public String toString() {
        String result = "Zamowienie: " + "\n";
        for (int i = 0; i < ileDodanych; i++) {
            result += pozycje[i].toString() + "\n"; // "\n" znak nowej linii
        }
        return result;

    }
}

