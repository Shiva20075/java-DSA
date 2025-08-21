package ARRAYS;
import java.util.Scanner;

public class OddCount {

    /**
     *This class takes array as input and return the number of odd numbers in it
     * Input: n=5, array = [1,3,5,7,9]
     * Output:
     * 5
     */

    public int oddCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] % 2 != 0) {
               count++;
           }
        }
        return count;
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
        OddCount oddCount = new OddCount();
        System.out.println("ODD COUNT -> " + oddCount.oddCount(arr));
    }
}