package Patterns;

import java.util.Scanner;

public class NumbersTriangle {

    public static void main(String[] args) {

        /**
         * The Patterns.NumbersTriangle class prints a pyramid using  numbers.
         * if n = 4
         *     1
         *    121
         *   12321
         *  1234321
         */

        System.out.print("ENTER A NUMBER -> ");
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println();
            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            for( int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for( int m = i - 1 ; m >= 1; m--) {
                System.out.print(m);
            }
        }
    }

    public static class NumberOfDigits {

        public static void main(String[] args) {

            /**
             * This class count the no of digits (Integers) enterd by a user
             *ex -> userInput = 1234
             * output -> 4
             */

            Scanner s = new Scanner(System.in);
            System.out.print("ENRER A NUMBER -> ");
            int userInput = s.nextInt();
            int numberCount = 0;


            while(userInput > 0){

                userInput = userInput/10;
                numberCount++;
            }
            System.out.println("COUNT -> " + numberCount);
        }
    }
}
