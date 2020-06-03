package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF732-D2-A.
 * Problem Name: Buy a Shovel.
 * Date : 07/10/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF732_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int r = input.nextInt();
        int minimumNumberOfShovels = 1;
        while (true) {
            if ((k * minimumNumberOfShovels) % 10 == 0 || (k * minimumNumberOfShovels) % 10 == r)
                break;
            minimumNumberOfShovels++;
        }
        System.out.println(minimumNumberOfShovels);
    }
}
