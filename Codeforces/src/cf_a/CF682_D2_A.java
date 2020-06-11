package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF682-D2-A.
 * Problem Name: Alyona and Numbers.
 * Date : 09/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF682_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] a = new int[5];
        int[] b = new int[5];
        for (int i = 1; i <= n; i++)
            a[i % 5]++;
        for (int i = 1; i <= m; i++)
            b[i % 5]++;
        long count = 1L * a[0] * b[0];
        for (int i = 1; i < a.length; i++)
            count += 1L * a[i] * b[5 - i];

        System.out.println(count);
    }
}
