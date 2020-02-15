package zajecia5;

public class Prostokat {
    /* Napisz program do obliczania pola prostokąta. W tym celu stwórz klasę prostokąt i dodaj jej pola bokA oraz bokB.
    Utwórz konstruktor dla tych parametrów (tylko jeden, dwu parametrowy) oraz dodaj metody obliczPole oraz obliczObwod
    Utwórz klasę ProstokatProgram, w której utworzysz 3 prostokąty i obliczysz ich pola i obwody.
    Wymiary prostokątów powinny pochodzić od użytkownika (z klawiatury)
     */
    //pola w klasie
    public int bokA;
    public int bokB;


    //konstruktor 2-argumentowy
    public Prostokat (int bokA, int bokB) {
        this.bokA=bokA;
        this.bokB=bokB;

    }

    public int obliczPole() {
        return bokA * bokB; // mozna tu zrobic juz bez this

    }

    public int obliczObwod() {
        return (2* bokA + 2*bokB);




    }

}
