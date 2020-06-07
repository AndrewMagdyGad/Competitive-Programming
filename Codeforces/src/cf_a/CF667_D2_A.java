package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF667-D2-A.
 * Problem Name: Pouring Rain.
 * Date : 06/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF667_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextInt() / 2.0;
        int h = input.nextInt();
        int v = input.nextInt();
        int e = input.nextInt();

        // if rate is +ve then the amount of water increases, and if it is -ve then it decreases
        double rate = Math.PI * r * r * e - v;
        if (rate > 0)
            System.out.printf("NO");
        else {
            System.out.println("YES");
            System.out.printf("%.12f\n", (Math.PI * r * r * h / Math.abs(rate)));
        }
    }
}
