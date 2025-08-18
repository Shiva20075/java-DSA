package ARRAYS;

import java.util.Scanner;
public class ArrayRotation {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER TO ROTATE ARRAY -> ");
        int k = s.nextInt()%5;
        int rotatedArr[] = new int[]{1,2,3,4,5,6,7};
        int firsrIndex = rotatedArr[0];
        System.out.println(k);

        for (int i = 0; i < k; i++) {

            for (int n = 0; n < rotatedArr.length - 1; n++) {
                rotatedArr[n] = rotatedArr[n+1];
            }

            rotatedArr[rotatedArr.length - 1] = firsrIndex;
            firsrIndex = rotatedArr[0];
        }

        for (int i = 0; i < rotatedArr.length; i++) {
          System.out.print(rotatedArr[i]);
        }
    }
}
