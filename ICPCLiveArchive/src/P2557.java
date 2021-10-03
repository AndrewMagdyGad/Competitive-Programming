/**
 * Online Judge: ACM-ICPC Live Archive.
 * Problem Code: 2557.
 * Problem Name: The Drunk Jailer.
 * Date : 09/03/2021.
 * @author Andrew
 */
import java.util.Scanner;

public class P2557 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            System.out.println((int)Math.sqrt(n));
        }
    }
}
