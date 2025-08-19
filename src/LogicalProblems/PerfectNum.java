package LogicalProblems;
import java.util.Scanner;

public class PerfectNum {

    /**
     * Checks if a number is a perfect number.
     * A perfect number is a positive integer that equals the sum of its proper divisors,
     * which are the positive divisors of the number excluding the number itself.
     *
     * For example, 6 is a perfect number because its proper divisors are 1, 2, and 3,
     * and 1 + 2 + 3 = 6.
     *
     */
    public static boolean isPerfectNumber(int n) {

        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        boolean isPerfect;
        if (sum == n) {
            isPerfect = true;
        } else {
            isPerfect = false;
        }

        return isPerfect;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER TO CHECK PERFECT NUM -> ");
        int n = s.nextInt();

        if (isPerfectNumber(n)) {
            System.out.println(n + " IS A PERFECT NUMBER");
        } else {
            System.out.println(n + " IS NOT A PERFECT NUMBER");
        }

        s.close();
    }
}
