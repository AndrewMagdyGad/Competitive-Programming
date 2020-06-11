package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF1-D2-A.
 * Problem Name: Theatre Square.
 * Date : 09/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF1_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int a = input.nextInt();
        System.out.printf("%.0f\n", Math.ceil(m * 1.0 / a) * Math.ceil(n * 1.0 / a));
    }
}
