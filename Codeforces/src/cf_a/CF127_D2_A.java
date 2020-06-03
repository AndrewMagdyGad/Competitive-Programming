package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF127-D2-A.
 * Problem Name: Wasted Time.
 * Date : 02/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF127_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        double distance = 0;
        int x = input.nextInt();
        int y = input.nextInt();
        for (int i = 1; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            distance += Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2));
            x = a;
            y = b;
        }
        System.out.printf("%.9f\n", k * distance / 50 );
    }
}
