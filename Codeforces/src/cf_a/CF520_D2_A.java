package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF520-D2-A.
 * Problem Name: Pangram.
 * Date : 22/02/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF520_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] array = new boolean[26];
        int n = input.nextInt();
        String word = input.next().toLowerCase();
        boolean isPangram = true;
        for (int i = 0; i < n; i++)
            array[word.charAt(i) - 'a'] = true;
        for (int i = 0; i < array.length; i++)
            if (!array[i]) {
                isPangram = false;
                break;
            }
        System.out.println(isPangram? "YES" : "NO");
    }
}
