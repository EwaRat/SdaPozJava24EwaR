package zajecia4.Funkcje;


import java.util.Scanner;

public class ZadDom4 {

    static boolean check(String wyrazenie) {

        int licznik = 0;
        boolean status;

        for (int i = 0; i < wyrazenie.length(); i++) {


            char znak = wyrazenie.charAt(i);

            if (znak == '(') {
                licznik++;
            }

            if (znak == ')') {
                licznik--;
            }

           if (licznik-- == licznik++) {
                continue;

            } else {
                return false;
            }

        }
        return true;

    }

            public static void main (String[]args){

                System.out.println("Podaj dowolne wyrazenie algebraiczne zawierajace nawiasy - sprawdze czy sa one poprawnie sparowane");

                Scanner sc = new Scanner(System.in);
                String text = sc.nextLine();

                System.out.println(check(text));

            }
        }



