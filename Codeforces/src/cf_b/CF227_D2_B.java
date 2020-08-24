package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF227-D2-B.
 * Problem Name: Effective Approach.
 * Date : 24/08/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF227_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long vasyaCounter = 0, petyaCounter = 0;
        int n = input.nextInt();
        int[] frequencyArray = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            frequencyArray[number] = i;
        }

        int m = input.nextInt();
        for (int i = 0; i < m; i++) {
            int query = input.nextInt();
            vasyaCounter += frequencyArray[query] + 1;
            petyaCounter += n - frequencyArray[query];
        }
        System.out.println(vasyaCounter + " " + petyaCounter);
    }
}
