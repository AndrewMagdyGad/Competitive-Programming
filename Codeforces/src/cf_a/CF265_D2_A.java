package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF265-D2-A.
 * Problem Name: Colorful Stones (Simplified Edition).
 * Date : 07/10/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF265_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String t = input.next();
        int index = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(index))
                index++;
        }
        System.out.println(index + 1);
    }
}
