package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF742-D2-A.
 * Problem Name: Arpa’s hard exam and Mehrdad’s naive cheat.
 * Date : 07/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF742_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n <= 3)
            System.out.println((int) (Math.pow(8, n) % 10));
        else {
            int r = n % 4;
            System.out.println((int) (Math.pow(8, r + 4) % 10));
        }
    }
}
