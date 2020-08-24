package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF746-D2-B.
 * Problem Name: Decoding.
 * Date : 20/08/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF746_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String word = input.next();
        String answer = "";
        boolean isEven = n % 2 == 0;
        for (int i = 0; i < n; i++) {
            if (isEven) {
                if (i % 2 == 0)
                    answer = word.charAt(i) + answer;
                else
                    answer += word.charAt(i);
            }
            else {
                if (i % 2 == 0)
                    answer += word.charAt(i);
                else
                    answer = word.charAt(i) + answer;
            }
        }
        System.out.println(answer);
    }
}
