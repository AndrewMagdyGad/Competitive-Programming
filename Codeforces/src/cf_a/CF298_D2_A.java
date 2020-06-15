package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF298-D2-A.
 * Problem Name: Snow Footprints.
 * Date : 15/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF298_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String path = input.next();
        int s = 0, t = 0;
        for (int i = 1; i < path.length() - 1; i++) {
            if (path.charAt(i) == 'R' && path.charAt(i - 1) == '.')
                s = i + 1;
            if (path.charAt(i) == 'R' && path.charAt(i + 1) == 'L') {
                t = i + 1;
                break;
            }
            if (path.charAt(i) == 'R' && path.charAt(i + 1) == '.') {
                t = i + 2;
                break;
            }
            if (path.charAt(i) == 'L' && path.charAt(i - 1) == '.')
                t = i;
            if (path.charAt(i) == 'L' && path.charAt(i + 1) == '.') {
                s = i + 1;
                break;
            }
        }
        System.out.println(s + " " + t);
    }
}
