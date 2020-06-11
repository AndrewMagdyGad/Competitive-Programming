package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF486-D2-A.
 * Problem Name: Calculating Function.
 * Date : 09/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF486_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        if (n % 2 == 0)
            System.out.println(n / 2);
        else
            System.out.println(n / 2 - n);
    }
}
