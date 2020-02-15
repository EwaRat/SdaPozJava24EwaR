package zajecia5.zamowienie_zad1;

public class Zamowienie {

    private final static int DOMYSLNY_ROZMIAR_ZAMOWIENIA = 10;  // stworzenie stalej
    private Pozycja[] pozycje;  // utworzenie tablicy z pozycji
    private int ileDodanych;
    private int maksRozmiar;

    //konstruktor bezparametrowy moze sluzyc do ustawienia wartosci domyslnych
    //wywolujemy konstroktor przekazujac domyslny rozmiar zamowienia
    public Zamowienie() {
        this(DOMYSLNY_ROZMIAR_ZAMOWIENIA);
        // lub tak:
        // this.maksRozmiar=10; // lub odrazu u gory: private int maksRozmiar=10;
        //  pozycje=new Pozycja [maksRozmiar]; //- stworzenie tablicy
    }

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
        pozycje = new Pozycja[maksRozmiar];
    }

    public void dodajPozycje(Pozycja poz) {
        if (this.ileDodanych >= maksRozmiar) {
            System.out.println("Nie mozna dodac zamowienia - osiagnieto max rozmiar");
        } else {
            this.pozycje[ileDodanych] = poz;  // tablicowy operator []
            ileDodanych++;

            // lub w 1 linijce:
            // this.pozycje{ileDodanych++} = poz;
        }
    }

    public double obliczWartosc() {
        //throw new RuntimeException("Do zaimplementowania"); -- gdy na chwile zostawiamy i robimy cos innego
        double wartoscZamowienia = 0;
        for (Pozycja poz : pozycje) {
            if (poz != null) {
                wartoscZamowienia += poz.obliczWartosc();
            }
        }
        return wartoscZamowienia;
    }

    public String toString() {
        String result = "Zamowienie; ";
        for (int i = 0; i < ileDodanych; i++) {
            result += pozycje[i].toString() + "\n"; // "\n" znak nowej linii
        }
        return result;

    }
}
