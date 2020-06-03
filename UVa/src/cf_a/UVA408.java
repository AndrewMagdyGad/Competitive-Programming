package cf_a;

/**
 * Online Judge: UVa.
 * Problem Code: UVA 408.
 * Problem Name: Uniform Generator.
 * Date : 10/01/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class UVA408 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int step = input.nextInt();
            int mod = input.nextInt();
            int num = 0;
            boolean arr[] = new boolean[mod];
            for (int i = 0; i < mod; i++) {
                num = (num + step) % mod;
                arr[num] = true;
            }
            if (isGoodChoice(arr)) {
                System.out.printf("%10d%10d%15s\n\n", step, mod, "Good Choice");
            }
            else {
                System.out.printf("%10d%10d%14s\n\n", step, mod, "Bad Choice");
            }
        }
    }
    
    public static boolean isGoodChoice(boolean arr[]) {
        for (int i = 0; i < arr.length; i++)
            if (!arr[i])
                return false;
        return true;
    }
}
