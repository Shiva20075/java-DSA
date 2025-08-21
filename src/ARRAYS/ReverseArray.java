package ARRAYS;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    /**
     * This class takes an Array as Input and prints it in reverse of its insertion order
     * Input: size=5, arr = [1,2,3,4,5]
     * Output: [5,4,3,2,1]
     * Explanation: The reverse of the array [1,2,3,4,5] is [5,4,3,2,1]
     *
     */

    public static int[] reversedArray(int[] arr) {

        int reversedArr[] = new int [arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - i -1];
        }
        return reversedArr;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("ENTER ARRAY SIZE -> ");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("ENTER ARRAY ELEMENTS -> ");

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("ENTERED ARRAY -> " + Arrays.toString(arr));
        System.out.println("REVERSED ARRAY -> " + Arrays.toString(reversedArray(arr)));
    }
}

