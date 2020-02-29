package zajecia8;

import java.util.Arrays;

public class ZadanieRegex {

    //Zadanie 1: podzielić poniższe zdanie na tablice z wyrazami.
    // "Bardzo lubię uczyć się Javy, ale czasami wolę: JavaScript. Pythona, Scale."
    // Zadanie 2: zastąpić w zdaniu, każde wystąpienie litery "a" znakiem @.

    public static void main(String[] args) {

        String tekst = "Bardzo lubię uczyć się Javy, ale czasami wolę: JavaScript, Pythona, Scale.";
        String[] words = tekst.split("[ .,:]+");
        System.out.println(words.length + "|" + Arrays.toString(words));

        String noweZdanie = tekst.replaceAll("a", "@");
        System.out.println(noweZdanie);
    }
}