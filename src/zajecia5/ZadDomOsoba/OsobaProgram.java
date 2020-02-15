package zajecia5.ZadDomOsoba;



public class OsobaProgram {

    public static void main(String[] args) {

        Osoba uczen=new Osoba("Anna", "Nowak", 30);
        Osoba nauczyciel = new Osoba ("Adam", "Klos", 25);
        Osoba student = new Osoba ("Ala", "Kot", 20);

        System.out.println(uczen.przedstawSie());
        System.out.println(nauczyciel.przedstawSie());
        System.out.println(student.przedstawSie());


    }



}
