/**
 * Online Judge: UVa.
 * Problem Code: UVA 374.
 * Problem Name: Big Mod.
 * Date : 07/03/2021.
 * @author Andrew
 */
import java.util.Scanner;

public class UVA374 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int b = input.nextInt();
            int p = input.nextInt();
            int m = input.nextInt();
            input.nextLine();

            System.out.println(mod(b, p, m) % m);
        }
    }

    public static long mod(int b, int p, int m) {
        if (p == 0)
            return 1;
        long half = mod(b % m, p / 2 , m) % m;
        long result = (half * half) % m;
        if (p % 2 == 0)
            return result;
        return ((b % m) * (result % m)) % m;
    }
}
