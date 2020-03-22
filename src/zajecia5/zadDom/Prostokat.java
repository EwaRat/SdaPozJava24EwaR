package zajecia5.zadDom;

public class Prostokat {
    /* Napisz program do obliczania pola prostokąta. W tym celu stwórz klasę prostokąt i dodaj jej pola bokA oraz bokB.
    Utwórz konstruktor dla tych parametrów (tylko jeden, dwu parametrowy) oraz dodaj metody obliczPole oraz obliczObwod
    Utwórz klasę ProstokatProgram, w której utworzysz 3 prostokąty i obliczysz ich pola i obwody.
    Wymiary prostokątów powinny pochodzić od użytkownika (z klawiatury)
     */

    private int bokA;
    private int bokB;

    public Prostokat(int bokA, int bokB) {
        this.bokA=bokA;
        this.bokB=bokB;
    }

    public int getBokA() {
        return bokA;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }

    public int getBokB() {
        return bokB;
    }

    public void setBokB(int bokB) {
        this.bokB = bokB;
    }

    public int obliczPole() {
        return this.bokA * this.bokB;
    }

    public int obliczObwod() {
        return 2* this.bokA + 2* this.bokB;
    }
}