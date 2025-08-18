package Patterns;

import java.util.Scanner;
public class Diamond {

    public static void main(String[] args) {

        /**
         * This program prints a symmetrical diamond-like pattern using asterisks (*). and spaces
         * ex-> user input is 3
         *  output -> ******
         *            **  **
         *            *    *
         *            *    *
         *            **  **
         *            ******
         */
        Scanner y = new Scanner(System.in);
        System.out.print(" ENTER A NUMBER -> ");
        int userInput = y.nextInt();

        for ( int i = 0; i < userInput; i++ ) {

            for (int j = userInput; j > i; j--) {
                System.out.print("*");
            }
            for (int k = 0; k < 2*i; k++){
                System.out.print(" ");
            }
            for ( int s = 0; s < userInput-i; s++){
                System.out.print("*");
            }
            System.out.println();
        }

        for ( int i = 0; i < userInput; i++){
            for ( int j = 0; j <= i; j++){
                System.out.print("*");
            }
            for (int k = 0; k <2*(userInput-i-1); k++){
                System.out.print("x");
            }
            for ( int s = 0; s <= i; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
