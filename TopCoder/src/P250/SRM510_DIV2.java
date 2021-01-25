package P250;

/**
 * Online Judge: TopCoder.
 * Problem Code: SRM510-Div2-250.
 * Date : 25/01/2021.
 * @author Andrew
 */
import java.util.Scanner;

public class SRM510_DIV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(find(a, b));
    }

    public static int find(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++)
            if (isLucky(i))
                count++;
        return count;
    }

    public static boolean isLucky(int a) {
        int count = 0;

        while (a > 0) {
            int digit = a % 10;
            a /= 10;
            if (digit != 7 && digit != 4) {
                count++;
                if (count > 1)
                    return false;
            }
        }

        return true;
    }
}
