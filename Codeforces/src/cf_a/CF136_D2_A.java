package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF136-D2-A.
 * Problem Name: Presents.
 * Date : 18/01/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF136_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[input.nextInt() - 1] = i + 1;
        }
        for (int i: ans)
            System.out.print(i + " ");
        System.out.println();
    }
}
