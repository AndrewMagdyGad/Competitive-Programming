package P250;

/**
 * Online Judge: TopCoder.
 * Problem Code: SRM507-Div2-250.
 * Date : 18/01/2021.
 * @author Andrew
 */
import java.util.Scanner;

public class SRM507_DIV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] pos = new int[n];
        for (int i = 0; i < n; i++)
            pos[i] = input.nextInt();
        System.out.println(getMinimumSteps(pos));
    }

    public static int getMinimumSteps(int[] pos) {
        int[] min_distance = {0, 1, 2, 1, 1, 2, 3, 2};
        int max = 0;

        for (int item : pos)
            if (min_distance[item] > max)
                max = min_distance[item];

        return max;
    }
}
