package P250;

/**
 * Online Judge: TopCoder.
 * Problem Code: SRM508-Div2-250.
 * Date : 18/01/2021.
 * @author Andrew
 */
import java.util.Scanner;

public class SRM508_DIV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] X = new int[n];
        int[] Y = new int[n];
        int[] R = new int[n];
        for (int i = 0; i < n; i++)
            X[i] = input.nextInt();
        for (int i = 0; i < n; i++)
            Y[i] = input.nextInt();
        for (int i = 0; i < n; i++)
            R[i] = input.nextInt();
        System.out.println(countProbablePlaces(X, Y, R));
    }

    public static int countProbablePlaces(int[] X, int[] Y, int[] R) {
        int count = 0;

        for (int x = -200; x <= 200; x++) {
            for (int y = -200; y <= 200; y++) {
                boolean isReachable = true;
                for (int i = 0; i < X.length; i++) {
                    int dx = Math.abs(x - X[i]);
                    int dy = Math.abs(y - Y[i]);
                    if (dx + dy > R[i]) {
                        isReachable = false;
                        break;
                    }
                }

                if (isReachable)
                    count++;
            }
        }

        return count;
    }
}
