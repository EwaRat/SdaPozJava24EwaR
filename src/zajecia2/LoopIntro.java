package zajecia2;

public class LoopIntro {
    public static void main(String[] args) {

        //prosta petla while wypisujaca wartosci 0-9

        int wiek = 20;
        System.out.println(wiek);
        // 1. zwiekszenie wartosci zmiennej;

        wiek= wiek + 5;
        System.out.println(wiek);
        //2
        wiek +=7;
        System.out.println(wiek);
        //3
        wiek += 1;
        System.out.println(wiek);
        //4;
        wiek++;
        System.out.println(wiek);
        //5 post- vs pre- inkrementacja;
        System.out.println("Pre vs post inkrementacja");
        System.out.println("Postinkrementacja liczba++");
        int liczba = 25;
        System.out.println(liczba++);
        System.out.println(liczba);

        System.out.println("Preinkrementacja: ++ number");
        int number = 0;
        System.out.println(++number);
        System.out.println(number);


        //petla wypisujaca liczby 0-9;

        System.out.println("Petla while");
        int licznik = 0;
        while (licznik < 10) {
            System.out.println(licznik); // lub odrazu System.out.println(licznik++)
            licznik++;
        }


        System.out.println("Petla do while");
        int x = 20;
        do {
            System.out.print(x++);
            System.out.print(",");
        } while (x < 10);

    }


}
