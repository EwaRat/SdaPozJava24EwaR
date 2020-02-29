package zajecia8;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZadaniaDataCzas {

    public static void main(String[] args) {

        // formatowanie daty na string
        ZonedDateTime dataCzas = ZonedDateTime.now();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("2020,02,29");
        String tekst = dataCzas.format(f);
        System.out.println(tekst);

        //wczytywanie czasu i dat ze stringa

        String tekst2="2020 02 29";

        DateTimeFormatter f2= DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate data=LocalDate.parse(tekst2,f2);



    }

}
