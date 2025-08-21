package ARRAYS;
import java.util.Scanner;

public class SortedArray {

    /**
     * This class takes array as input and prints weather its sorted or not
     * Input: n = 5, arr = [1,2,3,4,5]
     * Output: True
     * Explanation: The given array is sorted Every element in the array is smaller than or equals to its next values, So the answer is True.
     *
     */

    public boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
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
        SortedArray sortedArray = new SortedArray();

        if (sortedArray.isSorted(arr)) {
            System.out.println("ARRAY IS SORTED ORDER ");
        } else {
            System.out.println("ARRAY IS NOT IN  SORTED ORDER");
        }
    }
}

