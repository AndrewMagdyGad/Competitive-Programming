package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF365-D2-A.
 * Problem Name: Good Number.
 * Date : 09/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF365_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int goodNumbers = 0;
        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            boolean[] digits = new boolean[k + 1];
            boolean isGood = true;
            while (number > 0) {
                if (number % 10 <= k)
                    digits[number % 10] = true;
                number /= 10;
            }
            for (int j = 0; j < digits.length; j++)
                if (!digits[j]) {
                    isGood = false;
                    break;
                }
            if (isGood)
                goodNumbers++;
        }
        System.out.println(goodNumbers);
    }
}
