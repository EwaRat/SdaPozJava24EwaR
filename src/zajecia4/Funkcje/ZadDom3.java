package zajecia4.Funkcje;


import javax.swing.*;
import java.util.Scanner;

public class ZadDom3 {

    static boolean isPalindrom (String text) {

        boolean status = false;

        for (int i = 0; i < text.length() / 2; i++)
            if (text.charAt(i) == text.charAt(text.length() - 1 - i))
                status = true;
            else
                status = false;
        return status;

    }









    public static void main(String[] args) {
        System.out.println("podaj text");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(isPalindrom(text));

    }

}
