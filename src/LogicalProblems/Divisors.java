package LogicalProblems;
import java.util.Scanner;

public class Divisors {

    public static void main(String[] args) {

        /**
         * This calss takes input from user and prints all divisiors of the given input
         * ex: input -> 8
         * divisiors of 8: 1,2,4,8
         */

        Scanner s = new Scanner (System.in);
        System.out.print("ENTER A NUMBER FIND ITS DIVISIORS ");
        int number = s.nextInt();

        for ( int i = 1; i <= number; i++){

            if(number % i == 0){
                System.out.print(i+",");
            }
        }
    }
}
