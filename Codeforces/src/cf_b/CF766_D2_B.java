package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF766-D2-B.
 * Problem Name: Mahmoud and a Triangle.
 * Date : 28/03/2021.
 * @author Andrew
 */
import java.util.*;

public class CF766_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> lines = new ArrayList<>(n);
        String answer = "NO";
        for (int i = 0; i < n; i++)
            lines.add(input.nextInt());

        Collections.sort(lines);

        for (int i = 0; i < n - 2; i++) {
            int a = lines.get(i);
            int b = lines.get(i + 1);
            int c = lines.get(i + 2);
            if (a + b > c && a + c > b && b + c > a) {
                answer = "YES";
                break;
            }
        }
        System.out.println(answer);
    }
}
