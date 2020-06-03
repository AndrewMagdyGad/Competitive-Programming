package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF807-D2-A.
 * Problem Name: Is it rated?.
 * Date : 28/03/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF807_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean isRated = false;
        boolean isDescending = true;
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            array[i][0] = input.nextInt();
            array[i][1] = input.nextInt();
            if (array[i][0] != array[i][1])
                isRated = true;
            if (i == 0) continue;
            if (array[i][0] > array[i - 1][0])
                isDescending = false;
        }
        if (isRated)
            System.out.println("rated");
        else if (isDescending)
            System.out.println("maybe");
        else
            System.out.println("unrated");
    }
}
