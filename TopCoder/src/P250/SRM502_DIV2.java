package P250;

/**
 * Online Judge: TopCoder.
 * Problem Code: SRM502-Div2-250.
 * Date : 30/12/2020.
 * @author Andrew
 */
import java.util.*;

public class SRM502_DIV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int n = input.nextInt();
        int[] requiredTime = new int[n];
        for (int i = 0; i < n; i++)
            requiredTime[i] = input.nextInt();
        int[] answer = find(T, requiredTime);
        for (int item : answer)
            System.out.println(item);
    }

    public static int[] find(int T, int[] requiredTime) {
        Arrays.sort(requiredTime);
        int solved = requiredTime[0] <= T ? 1 : 0;
        int penalty = requiredTime[0] <= T ? requiredTime[0] : 0;
        int sum = penalty;
        for (int i = 1; i < requiredTime.length; i++) {
            if (requiredTime[i] + penalty <= T) {
                solved++;
                penalty += requiredTime[i];
                sum += penalty;
            }
        }
        return new int[]{solved, sum};
    }
}
