package LogicalProblems;
import java.util.Scanner;

public class Nprimes {

    public static void main(String[] args) {

        /**
         * This class takes input as n from user and print all prime Numbers upto n
         * ex: if n = 15
         * output : 2,3,5,7,11,13
         */

        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER ->");
        int n = s.nextInt();

        printPrimesUpToN(n);
    }

    public static void printPrimesUpToN(int n) {

        for (int i = 2; i <= n; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count <= 2) {
                System.out.print(i + ",");
            }
        }
    }
}
