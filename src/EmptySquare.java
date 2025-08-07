import java.util.Scanner;

public class EmptySquare {

    public static void main(String[] args) {

        /**
         * this class take input from user and print a square according to that input
         * ex -> if userInput = 6
         *
         *  ******
         *  *    *
         *  *    *
         *  *    *
         *  *    *
         *  ******
         */

        Scanner s = new Scanner(System.in);
        System.out.print( " ENTER A NUMBER -> ");
        int userInput = s.nextInt();

        for (int i = 1; i <= userInput; i++) {
            System.out.println();
            for (int j = 1; j <= userInput; j++ ) {

            // MY SOLUTION
                if ( i > 1 && i < userInput) {

                    if (j > 1 && j < userInput) {
                        System.out.print(" ");
                    }else {
                        System.out.print("*");
                    }

                }else {
                    System.out.print("*");
                }

            // ACTUAL SOLUTION

                if ((i== 1|| i==userInput) || (j == 1 || j == userInput)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
        }
    }
}
