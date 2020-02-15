package zajecia4.Funkcje;

import java.util.Scanner;

public class Zadanie2 {

    static String reverseString (String text) {
       String result ="";
       for (int i=text.length()-1; i>=0;i--) {
           result = result + text.charAt(i);
        }
       return result;

    }

    public static void main(String[] args) {

        System.out.println("Podaj napis:");
        Scanner scanner = new Scanner(System.in);

        String napis=scanner.nextLine();
        //wywolanie funkcji - przed mainem
        String nowyText=reverseString(napis);
        System.out.println("Nowy napis to: " + nowyText);




    }
}
