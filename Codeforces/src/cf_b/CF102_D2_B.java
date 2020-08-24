package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF102-D2-B.
 * Problem Name: Sum of Digits.
 * Date : 24/08/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF102_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.next();
        int answer = 0;
        while (n.length() > 1) {
            int sum = 0;
            for (int i = 0; i < n.length(); i++)
                sum += n.charAt(i) - '0';
            answer++;
            n = String.valueOf(sum);
        }
        System.out.println(answer);
    }
}
