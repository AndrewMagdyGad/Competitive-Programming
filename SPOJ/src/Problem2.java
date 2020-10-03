/**
 * Online Judge: SPOJ.
 * Problem Code: NOVICE22.
 * Problem Name: Problem 2.
 * Date : 29/09/2020.
 * @author Andrew
 */
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            String line = input.next();
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < line.length(); j++)
                set.add(line.charAt(j));
            System.out.println(set.size());
        }
    }
}
