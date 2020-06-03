package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF69-D2-A.
 * Problem Name: Young Physicist.
 * Date : 22/02/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF69_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < n; i++) {
            x += input.nextInt();
            y += input.nextInt();
            z += input.nextInt();
        }
        if (x == 0 && y == 0 && z == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
