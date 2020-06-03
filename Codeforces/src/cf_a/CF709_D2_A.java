package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF709-D2-A.
 * Problem Name: Juicer.
 * Date : 13/11/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF709_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int b = input.nextInt();
        int d = input.nextInt();
        int orange;
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            orange = input.nextInt();
            if (orange <= b) {
                sum += orange;
            }
            if (sum > d) {
                answer++;
                sum = 0;
            }
        }
        System.out.println(answer);
    }
}
