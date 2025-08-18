package LogicalProblems;

import java.util.Scanner;

public class PerfectNum {

    public static void main(String[] args) {

        /**
         * This class takes input from user and print if the input number is perfect Number or not.
         * EX: input -> 6
         * Output -> 6 is a perfect Number.
         */

        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER TO CHECK PERFECT NUM -> ");
        int n = s.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println(n + " IS A PERFECT NUMBER");

        } else {
            System.out.println(n + " IS NOT A PERFECT NUMBER");
        }

        s.close();
    }
}
