package zajecia4.Funkcje;


import java.util.Scanner;

public class ZadDom2 {

    static String reverse (String text) {
        String result="";
        for (int i =text.length()-1; i >=0 ; i--) {
            result = result +text.charAt(i);
        }
        return result;




    }

    public static void main(String[] args) {
        System.out.println("podaj text");
        Scanner sc = new Scanner(System.in);

        String slowo = sc.nextLine();

        String odwroconeSlowo=reverse(slowo);

        System.out.println(odwroconeSlowo);

    }




}




