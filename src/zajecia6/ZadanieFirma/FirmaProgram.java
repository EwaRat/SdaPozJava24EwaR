package zajecia6.ZadanieFirma;


public class FirmaProgram {
    public static void main(String[] args) {
        Menu menu = new Menu();
        ListaPracownikow listaPracownikow = new ListaPracownikow();
        String akcja ="";
        while(!akcja.equals("e") && !akcja.equals("q")) {  // !! && nie || !!
            menu.pokazGlowneMenu();
            akcja=menu.pobierzAkcjeodUzytkownika();

            switch (akcja) {
                case "1": // wyswietlic uzytkownika
                    listaPracownikow.wypiszWszystkichPracownikow();
                    break;
                case "2": // dodac uzytkownika
                    listaPracownikow.dodajNowegoPracownika();
                    break;
                case "4": //usunac uzytkownika
                    listaPracownikow.wypiszWszystkichPracownikow(); // bo pkt 4 - najpierw ma wszystkich wypisac potem usunac
                    listaPracownikow.usunPracownika();
                    break;
                case "e":
                case "q":
                    System.out.println("Koniec programu"); // to oznacza jesli wcisniesz e lub q wyswietli sie koniec programu
                    break;
                default:
                    System.out.println("Bledna akcja");



            }
            }
    }


    }



