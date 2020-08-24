package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF16-D2-B.
 * Problem Name: Burglar and Matches.
 * Date : 22/08/2020.
 * @author Andrew
 */
import java.util.Arrays;
import java.util.Scanner;

public class CF16_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] array = new int[m][2];
        int max = 0;
        for (int i = 0; i < m; i++) {
            array[i][0] = input.nextInt();
            array[i][1] = input.nextInt();
        }
        Arrays.sort(array, (a, b) -> Integer.compare(b[1], a[1]));
        for (int i = 0; i < m && n > 0; i++) {
            int matchboxes = array[i][0];
            if (matchboxes <= n) {
                max += matchboxes * array[i][1];
                n -= matchboxes;
            }
            else {
                max += n * array[i][1];
                n = 0;
            }
        }
        System.out.println(max);
    }
}
