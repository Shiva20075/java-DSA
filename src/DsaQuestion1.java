import java.util.Scanner;
public class DsaQuestion1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print ("ENTER A NUMBER = " );
        int n = s.nextInt();

        for (int row = 1; row <= n; row++) {
            System.out.println();
            for (int coloum = 1; coloum <= n; coloum++) {
                if( row % 2 == 0 && coloum % 2 != 0 ){
                    System.out.print("*");
                }else if( row % 2 != 0 && coloum % 2 == 0) {
                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
        }
    }
}
