package ARRAYS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequentNumber {

    /**
     * THIS METHOD TAKE AN ARRAY AND PRINTS MOST FREQUENT NUMBER
     * SUPPOSE A ARRAY : 1,2,3,4,3,3,4
     * FREQUENT NUMBER IS 3;
     * @param arr
     */

    public static void frequentNum(int arr[]){

        Map<Integer,Integer> frequentNumber = new HashMap<>();
        int count = 0;
        int frequentNum = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (frequentNumber.containsKey(num)) {
                frequentNumber.put(num,frequentNumber.get(num)+1);
            } else {
                frequentNumber.put(num,0);
            }
        }
        for (Integer key : frequentNumber.keySet()) {
            if (frequentNumber.get(key) > count) {
                count = frequentNumber.get(key);
                frequentNum = key;
            }
        }
        System.out.println("FREQUENT NUMBER -> " + frequentNum);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);
        FrequentNumber frequentNum = new FrequentNumber();
        System.out.print (" ENTER ARRYA SIZE -> ");
        int size = s.nextInt();
        int arr[] = new int [size];
        System.out.println("ENTER ARRAY ELEMENTS -> " );

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        frequentNum(arr);
    }
}
