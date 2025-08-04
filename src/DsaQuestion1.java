import java.util.Scanner;

public class DsaQuestion1 {

    public static void main(String[] args) {

        /**
         * THIS PROBLEM TAKES N AS INPUT FROM USER IF ROW is EVEN PRINTS '*' AT ODD COLOUM
         * IF ROW IS ODD PRINTS '*' AT EVEN COLOUM
         *
         * EX :
         * ENTER A NUMBER = 5
         * Print * at even columns (2, 4)
         * Row 1:  " * * "
         * Print * at odd columns (1, 3, 5)
         * Row 2:  "* * *"
         * Print * at even columns (2, 4)
         * Row 3:  " * * "
         */

        Scanner s = new Scanner(System.in);
        System.out.print ("ENTER A NUMBER = " );
        int n = s.nextInt();

        for (int row = 1; row <= n; row++) {
            System.out.println();
            for (int coloum = 1; coloum <= n; coloum++) {
                if ( row % 2 == 0 && coloum % 2 != 0 ){
                    System.out.print("*");
                }else if ( row % 2 != 0 && coloum % 2 == 0) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
        }
    }
}
