package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF810-D2-B.
 * Problem Name: Summer sell-off.
 * Date : 17/03/2021.
 * @author Andrew
 */
import java.util.*;

public class CF810_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int f = input.nextInt();
        List<Pair> list = new ArrayList<>(n);
        long answer = 0;
        for (int i = 0; i < n; i++) {
            int l = input.nextInt();
            int k = input.nextInt();
            list.add(new Pair(l, k));
        }

        Collections.sort(list, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p2.delta - p1.delta;
            }
        });

        for (int i = 0; i < n; i++) {
            Pair current = list.get(i);
            if (i < f)
                answer += Math.min(current.l * 2, current.k);
            else
                answer += Math.min(current.l, current.k);
        }

        System.out.println(answer);
    }
}

class Pair {
    int l, k, delta;
    public Pair(int l, int k) {
        this.l = l;
        this.k = k;
        this.delta = Math.min(2 * l, k) - Math.min(l , k);
    }
}
