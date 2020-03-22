package zajecia7;

import java.util.Scanner;

public class Spammer {
    public static void main(String[] args) {
        Spammer spammer = new Spammer();
        spammer.spammer();
    }

   /* void spammer1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo");
        String text = scanner.nextLine();
        System.out.println("Podaj liczbe powtórzen");
        int counter = Integer.parseInt(scanner.nextLine());
        //System.out.println(text.repeat(counter));
    } */

    void spammer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo");
        String text = scanner.nextLine();
        System.out.println("Podaj liczbe powtórzen");
        int counter = Integer.parseInt(scanner.nextLine());
        do {
            System.out.println(text);
            counter--;
        } while (counter > 0);
    }
}



