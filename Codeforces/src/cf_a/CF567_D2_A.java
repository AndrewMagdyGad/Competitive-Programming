package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF567-D2-A.
 * Problem Name: Lineland Mail.
 * Date : 18/01/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF567_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long x[] = new long[n];
        long min, max;
        for (int i = 0; i < n; i++)
            x[i] = input.nextInt();
        for (int i = 0; i < n; i++) {
            max = Math.max(Math.abs(x[i] - x [n - 1]), Math.abs(x[i] - x [0]));
            if (i == 0)
                min = Math.abs(x[i] - x [i + 1]);
            else if (i == n - 1)
                min = Math.abs(x[i] - x [i - 1]);
            else
                min = Math.min(Math.abs(x[i] - x [i - 1]), Math.abs(x[i] - x [i + 1]));
            System.out.println(min + " " + max);
        }
    }
}
