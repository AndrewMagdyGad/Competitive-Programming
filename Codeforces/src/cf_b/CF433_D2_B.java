package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF433-D2-B.
 * Problem Name: Kuriyama Mirai's Stones.
 * Date : 12/03/2021.
 * @author Andrew
 */
import java.util.*;

public class CF433_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> stones = new ArrayList<>();
        List<Long> prefixSum1 = new ArrayList<>();
        List<Long> prefixSum2 = new ArrayList<>();
        // 1-based array
        stones.add(0);
        prefixSum1.add(0L);
        prefixSum2.add(0L);
        for (int i = 1; i <= n; i++) {
            stones.add(input.nextInt());
            prefixSum1.add(prefixSum1.get(i - 1) + stones.get(i));
        }
        Collections.sort(stones);
        for (int i = 1; i <= n; i++) {
            prefixSum2.add(prefixSum2.get(i - 1) + stones.get(i));
        }

        int m = input.nextInt();
        for (int i = 0; i < m; i++) {
            int type = input.nextInt();
            int l = input.nextInt();
            int r = input.nextInt();

            if (type == 1)
                System.out.println(prefixSum1.get(r) - prefixSum1.get(l - 1));
            else
                System.out.println(prefixSum2.get(r) - prefixSum2.get(l - 1));
        }
    }
}
