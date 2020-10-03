package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF119-D2-A.
 * Problem Name: Epic Game.
 * Date : 04/10/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF119_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int n = input.nextInt();
        int check;
        boolean isSimonTurn = true;
        do {
            if (isSimonTurn)
                check = gcd(a, n);
            else
                check = gcd(b, n);
            n -= check;
            isSimonTurn = !isSimonTurn;
        } while (n >= check);
        System.out.println(isSimonTurn ? 1 : 0);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
