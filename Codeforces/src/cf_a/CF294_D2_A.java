package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF294-D2-A.
 * Problem Name: Shaass and Oskols.
 * Date : 13/11/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF294_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = input.nextInt();
        int m = input.nextInt();
        int x, y;
        for (int i = 0; i < m; i++) {
            x = input.nextInt() - 1;
            y = input.nextInt();
            if (x - 1 >= 0)
                array[x - 1] += y - 1;
            if (x + 1 < n)
                array[x + 1] += array[x] - y;
            array[x] = 0;
        }
        for (int i = 0; i < n; i++)
            System.out.println(array[i]);
    }
}
