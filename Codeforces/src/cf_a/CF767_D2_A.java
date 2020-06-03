package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF767-D2-A.
 * Problem Name: Snacktower.
 * Date : 18/01/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF767_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int biggest = n;
        boolean list[] = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            list[input.nextInt()] = true;
            while (list[biggest])
                System.out.print(biggest-- + " ");
            System.out.println();
        }
    }
}
