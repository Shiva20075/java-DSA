package ARRAYS;
import java.util.Scanner;

public class ArraySum {

    /**
     *This class take Array as Input and returns the sum of elements in Array
     * Input: n=3, arr = [2,1,1]
     * Output:
     * 4
     */

    public int sumOfElements (int[] arr){

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
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

        ArraySum arraySum = new ArraySum();
        System.out.println("SUM -> " +  arraySum.sumOfElements(arr));
    }
}
