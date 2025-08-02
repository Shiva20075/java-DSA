import java.util.Scanner;
public class NumbersValley {

    public static void main(String[] args) {

        System.out.print("ENTER A NUMBER -> ");
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();

        for( int i = 1; i <= n; i++){
            System.out.println();
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for ( int s = i; s < (2*n -i); s++){
                System.out.print(" ");
            }

            for ( int x = i; x >= 1; x--){
                System.out.print(x);
            }
        }
    }
}
