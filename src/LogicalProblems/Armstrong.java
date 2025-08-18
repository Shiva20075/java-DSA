package LogicalProblems;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number to check if it is an LogicalProblems.Armstrong number: ");
        int num = s.nextInt();

        boolean isArmstrong = false;

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num; j++) {
                for (int k = 0; k <= num; k++) {
                    if (i*i*i + j*j*j + k*k*k == num) {
                        isArmstrong = true;
                        break;
                    }
                }
                if (isArmstrong){
                    break;
                }
            }
            if (isArmstrong){
                break;
            }
        }

        if (isArmstrong) {
            System.out.println(num + " IS ARMSTRONG NUMBER");
        } else {
            System.out.println(num + " IS NOT ARMSTRONG NUMBER");
        }
    }
}
