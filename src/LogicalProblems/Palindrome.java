package LogicalProblems;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        /**
         * This class check if the given number is palindrome or not
         * ex : Input -> 121
         *      Output -> 121 IS PALANDROME
         * ex : Input 12112
         *      output -> NO ITS NOT A PALANDROME
         */

        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER -> ");
        int userInput = s.nextInt();
        int originalNumber = userInput;
        int reversedNumber = 0;

        while(userInput > 0) {
            int lastDigit = userInput % 10;
            reversedNumber = reversedNumber*10 + lastDigit;
            userInput = userInput / 10;
        }

        if(reversedNumber == originalNumber){
            System.out.println( originalNumber + " -> IS PALANDROME");

        }else {

            System.out.println("NO ITS NOT A PALANDROM");
        }
    }
}
