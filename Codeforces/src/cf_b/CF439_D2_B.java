package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF439-D2-B.
 * Problem Name: Devu, the Dumb Guy.
 * Date : 17/03/2021.
 * @author Andrew
 */
import java.util.*;

public class CF439_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = input.nextInt();
        List<Integer> chapters = new ArrayList<>(n);
        long answer = 0;
        for (int i = 0; i < n; i++)
            chapters.add(input.nextInt());
        Collections.sort(chapters);

        for (int i = 0; i < n; i++) {
            answer += (long)chapters.get(i) * x;
            x = (x == 1) ? 1 : --x;
        }

        System.out.println(answer);
    }
}
