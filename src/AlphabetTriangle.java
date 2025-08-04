import java.util.Scanner;

public class AlphabetTriangle {

    public static void main(String[] args) {

        /**
         * AlphabetTriangle class prints pyramid using alphabets
         *
         * EX -> if n = 3
         *     A
         *    ABA
         *   ABCBA
         */

        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        char ch = 65;

        for(int i = 1; i <= n; i++) {
            System.out.println();
            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print((char)(ch -1 + j));
            }
            for(int m = i - 1; m >= 1; m--) {
                System.out.print((char)(ch -1 + m));
            }
        }
    }
}

