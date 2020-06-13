package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF143-D2-A.
 * Problem Name: Help Vasilisa the Wise 2.
 * Date : 13/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF143_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r1 = input.nextInt();
        int r2 = input.nextInt();
        int c1 = input.nextInt();
        int c2 = input.nextInt();
        int d1 = input.nextInt();
        int d2 = input.nextInt();
        boolean[] check = new boolean[10];
        boolean isValid = (d1 - r2 + c1) % 2 == 0;
        int x = (d1 - r2 + c1) / 2;
        int[] answer = {x, r1 - x, c1 - x, d1 - x};
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] < 1 || answer[i] > 9 || check[answer[i]]) {
                isValid = false;
                break;
            }
            else
                check[answer[i]] = true;
        }
        if (isValid)
            System.out.println(answer[0] + " " + answer[1] + "\n" + answer[2] + " " + answer[3]);
        else
            System.out.println("-1");
    }
}
