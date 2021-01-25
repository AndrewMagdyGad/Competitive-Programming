package P250;

/**
 * Online Judge: TopCoder.
 * Problem Code: SRM509-Div2-250.
 * Date : 25/01/2021.
 * @author Andrew
 */
import java.util.Scanner;

public class SRM509_DIV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        System.out.println(getMinimumCost(X));
    }

    public static int getMinimumCost(int X) {
        int n1 = X;
        int n2 = X - 1;
        while (!isPalindromic(n1) && !isPalindromic(n2)) {
            n1++;
            n2--;
        }

        if (isPalindromic(n1))
            return n1 - X;
        return X - n2;
    }

    public static boolean isPalindromic(int n) {
        String a = String.valueOf(n);
        String b = new StringBuilder(a).reverse().toString();
        return a.equals(b);
    }
}
