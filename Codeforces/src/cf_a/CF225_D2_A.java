package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF225-D2-A.
 * Problem Name: Dice Tower.
 * Date : 09/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF225_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = input.nextInt();
        int a, b;
        boolean check = true;
        for (int i = 0; i < n; i++) {
            a = input.nextInt();
            b = input.nextInt();
            if (x == a || x == (7 - a) || x == b || x == (7 - b))
                check = false;
        }
        System.out.println((check) ? "YES" : "NO");
    }
}
