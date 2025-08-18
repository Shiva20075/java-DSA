package LogicalProblems;

import java.util.Scanner;

public class Gcd {

    public static void main(String[] args) {

        /**
         * This class prints the GCD of N1 AND N2
         * EX: N2 = 48 and N1 = 18
         * OUTPUT -> 6
         */

        Scanner s = new Scanner(System.in);
        System.out.print("ENTER N1 ");
        int N1 = s.nextInt();
        System.out.print("ENTER N2 ");
        int N2 = s.nextInt();
        int Gcd = 0;

        for (int i = 1; i <= N1; i++) {
            if (N1 % i == 0 && N2 % i == 0) {
                Gcd = i;
            }
        }
        System.out.println("GCD -> " + Gcd);
    }
}
