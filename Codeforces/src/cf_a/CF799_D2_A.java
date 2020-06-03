package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF799-D2-A.
 * Problem Name: Carrot Cakes.
 * Date : 13/11/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF799_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        int k = input.nextInt();
        int d = input.nextInt();
        int kOfPackage1 = 0;
        int kOfPackage2 = (d / t) * k;
        int package1 = 0;
        int package2 = d;
        while (kOfPackage1 < n) {
            kOfPackage1 += k;
            package1 += t;
        }
        while (kOfPackage2 < n) {
            kOfPackage2 += 2 * k;
            package2 += t;
        }
        System.out.println(package1 <= package2 ? "NO" : "YES");
    }
}
