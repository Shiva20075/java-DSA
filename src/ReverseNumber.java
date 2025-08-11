import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        /**
         * This program takes input from user (Integer) and reverse it
         * ex : userInput -> 1234
         *      Output -> 4321
         */
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER TO REVERSE IT -> " );
        int userInput = s.nextInt();
        int reversedNumber = 0;

        while(userInput > 0) {
            int lastDigit = userInput % 10;
                reversedNumber = reversedNumber*10 + lastDigit;
                userInput = userInput / 10;

        }
        System.out.println(" REVERSE OF YOUR INPUT -> " + reversedNumber);
    }
}
