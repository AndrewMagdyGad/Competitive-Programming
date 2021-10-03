package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF79-D2-B.
 * Problem Name: Colorful Field.
 * Date : 21/03/2021.
 * @author Andrew
 */
import java.util.*;

public class CF79_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        int t = input.nextInt();
        Set<String> wasteCells = new HashSet<>();
        List<Integer> wasteList = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            int a = input.nextInt() - 1;
            int b = input.nextInt() - 1;
            wasteCells.add(a + "," + b);
            wasteList.add(a * m + b);
        }

        Collections.sort(wasteList);

        for (int i = 0; i < t; i++) {
            int a = input.nextInt() - 1;
            int b = input.nextInt() - 1;
            if (wasteCells.contains(a + "," + b))
                System.out.println("Waste");
            else {
                int limit = a * m + b;
                int count = 0;
                while (count < wasteList.size() && wasteList.get(count) < limit)
                    count++;

                int index = a * m + b - count;
                switch (index % 3) {
                    case 0:
                        System.out.println("Carrots");
                        break;
                    case 1:
                        System.out.println("Kiwis");
                        break;
                    case 2:
                        System.out.println("Grapes");
                        break;
                }
            }
        }
    }
}
