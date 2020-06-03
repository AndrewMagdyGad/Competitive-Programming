package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF686-D2-A.
 * Problem Name: Free Ice Cream.
 * Date : 14/11/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF686_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long numberOfIceCream = input.nextLong();
        long d;
        int numberOfDistressedKids = 0;
        String sign;
        for (int i = 0; i < n; i++) {
            sign = input.next();
            d = input.nextLong();
            if (sign.equals("-")) {
                if (numberOfIceCream < d)
                    numberOfDistressedKids++;
                else
                    numberOfIceCream -= d;
            }
            else
                numberOfIceCream += d;
        }
        System.out.println(numberOfIceCream + " " + numberOfDistressedKids);
    }
}
