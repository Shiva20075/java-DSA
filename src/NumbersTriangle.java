import java.util.Scanner;

public class NumbersTriangle {

    public static void main(String[] args) {

        /**
         * The NumbersTriangle class prints a pyramid using  numbers.
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
}
