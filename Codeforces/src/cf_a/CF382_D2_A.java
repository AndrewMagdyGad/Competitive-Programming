package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF382-D2-A.
 * Problem Name: Ksenia and Pan Scales.
 * Date : 13/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF382_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        String left = "", right = "";
        boolean delimiterFound = false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) == '|')
                delimiterFound = true;
            else if (delimiterFound)
                right += a.charAt(i);
            else
                left += a.charAt(i);

        int total = left.length() + right.length() + b.length();
        if (total % 2 == 0 && Math.max(left.length(), right.length()) <= total / 2) {
            int max = total / 2;
            int index = 0;
            while (left.length() < max)
                left += b.charAt(index++);

            while (right.length() < max)
                right += b.charAt(index++);
            System.out.println(left + "|" + right);
        }
        else
            System.out.println("Impossible");
    }
}
