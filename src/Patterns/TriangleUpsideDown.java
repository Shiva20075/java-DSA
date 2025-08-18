package Patterns;

import java.util.Scanner;

public class TriangleUpsideDown {

    /**
     * This class prints a triangle shape at upside and downside
     * EX -> input is 5
     *    *        *
     *    **      **
     *    ***    ***
     *    ****  ****
     *    **********
     *    ****  ****
     *    ***    ***
     *    **      **
     *    *        *
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);
        System.out.print("ENTER A NUMBER -> ");
        int userInput = z.nextInt();

        for (int i = 1; i <= userInput; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            for (int s = 1; s <= 2*(userInput - i); s++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        for (int i = 1; i <= userInput; i++) {
            for (int j = 1; j <= userInput - i; j++) {
                System.out.print("*");
            }
            
            for (int s = 1; s <= 2*i; s++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= userInput - i; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
