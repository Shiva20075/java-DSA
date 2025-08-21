package LogicalProblems;
import java.util.Scanner;

public class ArmstrongNum {


/**
 * This method checks if a given number is an Armstrong number.
 * An Armstrong number (also known as a Narcissistic number) is a number
 * that is equal to the sum of its digits each raised to the power of the number of digits.
 * For example: if user enters 153 it will show:
 *  153 is an Armstrong number because: 1^3 + 5^3 + 3^3 = 153.
 *  */

    public boolean isArmstrong (int num) {
        int count = 0;
        int sum = 0;
        int inputNum = num;

        while (num > 0) {
            num = num / 10;
            count++;
        }

        num = inputNum;

        for (int i = 1; i <= count; i++) {
            int digit = 0;
            int product = 1;

            if (num > 0){
                digit = num % 10;
                num = num /10;
            }

            for (int j = 1; j <= count; j++) {
                product *= digit;
            }
            sum += product;
        }

        if (sum == inputNum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER -> ");
        int num = s.nextInt();
        ArmstrongNum ArmstrongNum = new ArmstrongNum();

        if (ArmstrongNum.isArmstrong(num)) {
            System.out.println( num + " IS ARMSTRONG NUMBER");
        } else {
            System.out.println(num + " IS NOT ARMSTRONG NUMBER");
        }
    }
}
