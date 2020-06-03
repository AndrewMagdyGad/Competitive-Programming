package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF344-D2-A.
 * Problem Name: Magnets.
 * Date : 04/10/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF344_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String previousMagnet = input.next();
        String currentMagnet;
        int groups = 1;
        for (int i = 1; i < n; i++) {
            currentMagnet = input.next();
            if (!currentMagnet.equals(previousMagnet))
                groups++;
            previousMagnet = currentMagnet;
        }
        System.out.println(groups);
    }
}
