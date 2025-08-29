package STRINGS;

import java.util.Scanner;

public class PalindromeCheck {

    public static boolean palindromeCheck(String inputString) {

        /**
         * This class takes string as input and checks if the string is palindrome or not
         * palindrome -> a sequence of characters (like a word, phrase, number, or other sequence) reads the same forwards as it does backward
         * EX : shiva
         * Output -> shiva is not palindrome
         */

        String reversedString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + "" + inputString.charAt(i);
        }
           if(!inputString.equals(reversedString)){
               return false;
       }
       return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (palindromeCheck(inputString)) {
            System.out.print(inputString + " IS PALIMDROME");
        } else {
            System.out.print(inputString + " IS NOT PALINDROME");
        }
    }
}
