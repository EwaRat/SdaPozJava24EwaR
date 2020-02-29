package zajecia8;

import java.util.Random;

public class ZadanieTablica {

   // Stworzyć tablicę z miejscem na 100 elementów.
   // Wygenerować losowo do niej elementy z zakresu 10-30;
    // Zrobić histogram tych wartości czyli policzyć na tablicach ile występuje elementów o danej wartości.
    // Histogram może być wypisany poziomo. Wyspisać to podobnie jak w zadaniu z gwiazdkami.

    public static void main(String[] args) {

        int array[] = new int [100];
        int counts[]=new int[21];

        Random r = new Random();
        for (int i= 0; i < array.length; i++) {
            array[i] = r.nextInt(21) + 10; //mozna odrazu tak
            counts[array[i]-10] ++;

            System.out.print(array[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i <counts.length ; i++) {
            System.out.println((i+10)+":"+"*".repeat(counts[i])+"("+counts[i]+")");


        }



    }
}

