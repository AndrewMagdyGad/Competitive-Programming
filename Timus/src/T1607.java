/**
 * Online Judge: Timus.
 * Problem Code: Timus 1607.
 * Problem Name: Taxi.
 * Date : 09/03/2021.
 * @author Andrew
 */
import java.util.Scanner;

public class T1607 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        if (a + b >= c)
            System.out.println(Math.max(a, c));
        else {
            int start = 0;
            int end = (c - a) / b;

            while (start < end) {
                int mid = start + (end - start) / 2;
                int petrOffer = a + mid * b;
                int driverOffer = c - mid * d;

                if (petrOffer < driverOffer)
                    start = mid + 1;
                else
                    end = mid;
            }

            System.out.println(Math.min(a + start * b, c - (start - 1) * d));
        }
    }
}
