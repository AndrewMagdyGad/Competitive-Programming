package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF80-D2-A.
 * Problem Name: Panoramix's Prediction.
 * Date : 09/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF80_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int nextPrime = getNextPrime(n);
        System.out.println((m == nextPrime) ? "YES" : "NO");
    }

    public static int getNextPrime(int n) {
        int nextPrime = n + 1;
        boolean isPrime = true;
        do {
            isPrime = true;
            for (int i = 2; i < nextPrime; i++) {
                if (nextPrime % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (!isPrime)
                nextPrime++;
        } while (!isPrime);
        return nextPrime;
    }
}
