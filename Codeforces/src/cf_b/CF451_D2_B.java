package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF451-D2-B.
 * Problem Name: Sort the Array.
 * Date : 17/03/2021.
 * @author Andrew
 */
import java.util.Scanner;

public class CF451_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n + 1];
        boolean canBeSorted = true;
        boolean isFound = false;
        boolean isDone = false;
        int l = 1, r = 1;
        for (int i = 1; i <= n; i++)
            array[i] = input.nextInt();

        for (int i = 1; i < n; i++) {
            if (array[i] > array[i + 1] && isDone) {
                canBeSorted = false;
                break;
            }
            else if (array[i] > array[i + 1] && !isFound) {
                isFound = true;
                l = i;
            }
            else if (array[i] < array[i + 1] && isFound && !isDone) {
                isDone = true;
                r = i;
            }
        }

        if (isFound && !isDone)
            r = n;

        if (canBeSorted)
            if (array[r] < array[l - 1] || (r < n && array[l] > array[r + 1]))
                canBeSorted = false;

        if (canBeSorted)
            System.out.println("yes\n" + l + " " + r);
        else
            System.out.println("no");
    }
}
