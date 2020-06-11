package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF483-D2-A.
 * Problem Name: Counterexample.
 * Date : 09/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF483_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long l = input.nextLong();
        long r = input.nextLong();
        if (l % 2 != 0)
            l++;
        if ((r - l) < 2)
            System.out.println(-1);
        else
            System.out.println(l + " " + ++l + " " + ++l);
    }
}
