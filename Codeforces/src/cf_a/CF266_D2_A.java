package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF266-D2-A.
 * Problem Name: Stones on the Table.
 * Date : 04/10/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF266_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s = input.next();
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                answer++;
        }
        System.out.println(answer);
    }
}
