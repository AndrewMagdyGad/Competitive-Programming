package P250;

/**
 * Online Judge: TopCoder.
 * Problem Code: SRM501-Div2-250.
 * Date : 30/12/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class SRM501_DIV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] seq = new int[n];
        for (int i = 0; i < n; i++)
            seq[i] = input.nextInt();
        System.out.println(theCount(seq));
    }

    public static int theCount(int[] seq) {
        if (seq.length < 2)
            return -1;
        int arithmeticRatio = seq[1] - seq[0];
        int geometricRatio = seq[1] / seq[0];
        boolean isArithmetic = true;
        boolean isGeometric = true;

        for (int i = 1; i < seq.length; i++) {
            if (seq[i - 1] + arithmeticRatio != seq[i])
                isArithmetic = false;
            if (seq[i - 1] * geometricRatio != seq[i])
                isGeometric = false;
        }

        if (isArithmetic && isGeometric) {
            if (seq[seq.length - 1] + arithmeticRatio != seq[seq.length - 1] * geometricRatio)
                return 2;
            else
                return 1;
        }
        else if (isArithmetic || isGeometric) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
