package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF287-D2-B.
 * Problem Name: Pipeline.
 * Date : 13/07/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF287_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong() - 1;
        long k = input.nextLong() - 1;

        if (n == 0)
            System.out.println(0);
        else if (n <= k)
            System.out.println(1);
        else if (sum(k) < n)
            System.out.println(-1);
        else
            System.out.println(minimumSplitters(n, k));
    }

    public static long minimumSplitters(long n, long k) {
        long start = 1, end = k;
        while (start < end) {
            long mid = start + (end - start) / 2;
            long sum = sum(mid, k);
            if (sum == n)
                return k - mid + 1;
            if (sum > n)
                start = mid + 1;
            else
                end = mid;
        }
        return k - start + 2;
    }

    public static long sum(long start, long end) {
        return sum(end) - sum(start - 1);
    }

    public static long sum(long n) {
        return (n * (n + 1)) / 2;
    }
}
