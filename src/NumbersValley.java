import java.util.Scanner;

public class NumbersValley {

    public static void main(String[] args) {

        /**
         * generates a symmetrical "valley" pattern using numbers.
         * Example (n = 4):
         * 1      1
         * 12    21
         * 123  321
         * 12344321
         */

        System.out.print("ENTER A NUMBER -> ");
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();

        for( int i = 1; i <= n; i++) {
            System.out.println();
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for ( int s = i; s < (2*n -i); s++) {
                System.out.print(" ");
            }

            for ( int x = i; x >= 1; x--) {
                System.out.print(x);
            }
        }
    }
}
