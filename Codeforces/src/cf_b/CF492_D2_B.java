package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF492-D2-B.
 * Problem Name: Vanya and Lanterns.
 * Date : 24/08/2020.
 * @author Andrew
 */
import java.util.Arrays;
import java.util.Scanner;

public class CF492_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int l = input.nextInt();
        int[] lanterns = new int[n];
        double maxDifference = 0;
        for (int i = 0; i < n; i++)
            lanterns[i] = input.nextInt();
        Arrays.sort(lanterns);
        for (int i = 0; i < n - 1; i++) {
            double difference = lanterns[i + 1] - lanterns[i];
            if (difference / 2 > maxDifference)
                maxDifference = difference / 2;
        }
        if (lanterns[0] > maxDifference)
            maxDifference = lanterns[0];
        if (l - lanterns[lanterns.length - 1] > maxDifference)
            maxDifference = l - lanterns[lanterns.length - 1];
        System.out.printf("%.10f\n", maxDifference);
    }
}
