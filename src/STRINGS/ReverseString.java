package STRINGS;

import java.util.Scanner;

public class ReverseString {

    /**
     * This class takes input from user as a string and reverse the input string
     * ex : shiva
     * output -> avihs
     *
     */
    public static String reverseString(String inputString) {

        String reversedString = "";

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + "" + inputString.charAt(i);
        }
        return reversedString;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("Reversed string: " + reverseString(inputString));

    }
}
