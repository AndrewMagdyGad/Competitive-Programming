package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF289-D2-A.
 * Problem Name: Polo the Penguin and Segments.
 * Date : 14/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF289_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int coveredArea = 0;
        for (int i = 0; i < n; i++) {
            int l = input.nextInt();
            int r = input.nextInt();
            coveredArea += r - l + 1;
        }
        System.out.println((k - coveredArea % k) % k);
    }
}
