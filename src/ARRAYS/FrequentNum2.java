package ARRAYS;

import java.util.Scanner;
import java.util.Arrays;

public class FrequentNum2 {

    /**
     * THIS METHOD TAKE AN ARRAY AND PRINTS MOST FREQUENT NUMBER
     * SUPPOSE A ARRAY : 1,2,3,4,3,3,4
     * FREQUENT NUMBER IS 3;
     * @param arr
     */

    public static void frequentNum2(int arr[]){

        int currentCount = 0;
        int prevCount = 0;
        int freqNum = 0;

        for (int i = 0 ; i < arr.length - 1; i++) {
            if ( arr[i] == arr[i+1]) {
                currentCount++;
            } else {
                currentCount = 1;
            }
            if (currentCount > prevCount) {
                prevCount = currentCount;
                freqNum = arr[i];
            }
        }
        System.out.println("FREQUENT NUM -> " + freqNum);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(" ENTER ARRYA SIZE -> ");
        int size = s.nextInt();
        int arr[] = new int[size];
        FrequentNum2 frequentNum2 = new FrequentNum2();

        System.out.println("ENTER ARRAY ELEMENTS -> ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr);
        frequentNum2(arr);
    }
}
