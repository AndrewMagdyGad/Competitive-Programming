package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF363-D2-B.
 * Problem Name: Fence.
 * Date : 16/03/2021.
 * @author Andrew
 */
import java.util.Scanner;

public class CF363_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt() - 1;
        int[] planks = new int[n + 1];
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 1; i <= n; i++)
            planks[i] = input.nextInt() + planks[i - 1];

        for (int i = 1; i <= n - k; i++) {
            int sum = planks[i + k] - planks[i - 1];
            if (sum < min) {
                min = sum;
                minIndex = i;
            }
        }

        System.out.println(minIndex);
    }
}
