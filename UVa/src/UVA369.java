/**
 * Online Judge: UVa.
 * Problem Code: UVA 369.
 * Problem Name: Combinations.
 * Date : 07/03/2021.
 * @author Andrew
 */
import java.util.Scanner;

public class UVA369 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        while (n != 0 || m != 0) {
            int[] numerator = new int[m];
            int[] denominator = new int[m];
            long numeratorProduct = 1;
            long denominatorProduct = 1;

            for (int i = 0; i < m; i++)
                numerator[i] = n - i;

            for (int i = 0; i < m; i++)
                denominator[i] = m - i;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    int d = gcd(numerator[i], denominator[j]);
                    numerator[i] /= d;
                    denominator[j] /= d;
                }
            }


            for (int item : numerator)
                numeratorProduct *= item;

            for (int item : denominator)
                denominatorProduct *= item;

            long result = numeratorProduct / denominatorProduct;

            System.out.println(n + " things taken " + m +" at a time is " + result + " exactly.");
            n = input.nextInt();
            m = input.nextInt();
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
