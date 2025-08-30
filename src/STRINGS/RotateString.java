package STRINGS;
import java.util.Scanner;

public class RotateString {

    /**
     *This class takes two strings s and goal as Input And return true if and only if s can become goal after some number of shifts on s.
     * A shift on s consists of moving the leftmost character of s to the rightmost position.
     * For example, if s = "abcde", then it will be "bcdea" after one shift.
     */

    public static boolean isEqualString(String s, String goal){
        if (s.length() != goal.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] goalArray = goal.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            char firstChar = sArray[0];
            for (int j = 0; j < sArray.length - 1; j++) {
                sArray[j] = sArray[j + 1];
            }
            sArray[sArray.length - 1] = firstChar;
            boolean arraysEqual = true;
            for (int k = 0; k < sArray.length; k++) {
                if (sArray[k] == goalArray[k]) {
                    arraysEqual = true;
                }else{
                    arraysEqual = false;
                    break;
                }
            }
            if (arraysEqual) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER STRING S - > ");
        String s = sc.nextLine();
        System.out.print("ENTER STRING Goal -> ");
        String goal = sc.nextLine();

        if(isEqualString(s,goal)){
            System.out.print("true");
        }else{
            System.out.println("false");
        }
    }
}
