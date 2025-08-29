package STRINGS;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anagram {

    /**
     * This class takes two strings s1 and s2, return true if s2 is an anagram of s1, and false otherwise.
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     *
     * Input : s1 = "anagram" , s2 = "nagaram"
     * Output : true
     * Explanation : We can rearrange the characters of string s to get string t as frequency of all characters from both strings is same.
     */

    public static boolean AnagramCheck(String s1 , String s2){

        List<Character> characters = new ArrayList<>();

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            characters.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++) {
            for (int j = 0; j < characters.size(); j++) {
                if (characters.get(j) == s2.charAt(i)) {
                    characters.remove(j);
                    break;
                }
            }
        }

        if (characters.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A S1 -> ");
        String s1 = s.nextLine();
        System.out.print("ENTER s2 -> ");
        String s2 = s.nextLine();

        if (AnagramCheck(s1,s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams ");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }
}
