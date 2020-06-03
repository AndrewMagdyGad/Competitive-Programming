package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF71-D2-A.
 * Problem Name: Way Too Long Words.
 * Date : 14/11/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF71_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String word;
        for (int i = 0; i < n; i++) {
            word = input.next();
            if (word.length() > 10)
                System.out.println("" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1));
            else
                System.out.println(word);
        }
    }
}
