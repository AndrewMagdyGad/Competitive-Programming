package cf_a;

/**
 * Online Judge: UVa.
 * Problem Code: UVA 10110.
 * Problem Name: Light, more light.
 * Date : 25/12/2019.
 * @author Andrew
 */
import java.util.Scanner;

public class UVA10110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        while (n != 0) {
            long squareRoot = (long)Math.sqrt(n);
            if (squareRoot * squareRoot == n)
                System.out.println("yes");
            else
                System.out.println("no");
            n = input.nextLong();
        }
    }
}
