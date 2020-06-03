package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF41-D2-A.
 * Problem Name: Translation.
 * Date : 28/03/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF41_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String t = input.next();
        int size = s.length();
        boolean isReversed = true;
        if (s.length() != t.length())
            isReversed = false;
        else
            for (int i = 0; i < size; i++)
                if (s.charAt(i) != t.charAt(size - 1 - i)) {
                    isReversed = false;
                    break;
                }
        System.out.println(isReversed ? "YES" : "NO");
    }
}
