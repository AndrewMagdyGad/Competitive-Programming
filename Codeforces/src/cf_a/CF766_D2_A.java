package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF766-D2-A.
 * Problem Name: Mahmoud and Longest Uncommon Subsequence.
 * Date : 18/01/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF766_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();
        if (a.equals(b))
            System.out.println(-1);
        else
            System.out.println((a.length() > b.length()) ? a.length() : b.length());
    }
}
