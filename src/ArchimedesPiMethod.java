/**
 * Shawn Chappelle 9/4/2022
 *
 */
import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Enter number of sides.");
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            if(n < 1){
                break;
            }

            double b = 360.0 / n;
            double a = b / 2;
            double s = 2 * Math.sin(Math.toRadians(a));
            double p = n * s;
            double pi = p / 2;

            System.out.printf("Pi estimate is: %.10f%n", pi);
        }
    }
}
