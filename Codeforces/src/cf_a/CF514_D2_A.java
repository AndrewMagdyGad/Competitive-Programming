package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF514-D2-A.
 * Problem Name: Chewbaсca and Number.
 * Date : 13/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF514_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x = input.next();
        String answer = "";
        for (int i = 0; i < x.length(); i++) {
            int digit = x.charAt(i) - '0';
            if (9 - digit < digit && !(9 - digit == 0 && i == 0))
                answer += 9 - digit;
            else
                answer += digit;
        }
        System.out.println(answer);
    }
}
