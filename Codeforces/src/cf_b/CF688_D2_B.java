package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF688-D2-B.
 * Problem Name: Lovely Palindromes.
 * Date : 17/03/2021.
 * @author Andrew
 */
import java.util.Scanner;

public class CF688_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.next();
        System.out.println(n + new StringBuilder(n).reverse().toString());
    }
}
