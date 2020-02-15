package zajecia5.zadDom;

public class Prostokat {

    private int bokA;
    private int bokB;
    private int bokC;


    public Prostokat (int bokA, int bokB,int bokC) {

        this.bokA=bokA;
        this.bokB=bokB;
        this.bokC=bokC;

    }

    public int obliczObjetosc() {
        return bokA*bokB*bokC;
    }

    public int obliczObwod() {
        return 2*bokA + 2*bokB;
    }
}
