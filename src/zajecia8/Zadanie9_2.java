package zajecia8;

import java.util.Scanner;

public class Zadanie9_2 {

   // Write a program called printArrayInStars which prompts user for the number of items in an array (a non-negative integer),
   // and saves it in an int variable called numItems.
    // It then prompts user for the values of all the items (non-negative integers) and saves them in an int array called items.
    //The program shall then print the contents of the array in a graphical form, with the array index and values represented by number of stars.

    public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter number of items:");
            int arrayLength=scanner.nextInt();

            int[] array=new int[arrayLength];

            System.out.println("Enter value of items");
            for (int i=0;i<array.length;i++){
                array[i]=scanner.nextInt();
            }
            for(int i=0; i<array.length;i++){
                System.out.println(i+":"+"*".repeat(array[i])+"("+array[i]+")");
            }
        }
    }




