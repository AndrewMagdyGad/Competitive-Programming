package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF584-D2-A.
 * Problem Name: Olesya and Rodion.
 * Date : 28/03/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF584_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        String answer = "";
        if (t == 10) {
            if (n == 1)
                System.out.println("-1");
            else {
                answer = "1";
                while (answer.length() < n)
                    answer += 0;
                System.out.println(answer);
            }
        }
        else {
            while (answer.length() < n)
                    answer += t;
            System.out.println(answer);
        }
    }
}
