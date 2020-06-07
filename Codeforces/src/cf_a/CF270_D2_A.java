package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF270-D2-A.
 * Problem Name: Fancy Fence.
 * Date : 06/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF270_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int a = input.nextInt();
            // for a regular polygon 180 - a = 360 / n where n is the number of sides
            if (360 % (180 - a) == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
