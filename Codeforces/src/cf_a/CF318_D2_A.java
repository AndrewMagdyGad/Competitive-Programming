package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF318-D2-A.
 * Problem Name: Even Odds.
 * Date : 28/03/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF318_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long k = input.nextLong();
        long half = (n % 2 == 0) ? n / 2 : n / 2 + 1;
        if (k > half)
            System.out.println((k - half - 1) * 2 + 2);
        else
            System.out.println((k - 1) * 2 + 1);
    }
}
