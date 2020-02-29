package zajecia8;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Zadanie5_6DataCzas {
    //napisac program , ktory wczytuje date w formiacie 2018-08-22, a wypisuje w formacie 22.08.2018

    public static void main(String[] args) {


        //tylko wczytanie daty
        DateTimeFormatter f1=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate l1=LocalDate.parse("2018-08-22");

        //wyswietlenie daty
        DateTimeFormatter f2=DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String tekst = l1.format(f2);
        System.out.println(tekst);


    }
}
