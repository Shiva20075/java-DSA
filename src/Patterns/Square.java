package Patterns;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        /**
         * Top half of the square (row <= n/2):
         * If row is even, print * at odd columns
         * If row is odd, print * at even columns
         *
         * Bottom half of the square (row > n/2):
         * If row is even, print * at even columns
         * If row is odd, print * at odd columns
         *
         * ex :
         * suppose n = 4
         * Top half (row <= 2):
         * Row 1 (odd):
         * '*' at even columns → col = 2, 4
         *  -> " * *"
         *
         *  Row 2 (even):
         * * at odd columns → col = 1, 3
         * "* * "
         *
         * Bottom half (row > 2):
         * Row 3 (odd):
         * * at odd columns → col = 1, 3
         * "* * "
         *
         Row 4 (even):
         * at even columns → col = 2, 4
         * " * *"
         */

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int row = 1; row <= n; row++){
            System.out.println();
            for (int coloum = 1; coloum <= n; coloum++){
                if ( row <= n/2){
                    if ( row % 2 == 0 && coloum % 2 != 0){
                            System.out.print("*");
                    }else if (row % 2 != 0 && coloum % 2 == 0){
                            System.out.print("*");
                    }else {
                            System.out.print(" ");
                    }

                }else {
                    if ( row %  2 == 0 && coloum % 2 == 0){
                        System.out.print("*");
                    }else if ( row % 2 != 0 && coloum % 2 != 0){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}
