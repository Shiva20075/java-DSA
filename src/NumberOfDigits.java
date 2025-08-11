import java.util.Scanner;

public class NumberOfDigits {

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
