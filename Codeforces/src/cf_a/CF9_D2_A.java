package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF9-D2-A.
 * Problem Name: Die Roll.
 * Date : 09/10/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF9_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();
        int w = input.nextInt();
        int d = 7 - Math.max(y, w);
        int gcd = greatestCommonDivisor(d, 6);
        System.out.println((d / gcd) + "/" + (6 / gcd));
    }
    
    public static int greatestCommonDivisor(int a, int b) {
        int minimum = Math.min(a, b);
        int gcd = 1;
        int temp = gcd;
        while (temp <= minimum) {
            if (a % temp == 0 && b % temp == 0){
                gcd = temp;
            }
            temp++;
        }
        return gcd;
    }
}
