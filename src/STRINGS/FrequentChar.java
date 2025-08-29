package STRINGS;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequentChar {

    /**
     *This class takes a string as input and count occurence of each character
     * Ex -> shiva charan
     * output -> { = 1, a=3, r=1, s=1, c=1, v=1, h=2, i=1, n=1}
     */

    public static Map<Character,Integer> frequencyOfChar(String userInput){

        Map<Character,Integer> frequencyOfChars  = new HashMap<>();

        for (int i = 0; i < userInput.length(); i++) {

            if (frequencyOfChars.containsKey(userInput.charAt(i))) {
                frequencyOfChars.put(userInput.charAt(i),frequencyOfChars.get(userInput.charAt(i)) + 1);
            } else {
                frequencyOfChars.put(userInput.charAt(i),1);
            }
        }
        return frequencyOfChars;
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A STRING -> ");
        String userInput = s.nextLine();

        System.out.println(frequencyOfChar(userInput));
    }
}
