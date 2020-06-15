package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF579-D2-A.
 * Problem Name: Raising Bacteria.
 * Date : 15/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF579_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int answer = x & 1;
        while (x > 0) {
            answer += x >> 1 & 1;
            x >>= 1;
        }
        System.out.println(answer);
    }
}
