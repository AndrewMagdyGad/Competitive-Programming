/**
 * Online Judge: UVa.
 * Problem Code: UVA 412.
 * Problem Name: Pi.
 * Date : 07/03/2021.
 * @author Andrew
 */
import java.util.Scanner;

public class UVA412 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while (n != 0) {
            int[] dataset = new int[n];
            for (int i = 0; i < n; i++)
                dataset[i] = input.nextInt();
            int count = 0;
            int total = n * (n - 1) / 2;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int d = gcd(dataset[i], dataset[j]);
                    if (d == 1)
                        count++;
                }
            }

            if (count > 0)
                System.out.printf("%.6f\n", Math.sqrt(1.0 * 6 * total / count));
            else
                System.out.println("No estimate for this data set.");

            n = input.nextInt();
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
