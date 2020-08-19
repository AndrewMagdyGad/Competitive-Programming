/**
 * Online Judge: UVa.
 * Problem Code: UVA 11231.
 * Problem Name: Black and white painting.
 * Date : 10/01/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class UVA11231 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int c = input.nextInt();
        while (n != 0 || m != 0 || c != 0) {
            // to handle when the number of possibilities is odd
            int num = (c == 1)? 1 : 0;
            int ans = ((n - 7) * (m - 7) + num) / 2;
            System.out.println(ans);
            n = input.nextInt();
            m = input.nextInt();
            c = input.nextInt();
        }
    }
}
